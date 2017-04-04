package com.h2soft.pedram.rent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    String toastText;


    public void onClickSubmitButton(View view) {

        long check =
                buildingManagement.insertInto(
                        nameEditText.getText().toString(),
                        Integer.parseInt(plateNumberEditText.getText().toString()),
                        addressEditText.getText().toString(),
                        cityEditText.getText().toString(),
                        parkingCheckBox.isChecked());
        if (check == -1)
            toastText = getString(R.string.anErrorOccurred);
        else {
            toastText = getString(R.string.DataAddedSuccessfully) +
                    getString(R.string.colonID) + " " + check + " " + getString(R.string.added);
            startActivity(new Intent(this, MainActivity.class));
        }
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
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
