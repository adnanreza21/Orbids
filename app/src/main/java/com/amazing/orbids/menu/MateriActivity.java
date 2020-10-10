package com.amazing.orbids.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.orbids.R;
import com.amazing.orbids.limaM.MengamatiActivity;
import com.amazing.orbids.materi.MateriGenActivity;
import com.amazing.orbids.materi.MateriJenisActivity;

public class MateriActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView jenisCard, genCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
       jenisCard = (CardView) findViewById(R.id.card1);
        genCard = (CardView) findViewById(R.id.card2);

        jenisCard.setOnClickListener(this);
        genCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, MateriJenisActivity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this, MateriGenActivity.class);startActivity(i);break;

            default:break;
        }
    }
}
