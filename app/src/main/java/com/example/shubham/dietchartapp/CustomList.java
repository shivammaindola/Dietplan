package com.example.shubham.dietchartapp;

/**
 * Created by Jessie on 4/30/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomList extends BaseAdapter{
    Context theActivity;
    ArrayList<foodDetails> fd= new ArrayList<foodDetails>();

    public CustomList(Context ctx, ArrayList<foodDetails> list)
    {
        theActivity = ctx;
        fd = list;
    }
    @Override
    public int getCount() {

        return fd.size();
    }

    @Override
    public Object getItem(int i) {

        return null;
    }

    @Override
    public long getItemId(int i) {

        return 0;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {

        View newView = null;

            foodDetails food_current = fd.get(pos);

            LayoutInflater inflater=LayoutInflater.from(theActivity);


            newView = inflater.inflate(R.layout.mycustomrow,null,true);
            TextView  nameText = (TextView)newView.findViewById(R.id.food_name);
            nameText.setText(food_current.name);

            TextView  Salary = (TextView)newView.findViewById(R.id.calories);
            Salary.setText(food_current.calories);


            ImageView food_image = (ImageView)newView.findViewById(R.id.food_image);

        /*logic for attaching image*/

        return newView;
    }

}
