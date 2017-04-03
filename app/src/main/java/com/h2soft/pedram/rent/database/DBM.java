package com.h2soft.pedram.rent.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by Pedram on 3/21/2017.
 */

public class DBM {
/*
    private String sqlExecuteCode;
    private SQLiteDatabase sqLiteDatabase;

    public DBM(SQLiteDatabase database) {
        sqLiteDatabase = database;

    }

    public void addBuilding(Building building) {

        //convert boolean to int (SQLite)
        int hasParking = (building.isParking()) ? 1 : 0;

        sqlExecuteCode = "INSERT INTO building_tbl(name, plate_number, address, city, parking) " +
                " VALUES (' " + building.getName()
                + "', '" + building.getPlateNumber()
                + "', '" + building.getAddress()
                + "', '" + building.getCity()
                + "', " + hasParking
                + ")";
        execSQL();
    }

    protected void execSQL() {
        sqLiteDatabase.execSQL(sqlExecuteCode);

        Cursor c = sqLiteDatabase.rawQuery("SELECT * FROM building_tbl",null);
        int nameIndex = c.getColumnIndex("name");
        int plateIndex = c.getColumnIndex("plate_number");
        int cityIndex = c.getColumnIndex("city");
        int parkingIndex = c.getColumnIndex("parking");

        c.moveToFirst();
        while (c!=null){
            Log.i("NAME: ",c.getString(nameIndex));
            Log.i("PLATE NUMBER: ",c.getString(plateIndex));
            Log.i("CITY: ",c.getString(cityIndex));
            Log.i("PARKING ",c.getString(parkingIndex));
        }

    }
*/
}
