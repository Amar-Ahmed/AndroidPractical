package com.example.android.androidpractical;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {
    private SharedPreferences loginPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        loginPreferences = getSharedPreferences("loginPrefs", MODE_PRIVATE);
        String username = loginPreferences.getString("username", "");
        String password = loginPreferences.getString("password", "");
    }

}