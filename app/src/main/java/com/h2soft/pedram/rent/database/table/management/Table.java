package com.h2soft.pedram.rent.database.table.management;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.h2soft.pedram.rent.database.attributes;

/**
 * Created by Pedram on 4/1/2017.
 * represent the least critical and common functions of classes that deal with tables in the database.
 * to define a new table in database, extend Table.
 */

public abstract class Table extends SQLiteOpenHelper {

    String query;
    ContentValues values;
    String tableName;

    /**
     * @param context to use to open or create the database
     * @param table   name of the table you want specify.
     */
    Table(Context context, String table) {
        super(context, attributes.getName(), null, attributes.getVersion());
        tableName = table;
        values = new ContentValues();
    }

    public Cursor selectAllRows() {
        query = "SELECT * FROM " + tableName;
        return getReadableDatabase().rawQuery(query, null);
    }

    // add later
    abstract public void clear();

    /**
     * For working this method, field id PRIMARY KEY must defined as _id.
     * @param id ,the row id you want to delete form the table.
     */
    public void deleteRow(int id) {
        query = "DELETE FROM " + tableName +
                "WHERE _id =" + id;

    }
}
