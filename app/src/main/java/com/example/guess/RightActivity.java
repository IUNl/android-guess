package com.example.guess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RightActivity extends AppCompatActivity {
    TextView tv;
    String tvs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_right );

        Intent intent = getIntent();
        tv = findViewById( R.id.textView_right );
        tv.setText( intent.getStringExtra( "in" ) );
    }
}
