package com.croozer.animalkingdom;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NamesAdapter extends ArrayAdapter<Names> {

    public NamesAdapter(Activity context, ArrayList<Names> namesArrayList) {
        super(context, 0, namesArrayList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View namesAndImageListView = convertView;

        if (namesAndImageListView == null) {
            namesAndImageListView = LayoutInflater.from(getContext()).inflate(R.layout.items_for_list_view, parent, false);
        }

        Names currentName = getItem(position);

        ImageView imageViewPic = namesAndImageListView.findViewById(R.id.image_view_pic);
        imageViewPic.setImageResource(currentName.getmImageResourceId());

        ImageView imageViewLoc = namesAndImageListView.findViewById(R.id.image_view_loc);
        imageViewLoc.setImageResource(currentName.getmImageLocationId());

        TextView commonNamesTextView = namesAndImageListView.findViewById(R.id.text_view_common_name);
        commonNamesTextView.setText(currentName.getmCommonNames());

        TextView scientificNamesTextView = namesAndImageListView.findViewById(R.id.text_view_scientific_name);
        scientificNamesTextView.setText(currentName.getmScientificNames());



        return namesAndImageListView;
    }
}
