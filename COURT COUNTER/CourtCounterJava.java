package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int scoreB)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v)
    {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v)
    {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v)
    {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v)
    {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v)
    {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v)
    {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void Refresh(View V)
    {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }

}