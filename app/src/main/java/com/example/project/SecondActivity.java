package com.example.project;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

        WebView myWebView;

        public void showInternalWebPage() {
            // TODO: Add your code for showing internal web page here
            myWebView.loadUrl("file:///android_asset/about.html");
        }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            myWebView = findViewById(R.id.my_WebView);

            showInternalWebPage();
        }

}