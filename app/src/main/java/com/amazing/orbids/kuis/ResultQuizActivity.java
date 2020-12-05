package com.amazing.orbids.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.amazing.orbids.R;
import com.amazing.orbids.menu.KuisActivity;

public class ResultQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quiz);
        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtKKM = (TextView) findViewById(R.id.textKKM);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        int a = 10;
        txtScore.setText("Nilaimu :\n" + score*a);

        if (score >= 8){
                txtKKM.setText("Selamat Nilai Anda sudah mencapai KKM ");
        }else if (score <8){
            txtKKM.setText("Nilai Anda belum mencapai KKM silahkan belajar lagi menggunakan Aplikasi ORBIDS");
        }

    }

           public void onClick(View view) {
        Intent intent = new Intent(ResultQuizActivity.this, KuisActivity.class);
        startActivity(intent);
        finish();
    }
}