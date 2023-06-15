package com.game.vmgaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.media.MediaPlayer;
import android.widget.Toast;

import com.example.vmgaming.R;


public class Playactivity extends AppCompatActivity {



    private ImageButton move,existt,pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playactivity);

        final MediaPlayer mediaPlayer=MediaPlayer.create(this, R.raw.buttonsound);

        move=findViewById(R.id.playbtn);
        existt=findViewById(R.id.exit);
        pause=findViewById(R.id.music);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                Intent intent= new Intent(Playactivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        existt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"You Have Exited",Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                Toast.makeText(getBaseContext(),"Resume",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent("com.example.ACTION_PAUSE_MUSIC");
                sendBroadcast(intent);
            }
        });

    }

    }

