package com.hrittik.listviewtut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView =  findViewById(R.id.myListView);
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Pizza");
        grocery.add("Biriyani");
        grocery.add("fried-rice");
        grocery.add("Chicken Chow");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this , android.R.layout.simple_dropdown_item_1line , grocery);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = "Item" + position + " " + ((TextView)view).getText().toString();
                Toast.makeText(MainActivity.this , text , Toast.LENGTH_SHORT).show();

            }
        });
    }
}