package com.example.tictactoeex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btnNewGame;
    ImageView img0,img1,img2,img3,img4,img5,img6,img7,img8;
    ImageView imgWinnerOrTurn;
    boolean flag = true;
    int counter = 0;
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

        int[][] matrix = new int[3][3];


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
                    matrix[0][0] = 1;
                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img0.setImageResource(R.drawable.o);
                    flag = true;
                    matrix[0][0] = 0;
                }
                counter++;
                Log.i("MainActivity", print2D(matrix));
                if (counter > 5)
                    checkWinner(matrix);
                if (counter == 9){
                    imgWinnerOrTurn.setImageResource(R.drawable.nowin);
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
                    matrix[0][1] = 1;
                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img1.setImageResource(R.drawable.o);
                    flag = true;
                    matrix[0][1] = 0;
                }
                counter++;
                Log.i("MainActivity", print2D(matrix));
                if (counter > 5)
                    checkWinner(matrix);
                if (counter == 9){
                    imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                }

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    imgWinnerOrTurn.setImageResource(R.drawable.oplay);
                    img2.setImageResource(R.drawable.x);
                    flag = false;
                    matrix[0][2] = 1;
                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img2.setImageResource(R.drawable.o);
                    flag = true;
                    matrix[0][2] = 0;
                }
                counter++;
                Log.i("MainActivity", print2D(matrix));
                if (counter > 5)
                    checkWinner(matrix);
                if (counter == 9){
                    imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                }
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    imgWinnerOrTurn.setImageResource(R.drawable.oplay);
                    img3.setImageResource(R.drawable.x);
                    flag = false;
                    matrix[1][0] = 1;

                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img3.setImageResource(R.drawable.o);
                    flag = true;
                    matrix[1][0] = 0;
                }
                counter++;
                Log.i("MainActivity", print2D(matrix));
                if (counter > 5)
                    checkWinner(matrix);
                if (counter == 9){
                    imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                }
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    imgWinnerOrTurn.setImageResource(R.drawable.oplay);
                    img4.setImageResource(R.drawable.x);
                    flag = false;
                    matrix[1][1] = 1;
                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img4.setImageResource(R.drawable.o);
                    flag = true;
                    matrix[1][1] = 0;
                }
                counter++;
                Log.i("MainActivity", print2D(matrix));
                if (counter > 5)
                    checkWinner(matrix);
                if (counter == 9){
                    imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                }
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    imgWinnerOrTurn.setImageResource(R.drawable.oplay);
                    img5.setImageResource(R.drawable.x);
                    flag = false;
                    matrix[1][2] = 1;
                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img5.setImageResource(R.drawable.o);
                    flag = true;
                    matrix[1][2] = 0;
                }
                counter++;
                Log.i("MainActivity", print2D(matrix));
                if (counter > 5)
                    checkWinner(matrix);
                if (counter == 9){
                    imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                }
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    imgWinnerOrTurn.setImageResource(R.drawable.oplay);
                    img6.setImageResource(R.drawable.x);
                    flag = false;
                    matrix[2][0] = 1;
                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img6.setImageResource(R.drawable.o);
                    flag = true;
                    matrix[2][0] = 0;
                }
                counter++;
                Log.i("MainActivity", print2D(matrix));
                if (counter > 5)
                    checkWinner(matrix);
                if (counter == 9){
                    imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                }
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    imgWinnerOrTurn.setImageResource(R.drawable.oplay);
                    img7.setImageResource(R.drawable.x);
                    flag = false;
                    matrix[2][1] = 1;
                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img7.setImageResource(R.drawable.o);
                    flag = true;
                    matrix[2][1] = 0;
                }
                counter++;
                Log.i("MainActivity", print2D(matrix));
                if (counter > 5)
                    checkWinner(matrix);
                if (counter == 9){
                    imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                }
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    imgWinnerOrTurn.setImageResource(R.drawable.oplay);
                    img8.setImageResource(R.drawable.x);
                    flag = false;
                    matrix[2][2] = 1;
                }else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img8.setImageResource(R.drawable.o);
                    flag = true;
                    matrix[2][2] = 0;
                }
                counter++;
                Log.i("MainActivity", print2D(matrix));
                if (counter > 5)
                    checkWinner(matrix);
                if (counter == 9){
                    imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                }

            }
        });
    }

    public int checkWinner(int[][] matrix) {

        return 0;
    }

    public String print2D(int mat[][])
    {
        String matrix = "";
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++) {
                matrix += ((String.valueOf(mat[i][j])));
                matrix += " ";
            }
        }
        return matrix;
    }
}