package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class history extends AppCompatActivity {

    private TextView r2c1;
    private TextView r2c2;
    private TextView r2c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        Toast.makeText(history.this, "Table Layout", Toast.LENGTH_LONG).show();

        r2c1 = findViewById(R.id.r2c1Id);
        r2c2 = findViewById(R.id.r2c2Id);
        r2c3 = findViewById(R.id.r2c3Id);


        Bundle bundle = getIntent().getExtras();


        String a = bundle.getString("contype");
        r2c1.setText(a);
        String b = bundle.getString("input");
        r2c2.setText(b);
        String c = bundle.getString("output");
        r2c3.setText(c);
        }
}
