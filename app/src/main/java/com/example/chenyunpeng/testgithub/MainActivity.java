package com.example.chenyunpeng.testgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void click2(View view){
        Toast.makeText(this,"被电击了",Toast.LENGTH_SHORT).show();
    }
}
