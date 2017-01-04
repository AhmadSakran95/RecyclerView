package com.example.ahmad.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Ahmad on 03/01/2017.
 */


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    protected ItemData[] itemData;
    Context context;
    public MyAdapter(ItemData[] itemData,Context context){
        this.itemData=itemData;
        this.context=context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singlerow,null);
        ViewHolder viewHolder=new ViewHolder(itemLayoutView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position){
        viewHolder.txtViewDec.setText(itemData[position].dec);
        viewHolder.txtViewDate.setText(itemData[position].date);
        viewHolder.txtViewTitle.setText(itemData[position].title);
        viewHolder.imgViewIcon.setImageResource(itemData[position].img);
        viewHolder.LinearClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent().setClass(v.getContext(), Main2ActivityFragment.class);

                intent.putExtra("LessonNum",itemData[position].title);
                intent.putExtra("LessonDec",itemData[position].dec);
                intent.putExtra("LessonImg",itemData[position].img);
                intent.putExtra("LessonDate",itemData[position].date);

                v.getContext().startActivity(intent);

            }
        });
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtViewTitle;
        public TextView txtViewDec;
        public TextView txtViewDate;
        public ImageView imgViewIcon;
        public LinearLayout LinearClick;

        public ViewHolder(View itemLayoutView){
            super(itemLayoutView);
            txtViewDate=(TextView)itemLayoutView.findViewById(R.id.textViewDate);
            txtViewDec=(TextView)itemLayoutView.findViewById(R.id.textViewDec);
            txtViewTitle=(TextView)itemLayoutView.findViewById(R.id.textViewTitle);
            imgViewIcon=(ImageView)itemLayoutView.findViewById(R.id.imageView2);
            LinearClick=(LinearLayout)itemLayoutView.findViewById(R.id.LinearClick);
        }
    }

    @Override
    public int getItemCount() {
        return itemData.length;
    }
}

