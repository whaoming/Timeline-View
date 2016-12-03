package com.com.wxxiaomi.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.vipul.hp_hp.timeline.R;
import com.wxxiaomi.ming.MingAdapter;
import com.wxxiaomi.ming.bean.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 最新版本的activity
 */
public class LatestActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<MyModel> list = new ArrayList<>();
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(getLinearLayoutManager());
        init();
    }

    private void init() {
        for(int i = 1;i <21;i++) {
//            TimeLineModel model = new TimeLineModel();
//            model.setName("Random"+i);
//            model.setAge(i);
//            mDataList.add(model);
//            if(i%4==0){
//
//            }else if(i%4==1){
//
//            }else if()
            MyModel m = new MyModel();
            m.type = i;
            list.add(m);
        }

        adapter = new MyAdapter(list);
        mRecyclerView.setAdapter(adapter);
    }

    private RecyclerView.LayoutManager getLinearLayoutManager() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        return linearLayoutManager;
    }
}
