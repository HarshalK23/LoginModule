package com.harshal.loginmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = " e793K6IxT7mZNaQFqjTJkz9tf";
    private static final String TWITTER_SECRET = "Wvb9JWtTtPTxQXWnqJzRrMq2vdWNpNMBpYIOzDlEQUk3W7YQvP";


    Button fb,g,t ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        setContentView(R.layout.activity_main);


     fb = (Button)findViewById(R.id.button);
        g= (Button)findViewById(R.id.button2);
        t =(Button)findViewById(R.id.button3);

        fb.setOnClickListener(this);
        g.setOnClickListener(this);
        t.setOnClickListener(this);

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

            case R.id.button3 :
                Intent i2 = new Intent(MainActivity.this, TwitterLogin.class);
                startActivity(i2);
                break;
        }

    }
}
