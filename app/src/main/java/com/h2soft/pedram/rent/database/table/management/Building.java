package com.h2soft.pedram.rent.database.table.management;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.h2soft.pedram.rent.database.attributes;

/**
 * Created by Pedram on 4/1/2017.<br>
 * Building Table Management Class.
 * Include <em>_id(INTEGER)</em>, <em>name(TEXT)</em>, <em>plate_number(INTEGER)</em>,
 * <em>address(TEXT)</em>, <em>city(TEXT)</em>, <em>image(BLOB)</em>, <em>parking(BOOL)</em> fields.
 */

public class Building extends Table {

    public Building(Context context) {
        super(context, "building_tbl");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        query = "CREATE TABLE "+ tableName +" ( " +
                "_id           INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "name          TEXT," +
                "plate_number  INTEGER," +
                "address       TEXT," +
                "city          TEXT," +
                "image         BLOB," +
                "parking       INTEGER" +
                ")";

        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long insertInto(String name, int plateNumber, String address, String city, boolean parking) {

        // _id is AUTOINCREMENT.
        values.put("name", name);
        values.put("plate_number", plateNumber);
        values.put("address", address);
        values.put("city", city);
        // values.put("image", );
        values.put("parking", parking);
        // Return -1 provided that a error occurred.
        return getWritableDatabase().insert(tableName, null, values);
    }


}
