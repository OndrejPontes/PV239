package com.opontes.pv239.cvicenia.second;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.opontes.pv239.cvicenia.R;
import com.opontes.pv239.cvicenia.main.MainActivity;

import java.util.ArrayList;

/**
 * Created by opontes on 09/03/16.
 */
public class TodoActivity extends AppCompatActivity {

    ArrayList<Todo> todoList;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_todo);

        setResult(RESULT_OK, new Intent());

        if (savedInstanceState == null){
            todoList = loadTodos();
        } else {
            todoList = savedInstanceState.getParcelableArrayList(MainActivity.TODO_LIST);
        }
        ListView todoListView = (ListView) findViewById(R.id.list_of_todos);
        TodoAdapter todoAdapter = new TodoAdapter(todoList, this);
        todoListView.setAdapter(todoAdapter);

        editText = (EditText) findViewById(R.id.todo_edit);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putParcelableArrayList(MainActivity.TODO_LIST, todoList);
        super.onSaveInstanceState(outState);
    }

    private ArrayList loadTodos() {
        return new ArrayList() {{
            add(new Todo("Read Effective Java", false));
            add(new Todo("Complete C# homework", false));
            add(new Todo("Go into space", false));
        }};
    }

    public void addTodoItem(View view) {
        String description = editText.getText().toString();
        if ("".equals(description)) {
            Toast.makeText(view.getContext(), "Todo description is empty", Toast.LENGTH_LONG).show();
        } else {
            todoList.add(new Todo(description, false));
        }
        InputMethodManager inputManager =
                (InputMethodManager) view.getContext().
                        getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(
                this.getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
        editText.setText("");
    }
}
