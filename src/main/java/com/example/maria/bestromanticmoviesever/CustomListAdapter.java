package com.example.maria.bestromanticmoviesever;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity Context;
    private final String[] ListItemsName;
    private final String[] ListItemsYear;
    private final Integer[] ImageName;
    private final String[] ListItemsStaring;

    public CustomListAdapter(Activity context, String[] content, Integer[] ImageName, String[] year, String[] staring) {

        super(context, R.layout.movies, content);

        this.Context = context;
        this.ListItemsName = content;
        this.ImageName = ImageName;
        this.ListItemsYear = year;
        this.ListItemsStaring = staring;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = Context.getLayoutInflater();
        View ListViewSingle = inflater.inflate(R.layout.movies, null, true);
        TextView ListViewItems = (TextView) ListViewSingle.findViewById(R.id.moviename);
        TextView ListViewItemsYears = (TextView) ListViewSingle.findViewById(R.id.movieyear);
        TextView ListViewItemsStaring = (TextView) ListViewSingle.findViewById(R.id.moviestaring);
        ImageView ListViewImage = (ImageView) ListViewSingle.findViewById(R.id.movieicon);

        ListViewItems.setText(ListItemsName[position]);
        ListViewItemsYears.setText(ListItemsYear[position]);
        ListViewItemsStaring.setText(ListItemsStaring[position]);
        ListViewImage.setImageResource(ImageName[position]);

        return ListViewSingle;

    }

}