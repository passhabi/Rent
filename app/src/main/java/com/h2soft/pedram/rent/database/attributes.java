package com.h2soft.pedram.rent.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Pedram on 3/31/2017.<br>
 * Attributes of Database
 */

public class attributes {

    private static final String Name = "rent.db";
    private static final int Version = 1;

    public static int getVersion() {
        return Version;
    }

    public static String getName() {
        return Name;
    }
}
