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

    private List<Medication.Results> mResults;
    private Context mContext;
    private LayoutInflater inflater;


    /**
     * Auto-Generated Constructors, getters and setters for the CustomAdapter class in which are two fields, the mResults and mContext
     *
     * @param mContext
     * @param mResults
     */

    public CustomAdapter(Context mContext,List<Medication.Results> mResults) {
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

    /**
     * This getView method is to display each medication in the ListView. The effective_time and purpose parameters were placeholders until
     * the method was finished, to be replaced with generic_name and the brand name.
     * item is a result of the Medication.Results, which uses the getItem(position) to access that specific item in the array of medications
     * The Layout inflater is used to inflate a specific xml file, in this case the each_list_item is the one xml file being used.
     * @param position
     * @param convertView
     * @param parent
     * @return rowView
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.each_list_item, parent, false);

        Medication.Results item = (Medication.Results) getItem(position);

        TextView effective_time = (TextView) rowView.findViewById(R.id.effective_time);
        TextView purpose = (TextView) rowView.findViewById(R.id.purpose);

        effective_time.setText(item.getEffective_time());
        purpose.setText(purpose.getText());
        

        return rowView;

    }
}
