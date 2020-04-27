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

public class DietPlan extends AppCompatActivity {
    Intent t;
    TextView t1,tgain1,tgain2;
    float calories,calorieslose,caloriesgain;
    Button b1,b2;
    String close,gain;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_view);
        Log.d("inside","b1 inside");
        t1 = (TextView)findViewById(R.id.textView17);
        t =getIntent();
        String value = t.getStringExtra("calories");
        t1.setText(value);
        calories= Float.parseFloat(t1.getText().toString());
        calorieslose = calories +500;
        close = Float.toString(calorieslose);
        caloriesgain = calories +1000;
        gain = Float.toString(caloriesgain);
        t1.setTextSize(20);
        t1.setTypeface(t1.getTypeface(), Typeface.BOLD);
        t1.setText(value);
        tgain1 = (TextView)findViewById(R.id.textView25);
        tgain1.setTextSize(20);
        tgain1.setTypeface(tgain1.getTypeface(), Typeface.BOLD);
        tgain1.setText(close);
        tgain2= (TextView)findViewById(R.id.textView27);
        tgain2.setTextSize(20);
        tgain2.setTypeface(tgain2.getTypeface(), Typeface.BOLD);
        tgain2.setText(gain);
        b1 = (Button)findViewById(R.id.button4);
        b2 = (Button)findViewById(R.id.button6);
        Log.d("calorieslose","value"+close);

        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("inside","b1 click");
                Log.d("caloriesgain2","value"+close);
                Log.d("caloriesgain2","value"+caloriesgain);
                Intent t = new Intent(DietPlan.this,ViewItems.class);
                String s =String.valueOf(caloriesgain);
                t.putExtra("values",s);
                startActivityForResult(t,0);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("inside","b1 click");
                Log.d("calorieslose","value"+gain);
                Log.d("calorieslose","value"+calorieslose);
                Intent t = new Intent(DietPlan.this,ViewItems.class);
                String s =String.valueOf(calorieslose);
                t.putExtra("values",s);
                startActivityForResult(t,0);

                //startActivity(t);
            }
        });
            }






    }

