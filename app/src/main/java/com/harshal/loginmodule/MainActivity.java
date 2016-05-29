package com.harshal.loginmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button fb,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     fb = (Button)findViewById(R.id.button);
        g= (Button)findViewById(R.id.button2);

        fb.setOnClickListener(this);
        g.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.button :
                Intent i = new Intent(MainActivity.this, FacebookLogin.class);
                startActivity(i);
                break;

            case R.id.button2 :
                Intent i1 = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i1);
                break;
        }

    }
}
