package com.example.numbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ans = (TextView)findViewById(R.id.ans);
        Intent intent = this.getIntent();
        ans.setText(intent.getStringExtra("wrong"));
    }

    public void back(View view){
        MainActivity2.this.finish();
    }
}