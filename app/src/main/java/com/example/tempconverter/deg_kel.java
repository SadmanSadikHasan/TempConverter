package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class deg_kel extends AppCompatActivity implements View.OnClickListener{

    private Button convert,back,history;
    private TextView result;
    private EditText enterTemp;
    double k;
    String s = "DEG-KEL";
    double temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deg_kel);
        Toast.makeText(deg_kel.this, "Relative Layout", Toast.LENGTH_LONG).show();

        convert = findViewById(R.id.convertId);
        back = findViewById(R.id.backId);
        result = findViewById(R.id.resultId);
        enterTemp = findViewById(R.id.enterTempId);
        history = findViewById(R.id.historyId);


        convert.setOnClickListener(this);
        back.setOnClickListener(this);
        history.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.convertId){
            double temp = Double.parseDouble(enterTemp.getText().toString());
            k = temp+273;
            result.setText(String.valueOf(k));
        }

        else if(v.getId() == R.id.backId){
            Intent backIntent = new Intent(deg_kel.this, MainActivity.class);
            startActivity(backIntent);
        }

        else if(v.getId() == R.id.historyId){
            Intent historyIntent = new Intent(deg_kel.this, history.class);
            String t = enterTemp.getText().toString();
            String x = String.valueOf(k);
            historyIntent.putExtra("contype",s);
            historyIntent.putExtra("input",t);
            historyIntent.putExtra("output",x);
            startActivity(historyIntent);
        }
    }
}
