package com.amazing.orbids.limaM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amazing.orbids.R;

public class MembuktikanActivity extends AppCompatActivity {
    private static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membuktikan);
        button = (Button) findViewById(R.id.answer1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMateriActivity();
            }
        });
    }

    public void openMateriActivity() {
        Intent intent = new Intent(this, MengkomunikasiActivity.class);
        startActivity(intent);
        finish();
    }
}