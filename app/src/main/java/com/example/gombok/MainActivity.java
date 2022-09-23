package com.example.gombok;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private EditText bekeres;
    private Button nagybetusGomb;
    private Button kisbetusGomb;
    private Button szinvaltasGomb;
    private TextView szinvaltasSzoveg;
    private Random rnd;
    private SeekBar seekbarSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        nagybetusGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szinvaltasSzoveg.setInputType(3);
                szinvaltasSzoveg.setText(bekeres.getText());
            }
        });
        kisbetusGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szinvaltasSzoveg.setInputType(0);
                szinvaltasSzoveg.setText(bekeres.getText());
            }
        });
        szinvaltasGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szinvaltasSzoveg.setText(bekeres.getText());
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                szinvaltasSzoveg.setBackgroundColor(Color.rgb(red, green, blue));
                if ((red+green+blue) > 450){
                    szinvaltasSzoveg.setTextColor(Color.BLACK);
                }else{
                    szinvaltasSzoveg.setTextColor(Color.WHITE);
                }
            }
        });
        seekbarSample.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

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
        seekbarSample = findViewById(R.id.seekbarSample);
    }
}