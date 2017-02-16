package com.hackingbuzz.gridview1;

/**
 * Created by Avi Hacker on 2/16/2017.
 */


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Avi Hacker on 12/11/2016.
 */

public class CustomAdapter extends BaseAdapter {

    String[] nameArray = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};

    LayoutInflater mInflater;
    public static final int MaxItems = 40;


    public CustomAdapter(LayoutInflater inflater) {
        mInflater = inflater;
    }


    @Override
    public int getCount() {
        return MaxItems;
    }

    @Override
    public Object getItem(int position) {    // this method returns what it has when we click on a button (when clicklistener call )..so tell here what you wanna print with toast (just the position (all it has got ) or somthing else modifly it
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {


            convertView = mInflater.inflate(R.layout.people_details, parent, false);
        }
        ImageView callNchat = (ImageView) convertView.findViewById(R.id.callNchat);

        TextView number = (TextView) convertView.findViewById(R.id.number);

        callNchat.setImageResource(R.drawable.emma);

        number.setText(nameArray[position]);  //


        return convertView;
    }
}