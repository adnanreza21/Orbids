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
import com.amazing.orbids.anekajenis.JenisBatangActivity;
import com.amazing.orbids.anekajenis.JenisBungaActivity;
import com.amazing.orbids.anekajenis.JenisDaunActivity;
import com.amazing.orbids.anekajenis.JenisLabelumActivity;

public class MateriJenisActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView batangCard,daunCard,bungaCard,labelumCard;
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

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, JenisBatangActivity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this, JenisDaunActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this, JenisBungaActivity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this, JenisLabelumActivity.class);startActivity(i);break;

            default:break;
        }
    }
}
