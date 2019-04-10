package com.example.rohan;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements inter {
   TextView enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter=findViewById(R.id.btn_enter);

        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container_frame,new FragmentDemo());
        fragmentTransaction.commit();
    }

    @Override
    public void setmeassage(String s) {
    enter.setText(s);
    }

}
