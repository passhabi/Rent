package com.h2soft.pedram.rent;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class AddBuildingActivity extends AppCompatActivity {

    EditText nameEditText;
    EditText plateNumberEditText;
    EditText cityEditText;
    EditText addressEditText;
    CheckBox parkingCheckBox;


    public void onClickSubmitButton(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_building);
        // Initialization
        nameEditText = (EditText) findViewById(R.id.buildingNameEditText);
        plateNumberEditText = (EditText) findViewById(R.id.plateNumberEditText);
        cityEditText = (EditText) findViewById(R.id.cityEditText);
        addressEditText = (EditText) findViewById(R.id.addressEditText);
        parkingCheckBox = (CheckBox) findViewById(R.id.parkingCheckBox);
    }
}
