package com.example.kyleskelly.searchbarapp;

import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "mbp.db"; //Mobile Pillbox Database
    public static final String TABLE_NAME = "medications_data";
    public static final String COL1 = "ID";
    public static final String COL2 = "DESCRIPTION";

    
}
