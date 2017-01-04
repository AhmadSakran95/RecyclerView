package com.example.ahmad.recyclerview;

/**
 * Created by Ahmad on 03/01/2017.
 */
public class ItemData {

    protected String title;
    protected int img;
    protected String dec;
    protected String date;

        public  ItemData(String title,String dec,String date,int img){
            this.img=img;
            this.title=title;
            this.date=date;
            this.dec=dec;
        }
}
