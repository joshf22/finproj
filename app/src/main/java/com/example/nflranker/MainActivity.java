package com.example.nflranker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView bears;
    ImageView packers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bears = findViewById(R.id.chi);
        packers = findViewById(R.id.gb);

        bears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You chose the Chicago Bears", Toast.LENGTH_SHORT).show();
            }
        });

        packers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You chose the Green Bay Packers", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
