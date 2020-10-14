package com.amazing.orbids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash2Activity extends AppCompatActivity {

    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        button = (Button) findViewById(R.id.mulai);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
    }
    public void openHomeActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}