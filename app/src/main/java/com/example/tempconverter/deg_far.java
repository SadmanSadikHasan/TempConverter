package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class deg_far extends AppCompatActivity implements View.OnClickListener{

    private Button convert,back,history;
    private TextView result;
    private EditText enterTemp;
    String s = "DEG-FAR";
    String t,x;
    double temp;
    double f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deg_far);
        Toast.makeText(deg_far.this, "Absolute Layout", Toast.LENGTH_LONG).show();

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
            f = ((1.8*temp)+32);
            result.setText(String.valueOf(f));

            t = enterTemp.getText().toString();
            x = String.valueOf(f);
        }

        else if(v.getId() == R.id.backId){
            Intent backIntent = new Intent(deg_far.this, MainActivity.class);
            startActivity(backIntent);
        }

        else if(v.getId() == R.id.historyId){
            Intent historyIntent = new Intent(deg_far.this, history.class);
            //String t = enterTemp.getText().toString();
            //String x = String.valueOf(f);
            Bundle bundle = new Bundle();
            bundle.putString("contype",s);
            bundle.putString("input",t);
            bundle.putString("output",x);
            historyIntent.putExtras(bundle);
            /*historyIntent.putExtra("contype1",s);
            historyIntent.putExtra("input1",t);
            historyIntent.putExtra("output1",x);*/
            startActivity(historyIntent);
        }
    }
}
