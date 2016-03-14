package com.opontes.pv239.cvicenia.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.opontes.pv239.cvicenia.R;
import com.opontes.pv239.cvicenia.first.SquareActivity;
import com.opontes.pv239.cvicenia.second.TodoActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    public final static String TODO_LIST = "todoList";

    ListView seminarList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        seminarList = (ListView) findViewById(R.id.list_of_seminar);
        SeminarAdapter seminarAdapter = new SeminarAdapter(this, R.layout.item_seminar, loadSeminarData());
        seminarList.setAdapter(seminarAdapter);
        seminarList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, SquareActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, TodoActivity.class));
                        break;
                    default:
                        Toast.makeText(view.getContext(), "NO DATA !!!", Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    private List<Seminar> loadSeminarData()
    {
        List<Seminar> seminarList = new ArrayList<>();

        seminarList.add(new Seminar(
                "Vkladanie štvorčekov",
                "Základné informácie o Android Štúdiu a jeho funkciách.",
                1
        ));
        seminarList.add(new Seminar(
                "Vytváranie List View",
                "Neviem čo sa rozoberalo na cviku, išlo to moc rýchlo.",
                2
        ));
        seminarList.add(new Seminar(
                "Neznáme",
                "Ak budú bližšie informácie treba doplniť",
                3
        ));
        seminarList.add(new Seminar(
                "Neznáme",
                "Ak budú bližšie informácie treba doplniť",
                4
        ));
        seminarList.add(new Seminar(
                "Neznáme",
                "Ak budú bližšie informácie treba doplniť",
                5
        ));
        seminarList.add(new Seminar(
                "Neznáme",
                "Ak budú bližšie informácie treba doplniť",
                6
        ));
        seminarList.add(new Seminar(
                "Neznáme",
                "Ak budú bližšie informácie treba doplniť",
                7
        ));
        seminarList.add(new Seminar(
                "Neznáme",
                "Ak budú bližšie informácie treba doplniť",
                8
        ));
        seminarList.add(new Seminar(
                "Neznáme",
                "Ak budú bližšie informácie treba doplniť",
                9
        ));
        seminarList.add(new Seminar(
                "Neznáme",
                "Ak budú bližšie informácie treba doplniť",
                10
        ));
        seminarList.add(new Seminar(
                "Neznáme",
                "Ak budú bližšie informácie treba doplniť",
                11
        ));
        seminarList.add(new Seminar(
                "Neznáme",
                "Ak budú bližšie informácie treba doplniť",
                12
        ));

        return seminarList;
    }
}
