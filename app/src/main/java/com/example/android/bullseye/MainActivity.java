package com.example.android.bullseye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    TextView score1, score2;
    Button bullEye1, bullEye2, pts11, pts12, pts13, pts14, pts15,pts16,pts17,pts18,pts19;
    Button pts21, pts22, pts23, pts24, pts25,pts26,pts27,pts28,pts29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score1 = findViewById(R.id.score1);
        score2 = findViewById(R.id.score2);
        bullEye1 = findViewById(R.id.bulls_eye1);
        bullEye2 = findViewById(R.id.bulls_eye2);
        pts11 = findViewById(R.id.points1_1);
        pts12 = findViewById(R.id.points2_1);
        pts13 = findViewById(R.id.points3_1);
        pts14 = findViewById(R.id.points4_1);
        pts15 = findViewById(R.id.points5_1);
        pts16 = findViewById(R.id.points6_1);
        pts17 = findViewById(R.id.points7_1);
        pts18 = findViewById(R.id.points8_1);
        pts19 = findViewById(R.id.points9_1);
        pts21 = findViewById(R.id.points1_2);
        pts22 = findViewById(R.id.points2_2);
        pts23 = findViewById(R.id.points3_2);
        pts24 = findViewById(R.id.points4_2);
        pts25 = findViewById(R.id.points5_2);
        pts26 = findViewById(R.id.points6_2);
        pts27 = findViewById(R.id.points7_2);
        pts28 = findViewById(R.id.points8_2);
        pts29 = findViewById(R.id.points9_2);

        bullEye1.setOnClickListener(this);
        bullEye2.setOnClickListener(this);
        pts11.setOnClickListener(this);
        pts12.setOnClickListener(this);
        pts13.setOnClickListener(this);
        pts14.setOnClickListener(this);
        pts15.setOnClickListener(this);
        pts16.setOnClickListener(this);
        pts17.setOnClickListener(this);
        pts18.setOnClickListener(this);
        pts19.setOnClickListener(this);
        pts21.setOnClickListener(this);
        pts22.setOnClickListener(this);
        pts23.setOnClickListener(this);
        pts24.setOnClickListener(this);
        pts25.setOnClickListener(this);
        pts26.setOnClickListener(this);
        pts27.setOnClickListener(this);
        pts28.setOnClickListener(this);
        pts29.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bulls_eye1:
                scorePlayer1+=20;
                displayScore1(scorePlayer1);
                break;
            case R.id.bulls_eye2:
                scorePlayer2+=20;
                displayScore2(scorePlayer2);
                break;
            case R.id.points1_1:
                scorePlayer1+=1;
                displayScore1(scorePlayer1);
                break;
            case R.id.points2_1:
                scorePlayer1+=2;
                displayScore1(scorePlayer1);
                break;
            case R.id.points3_1:
                scorePlayer1+=3;
                displayScore1(scorePlayer1);
                break;
            case R.id.points4_1:
                scorePlayer1+=4;
                displayScore1(scorePlayer1);
                break;
            case R.id.points5_1:
                scorePlayer1+=5;
                displayScore1(scorePlayer1);
                break;
            case R.id.points6_1:
                scorePlayer1+=6;
                displayScore1(scorePlayer1);
                break;
            case R.id.points7_1:
                scorePlayer1+=7;
                displayScore1(scorePlayer1);
                break;
            case R.id.points8_1:
                scorePlayer1+=8;
                displayScore1(scorePlayer1);
                break;
            case R.id.points9_1:
                scorePlayer1+=9;
                displayScore1(scorePlayer1);
                break;
            case R.id.points1_2:
                scorePlayer2+=1;
                displayScore2(scorePlayer2);
                break;
            case R.id.points2_2:
                scorePlayer2+=2;
                displayScore2(scorePlayer2);
                break;
            case R.id.points3_2:
                scorePlayer2+=3;
                displayScore2(scorePlayer2);
                break;
            case R.id.points4_2:
                scorePlayer2+=4;
                displayScore2(scorePlayer2);
                break;
            case R.id.points5_2:
                scorePlayer2+=5;
                displayScore2(scorePlayer2);
                break;
            case R.id.points6_2:
                scorePlayer2+=6;
                displayScore2(scorePlayer2);
                break;
            case R.id.points7_2:
                scorePlayer2+=7;
                displayScore2(scorePlayer2);
                break;
            case R.id.points8_2:
                scorePlayer2+=8;
                displayScore2(scorePlayer2);
                break;
            case R.id.points9_2:
                scorePlayer2+=9;
                displayScore2(scorePlayer2);
                break;
        }
    }

    public void resetScore (View v){
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayScore1(scorePlayer1);
        displayScore2(scorePlayer2);
    }

    public void displayScore1(int score){
        score1.setText(String.valueOf(score));
    }

    public void displayScore2(int score){
        score2.setText(String.valueOf(score));
    }

}
