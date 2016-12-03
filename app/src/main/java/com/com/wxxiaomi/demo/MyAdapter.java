package com.com.wxxiaomi.demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.wxxiaomi.ming.bean.MyModel;

import java.util.List;

/**
 * Created by Administrator on 2016/12/3.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<MyModel> list;
    private Context mContext;


    public MyAdapter(List<MyModel> feedList) {
        list = feedList;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
