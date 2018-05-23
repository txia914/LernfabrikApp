package com.example.datenknecht.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private static final int Num_List_Items = 3;
    private SystemAdapter SystemAdapter;
    private RecyclerView mNumbersList;

    private Button openSetting;
    private Button newDevice_button;
//use git
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mNumbersList = (RecyclerView) findViewById(R.id.recycler_Systems);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mNumbersList.setLayoutManager(layoutManager);
        mNumbersList.setHasFixedSize(true);
        SystemAdapter = new SystemAdapter(Num_List_Items);
        mNumbersList.setAdapter(SystemAdapter);



        openSetting = (Button) findViewById(R.id.settings);

        openSetting.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainActivity.this;
                Class destinationActivity = Settings.class;
                Intent openSettingsActivityIntent = new Intent(context, destinationActivity);
                startActivity(openSettingsActivityIntent);
            }
        });

    }
}
