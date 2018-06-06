package com.example.ziyadmokhtar.dorrepaaltour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Map extends AppCompatActivity {
    private Button buttonVillaGazon;
    private Button buttonHoutwerkErf;
    private Button buttonTheeTuinWeide;
    private Button buttonMoestuinPluktuin;
    private Button buttonKasKwekerij;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        buttonVillaGazon = (Button) findViewById(R.id.buttonHoutwerkErf);
        buttonVillaGazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHoutwerkErf();
            }
        });
        buttonHoutwerkErf = (Button) findViewById(R.id.buttonHoutwerkErf);
        buttonHoutwerkErf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHoutwerkErf();
            }
        });
        buttonTheeTuinWeide = (Button) findViewById(R.id.buttonTheeTuinWeide);
        buttonTheeTuinWeide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheeTuinWeide();
            }
        });
        buttonMoestuinPluktuin = (Button) findViewById(R.id.buttonTheeTuinWeide);
        buttonMoestuinPluktuin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheeTuinWeide();
            }
        });
        buttonKasKwekerij = (Button) findViewById(R.id.buttonTheeTuinWeide);
        buttonKasKwekerij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheeTuinWeide();
            }
        });
    }

    public void openVillaGazon() {
        Intent intent = new Intent(this, Houtwerk.class);
        startActivity(intent);
    }

    public void openHoutwerkErf() {
        Intent intent = new Intent(this, Houtwerk.class);
        startActivity(intent);
    }

    public void openTheeTuinWeide() {
        Intent intent = new Intent(this, Theetuin_Weide.class);
        startActivity(intent);
    }
    public void openMoestuinPluktuin() {
        Intent intent = new Intent(this, Houtwerk.class);
        startActivity(intent);
    }

    public void openKasKwekerij() {
        Intent intent = new Intent(this, Houtwerk.class);
        startActivity(intent);
    }

}
