package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//uhjhj
public class MainActivity extends AppCompatActivity {
int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeForTeamA(View v){
        displayForTeamA(scoreTeamA+=3);
    }
    public void addTwoForTeamA(View v){
        displayForTeamA(scoreTeamA+=2);
    }
    public void addNullForTeamA(View v){
        displayForTeamA(scoreTeamA=0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
