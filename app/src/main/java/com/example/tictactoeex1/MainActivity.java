package com.example.tictactoeex1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    Button btnNewGame;
    ImageView img0,img1,img2,img3,img4,img5,img6,img7,img8;
    ImageView imgWinnerOrTurn;
    ImageView resultView;
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
        resultView = findViewById(R.id.resultView1);

        int[][] matrix =
                {{-1, -1, -1}
                ,{-1, -1, -1}
                ,{-1, -1, -1}};


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
                img0.setClickable(false);
                counter++;
                if (counter >= 5) {
                    String s = checkWinner(matrix);
                    if (s != "noWinner") {
                        String result[] = markWinner(s).split(",");
                        if (result[0].equals("xwin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.xwin);
                        if (result[0].equals("owin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.owin);
                        switch (result[1]) {
                            case ("mark1"):
                                resultView.setImageResource(R.drawable.mark1);
                                break;
                            case ("mark2"):
                                resultView.setImageResource(R.drawable.mark2);
                                break;
                            case ("mark3"):
                                resultView.setImageResource(R.drawable.mark3);
                                break;
                            case ("mark4"):
                                resultView.setImageResource(R.drawable.mark4);
                                break;
                            case ("mark5"):
                                resultView.setImageResource(R.drawable.mark5);
                                break;
                            case ("mark6"):
                                resultView.setImageResource(R.drawable.mark6);
                                break;
                            case ("mark7"):
                                resultView.setImageResource(R.drawable.mark7);
                                break;
                            case ("mark8"):
                                resultView.setImageResource(R.drawable.mark8);
                                break;
                        }
                    }
                    if(counter == 9 && s == "noWinner"){
                        imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                    }
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
                img1.setClickable(false);
                counter++;
                if (counter >= 5) {
                    String s = checkWinner(matrix);
                    if (s != "noWinner") {
                        String result[] = markWinner(s).split(",");
                        if (result[0].equals("xwin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.xwin);
                        if (result[0].equals("owin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.owin);
                        switch (result[1]) {
                            case ("mark1"):
                                resultView.setImageResource(R.drawable.mark1);
                                break;
                            case ("mark2"):
                                resultView.setImageResource(R.drawable.mark2);
                                break;
                            case ("mark3"):
                                resultView.setImageResource(R.drawable.mark3);
                                break;
                            case ("mark4"):
                                resultView.setImageResource(R.drawable.mark4);
                                break;
                            case ("mark5"):
                                resultView.setImageResource(R.drawable.mark5);
                                break;
                            case ("mark6"):
                                resultView.setImageResource(R.drawable.mark6);
                                break;
                            case ("mark7"):
                                resultView.setImageResource(R.drawable.mark7);
                                break;
                            case ("mark8"):
                                resultView.setImageResource(R.drawable.mark8);
                                break;
                        }
                    }
                    if(counter == 9 && s == "noWinner"){
                        imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                    }
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
                img2.setClickable(false);
                counter++;
                if (counter >= 5) {
                    String s = checkWinner(matrix);
                    if (s != "noWinner") {
                        String result[] = markWinner(s).split(",");
                        if (result[0].equals("xwin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.xwin);
                        if (result[0].equals("owin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.owin);
                        switch (result[1]) {
                            case ("mark1"):
                                resultView.setImageResource(R.drawable.mark1);
                                break;
                            case ("mark2"):
                                resultView.setImageResource(R.drawable.mark2);
                                break;
                            case ("mark3"):
                                resultView.setImageResource(R.drawable.mark3);
                                break;
                            case ("mark4"):
                                resultView.setImageResource(R.drawable.mark4);
                                break;
                            case ("mark5"):
                                resultView.setImageResource(R.drawable.mark5);
                                break;
                            case ("mark6"):
                                resultView.setImageResource(R.drawable.mark6);
                                break;
                            case ("mark7"):
                                resultView.setImageResource(R.drawable.mark7);
                                break;
                            case ("mark8"):
                                resultView.setImageResource(R.drawable.mark8);
                                break;
                        }
                    }
                    if(counter == 9 && s == "noWinner"){
                        imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                    }
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
                img3.setClickable(false);
                counter++;
                if (counter >= 5) {
                    String s = checkWinner(matrix);
                    if (s != "noWinner") {
                        String result[] = markWinner(s).split(",");
                        if (result[0].equals("xwin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.xwin);
                        if (result[0].equals("owin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.owin);
                        switch (result[1]) {
                            case ("mark1"):
                                resultView.setImageResource(R.drawable.mark1);
                                break;
                            case ("mark2"):
                                resultView.setImageResource(R.drawable.mark2);
                                break;
                            case ("mark3"):
                                resultView.setImageResource(R.drawable.mark3);
                                break;
                            case ("mark4"):
                                resultView.setImageResource(R.drawable.mark4);
                                break;
                            case ("mark5"):
                                resultView.setImageResource(R.drawable.mark5);
                                break;
                            case ("mark6"):
                                resultView.setImageResource(R.drawable.mark6);
                                break;
                            case ("mark7"):
                                resultView.setImageResource(R.drawable.mark7);
                                break;
                            case ("mark8"):
                                resultView.setImageResource(R.drawable.mark8);
                                break;
                        }
                    }
                    if(counter == 9 && s == "noWinner"){
                        imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                    }
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
                img4.setClickable(false);
                counter++;
                if (counter >= 5) {
                    String s = checkWinner(matrix);
                    if (s != "noWinner") {
                        String result[] = markWinner(s).split(",");
                        if (result[0].equals("xwin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.xwin);
                        if (result[0].equals("owin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.owin);
                        switch (result[1]) {
                            case ("mark1"):
                                resultView.setImageResource(R.drawable.mark1);
                                break;
                            case ("mark2"):
                                resultView.setImageResource(R.drawable.mark2);
                                break;
                            case ("mark3"):
                                resultView.setImageResource(R.drawable.mark3);
                                break;
                            case ("mark4"):
                                resultView.setImageResource(R.drawable.mark4);
                                break;
                            case ("mark5"):
                                resultView.setImageResource(R.drawable.mark5);
                                break;
                            case ("mark6"):
                                resultView.setImageResource(R.drawable.mark6);
                                break;
                            case ("mark7"):
                                resultView.setImageResource(R.drawable.mark7);
                                break;
                            case ("mark8"):
                                resultView.setImageResource(R.drawable.mark8);
                                break;
                        }
                    }
                    if(counter == 9 && s == "noWinner"){
                        imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                    }
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
                img5.setClickable(false);
                counter++;
                if (counter >= 5) {
                    String s = checkWinner(matrix);
                    if (s != "noWinner") {
                        String result[] = markWinner(s).split(",");
                        if (result[0].equals("xwin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.xwin);
                        if (result[0].equals("owin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.owin);
                        switch (result[1]) {
                            case ("mark1"):
                                resultView.setImageResource(R.drawable.mark1);
                                break;
                            case ("mark2"):
                                resultView.setImageResource(R.drawable.mark2);
                                break;
                            case ("mark3"):
                                resultView.setImageResource(R.drawable.mark3);
                                break;
                            case ("mark4"):
                                resultView.setImageResource(R.drawable.mark4);
                                break;
                            case ("mark5"):
                                resultView.setImageResource(R.drawable.mark5);
                                break;
                            case ("mark6"):
                                resultView.setImageResource(R.drawable.mark6);
                                break;
                            case ("mark7"):
                                resultView.setImageResource(R.drawable.mark7);
                                break;
                            case ("mark8"):
                                resultView.setImageResource(R.drawable.mark8);
                                break;
                        }
                    }
                    if(counter == 9 && s == "noWinner"){
                        imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                    }
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
                img6.setClickable(false);
                counter++;
                if (counter >= 5) {
                    String s = checkWinner(matrix);
                    if (s != "noWinner") {
                        String result[] = markWinner(s).split(",");
                        if (result[0].equals("xwin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.xwin);
                        if (result[0].equals("owin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.owin);
                        switch (result[1]) {
                            case ("mark1"):
                                resultView.setImageResource(R.drawable.mark1);
                                break;
                            case ("mark2"):
                                resultView.setImageResource(R.drawable.mark2);
                                break;
                            case ("mark3"):
                                resultView.setImageResource(R.drawable.mark3);
                                break;
                            case ("mark4"):
                                resultView.setImageResource(R.drawable.mark4);
                                break;
                            case ("mark5"):
                                resultView.setImageResource(R.drawable.mark5);
                                break;
                            case ("mark6"):
                                resultView.setImageResource(R.drawable.mark6);
                                break;
                            case ("mark7"):
                                resultView.setImageResource(R.drawable.mark7);
                                break;
                            case ("mark8"):
                                resultView.setImageResource(R.drawable.mark8);
                                break;
                        }
                    }
                    if(counter == 9 && s == "noWinner"){
                        imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                    }
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
                img7.setClickable(false);
                counter++;
                if (counter >= 5) {
                    String s = checkWinner(matrix);
                    if (s != "noWinner") {
                        String result[] = markWinner(s).split(",");
                        if (result[0].equals("xwin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.xwin);
                        if (result[0].equals("owin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.owin);
                        switch (result[1]) {
                            case ("mark1"):
                                resultView.setImageResource(R.drawable.mark1);
                                break;
                            case ("mark2"):
                                resultView.setImageResource(R.drawable.mark2);
                                break;
                            case ("mark3"):
                                resultView.setImageResource(R.drawable.mark3);
                                break;
                            case ("mark4"):
                                resultView.setImageResource(R.drawable.mark4);
                                break;
                            case ("mark5"):
                                resultView.setImageResource(R.drawable.mark5);
                                break;
                            case ("mark6"):
                                resultView.setImageResource(R.drawable.mark6);
                                break;
                            case ("mark7"):
                                resultView.setImageResource(R.drawable.mark7);
                                break;
                            case ("mark8"):
                                resultView.setImageResource(R.drawable.mark8);
                                break;
                        }
                    }
                    if(counter == 9 && s == "noWinner"){
                        imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                    }
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
                } else {
                    imgWinnerOrTurn.setImageResource(R.drawable.xplay);
                    img8.setImageResource(R.drawable.o);
                    flag = true;
                    matrix[2][2] = 0;
                }
                img8.setClickable(false);
                counter++;
                if (counter >= 5) {
                    String s = checkWinner(matrix);
                    if (s != "noWinner") {
                        String result[] = markWinner(s).split(",");
                        if (result[0].equals("xwin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.xwin);
                        if (result[0].equals("owin"))
                            imgWinnerOrTurn.setImageResource(R.drawable.owin);
                        switch (result[1]) {
                            case ("mark1"):
                                resultView.setImageResource(R.drawable.mark1);
                                break;
                            case ("mark2"):
                                resultView.setImageResource(R.drawable.mark2);
                                break;
                            case ("mark3"):
                                resultView.setImageResource(R.drawable.mark3);
                                break;
                            case ("mark4"):
                                resultView.setImageResource(R.drawable.mark4);
                                break;
                            case ("mark5"):
                                resultView.setImageResource(R.drawable.mark5);
                                break;
                            case ("mark6"):
                                resultView.setImageResource(R.drawable.mark6);
                                break;
                            case ("mark7"):
                                resultView.setImageResource(R.drawable.mark7);
                                break;
                            case ("mark8"):
                                resultView.setImageResource(R.drawable.mark8);
                                break;
                        }
                    }
                    if(counter == 9 && s == "noWinner"){
                        imgWinnerOrTurn.setImageResource(R.drawable.nowin);
                    }
                }
            }
        });
    }

    private String markWinner(String s) {
        switch (s) {
            case "x0-1":
                return "xwin,mark6";
            case "x0-0":
                return "owin,mark6";
            case "x1-1":
                return "xwin,mark7";
            case "x1-0":
                return "owin,mark7";
            case "x2-1":
                return "xwin,mark8";
            case "x2-0":
                return "owin,mark8";
            case "y0-1":
                return "xwin,mark3";
            case "y0-0":
                return "owin,mark3";
            case "y1-1":
                return "xwin,mark4";
            case "y1-0":
                return "owin,mark4";
            case "y2-1":
                return "xwin,mark5";
            case "y2-0":
                return "owin,mark5";
            case "z1-1":
                return"xwin,mark1";
            case "z1-0":
                return"owin,mark1";
            case "z2-1":
                return"xwin,mark2";
            case "z2-0":
                return"owin,mark2";
        }
        return "x";
    }

    public String checkWinner(int[][] matrix) {
        int x0 = checkWinnerHelperHorizontal(0,matrix);
            if(x0==1)
                return "x0-1";
            if(x0==0)
                return "x0-0";
        int x1 = checkWinnerHelperHorizontal(1,matrix);
            if(x1==1)
                return "x1-1";
            if(x1==0)
                return "x1-0";
        int x2 = checkWinnerHelperHorizontal(2,matrix);
            if(x2==1)
                return "x2-1";
            if(x2==0)
                return "x2-0";
        int y1 = checkWinnerHelperVertical(0,matrix);
            if(y1==1)
                return "y0-1";
            if(y1==0)
                return "y0-0";
        int y2 = checkWinnerHelperVertical(1,matrix);
            if(y2==1)
                return "y1-1";
            if(y2==0)
                return "y1-0";
        int y3 = checkWinnerHelperVertical(2,matrix);
            if(y3==1)
                return "y2-1";
            if(y3==0)
                return "y2-0";
        int z1 = checkWinnerHelperDiagonalNormal(matrix);
            if(z1 == 1)
                return "z1-1";
            if(z1 == 0)
                return "z1-0";
        int z2 = checkWinnerHelperDiagonalReverse(matrix);
            if(z2 == 1)
                return "z2-1";
            if(z2 == 0)
                return "z2-0";
        return "noWinner";
    }

    public String print2D(int mat[][]) {
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

    public int checkWinnerHelperHorizontal(int index, int[][] matrix){
        int winCountX = 0;
        int winCountO = 0;
        for (int i = 0; i < 3; i++) {
            if(matrix[index][i] == 1)
                winCountX++;
            if(matrix[index][i] == 0)
                winCountO++;
        }
        if (winCountX == 3)
            return 1;
        if (winCountO == 3)
            return 0;
        return 2;
    }

    public int checkWinnerHelperVertical(int jndex, int[][] matrix){
        int winCountX = 0;
        int winCountO = 0;
        for (int i = 0; i < 3; i++) {
            if(matrix[i][jndex] == 1)
                winCountX++;
            if(matrix[i][jndex] == 0)
                winCountO++;
        }
        if (winCountX == 3)
            return 1;
        if (winCountO == 3)
            return 0;
        return 2;
    }

    public int checkWinnerHelperDiagonalNormal(int[][] matrix){
        int winCountX = 0;
        int winCountO = 0;
        for (int i = 0; i < 3; i++) {
            if(matrix[i][i] == 1)
                winCountX++;
            if(matrix[i][i] == 0)
                winCountO++;
        }
        if (winCountX == 3)
            return 1;
        if (winCountO == 3)
            return 0;
        return 2;
    }

    public int checkWinnerHelperDiagonalReverse(int[][] matrix){
        int winCountX = 0;
        int winCountO = 0;
        for (int i = 0; i < 3; i++) {
            if(matrix[i][2-i] == 1)
                winCountX++;
            if(matrix[i][2-i] == 0)
                winCountO++;
        }
        if (winCountX == 3)
            return 1;
        if (winCountO == 3)
            return 0;
        return 2;
    }
}