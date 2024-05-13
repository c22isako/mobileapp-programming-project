package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener{

    private RecyclerViewAdapter adapter;
    private Gson gson;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=c22isako";
    private ArrayList <RecyclerViewItem> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gson = new Gson();

        Button aboutButtonMain = findViewById(R.id.aboutButton);
        aboutButtonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                //intent.putExtra("potatoType", "King Edward"); // Optional
                //intent.putExtra("anyNumber", 7); // Optional

                startActivity(intent);
            }
        });

        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        items = new ArrayList<>(Arrays.asList(
                new RecyclerViewItem("potato1"),
                new RecyclerViewItem("potato2"),
                new RecyclerViewItem("potato3")));

        String json = gson.toJson(items);

        for(int i = 0; i< items.size(); i++) {
            Log.d("potato", items.get(i).getTitle());
        }
        adapter = new RecyclerViewAdapter(this, items, new RecyclerViewAdapter.OnClickListener() {

            @Override
            public void onClick(RecyclerViewItem item) {
                Log.d("potato", "hej");
            }

        });



        RecyclerView view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);

        Log.d("potato", "Has run");

        new JsonTask(this).execute(JSON_URL);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
        Log.d("potato", "onPostExecute in Main");
        Type type = new TypeToken<ArrayList<RecyclerViewItem>>(){}.getType();

        items = gson.fromJson(json, type);

        /*for(RecyclerViewItem r : items){

            String hello = getTitle().toString();
        }*/


        // Mountain mountain = gson.fromJson(json, Mountain.class);

        Log.d("potato", "Before update Data");
        adapter.UpdateData(items);

    }

}
