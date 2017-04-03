package com.h2soft.pedram.rent;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.h2soft.pedram.rent.database.table.management.Building;

public class AddBuildingActivity extends AppCompatActivity {

    Building buildingManagement;
    EditText nameEditText;
    EditText plateNumberEditText;
    EditText cityEditText;
    EditText addressEditText;
    CheckBox parkingCheckBox;

    int toastMessage;


    public void onClickSubmitButton(View view) {

        long errorCheck =
                buildingManagement.insertInto(
                        nameEditText.getText().toString(),
                        Integer.parseInt(plateNumberEditText.getText().toString()),
                        addressEditText.getText().toString(),
                        cityEditText.getText().toString(),
                        parkingCheckBox.isChecked());
        if (errorCheck == -1)
            toastMessage = R.string.anErrorOccurred;
        else {
            toastMessage = R.string.DataAddedSuccessfully;
            startActivity(new Intent(this, MainActivity.class));
        }
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();


        /*
        Cursor c = buildingManagement.selectAllRows();
        int nameIndex = c.getColumnIndex("name");
        int plateIndex = c.getColumnIndex("plate_number");
        int cityIndex = c.getColumnIndex("city");
        int parkingIndex = c.getColumnIndex("parking");

        c.moveToFirst();
        while (c.moveToNext()){
            Log.i("NAME: ",c.getString(nameIndex));
            Log.i("PLATE NUMBER: ",c.getString(plateIndex));
            Log.i("CITY: ",c.getString(cityIndex));
            Log.i("PARKING ",c.getString(parkingIndex));
        }*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_building);
        // Initialization
        buildingManagement = new Building(AddBuildingActivity.this);

        nameEditText = (EditText) findViewById(R.id.buildingNameEditText);
        plateNumberEditText = (EditText) findViewById(R.id.plateNumberEditText);
        cityEditText = (EditText) findViewById(R.id.cityEditText);
        addressEditText = (EditText) findViewById(R.id.addressEditText);
        parkingCheckBox = (CheckBox) findViewById(R.id.parkingCheckBox);
    }
}
