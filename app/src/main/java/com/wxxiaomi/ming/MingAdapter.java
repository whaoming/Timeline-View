package com.wxxiaomi.ming;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.vipul.hp_hp.timeline.R;
import com.vipul.hp_hp.timelineview.TimelineView2;
import com.wxxiaomi.ming.bean.MyModel;
import com.wxxiaomi.ming.bean.OptionType;

import java.util.List;

/**
 * Created by HP-HP on 05-12-2015.
 */
public class MingAdapter extends RecyclerView.Adapter<MingViewHolder> {

    private List<MyModel> mFeedList;
    private Context mContext;

    public MingAdapter(List<MyModel> feedList) {
        mFeedList = feedList;
    }

    @Override
    public int getItemViewType(int position) {
        return TimelineView2.getTimeLineViewType(position,getItemCount());
    }

    @Override
    public MingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        mContext = parent.getContext();

        View view;

//        if(mOrientation == Orientation.horizontal) {
//            view = View.inflate(parent.getContext(), R.layout.item_timeline_horizontal, null);
//        } else {
            view = View.inflate(parent.getContext(), R.layout.ming_item_timeline, null);
//        }

        return new MingViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(MingViewHolder holder, int position) {

        MyModel timeLineModel = mFeedList.get(position);
        switch (timeLineModel.type){
            case OptionType.PHOTO_PUBLISH:
                holder.user_name.setText("wang更新了相册");
                holder.rl_foot.setVisibility(View.GONE);
                holder.info_content.setVisibility(View.GONE);
                break;
            case OptionType.TOPIC_COMMENT:
                holder.user_name.setText("122627018发表了评论");
                holder.info_pic.setVisibility(View.GONE);
                break;
            case OptionType.TOPIC_PUBLISH:
                holder.user_name.setText("122627018发表了一个话题");
                break;
            default:
                break;
        }
//        holder.name.setText("name：" + timeLineModel.getName() + "    age：" + timeLineModel.getAge());

    }

    @Override
    public int getItemCount() {
        return (mFeedList!=null? mFeedList.size():0);
    }

}
