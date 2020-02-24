package com.example.guess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn;

    final double d = Math.random();
    final int rn = (int)(d*1000);

    int in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        et = findViewById( R.id.et_main );
        btn = findViewById( R.id.btn_main );

        //为EditText设置监听，注意监听类型为TextWatcher
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (et.getText().length() > 0) {
                    btn.setEnabled( true );
                    btn.setBackgroundResource( R.drawable.shape_oval );
                }else{
                    btn.setEnabled( false );
                    btn.setBackgroundResource( R.drawable.shape_oval_grey );
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = Integer.parseInt(et.getText().toString());
                if( in == rn ){
                    Intent intent_right = new Intent();
                    intent_right.setClass(MainActivity.this,RightActivity.class);
                    intent_right.putExtra( "in", "" + in );
                    startActivity(intent_right);
                }
                if( in > rn ){
                    Intent intent_big = new Intent();
                    intent_big.setClass(MainActivity.this,BigActivity.class);
                    intent_big.putExtra( "in", "" + in );
                    startActivity(intent_big);
                }
                if(in < rn ){
                    Intent intent_small = new Intent();
                    intent_small.setClass(MainActivity.this,SmallActivity.class);
                    intent_small.putExtra( "in", "" + in );
                    startActivity(intent_small);
                }
            }
        });
    }
}
