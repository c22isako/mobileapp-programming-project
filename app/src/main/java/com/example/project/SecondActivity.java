package com.example.project;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            //Bundle extras = getIntent().getExtras();
            /*if (extras != null) {
                //String type = extras.getString("potatoType");
                //int number = extras.getInt("anyNumber");

                TextView ExtrasTextView = findViewById(R.id.secondActivityTextView);
                ExtrasTextView.setText("Potatos are great. Especially the type " + ". And Atleast " + " Each meal.");

            }

             */

        }
}