package com.h2soft.pedram.rent;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    public void addBuildingButton(View view){
        startActivity(new Intent(this,AddBuildingActivity.class));
    }
    public void showItemsButton(View view){
        intent = new Intent(this,ListViewActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
