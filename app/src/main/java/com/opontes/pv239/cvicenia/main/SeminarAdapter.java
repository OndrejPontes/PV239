package com.opontes.pv239.cvicenia.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.opontes.pv239.cvicenia.R;

import java.util.List;

/**
 * Created by opontes on 3/7/16.
 */
public class SeminarAdapter extends BaseAdapter {

    private List<Seminar> seminarList;
    private Context context;
    private int textViewResourceId;
    private LayoutInflater inflater;

    public SeminarAdapter(Context context, int textViewResourceId, List<Seminar> seminarList) {
        this.seminarList = seminarList;
        this.context = context;
        this.textViewResourceId = textViewResourceId;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
}

    @Override
    public int getCount() {
        return seminarList.size();
    }

    @Override
    public Seminar getItem(int position) {
        return seminarList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        Seminar seminar = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_seminar, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.seminar_name);
            viewHolder.description = (TextView) convertView.findViewById(R.id.seminar_description);
            viewHolder.number = (TextView) convertView.findViewById(R.id.seminar_number);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.name.setText(seminar.getName());
        viewHolder.description.setText(seminar.getDescription());
        viewHolder.number.setText(String.valueOf(seminar.getNumber()));

        return convertView;
    }

    private static class ViewHolder {
        TextView name;
        TextView description;
        TextView number;
    }
}
