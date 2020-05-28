package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private Button btnStart;
    private LinearLayout c1, c2, u1, u2;
    private boolean c_u = false;
    private int counterC1, counterC2, counterU1, counterU2;
    private int counterC = 0;
    private int counterU = 0;
    private TextView textComp, textUser, againText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c1 = findViewById(R.id.comp1);
        c2 = findViewById(R.id.comp2);
        u1 = findViewById(R.id.user1);
        u2 = findViewById(R.id.user2);
        textComp = findViewById(R.id.textComp);
        textUser = findViewById(R.id.textUser);
        againText = findViewById(R.id.again);
        btnStart = findViewById(R.id.start);
    }

    public void onClickStart(View view) {
        counterC1 = (int) (Math.random() * 5) + 2;
        counterC2 = (int) (Math.random() * 5) + 2;
        counterU1 = (int) (Math.random() * 5) + 2;
        counterU2 = (int) (Math.random() * 5) + 2;
        if(counterU < 100 && counterC < 100) {
            if (c_u) {
                switch (counterC1) {
                    case 1:
                        c1.setBackgroundResource(R.drawable.c1);
                        break;
                    case 2:
                        c1.setBackgroundResource(R.drawable.c2);
                        break;
                    case 3:
                        c1.setBackgroundResource(R.drawable.c3);
                        break;
                    case 4:
                        c1.setBackgroundResource(R.drawable.c4);
                        break;
                    case 5:
                        c1.setBackgroundResource(R.drawable.c5);
                        break;
                    case 6:
                        c1.setBackgroundResource(R.drawable.c6);
                        break;
                }
                switch (counterC2) {
                    case 1:
                        c2.setBackgroundResource(R.drawable.c1);
                        break;
                    case 2:
                        c2.setBackgroundResource(R.drawable.c2);
                        break;
                    case 3:
                        c2.setBackgroundResource(R.drawable.c3);
                        break;
                    case 4:
                        c2.setBackgroundResource(R.drawable.c4);
                        break;
                    case 5:
                        c2.setBackgroundResource(R.drawable.c5);
                        break;
                    case 6:
                        c2.setBackgroundResource(R.drawable.c6);
                        break;
                }
                if (counterC1 == counterC2) {
                    againText.setText("Одинаковые кубики. Переброс");
                } else {
                    againText.setText("");
                    counterC += counterC1 + counterC2;
                    textComp.setText(String.valueOf(counterC));
                    c_u = false;
                    btnStart.setText("Бросить");
                }
            } else {
                switch (counterU1) {
                    case 1:
                        u1.setBackgroundResource(R.drawable.c1);
                        break;
                    case 2:
                        u1.setBackgroundResource(R.drawable.c2);
                        break;
                    case 3:
                        u1.setBackgroundResource(R.drawable.c3);
                        break;
                    case 4:
                        u1.setBackgroundResource(R.drawable.c4);
                        break;
                    case 5:
                        u1.setBackgroundResource(R.drawable.c5);
                        break;
                    case 6:
                        u1.setBackgroundResource(R.drawable.c6);
                        break;
                }
                switch (counterU2) {
                    case 1:
                        u2.setBackgroundResource(R.drawable.c1);
                        break;
                    case 2:
                        u2.setBackgroundResource(R.drawable.c2);
                        break;
                    case 3:
                        u2.setBackgroundResource(R.drawable.c3);
                        break;
                    case 4:
                        u2.setBackgroundResource(R.drawable.c4);
                        break;
                    case 5:
                        u2.setBackgroundResource(R.drawable.c5);
                        break;
                    case 6:
                        u2.setBackgroundResource(R.drawable.c6);
                        break;
                }
                if (counterU1 == counterU2) {
                    againText.setText("Одинаковые кубики. Переброс");
                } else {
                    againText.setText("");
                    counterU += counterU1 + counterU2;
                    textUser.setText(String.valueOf(counterU));
                    c_u = true;
                    btnStart.setText("Позволить бросить компьютеру");
                }
            }
        }else if (counterU > counterC){
                    Intent intent = new Intent(Main2Activity.this, Victory.class);
                    startActivity(intent);
            }
        else if (counterU < counterC){
            Intent intent = new Intent(Main2Activity.this, loser.class);
            startActivity(intent);
        }
        else if (counterU == counterC){
            Intent intent = new Intent(Main2Activity.this, notGnotT.class);
            startActivity(intent);
        }
        }
    }
