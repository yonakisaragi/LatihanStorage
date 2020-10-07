package com.example.latihanstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_internal, button_external;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button_internal=findViewById(R.id.buttonInternal);
        button_external=findViewById(R.id.buttonExternal);
    }

    public void launchInternalActivity(View view) {
        Intent i=new Intent(MainActivity.this, InternalActivity.class);
        startActivity(i);
    }

    public void launchExternalActivity(View view) {
        Intent a=new Intent(MainActivity.this, ExternalActivity.class);
        startActivity(a);
    }
}