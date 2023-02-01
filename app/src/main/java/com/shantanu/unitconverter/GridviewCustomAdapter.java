package com.shantanu.unitconverter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridviewCustomAdapter extends BaseAdapter {

    Context context;
    int[] icons;
    String[] texts;
    LayoutInflater inflater;

    public GridviewCustomAdapter(Context context, int[] icons, String[] texts) {
        this.context = context;
        this.icons = icons;
        this.texts = texts;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return icons.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.grid_view_single_item, null);
        ImageView iv = (ImageView) view.findViewById(R.id.convertor_icon);
        TextView tv = (TextView) view.findViewById(R.id.convertor_text);
        iv.setImageResource(icons[i]);
        tv.setText(texts[i]);
        return view;
    }
}
