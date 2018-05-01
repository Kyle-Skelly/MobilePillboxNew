package com.example.kyleskelly.searchbarapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.lang.Object;

public class CustomAdapter extends BaseAdapter {

    private List<Medication.MedicationEntity> mResults;
    private Context mContext;
    private LayoutInflater inflater;


    public CustomAdapter(Context mContext,List<Medication.MedicationEntity> mResults) {
        this.mResults = mResults;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mResults.size();
    }

    @Override
    public Object getItem(int position) {
        return mResults.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.each_list_item, parent, false);

        Medication.MedicationEntity item = (Medication.MedicationEntity) getItem(position);

        TextView effective_time = (TextView) rowView.findViewById(R.id.effective_time);
        TextView purpose = (TextView) rowView.findViewById(R.id.purpose);

        effective_time.setText(item.getEffective_time());
        purpose.setText(purpose.getText());



        return rowView;

    }
}
