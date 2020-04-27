package com.example.shubham.dietchartapp;

/**
 * Created by Jessie on 4/30/2017.
 */


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class sqlDatabase extends SQLiteOpenHelper{


    int DB_VERSION;
    String DB_NAME;
    Context context;

    public sqlDatabase(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.context = context;
        DB_VERSION = version;
        DB_NAME = name;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE foods ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name TEXT NOT NULL, "
                + "size TEXT NOT NULL,"
                + "calories TEXT NOT NULL )"
        );

    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //erase or upgrade database

    }

}

