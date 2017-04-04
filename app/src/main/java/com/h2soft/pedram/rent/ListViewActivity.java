package com.h2soft.pedram.rent;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.h2soft.pedram.rent.database.table.management.Building;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    Building buildingManagement;
    ListView listView;
    ArrayList<String> houseNames;
    Cursor cursor;

    /**
     * Fill listView with buildings name of database.
     */
    public void updateLayout() {
        houseNames.clear();
        cursor = buildingManagement.selectAllRows();
        cursor.moveToFirst();
        while (cursor.moveToNext())
            // add each name of building to a list called houseNames.
            houseNames.add(cursor.getString(1));

        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, houseNames));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        buildingManagement = new Building(this);
        listView = (ListView) findViewById(R.id.listViewItem);
        houseNames = new ArrayList<>();
        updateLayout();
    }
}
