package com.h2soft.pedram.rent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.h2soft.pedram.rent.database.table.management.Building;

public class ListViewActivity extends AppCompatActivity {

    private Building buildingManagement;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = (ListView) findViewById(R.id.listViewItem);

    }
}
