package com.swufe.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView out;
    EditText edit;
    final DecimalFormat df   = new DecimalFormat("######0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = findViewById(R.id.out);
        edit = findViewById(R.id.inp);

//        Button btn = (Button)findViewById(R.id.btn);
//        btn.setOnClickListener(this);
    }
//    @Override
//    public void onClick(View v){
//        Log.i("main","onClick msg....");
//        String str = edit.getText().toString();
//        out.setText("Hello"+str);
//    }

    public void btn(View v) {
        double C = Double.valueOf(edit.getText().toString());
        double F = C * 1.8 + 32;
        out.setText(df.format(F));
    }
}