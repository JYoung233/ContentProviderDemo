package com.example.zju.contentproviderdemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yy on 16/7/5.
 */
public class DBOpenHelper extends SQLiteOpenHelper{
    private static final String DB_CREATE="create table peopleinfo"+"("+People.KEY_ID+"integer primary key autoincrement,"+People.KEY_NAME+"text not null,"+People.KEY_AGE+"integer,"+People.KEY_HEIGHT+"float);";

    public DBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
       sqLiteDatabase.execSQL(DB_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS peopleinfo");
        onCreate(sqLiteDatabase);

    }
}
