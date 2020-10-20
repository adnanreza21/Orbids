package com.amazing.orbids.materi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.orbids.R;
import com.amazing.orbids.anekagen.GenBungaActivity;
import com.amazing.orbids.anekagen.GenLabelumActivity;
import com.amazing.orbids.anekagen.GenPanjangActivity;
import com.amazing.orbids.anekagen.GenRumpunActivity;
import com.amazing.orbids.anekagen.GenTinggiActivity;
import com.amazing.orbids.limaM.MengamatiActivity;
import com.amazing.orbids.menu.DapusActivity;
import com.amazing.orbids.menu.GlosariumActivity;
import com.amazing.orbids.menu.KompetensiActivity;
import com.amazing.orbids.menu.KuisActivity;
import com.amazing.orbids.menu.MengenalActivity;
import com.amazing.orbids.menu.PetunjukActivity;
import com.amazing.orbids.menu.ProfilActivity;

public class MateriGenActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView panjangCard,rumpunCard,tinggiCard,bungaCard,labelumCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_gen);
        panjangCard = (CardView) findViewById(R.id.card1);
        rumpunCard = (CardView) findViewById(R.id.card2);
        tinggiCard = (CardView) findViewById(R.id.card3);
        bungaCard = (CardView) findViewById(R.id.card4);
        labelumCard = (CardView) findViewById(R.id.card5);

        panjangCard.setOnClickListener(this);
        rumpunCard.setOnClickListener(this);
        tinggiCard.setOnClickListener(this);
        bungaCard.setOnClickListener(this);
        labelumCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, GenPanjangActivity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this, GenRumpunActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this, GenTinggiActivity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this, GenBungaActivity.class);startActivity(i);break;
            case R.id.card5 : i = new Intent(this, GenLabelumActivity.class);startActivity(i);break;
            default:break;
        }
    }
}
