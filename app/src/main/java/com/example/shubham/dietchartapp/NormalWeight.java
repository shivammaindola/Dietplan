package com.example.shubham.dietchartapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jessie on 4/29/2017.
 */

public class NormalWeight extends AppCompatActivity {

    TextView t1,t2,t3;
    Intent t;
    float calories,calorieslose,caloriesgain;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_weight);
        t1 = (TextView) findViewById(R.id.textView30);
        t2 = (TextView) findViewById(R.id.textView25);
        t3 = (TextView) findViewById(R.id.textView27);
        b1 = (Button)findViewById(R.id.button4);
        b2 = (Button)findViewById(R.id.button7);
        t = getIntent();
        String value = t.getStringExtra("calories");
        t1.setText(value);
        calories = Float.parseFloat(t1.getText().toString());
        calorieslose = calories - 500;
        Log.d("calories lose","value"+calorieslose);
        String close = Float.toString(calorieslose);
        Log.d("calories lose","value"+close);
        caloriesgain = calories + 500;
        Log.d("calories lose","value"+calorieslose);
        String gain = Float.toString(caloriesgain);
        Log.d("calories lose","value"+gain);
        t1.setTextSize(20);
        t1.setTypeface(t1.getTypeface(), Typeface.BOLD);
        t2.setText(gain);
        t2.setTextSize(20);
        t2.setTypeface(t2.getTypeface(), Typeface.BOLD);
        t3.setText(close);
        t3.setTextSize(20);
        t3.setTypeface(t3.getTypeface(), Typeface.BOLD);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("inside","b1 click");
                //Log.d("caloriesgain2","value"+lose);
                Log.d("calorieslose 1 week","value"+calorieslose);
                Intent t = new Intent(NormalWeight.this,ViewItems.class);
                String s =String.valueOf(calorieslose);
                t.putExtra("values",s);
                startActivityForResult(t,0);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("inside","b1 click");
                //Log.d("caloriesgain2","value"+lose);
                Log.d("caloriesgain 1 week","value"+caloriesgain);
                Intent t = new Intent(NormalWeight.this,ViewItems.class);
                String s =String.valueOf(calorieslose);
                t.putExtra("values",s);
                startActivityForResult(t,0);

            }

        });
    }

}
