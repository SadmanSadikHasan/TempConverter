package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class far_deg extends AppCompatActivity implements View.OnClickListener {

    private Button convert,back,history;
    private TextView result;
    private EditText enterTemp;
    double c;
    String s = "FAR-DEG";
    String t,x;
    double temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_far_deg);
        Toast.makeText(far_deg.this, "Relative Layout", Toast.LENGTH_LONG).show();

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
        //double temp = Double.parseDouble(enterTemp.getText().toString());
        //c = (5*(temp-32))/9;

        if(v.getId() == R.id.convertId){
            temp = Double.parseDouble(enterTemp.getText().toString());
            c = (5*(temp-32))/9;
            result.setText(String.valueOf(c));

            t = enterTemp.getText().toString();
            x = String.valueOf(c);

        }

        else if(v.getId() == R.id.backId){
            Intent backIntent = new Intent(far_deg.this, MainActivity.class);
            startActivity(backIntent);
        }

        else if(v.getId() == R.id.historyId){
            Intent historyIntent = new Intent(far_deg.this, history.class);
            Bundle bundle = new Bundle();
            bundle.putString("contype",s);
            bundle.putString("input",t);
            bundle.putString("output",x);
            historyIntent.putExtras(bundle);

            //historyIntent.putExtra("contype",s);
            //historyIntent.putExtra("input",t);
            //historyIntent.putExtra("output",x);
            startActivity(historyIntent);
        }

    }
}
