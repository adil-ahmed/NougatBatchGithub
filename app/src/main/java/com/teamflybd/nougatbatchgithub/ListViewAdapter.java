package com.teamflybd.nougatbatchgithub;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter{
    private Activity context;
    private ArrayList<String> peoples;
    private ArrayList<String> countries;

    public ListViewAdapter(Activity context, ArrayList<String> peoples, ArrayList<String> countries) {
        this.context = context;
        this.peoples = peoples;
        this.countries = countries;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
        {
            convertView = context.getLayoutInflater().inflate(R.layout.list_item, parent, false);
        }

        TextView dummyText = convertView.findViewById(R.id.dummytext);
        TextView dummyText2 = convertView.findViewById(R.id.dummytext2);
        String peoplesText = peoples.get(position).toString();
        String countryText = countries.get(position).toString();
        dummyText.setText(peoplesText);
        dummyText2.setText(countryText);
        return convertView;
    }
}
