package com.example.project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        items = new ArrayList<>(Arrays.asList(
                new RecyclerViewItem("mountain1"),
                new RecyclerViewItem("mountain2"),
                new RecyclerViewItem("mountain3")));
        adapter = new RecyclerViewAdapter(this, items, new RecyclerViewAdapter.OnClickListener() {


        });



    }


}
