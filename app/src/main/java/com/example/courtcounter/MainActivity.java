package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // The global variables
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Add Three points for team a
    public void AddThreeForTeamA(View view) {
        ScoreTeamA += 3;
        displayForTeamA(ScoreTeamA);
    }

    // Add two points for team a
    public void AddTwoForTeamA(View view) {
        ScoreTeamA += 2;
        displayForTeamA(ScoreTeamA);
    }

    // Add one points for team a
    public void AddOneForTeamA(View view) {
        ScoreTeamA += 1;
        displayForTeamA(ScoreTeamA);
    }

    // Add Three points for team B
    public void AddThreeForTeamB(View view) {
        ScoreTeamB += 3;
        displayForTeamB(ScoreTeamB);
    }

    // Add two points for team B
    public void AddTwoForTeamB(View view) {
        ScoreTeamB += 2;
        displayForTeamB(ScoreTeamB);
    }

    // Add one points for team b
    public void AddOneForTeamB(View view) {
        ScoreTeamB += 1;
        displayForTeamB(ScoreTeamB);
    }

    // display for team A
    public void displayForTeamA(int score){
        TextView ScoreForTeamA = findViewById(R.id.score_team_a_);
        ScoreForTeamA.setText(String.valueOf(score));
    }

    // display for team B
    public void displayForTeamB(int score){
        TextView ScoreForTeamB = findViewById(R.id.score_team_b);
        ScoreForTeamB.setText(String.valueOf(score));
    }

    // resetting all the scores
    public void resetAllScores(View view) {
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamA(ScoreTeamB);
        displayForTeamB(ScoreTeamB);
    }

}
