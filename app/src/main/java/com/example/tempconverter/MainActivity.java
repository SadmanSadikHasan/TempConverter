package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView day, night;
    private Button fd;
    private Button df;
    private Button dk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Frame Layout", Toast.LENGTH_LONG).show();

        day = findViewById(R.id.dayId);
        night = findViewById(R.id.nightId);
        fd = findViewById(R.id.fdId);
        df = findViewById(R.id.dfId);
        dk= findViewById(R.id.dkId);

        day.setOnClickListener(this);
        night.setOnClickListener(this);
        fd.setOnClickListener(this);
        df.setOnClickListener(this);
        dk.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.dayId){
            day.setVisibility(v.GONE);
            night.setVisibility(v.VISIBLE);
        }
        else if(v.getId() == R.id.nightId){
            night.setVisibility(v.GONE);
            day.setVisibility(v.VISIBLE);
        }

        else if(v.getId() == R.id.fdId){
            Intent fdIntent = new Intent(MainActivity.this, far_deg.class);
            startActivity(fdIntent);
        }

        else if(v.getId() == R.id.dfId){
            Intent dfIntent = new Intent(MainActivity.this, deg_far.class);
            startActivity(dfIntent);
        }
        else if(v.getId() == R.id.dkId){
            Intent dkIntent = new Intent(MainActivity.this, deg_kel.class);
            startActivity(dkIntent);
        }

    }
}
