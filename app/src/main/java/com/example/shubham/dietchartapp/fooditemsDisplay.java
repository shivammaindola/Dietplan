package com.example.shubham.dietchartapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Jessie on 5/1/2017.
 */

public class fooditemsDisplay extends AppCompatActivity {

    sqlDatabase sql;
    SQLiteDatabase qdb;
    ListView lv;
    CustomList customAdapter;

    ArrayList<foodDetails> foodList = new ArrayList<foodDetails>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_db_listview);

        try {
            create_initialize_database();
        } catch (IOException e) {
            e.printStackTrace();
        }

        lv = (ListView)findViewById(R.id.view);
        customAdapter = new CustomList(fooditemsDisplay.this, foodList);
        lv.setAdapter(customAdapter);


    }


    void create_initialize_database() throws IOException {


        sql = new sqlDatabase(this,"foodDB.db",null,1);

        qdb = sql.getReadableDatabase();


        InputStream is_food_name = null;
        is_food_name = this.getResources().getAssets().open("food.txt");
        BufferedReader reader_food_name = new BufferedReader(new InputStreamReader(is_food_name));


        InputStream is_food_size = null;
        is_food_size = this.getResources().getAssets().open("size.txt");
        BufferedReader reader_food_size = new BufferedReader(new InputStreamReader(is_food_size));


        InputStream is_food_calories = null;
        is_food_calories = this.getResources().getAssets().open("calories.txt");
        BufferedReader reader_food_calories = new BufferedReader(new InputStreamReader(is_food_calories));



        if((is_food_name != null) && (is_food_size != null) &&(is_food_calories != null)){

            String str_name,str_size, str_calories;


            while( ((str_name = reader_food_name.readLine()) != null) &&
                    ((str_size= reader_food_size.readLine()) != null) &&
                    ((str_calories = reader_food_calories.readLine()) != null)){


                foodDetails fd_temp = new foodDetails(str_name,str_size,str_calories);

                ContentValues values = new ContentValues();
                values.put("name", str_name);
                values.put("size", str_size);
                values.put("calories", str_calories);
                qdb.insert("foods", null, values);

                //foodList.add();

            }
        }




    }



}
