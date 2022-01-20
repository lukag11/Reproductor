package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button play;
    SoundPool sp;
    int sonidoReproduccion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button)findViewById(R.id.botonplay);

        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        // MAXIMO DE REPRODUCCION SIMULTANEAS - TIPO DE STRING DE AUDIO - CALIDAD DEL SONIDO.
        sonidoReproduccion = sp.load(this,R.raw.sound_short,1); // SE UTILIZA PARA CARGAR EL AUDIO


    }

    public void SoundPool (View view){

        sp.play(sonidoReproduccion, 1,1,1,0,0); // DONDE GUARDAMOS EL AUDIO
        // LOOP - CANTIDAD DE REPRODUCIONES -1 SE VA A REPETIR SIEMPRE - 0 UNA SOLA VEZ - 1



    }


    public void MediaPLayer (View view){

        MediaPlayer mp = MediaPlayer.create(this, R.raw.sound_long);
        mp.start();


    }

}
