package com.wxxiaomi.ming;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.vipul.hp_hp.timeline.R;
import com.vipul.hp_hp.timelineview.TimelineView2;

/**
 * Created by HP-HP on 05-12-2015.
 */
public class MingViewHolder extends RecyclerView.ViewHolder {

    public TimelineView2 mTimelineView;
    public ImageView user_head;
    public ImageView info_pic;
    public TextView user_name;
    public TextView info_content;
    public TextView info_locat_tag;
    public TextView info_star;
    public RelativeLayout rl_foot;


    public MingViewHolder(View itemView, int viewType) {
        super(itemView);
        user_head = (ImageView) itemView.findViewById(R.id.user_head);
        info_pic = (ImageView) itemView.findViewById(R.id.info_pic);
        user_name = (TextView) itemView.findViewById(R.id.user_name);
        info_content = (TextView) itemView.findViewById(R.id.info_content);
        info_locat_tag = (TextView) itemView.findViewById(R.id.info_locat_tag);
        info_star = (TextView) itemView.findViewById(R.id.info_star);
        mTimelineView = (TimelineView2) itemView.findViewById(R.id.time_marker);
        rl_foot = (RelativeLayout) itemView.findViewById(R.id.rl_foot);
        mTimelineView.initLine(viewType);
    }
}
