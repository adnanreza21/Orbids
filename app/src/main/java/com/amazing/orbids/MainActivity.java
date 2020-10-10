package com.amazing.orbids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.orbids.limaM.MengamatiActivity;
import com.amazing.orbids.menu.DapusActivity;
import com.amazing.orbids.menu.GlosariumActivity;
import com.amazing.orbids.menu.KompetensiActivity;
import com.amazing.orbids.menu.KuisActivity;
import com.amazing.orbids.menu.MateriActivity;
import com.amazing.orbids.menu.MengenalActivity;
import com.amazing.orbids.menu.PetunjukActivity;
import com.amazing.orbids.menu.ProfilActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView kdCard,petunjukCard,anggrekCard,materiCard,kuisCard,profilCard,dapusCard,glosaCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kdCard = (CardView) findViewById(R.id.card1);
        petunjukCard = (CardView) findViewById(R.id.card2);
        anggrekCard = (CardView) findViewById(R.id.card3);
        materiCard = (CardView) findViewById(R.id.card4);
        kuisCard = (CardView) findViewById(R.id.card5);
        profilCard = (CardView) findViewById(R.id.card6);
        dapusCard = (CardView) findViewById(R.id.card7);
        glosaCard = (CardView) findViewById(R.id.card8);

        kdCard.setOnClickListener(this);
        petunjukCard.setOnClickListener(this);
        anggrekCard.setOnClickListener(this);
        materiCard.setOnClickListener(this);
        kuisCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);
        dapusCard.setOnClickListener(this);
        glosaCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, KompetensiActivity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this, PetunjukActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this, MengenalActivity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this, MengamatiActivity.class);startActivity(i);break;
            case R.id.card5 : i = new Intent(this, KuisActivity.class);startActivity(i);break;
            case R.id.card6 : i = new Intent(this, ProfilActivity.class);startActivity(i);break;
            case R.id.card7 : i = new Intent(this, DapusActivity.class);startActivity(i);break;
            case R.id.card8 : i = new Intent(this, GlosariumActivity.class);startActivity(i);break;
            default:break;
        }
    }
}
