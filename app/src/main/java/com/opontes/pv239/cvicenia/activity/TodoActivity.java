package com.opontes.pv239.cvicenia.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.opontes.pv239.cvicenia.R;
import com.opontes.pv239.cvicenia.adapter.TodoAdapter;
import com.opontes.pv239.cvicenia.data.Todo;

import java.util.ArrayList;

/**
 * Created by opontes on 09/03/16.
 */
public class TodoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_todo);

        setResult(RESULT_OK, new Intent());

        ListView todoList = (ListView) findViewById(R.id.list_of_todos);
        TodoAdapter todoAdapter = new TodoAdapter(loadTodos(), this);
        todoList.setAdapter(todoAdapter);
    }

    private ArrayList loadTodos(){
        return new ArrayList(){{
            add(new Todo("Read Effective Java", false));
            add(new Todo("Complete C# homework", false));
            add(new Todo("Go into space", false));
        }};
    }
}
