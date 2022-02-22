package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private MediaPlayer sonido,sonidoe,sonidoi,sonidoo,sonidou;
    private ImageView img, image,imagei,imageo,imageu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=(ImageView) findViewById(R.id.imgA);
        image=(ImageView) findViewById(R.id.imgE);
        imagei=(ImageView) findViewById(R.id.imgI);
        imageo=(ImageView) findViewById(R.id.imgO);
        imageu=(ImageView) findViewById(R.id.imgU);


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Seleccionastes la A", Toast.LENGTH_SHORT).show();
                sonido.start();
            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seleccionastes la E", Toast.LENGTH_LONG).show();
                sonidoe.start();
            }
        });

        imagei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seleccionastes la I", Toast.LENGTH_LONG).show();
                sonidoi.start();
            }
        });

        imageo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seleccionastes la O", Toast.LENGTH_LONG).show();
                sonidoo.start();
            }
        });

        imageu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seleccionastes la U", Toast.LENGTH_LONG).show();
                sonidou.start();
            }
        });









        sonido=MediaPlayer.create(getApplicationContext(),R.raw.a);
        sonidoe=MediaPlayer.create(getApplicationContext(),R.raw.e);
        sonidoi=MediaPlayer.create(getApplicationContext(),R.raw.i);
        sonidoo=MediaPlayer.create(getApplicationContext(),R.raw.o);
        sonidou=MediaPlayer.create(getApplicationContext(),R.raw.u);
    }


    }


