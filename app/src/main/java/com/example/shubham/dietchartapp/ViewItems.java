package com.example.shubham.dietchartapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

/**
 * Created by Jessie on 5/1/2017.
 */

public class ViewItems  extends AppCompatActivity {
    Intent gg;
    float value1,caloriesesent;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,caloriesaddedtodiet,caloriesyettobeadded,calorieslabel,t16;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    ImageView im1,im2,im3,im4,im5,im6,im7,im8,im9,im10;
    Button b1,b2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewfooditems);
        gg = getIntent();
        String ss = gg.getStringExtra("values");
        Log.d ("received","value" +ss);
        caloriesesent = Float.parseFloat(ss);
        Log.d("caloriessent","value"+caloriesesent);
        caloriesaddedtodiet=(TextView)findViewById(R.id.textView31);
        caloriesyettobeadded = (TextView)findViewById(R.id.textView35);
        calorieslabel = (TextView)findViewById(R.id.textView34);
        t16 = (TextView)findViewById(R.id.textView16);
        t16.setVisibility(INVISIBLE);
        t16.setTextSize(16);
        t16.setTypeface(t16.getTypeface(), Typeface.BOLD);
        calorieslabel.setVisibility(INVISIBLE);
        caloriesaddedtodiet.setVisibility(INVISIBLE);
        b1 = (Button)findViewById(R.id.button5);
        b2 = (Button)findViewById(R.id.button10);
        t1 = (TextView)findViewById(R.id.t1);
        t1.setTextSize(16);
        t1.setTypeface(t1.getTypeface(), Typeface.BOLD);
        e1 =(EditText)findViewById(R.id.e1);
        t2 = (TextView)findViewById(R.id.t3);
        t2.setTextSize(16);
        t2.setTypeface(t2.getTypeface(), Typeface.BOLD);
        e2 =(EditText)findViewById(R.id.e2);
        t3 = (TextView)findViewById(R.id.t5);
        t3.setTextSize(16);
        t3.setTypeface(t3.getTypeface(), Typeface.BOLD);
        e3 =(EditText)findViewById(R.id.e3);
        t4 = (TextView)findViewById(R.id.t7);
        t4.setTextSize(16);
        t4.setTypeface(t4.getTypeface(), Typeface.BOLD);
        e4 =(EditText)findViewById(R.id.e4);
        t5 = (TextView)findViewById(R.id.t9);
        t5.setTextSize(16);
        t5.setTypeface(t5.getTypeface(), Typeface.BOLD);
        e5 =(EditText)findViewById(R.id.e5);
        t6 = (TextView)findViewById(R.id.t11);
        t6.setTextSize(16);
        t6.setTypeface(t6.getTypeface(), Typeface.BOLD);
        e6 =(EditText)findViewById(R.id.e6);
        t7 = (TextView)findViewById(R.id.t13);
        t7.setTextSize(16);
        t7.setTypeface(t7.getTypeface(), Typeface.BOLD);
        e7 =(EditText)findViewById(R.id.e7);
        t8 = (TextView)findViewById(R.id.t15);
        t8.setTextSize(16);
        t8.setTypeface(t8.getTypeface(), Typeface.BOLD);
        e8 =(EditText)findViewById(R.id.e8);
        t9 = (TextView)findViewById(R.id.t17);
        t9.setTextSize(16);
        t9.setTypeface(t9.getTypeface(), Typeface.BOLD);
        e9 =(EditText)findViewById(R.id.e9);
        t10 = (TextView)findViewById(R.id.t19);
        t10.setTextSize(16);
        t10.setTypeface(t10.getTypeface(), Typeface.BOLD);
        e10 =(EditText)findViewById(R.id.e10);
        t12 = (TextView)findViewById(R.id.value);
        t12.setText(ss);
        t12.setTextSize(16);
        t12.setTypeface(t12.getTypeface(), Typeface.BOLD);
        t11 = (TextView)findViewById(R.id.textView28);
        t11.setVisibility(INVISIBLE);
        t11.setTextSize(16);
        t11.setTypeface(t11.getTypeface(), Typeface.BOLD);
        im1 = (ImageView)findViewById(R.id.imageView);
        im1.getLayoutParams().height = 100;
        im1.getLayoutParams().width = 150;
        im2 = (ImageView)findViewById(R.id.imageView1);
        im2.getLayoutParams().height = 100;
        im2.getLayoutParams().width = 150;
        im3 = (ImageView)findViewById(R.id.imageView2);
        im3.getLayoutParams().height = 100;
        im3.getLayoutParams().width = 150;
        im4 = (ImageView)findViewById(R.id.imageView3);
        im4.getLayoutParams().height = 100;
        im4.getLayoutParams().width = 150;
        im5 = (ImageView)findViewById(R.id.imageView4);
        im5.getLayoutParams().height = 100;
        im5.getLayoutParams().width = 150;
        im6 = (ImageView)findViewById(R.id.imageView6);
        im6.getLayoutParams().height = 100;
        im6.getLayoutParams().width = 150;
        im7 = (ImageView)findViewById(R.id.imageView7);
        im7.getLayoutParams().height = 100;
        im7.getLayoutParams().width = 150;
        im8 = (ImageView)findViewById(R.id.imageView8);
        im8.getLayoutParams().height = 100;
        im8.getLayoutParams().width = 150;
        im9 = (ImageView)findViewById(R.id.imageView9);
        im9.getLayoutParams().height = 100;
        im9.getLayoutParams().width = 150;
        im10 = (ImageView)findViewById(R.id.imageView10);
        im10.getLayoutParams().height = 100;
        im10.getLayoutParams().width = 150;
        im1.setVisibility(INVISIBLE);
        im2.setVisibility(INVISIBLE);
        im3.setVisibility(INVISIBLE);
        im4.setVisibility(INVISIBLE);
        im5.setVisibility(INVISIBLE);
        im6.setVisibility(INVISIBLE);
        im7.setVisibility(INVISIBLE);
        im8.setVisibility(INVISIBLE);
        im9.setVisibility(INVISIBLE);
        im10.setVisibility(INVISIBLE);
        t1.setVisibility(INVISIBLE);
        t2.setVisibility(INVISIBLE);
        t3.setVisibility(INVISIBLE);
        t4.setVisibility(INVISIBLE);
        t5.setVisibility(INVISIBLE);
        t6.setVisibility(INVISIBLE);
        t7.setVisibility(INVISIBLE);
        t8.setVisibility(INVISIBLE);
        t9.setVisibility(INVISIBLE);
        t10.setVisibility(INVISIBLE);
        e1.setVisibility(INVISIBLE);
        e2.setVisibility(INVISIBLE);
        e3.setVisibility(INVISIBLE);
        e4.setVisibility(INVISIBLE);
        e5.setVisibility(INVISIBLE);
        e6.setVisibility(INVISIBLE);
        e7.setVisibility(INVISIBLE);
        e8.setVisibility(INVISIBLE);
        e9.setVisibility(INVISIBLE);
        e10.setVisibility(INVISIBLE);
        b1.setVisibility(INVISIBLE);
        b2.setVisibility(INVISIBLE);
        t12.setVisibility(INVISIBLE);
        t16.setVisibility(INVISIBLE);
        calorieslabel.setVisibility(INVISIBLE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //create a menu with two options: play round 1 or play round two
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.foot_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.one:
                b2.setVisibility(VISIBLE);
                calorieslabel.setVisibility(INVISIBLE);
                caloriesaddedtodiet.setVisibility(INVISIBLE);
                im1.setImageResource(R.drawable.asparagus);
                im2.setImageResource(R.drawable.broccoli);
                im3.setImageResource(R.drawable.carrots);
                im4.setImageResource(R.drawable.cucumber);
                im5.setImageResource(R.drawable.eggplant);
                im6.setImageResource(R.drawable.lettuce);
                im7.setImageResource(R.drawable.tomato);
                im8.setVisibility(INVISIBLE);
                im9.setVisibility(INVISIBLE);
                im10.setVisibility(INVISIBLE);
                im1.setVisibility(VISIBLE);
                im2.setVisibility(VISIBLE);
                im3.setVisibility(VISIBLE);
                im4.setVisibility(VISIBLE);
                im5.setVisibility(VISIBLE);
                im6.setVisibility(VISIBLE);
                im7.setVisibility(VISIBLE);
                e1.setVisibility(VISIBLE);
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
                e5.setText("");
                e6.setText("");
                e7.setText("");
                e8.setText("");
                e9.setText("");
                e10.setText("");

                e2.setVisibility(VISIBLE);
                e3.setVisibility(VISIBLE);
                e4.setVisibility(VISIBLE);
                e5.setVisibility(VISIBLE);
                e6.setVisibility(VISIBLE);
                e7.setVisibility(VISIBLE);
                e8.setVisibility(INVISIBLE);
                e9.setVisibility(INVISIBLE);
                e10.setVisibility(INVISIBLE);
                t1.setVisibility(VISIBLE);
                t2.setVisibility(VISIBLE);
                t3.setVisibility(VISIBLE);
                t4.setVisibility(VISIBLE);
                t5.setVisibility(VISIBLE);
                t6.setVisibility(VISIBLE);
                t7.setVisibility(VISIBLE);
                t8.setVisibility(INVISIBLE);
                t9.setVisibility(INVISIBLE);
                t10.setVisibility(INVISIBLE);
                t11.setVisibility(VISIBLE);
                t12.setVisibility(VISIBLE);
                b1.setVisibility(VISIBLE);
                t12.setVisibility(VISIBLE);
                t1.setText("");
                t1.setText("1 cup 36 cal");
                t2.setText("");
                t2.setText("1 cup 40 cal");
                t3.setText("");
                t3.setText("1 cup 45 cal");
                t4.setText("");
                t4.setText("each 30 cal");
                t5.setText("");
                t5.setText("1 cup 38 cal");
                t6.setText("");
                t6.setText("1 cup 7 cal");
                t7.setText("");
                t7.setText("1 cup 29 cal");
                b2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");
                        e7.setText("");
                        e8.setText("");
                        e9.setText("");
                        e10.setText("");
                        caloriesyettobeadded.setVisibility(INVISIBLE);
                        caloriesaddedtodiet.setVisibility(INVISIBLE);
                        calorieslabel.setVisibility(INVISIBLE);
                        t16.setVisibility(INVISIBLE);

                    }

                });

                b1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        t16.setVisibility(VISIBLE);
                        calorieslabel.setVisibility(VISIBLE);
                        calorieslabel.setTextSize(16);
                        calorieslabel.setTypeface(calorieslabel.getTypeface(), Typeface.BOLD);
                        caloriesaddedtodiet.setVisibility(VISIBLE);
                        caloriesaddedtodiet.setTextSize(16);
                        caloriesaddedtodiet.setTypeface(caloriesaddedtodiet.getTypeface(), Typeface.BOLD);
                        String v1 = ((EditText)findViewById(R.id.e1)).getText().toString();
                        String v2 = ((EditText)findViewById(R.id.e2)).getText().toString();
                        String v3 = ((EditText)findViewById(R.id.e3)).getText().toString();
                        String v4 = ((EditText)findViewById(R.id.e4)).getText().toString();
                        String v5 = ((EditText)findViewById(R.id.e5)).getText().toString();
                        String v6 = ((EditText)findViewById(R.id.e6)).getText().toString();
                        String v7 = ((EditText)findViewById(R.id.e7)).getText().toString();
                        Log.d("v1"," "+v1);
                        Log.d("v1"," "+v2);
                        Log.d("v1"," "+v3);
                        Log.d("v1"," "+v4);
                        Log.d("v1"," "+v5);
                        Log.d("v1"," "+v6);
                        Log.d("v1"," "+v7);

                        if(v1.isEmpty()){
                            Log.d("v7","isempty");
                            v1 = "0";
                        }
                        if(v2.isEmpty()){
                            Log.d("v7","isempty");
                            v2 = "0";
                        }
                        if(v3.isEmpty()){
                            Log.d("v10","isempty");
                            v3 = "0";
                        }
                        if(v4.isEmpty()){
                            Log.d("v7","isempty");
                            v4 = "0";
                        }
                        if(v5.isEmpty()){
                            Log.d("v7","isempty");
                            v5 = "0";
                        }
                        if(v6.isEmpty()){
                            Log.d("v10","isempty");
                            v6 = "0";
                        }
                        if(v7.isEmpty()){
                            Log.d("v10","isempty");
                            v7 = "0";
                        }


                        float f1 = Float.parseFloat(v1);
                        Log.d("v1"," "+f1);
                        float f1new = f1 *36;
                        Log.d("v1"," "+f1new);

                        float f2 = Float.parseFloat(v2);
                        Log.d("v1"," "+f2);
                        float f2new = f2 *40;
                        Log.d("v1"," "+f2new);

                        float f3 = Float.parseFloat(v3);
                        float f3new = f3 *45;
                        Log.d("v1"," "+f3);
                        Log.d("v1"," "+f3new);

                        float f4 = Float.parseFloat(v4);
                        float f4new = f4 *30;

                        Log.d("v1"," "+f4);
                        Log.d("v1"," "+f4new);

                        float f5 = Float.parseFloat(v5);
                        float f5new = f5 *38;

                        Log.d("v1"," "+f5);
                        Log.d("v1"," "+f5new);

                        float f6 = Float.parseFloat(v6);
                        float f6new = f6 *7;

                        Log.d("v1"," "+f6);
                        Log.d("v1"," "+f6new);

                        float f7 = Float.parseFloat(v7);
                        float f7new = f7 *29;

                        Log.d("v1"," "+f7);
                        Log.d("v1"," "+f7new);

                        float total = f1new+f2new+f3new+f4new+f5new+f6new+f7new;
                        Log.d("v1total"," "+total);
                        Log.d("v1caloriessent"," "+caloriesesent);

                        String s = Float.toString(total);
                        caloriesaddedtodiet.setText(s);
                        caloriesaddedtodiet.setTextSize(16);
                        caloriesaddedtodiet.setTypeface(caloriesaddedtodiet.getTypeface(), Typeface.BOLD);

                        float finaltotal = 0;
                        finaltotal = caloriesesent - total;
                        Log.d("v1total"," "+total);

                        String s1 = Float.toString(finaltotal);
                        caloriesyettobeadded.setText(s1);
                        caloriesyettobeadded.setTextSize(16);
                        caloriesyettobeadded.setTypeface(caloriesyettobeadded.getTypeface(), Typeface.BOLD);

                        Log.d("inside main loop","vegetables"+total);


                        if ((caloriesesent-total) >100) {
                            AlertDialog.Builder build = new AlertDialog.Builder(ViewItems.this);
                            build.setTitle("Add more items");
                            build.setMessage("Add more vegetables to raise your calorie count");

                            build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }

                            });
                            AlertDialog done = build.create();
                            done.show();


                        }
                        else if(total > caloriesesent) {
                            //calorieslabel.setText(" ");
                            calorieslabel.setTextSize(16);
                            calorieslabel.setTypeface(calorieslabel.getTypeface(), Typeface.BOLD);
                            //calorieslabel.setText("ExtraCaloriesAdded");
                            AlertDialog.Builder build = new AlertDialog.Builder(ViewItems.this);
                            build.setTitle("Reduce your calorie intake");
                            build.setMessage("Keep your Calorie intake stable. Consuming more foods will not let you say FIT!!!");

                            build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }

                            });
                            AlertDialog done = build.create();
                            done.show();
                        }
                        else
                        {
                            //calorieslabel.setText(" ");
                            calorieslabel.setTextSize(16);
                            calorieslabel.setTypeface(calorieslabel.getTypeface(), Typeface.BOLD);
                            //calorieslabel.setText("CaloriesAddedToDiet");
                            AlertDialog.Builder build = new AlertDialog.Builder(ViewItems.this);
                            build.setTitle("Diet Plan");
                            build.setMessage("Keep Following this diet to stay Fit. Consume 2 liters of water on a regular basis along with some" +
                                    "healthy nuts added to your diet to stay FIT.");

                            build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }

                            });
                            AlertDialog done = build.create();
                            done.show();
                        }
                    }
                });
                return true;
            case R.id.two:
                calorieslabel.setVisibility(INVISIBLE);
                //calorieslabel.setText(" ");
                calorieslabel.setTextSize(16);
                calorieslabel.setTypeface(calorieslabel.getTypeface(), Typeface.BOLD);
                b2.setVisibility(VISIBLE);
                caloriesaddedtodiet.setVisibility(INVISIBLE);
                t16.setVisibility(INVISIBLE);
                im1.setVisibility(VISIBLE);
                im2.setVisibility(VISIBLE);
                im3.setVisibility(VISIBLE);
                im4.setVisibility(VISIBLE);
                im5.setVisibility(VISIBLE);
                im6.setVisibility(VISIBLE);
                im7.setVisibility(VISIBLE);
                im8.setVisibility(VISIBLE);
                im9.setVisibility(VISIBLE);
                im10.setVisibility(VISIBLE);
                b1.setVisibility(VISIBLE);
                e1.setVisibility(VISIBLE);
                e2.setVisibility(VISIBLE);
                e3.setVisibility(VISIBLE);
                e4.setVisibility(VISIBLE);
                e5.setVisibility(VISIBLE);
                e6.setVisibility(VISIBLE);
                e7.setVisibility(VISIBLE);
                e8.setVisibility(VISIBLE);
                e9.setVisibility(VISIBLE);
                e10.setVisibility(VISIBLE);
                t1.setVisibility(VISIBLE);
                t2.setVisibility(VISIBLE);
                t3.setVisibility(VISIBLE);
                t4.setVisibility(VISIBLE);
                t5.setVisibility(VISIBLE);
                t6.setVisibility(VISIBLE);
                t7.setVisibility(VISIBLE);
                t8.setVisibility(VISIBLE);
                t9.setVisibility(VISIBLE);
                t10.setVisibility(VISIBLE);
                t11.setVisibility(VISIBLE);
                t12.setVisibility(VISIBLE);
                t1.setText("");
                t1.setText("1 small 80cal");
                t2.setText("");
                t2.setText("1 medium 101cal");
                t3.setText(" ");
                t3.setText("each of 2 cal");
                t4.setText(" ");
                t4.setText("1 of 135 cal");
                t5.setText(" ");
                t5.setText("1 of 71 cal");
                t6.setText(" ");
                t6.setText("1 of 100 cal");
                t7.setText(" ");
                t7.setText("1 of 38 cal");
                t8.setText(" ");
                t8.setText("1 of 80 cal");
                t9.setText(" ");
                t9.setText("1 of 53 cal");
                t10.setText(" ");
                t10.setText("1 of 45 cal");
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
                e5.setText("");
                e6.setText("");
                e7.setText("");
                e8.setText("");
                e9.setText("");
                e10.setText("");
                im1.setImageResource(R.drawable.apple);
                im2.setImageResource(R.drawable.banana);
                im3.setImageResource(R.drawable.grape);
                im4.setImageResource(R.drawable.mango);
                im5.setImageResource(R.drawable.orange);
                im6.setImageResource(R.drawable.pear);
                //im7.setImageResource(R.drawable.peach);
                im8.setImageResource(R.drawable.pineapple);
                im9.setImageResource(R.drawable.strawberry);
                im10.setImageResource(R.drawable.watermelon);

                b2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");
                        e7.setText("");
                        e8.setText("");
                        e9.setText("");
                        e10.setText("");
                        caloriesyettobeadded.setVisibility(INVISIBLE);
                        caloriesaddedtodiet.setVisibility(INVISIBLE);
                        calorieslabel.setVisibility(INVISIBLE);
                        t16.setVisibility(INVISIBLE);

                    }

                });

                b1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        t16.setVisibility(VISIBLE);
                        calorieslabel.setVisibility(VISIBLE);
                        calorieslabel.setTextSize(16);
                        calorieslabel.setTypeface(calorieslabel.getTypeface(), Typeface.BOLD);
                        caloriesaddedtodiet.setVisibility(VISIBLE);
                        caloriesaddedtodiet.setTextSize(16);
                        caloriesaddedtodiet.setTypeface(caloriesaddedtodiet.getTypeface(), Typeface.BOLD);
                        String v1 = ((EditText)findViewById(R.id.e1)).getText().toString();
                        String v2 = ((EditText)findViewById(R.id.e2)).getText().toString();
                        String v3 = ((EditText)findViewById(R.id.e3)).getText().toString();
                        String v4 = ((EditText)findViewById(R.id.e4)).getText().toString();
                        String v5 = ((EditText)findViewById(R.id.e5)).getText().toString();
                        String v6 = ((EditText)findViewById(R.id.e6)).getText().toString();
                        String v7 = ((EditText)findViewById(R.id.e7)).getText().toString();
                        String v8 = ((EditText)findViewById(R.id.e8)).getText().toString();
                        String v9 = ((EditText)findViewById(R.id.e9)).getText().toString();
                        String v10 = ((EditText)findViewById(R.id.e10)).getText().toString();
                        Log.d("v1"," "+v1);
                        Log.d("v1"," "+v2);
                        Log.d("v1"," "+v3);
                        Log.d("v1"," "+v4);
                        Log.d("v1"," "+v5);
                        Log.d("v1"," "+v6);
                        Log.d("v1"," "+v7);
                        Log.d("v1"," "+v8);
                        Log.d("v1"," "+v9);
                        Log.d("v1"," "+v10);

                        if(v1.isEmpty()){
                            Log.d("v1","isempty");
                            v1 = "0";
                        }
                        if(v2.isEmpty()){
                            Log.d("v2","isempty");
                            v2 = "0";
                        }
                        if(v3.isEmpty()){
                            Log.d("v3","isempty");
                            v3 = "0";
                        }
                        if(v4.isEmpty()){
                            Log.d("v4","isempty");
                            v4 = "0";
                        }
                        if(v5.isEmpty()){
                            Log.d("v5","isempty");
                            v5 = "0";
                        }
                        if(v6.isEmpty()){
                            Log.d("v6","isempty");
                            v6 = "0";
                        }
                        if(v7.isEmpty()){
                            Log.d("v7","isempty");
                            v7 = "0";
                        }
                        if(v8.isEmpty()){
                            Log.d("v7","isempty");
                            v8 = "0";
                        }
                        if(v9.isEmpty()){
                            Log.d("v7","isempty");
                            v9 = "0";
                        }
                        if(v10.isEmpty()){
                            Log.d("v10","isempty");
                            v10 = "0";
                        }

                        float f1 = Float.parseFloat(v1);
                        Log.d("v1"," "+f1);
                        float f1new = f1 *80;
                        Log.d("v1"," "+f1new);

                        float f2 = Float.parseFloat(v2);
                        Log.d("v1"," "+f2);
                        float f2new = f2 *101;
                        Log.d("v1"," "+f2new);

                        float f3 = Float.parseFloat(v3);
                        float f3new = f3 *2;
                        Log.d("v1"," "+f3);
                        Log.d("v1"," "+f3new);

                        float f4 = Float.parseFloat(v4);
                        float f4new = f4*135;

                        Log.d("v1"," "+f4);
                        Log.d("v1"," "+f4new);

                        float f5 = Float.parseFloat(v5);
                        float f5new = f5 *71;

                        Log.d("v1"," "+f5);
                        Log.d("v1"," "+f5new);

                        float f6 = Float.parseFloat(v6);
                        float f6new = f6 *100;

                        Log.d("v1"," "+f6);
                        Log.d("v1"," "+f6new);

                        float f8 = Float.parseFloat(v8);
                        float f8new = f8 *80;

                        Log.d("v1"," "+f8);
                        Log.d("v1"," "+f8new);

                        float f9 = Float.parseFloat(v9);
                        float f9new = f9 *53;

                        Log.d("v1"," "+f9);
                        Log.d("v1"," "+f9new);

                        float f10 = Float.parseFloat(v10);
                        float f10new = f10 *45;

                        Log.d("v1"," "+f10);
                        Log.d("v1"," "+f10new);

                        float total = f1new+f2new+f3new+f4new+f5new+f6new+f8new+f9new+f10new;
                        String s = Float.toString(total);
                        caloriesaddedtodiet.setText(s);
                        caloriesaddedtodiet.setTextSize(16);
                        caloriesaddedtodiet.setTypeface(caloriesaddedtodiet.getTypeface(), Typeface.BOLD);
                        Log.d("v1total"," "+total);
                        Log.d("v1caloriessent"," "+caloriesesent);

                        float finaltotal = caloriesesent - total;
                        String s1 = Float.toString(finaltotal);
                        caloriesyettobeadded.setText(s1);
                        caloriesyettobeadded.setTextSize(16);
                        caloriesyettobeadded.setTypeface(caloriesyettobeadded.getTypeface(), Typeface.BOLD);
                        Log.d("v1total"," "+total);

                        if ((caloriesesent-total) >100) {
                            AlertDialog.Builder build = new AlertDialog.Builder(ViewItems.this);
                            build.setTitle("Add more items");
                            build.setMessage("Add more vegetables to raise your calorie count");

                            build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }

                            });
                            AlertDialog done = build.create();
                            done.show();


                        }
                        else if(total > caloriesesent) {
                            //calorieslabel.setText(" ");
                            //calorieslabel.setText("ExtraCaloriesAdded");
                            AlertDialog.Builder build = new AlertDialog.Builder(ViewItems.this);
                            build.setTitle("Reduce your calorie intake");
                            build.setMessage("Keep your Calorie intake stable. Consuming more foods will not let you say FIT!!!");

                            build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }

                            });
                            AlertDialog done = build.create();
                            done.show();
                        }
                        else
                        {
                            calorieslabel.setText("");
                            //calorieslabel.setText("CaloriesAddedToDiet");
                            AlertDialog.Builder build = new AlertDialog.Builder(ViewItems.this);
                            build.setTitle("Diet Plan");
                            build.setMessage("Keep Following this diet to stay Fit. Consume 2 liters of water on a regular basis along with some" +
                                    "healthy nuts added to your diet to stay FIT.");

                            build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }

                            });
                            AlertDialog done = build.create();
                            done.show();
                        }


                    }
                });

                return true;
            case R.id.three:
                calorieslabel.setVisibility(INVISIBLE);
                b2.setVisibility(VISIBLE);
                caloriesaddedtodiet.setVisibility(INVISIBLE);
                t16.setVisibility(INVISIBLE);
                t11.setVisibility(INVISIBLE);
                im1.setVisibility(VISIBLE);
                im2.setVisibility(VISIBLE);
                im3.setVisibility(VISIBLE);
                im4.setVisibility(VISIBLE);
                im5.setVisibility(VISIBLE);
                im6.setVisibility(VISIBLE);
                im7.setVisibility(VISIBLE);
                im8.setVisibility(INVISIBLE);
                im9.setVisibility(INVISIBLE);
                im10.setVisibility(INVISIBLE);
                b1.setVisibility(VISIBLE);
                e1.setVisibility(VISIBLE);
                e2.setVisibility(VISIBLE);
                e3.setVisibility(VISIBLE);
                e4.setVisibility(VISIBLE);
                e5.setVisibility(VISIBLE);
                e6.setVisibility(VISIBLE);
                e7.setVisibility(VISIBLE);
                e8.setVisibility(INVISIBLE);
                e9.setVisibility(INVISIBLE);
                e10.setVisibility(INVISIBLE);
                t1.setVisibility(VISIBLE);
                t2.setVisibility(VISIBLE);
                t3.setVisibility(VISIBLE);
                t4.setVisibility(VISIBLE);
                t5.setVisibility(VISIBLE);
                t6.setVisibility(VISIBLE);
                t7.setVisibility(VISIBLE);
                t8.setVisibility(INVISIBLE);
                t9.setVisibility(INVISIBLE);
                t10.setVisibility(INVISIBLE);
                t11.setVisibility(INVISIBLE);
                t12.setVisibility(VISIBLE);
                t1.setText("");
                t1.setText("1 SLICE 120 cal");
                t2.setText("");
                t2.setText("1 SLICE 95 cal ");
                t3.setText(" ");
                t3.setText("Large 79 cal");
                t4.setText(" ");
                t4.setText("2 oz 80 cal");
                t5.setText(" ");
                t5.setText("1 slice 130 cal");
                t6.setText(" ");
                t6.setText("2 oz 70 cal");
                t7.setText(" ");
                t7.setText("1 smallchop 112 cal");
                t11.setVisibility(VISIBLE);
                im1.setImageResource(R.drawable.beef);
                im2.setImageResource(R.drawable.chicken);
                im3.setImageResource(R.drawable.egg);
                im4.setImageResource(R.drawable.fish);
                im5.setImageResource(R.drawable.pork);
                im6.setImageResource(R.drawable.shrimp);
                im7.setImageResource(R.drawable.lamb);

                b2.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");
                        e7.setText("");
                        e8.setText("");
                        e9.setText("");
                        e10.setText("");
                        caloriesyettobeadded.setVisibility(INVISIBLE);
                        caloriesaddedtodiet.setVisibility(INVISIBLE);
                        calorieslabel.setVisibility(INVISIBLE);
                        t16.setVisibility(INVISIBLE);

                    }

                });
                b1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        calorieslabel.setVisibility(VISIBLE);
                        t16.setVisibility(VISIBLE);
                        calorieslabel.setVisibility(VISIBLE);
                        calorieslabel.setTextSize(16);
                        calorieslabel.setTypeface(calorieslabel.getTypeface(), Typeface.BOLD);
                        caloriesaddedtodiet.setVisibility(VISIBLE);
                        caloriesaddedtodiet.setTextSize(16);
                        caloriesaddedtodiet.setTypeface(caloriesaddedtodiet.getTypeface(), Typeface.BOLD);
                        String v1 = ((EditText) findViewById(R.id.e1)).getText().toString();
                        String v2 = ((EditText) findViewById(R.id.e2)).getText().toString();
                        String v3 = ((EditText) findViewById(R.id.e3)).getText().toString();
                        String v4 = ((EditText) findViewById(R.id.e4)).getText().toString();
                        String v5 = ((EditText) findViewById(R.id.e5)).getText().toString();
                        String v6 = ((EditText) findViewById(R.id.e6)).getText().toString();
                        String v7 = ((EditText) findViewById(R.id.e7)).getText().toString();
                        Log.d("v1", " " + v1);
                        Log.d("v1", " " + v2);
                        Log.d("v1", " " + v3);
                        Log.d("v1", " " + v4);
                        Log.d("v1", " " + v5);
                        Log.d("v1", " " + v6);
                        Log.d("v1", " " + v7);



                        if(v1.isEmpty()){
                            Log.d("v1","isempty");
                            v1 = "0";
                        }
                        if(v2.isEmpty()){
                            Log.d("v2","isempty");
                            v2 = "0";
                        }
                        if(v3.isEmpty()){
                            Log.d("v3","isempty");
                            v3 = "0";
                        }
                        if(v4.isEmpty()){
                            Log.d("v4","isempty");
                            v4 = "0";
                        }
                        if(v5.isEmpty()){
                            Log.d("v5","isempty");
                            v5 = "0";
                        }
                        if(v6.isEmpty()){
                            Log.d("v6","isempty");
                            v6 = "0";
                        }
                        if(v7.isEmpty()){
                            Log.d("v7","isempty");
                            v7 = "0";
                        }



                        float f1 = Float.parseFloat(v1);
                        Log.d("v1", " " + f1);
                        float f1new = f1 * 120;
                        Log.d("v1", " " + f1new);

                        float f2 = Float.parseFloat(v2);
                        Log.d("v2", " " + f2);
                        float f2new = f2 * 95;
                        Log.d("v2", " " + f2new);

                        float f3 = Float.parseFloat(v3);
                        Log.d("v3", " " + f3);
                        float f3new = f3 * 79;
                        Log.d("v3", " " + f3new);

                        float f4 = Float.parseFloat(v4);
                        Log.d("v4", " " + f4);
                        float f4new = f4 * 80;
                        Log.d("v4", " " + f4new);

                        float f5 = Float.parseFloat(v5);
                        Log.d("v5", " " + f5);
                        float f5new = f5 * 130;
                        Log.d("v5", " " + f5new);

                        float f6 = Float.parseFloat(v6);
                        Log.d("v6", " " + f6);
                        float f6new = f6 * 70;
                        Log.d("v6", " " + f6new);

                        float f7 = Float.parseFloat(v7);
                        Log.d("v7", " " + f7);
                        float f7new = f7 * 112;
                        Log.d("v7", " " + f7new);

                        float total = f1new+f2new+f3new+f4new+f5new+f6new+f7new;
                        Log.d("v1total"," "+total);
                        Log.d("v1caloriessent"," "+caloriesesent);

                        String s = Float.toString(total);
                        caloriesaddedtodiet.setText(s);

                        float finaltotal = caloriesesent - total;
                        Log.d("v1total"," "+total);

                        String s1 = Float.toString(finaltotal);
                        caloriesyettobeadded.setText(s1);
                        caloriesyettobeadded.setTextSize(16);
                        caloriesyettobeadded.setTypeface(caloriesyettobeadded.getTypeface(), Typeface.BOLD);

                        if ((caloriesesent-total) >100) {
                            calorieslabel.setText("BalanceCalories");
                            calorieslabel.setVisibility(VISIBLE);
                            AlertDialog.Builder build = new AlertDialog.Builder(ViewItems.this);
                            build.setTitle("Add more items");
                            build.setMessage("Add more meat to your diet to raise your calorie count");

                            build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }

                            });
                            AlertDialog done = build.create();
                            done.show();


                        }
                        else if(total > caloriesesent) {
                            calorieslabel.setText("BalanceCalories");
                            calorieslabel.setVisibility(VISIBLE);
                            //calorieslabel.setText("ExtraCaloriesAdded");
                            AlertDialog.Builder build = new AlertDialog.Builder(ViewItems.this);
                            build.setTitle("Reduce your calorie intake");
                            build.setMessage("Keep your Calorie intake stable. Consuming more meat will not let you say FIT!!!");

                            build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }

                            });
                            AlertDialog done = build.create();
                            done.show();
                        }
                        else
                        {
                            calorieslabel.setText("BalanceCalories");
                            calorieslabel.setVisibility(VISIBLE);
                            //calorieslabel.setText("CaloriesAddedToDiet");
                            AlertDialog.Builder build = new AlertDialog.Builder(ViewItems.this);
                            build.setTitle("Diet Plan");
                            build.setMessage("Keep Following this diet to stay Fit. Consume 2 liters of water on a regular basis along with some" +
                                    "healthy nuts added to your diet to stay FIT.");

                            build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }

                            });
                            AlertDialog done = build.create();
                            done.show();
                        }



                    }
                });





            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
