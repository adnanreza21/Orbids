package com.amazing.orbids.rangkuman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.orbids.R;

public class RangkumanActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView jenisCard,genCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangkuman);
        jenisCard = (CardView) findViewById(R.id.card1);
        genCard = (CardView) findViewById(R.id.card2);

        jenisCard.setOnClickListener(this);
        genCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, RangkumanJenisActivity.class);startActivity(i);break;
            case R.id.card2 : i = new Intent(this, RangkumanGenActivity.class);startActivity(i);break;

            default:break;
        }
    }
}
