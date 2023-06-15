package com.game.vmgaming;

import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.example.vmgaming.R;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private MusicControlReceiver receiver;
    CardView btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;

    TextView txt,solution,timerr;
    String data,value;

ImageView pse;
private boolean isResume;
    int val;
    boolean isNewOp=true;
    MediaPlayer backmusic,bton;

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        receiver=new MusicControlReceiver();
        IntentFilter filter=new IntentFilter("com.example.ACTION_PAUSE_MUSIC");
        registerReceiver(receiver,filter);
        Toast.makeText(getBaseContext(),"You Have 4 Chances",Toast.LENGTH_SHORT).show();
        Toast toast =Toast.makeText(this,"Get The Above Number To Check Your Luck !",Toast.LENGTH_LONG);

        toast.show();
        backmusic= MediaPlayer.create(MainActivity.this, R.raw.backgroundmusic);
        backmusic.start();

        timerr=findViewById(R.id.timer);
        ImageView imgone=findViewById( R.id.imgz);
        ImageView fam=findViewById(R.id.fam);
        ImageView out=findViewById(R.id.out);
        ImageView sizuuu=findViewById(R.id.sizuu);
        btn_1=findViewById(R.id.btnn1);
        btn_2=findViewById(R.id.btnn2);
        btn_3=findViewById(R.id.btnn3);
        btn_4=findViewById(R.id.btnn4);
        btn_5=findViewById(R.id.btnn5);
        btn_6=findViewById(R.id.btnn6);
        btn_7=findViewById(R.id.btnn7);
        btn_8=findViewById(R.id.btnn8);
        btn_9=findViewById(R.id.btnn9);

        txt=findViewById(R.id.txt);
        solution=findViewById(R.id.solution_tv);

        Random random=new Random();

            if (isNewOp)
                txt.setText("");
            isNewOp = false;
            btn_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playbtn();
                    if(random.nextBoolean()) {
                        val = random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"-");
                    }else {
                        val=random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"+");
                    }
                    btn_1.setEnabled(false);

                }
            });

            btn_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playbtn();


                    if(random.nextBoolean()) {
                        val = random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"-");
                    }else{
                        val=random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"+");
                    }
                    btn_2.setEnabled(false);
                }
            });

            btn_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playbtn();

                    if(random.nextBoolean()) {
                        val = +random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"+");
                    }else {
                        val=random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"-");
                    }
                        btn_3.setEnabled(false);
                    }

            });

            btn_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playbtn();
                    if(random.nextBoolean()) {
                        val = random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"-");
                    }else {
                        val=random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"+");
                    }
                    btn_4.setEnabled(false);
                }
            });

            btn_5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playbtn();
                    if(random.nextBoolean()) {
                        val = random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"-");
                    }else {
                        val=random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"+");
                    }
                    btn_5.setEnabled(false);
                }
            });

            btn_6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playbtn();
                    if(random.nextBoolean()) {
                        val = random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"-");
                    }else {
                        val=random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"+");
                    }
                    btn_6.setEnabled(false);
                }
            });

            btn_7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playbtn();
                    if(random.nextBoolean()) {
                        val = random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"-");
                    }else {
                        val=random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"+");
                    }
                    btn_7.setEnabled(false);


                }
            });

            btn_8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playbtn();
                    if(random.nextBoolean()) {
                        val = random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"-");
                    }else {
                        val=random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"+");
                    }
                    btn_8.setEnabled(false);
                }
            });

            btn_9.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                   playbtn();
                    if(random.nextBoolean()) {
                        val = random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"-");
                    }else {
                        val=random.nextInt(5);
                        data = txt.getText().toString();
                        value = data + val;
                        txt.setText(value+"+");
                    }
                    btn_9.setEnabled(false);
                }
            });


        InputFilter[] filters=new InputFilter[1];
        filters[0]=new InputFilter.LengthFilter(7);
        txt.setFilters(filters);

        TextWatcher textWatcher=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (s.length() == 7) {

                    txt.setEnabled(false);
                    data = txt.getText().toString();
                    Context rhino = Context.enter();
                    rhino.setOptimizationLevel(-1);
                    String finalresult ="";
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalresult = rhino.evaluateString(scriptable, data, "Javascript", 1, null).toString();
                        solution.setText(finalresult);
                    }

                }
            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        txt.addTextChangedListener(textWatcher);

       solution.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {

              double value2 =Double.parseDouble(s.toString());

    if(s.toString().equals("6.0")||s.toString().equals("1.0")||s.toString().equals("8.0")){
    imgone.setVisibility(View.VISIBLE);
    new CountDownTimer(5000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            timerr.setText("Game starts: "+millisUntilFinished/1000);
        }

        @Override
        public void onFinish() {

            timerr.setVisibility(View.GONE);
        }
    }.start();


    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            imgone.setVisibility(View.GONE);
            new CountDownTimer(5000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    timerr.setText("Game starts: "+millisUntilFinished/1000);
                }

                @Override
                public void onFinish() {

                    timerr.setVisibility(View.GONE);
                }
            }.start();
            Intent intent=new Intent(MainActivity.this,Playactivity.class);
            startActivity(intent);
            finish();
        }
    },5000);
}else if(s.toString().equals("2.0")||s.toString().equals("9.0")||s.toString().equals("4.0")){
    fam.setVisibility(View.VISIBLE);
    new CountDownTimer(5000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            timerr.setText("Game starts: "+millisUntilFinished/1000);
        }

        @Override
        public void onFinish() {

            timerr.setVisibility(View.GONE);
        }
    }.start();
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            fam.setVisibility(View.GONE);
            Intent intent=new Intent(MainActivity.this,Playactivity.class);
            startActivity(intent);
            finish();
        }
    },5000);
}else if(s.toString().equals("3.0")||s.toString().equals("7.0")||s.toString().equals("5.0")){
    sizuuu.setVisibility(View.VISIBLE);
    new CountDownTimer(5000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            timerr.setText("Game starts: "+millisUntilFinished/1000);
        }

        @Override
        public void onFinish() {

            timerr.setVisibility(View.GONE);
        }
    }.start();
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            sizuuu.setVisibility(View.GONE);
            Intent intent=new Intent(MainActivity.this,Playactivity.class);
            startActivity(intent);
            finish();
        }
    },5000);
}
else if(value2>9||value2<=0){
  out.setVisibility(View.VISIBLE);
    new CountDownTimer(5000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            timerr.setText("Game starts: "+millisUntilFinished/1000);
        }

        @Override
        public void onFinish() {

            timerr.setVisibility(View.GONE);
        }
    }.start();

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            out.setVisibility(View.GONE);
            Intent intent=new Intent(MainActivity.this,Playactivity.class);
            startActivity(intent);
            finish();
        }
    },5000);
}
           }

           @Override
           public void afterTextChanged( Editable s) {

           }
       });
            }

    private void playbtn(){
        bton=MediaPlayer.create(this, R.raw.btnsounsss);
                    bton.start();
       }

           @Override
           protected void onDestroy(){
        super.onDestroy();
        unregisterReceiver(receiver);
           }
           @Override
    protected void onStop(){
        super.onStop();
        if(backmusic!=null&&backmusic.isPlaying()){
            backmusic.stop();
            backmusic.release();
            backmusic=null;
        }
           }
       }

