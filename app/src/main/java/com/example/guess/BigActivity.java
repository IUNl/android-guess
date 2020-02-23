package com.example.guess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BigActivity extends AppCompatActivity {
    TextView tv;
    String tvs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_big );

        Intent intent = getIntent();
        tv = findViewById( R.id.textView_big );
        tv.setText( intent.getStringExtra( "in" ) );
    }
}
