package com.example.firstApp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "FirstApp");
    }
    public void handleClick(View view) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
    }
}