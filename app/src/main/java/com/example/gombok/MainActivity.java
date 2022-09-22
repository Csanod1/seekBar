package com.example.gombok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private EditText bekeres;
    private Button nagybetusGomb;
    private Button kisbetusGomb;
    private Button szinvaltasGomb;
    private TextView szinvaltasSzoveg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        nagybetusGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bekeres.setInputType(3);
            }
        });
        kisbetusGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bekeres.setInputType(0);
            }
        });
        szinvaltasGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init(){
        layout = findViewById(R.id.layout);
        bekeres = findViewById(R.id.bekeres);
        nagybetusGomb = findViewById(R.id.nagybetusGomb);
        kisbetusGomb = findViewById(R.id.kisbetusGomb);
        szinvaltasGomb = findViewById(R.id.szinvaltasGomb);
        szinvaltasSzoveg = findViewById(R.id.szinvaltosSzoveg);
    }
}