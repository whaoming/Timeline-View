package com.wxxiaomi.ming;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.vipul.hp_hp.timeline.R;
import com.wxxiaomi.ming.bean.MyModel;

import java.util.ArrayList;
import java.util.List;

public class MyTimeLineActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private MingAdapter adapter;
    private List<MyModel> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_time_line);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(getLinearLayoutManager());
        initView();
    }

    private void initView() {
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

        adapter = new MingAdapter(list);
        mRecyclerView.setAdapter(adapter);
    }

    private RecyclerView.LayoutManager getLinearLayoutManager() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        return linearLayoutManager;
    }
}
