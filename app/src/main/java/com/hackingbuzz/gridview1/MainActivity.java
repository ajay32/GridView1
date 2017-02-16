package com.hackingbuzz.gridview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView people = (GridView)findViewById(R.id.people);

        CustomAdapter adapter = new CustomAdapter(getLayoutInflater());

        people.setAdapter(adapter);


    }
}
