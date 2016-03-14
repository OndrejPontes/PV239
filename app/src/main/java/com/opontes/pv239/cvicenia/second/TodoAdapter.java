package com.opontes.pv239.cvicenia.second;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.opontes.pv239.cvicenia.R;
import com.opontes.pv239.cvicenia.second.Todo;

import java.util.List;

/**
 * Created by opontes on 09/03/16.
 */
public class TodoAdapter extends BaseAdapter {

    private List<Todo> todos;
    private Context context;
    private LayoutInflater inflater;

    public TodoAdapter(List<Todo> todos, Context context) {
        this.todos = todos;
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return todos.size();
    }

    @Override
    public Todo getItem(int position) {
        return todos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        Todo todo = getItem(position);
        convertView = inflater.inflate(R.layout.item_todo, parent, false);

        TextView description = (TextView) convertView.findViewById(R.id.todo_description);
        CheckBox check = (CheckBox) convertView.findViewById(R.id.todo_checkbox);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Todo t = getItem(position);
                t.setCheck(!t.isCheck());
                notifyDataSetChanged();
            }
        });

        description.setText(todo.getDescription());
        check.setChecked(todo.isCheck());

        return convertView;
    }
}
