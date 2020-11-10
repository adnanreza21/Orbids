package com.amazing.orbids.materi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amazing.orbids.R;
import com.amazing.orbids.anekajenis.JenisBatangActivity;
import com.amazing.orbids.anekajenis.JenisBungaActivity;
import com.amazing.orbids.anekajenis.JenisDaunActivity;
import com.amazing.orbids.anekajenis.JenisLabelumActivity;
import com.amazing.orbids.anekajenis.LanjutJenisActivity;

public class MateriJenisActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView batangCard, daunCard, bungaCard, labelumCard;
    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_jenis);
        batangCard = (CardView) findViewById(R.id.card1);
        daunCard = (CardView) findViewById(R.id.card2);
        bungaCard = (CardView) findViewById(R.id.card3);
        labelumCard = (CardView) findViewById(R.id.card4);

        batangCard.setOnClickListener(this);
        daunCard.setOnClickListener(this);
        bungaCard.setOnClickListener(this);
        labelumCard.setOnClickListener(this);
        button = (Button) findViewById(R.id.answer1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMateriActivity();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.card1:
                i = new Intent(this, JenisBatangActivity.class);
                startActivity(i);
                break;
            case R.id.card2:
                i = new Intent(this, JenisDaunActivity.class);
                startActivity(i);
                break;
            case R.id.card3:
                i = new Intent(this, JenisBungaActivity.class);
                startActivity(i);
                break;
            case R.id.card4:
                i = new Intent(this, JenisLabelumActivity.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }

    public void openMateriActivity() {
        Intent intent = new Intent(this, LanjutJenisActivity.class);
        startActivity(intent);
        finish();
    }
}
