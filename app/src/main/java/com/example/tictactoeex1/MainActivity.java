package com.example.tictactoeex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnNewGame;
    ImageView img0,img1,img2,img3,img4,img5,img6,img7,img8;
    ImageView imgWinnerOrTurn;
    boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewGame = findViewById(R.id.main_btn);
        img0 = findViewById(R.id.main_imageView0);
        img1 = findViewById(R.id.main_imageView1);
        img2 = findViewById(R.id.main_imageView2);
        img3 = findViewById(R.id.main_imageView3);
        img4 = findViewById(R.id.main_imageView4);
        img5 = findViewById(R.id.main_imageView5);
        img6 = findViewById(R.id.main_imageView6);
        img7 = findViewById(R.id.main_imageView7);
        img8 = findViewById(R.id.main_imageView8);
        imgWinnerOrTurn = findViewById(R.id.main_imageViewWinnerTurn);

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(it);
            }
        });
        img0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    imgWinnerOrTurn.setImageResource(R.drawable.oplay);
                    img0.setImageResource(R.drawable.x);
                    flag = false;
                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img0.setImageResource(R.drawable.o);
                    flag = true;
                }
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    imgWinnerOrTurn.setImageResource(R.drawable.oplay);
                    img1.setImageResource(R.drawable.x);
                    flag = false;
                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img1.setImageResource(R.drawable.o);
                    flag = true;
                }
            }
        });
    }
}