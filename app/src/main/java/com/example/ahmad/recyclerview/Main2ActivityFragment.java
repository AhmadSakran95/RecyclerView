package com.example.ahmad.recyclerview;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class Main2ActivityFragment extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_fragment);

        FragmentManager MF=getSupportFragmentManager();
        FragmentTransaction Ft= MF.beginTransaction();
        BlankFragment Bf=new BlankFragment();
        Ft.add(R.id.FrameLayout,Bf);
        Ft.commit();
    }
}
