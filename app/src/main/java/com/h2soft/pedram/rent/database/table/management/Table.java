package com.h2soft.pedram.rent.database.table.management;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.h2soft.pedram.rent.database.attributes;

/**
 * Created by Pedram on 4/1/2017.
 */

public abstract class Table extends SQLiteOpenHelper {

    protected String query;
    protected ContentValues values;
    protected String tableName;

    /**
     *
     * @param context
     * @param table name of the table you want specify.
     */
    public Table(Context context, String table) {
        super(context, attributes.getName(), null, attributes.getVersion());
        tableName = table;
        values = new ContentValues();
    }

    public Cursor selectAllRows()
    {
        query = "SELECT * FROM "+ tableName;
        return getReadableDatabase().rawQuery(query, null);
    }

}
