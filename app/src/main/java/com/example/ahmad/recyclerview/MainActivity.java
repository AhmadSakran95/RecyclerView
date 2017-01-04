package com.example.ahmad.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycleView=(RecyclerView)findViewById(R.id.Myrecycle_view);

        ItemData itemData[]={new ItemData("Lesson 1","Short Text Lesson 1","12/12/2016",R.drawable.img1)
                ,new ItemData("Lesson 2","Short Text Lesson 2","18/12/2011",R.drawable.img6)
                ,new ItemData("Lesson 3","Short Text Lesson 3","11/05/2016",R.drawable.img1)
                ,new ItemData("Lesson 4","Short Text Lesson 4","12/04/2015",R.drawable.img6)
                ,new ItemData("Lesson 5","Short Text Lesson 5","30/07/2011",R.drawable.img1)
                ,new ItemData("Lesson 6","Short Text Lesson 6","12/06/2012",R.drawable.img6)
        };

        recycleView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter = new MyAdapter(itemData,this);
        recycleView.setAdapter(myAdapter);
        recycleView.setItemAnimator(new DefaultItemAnimator());

    }
}
