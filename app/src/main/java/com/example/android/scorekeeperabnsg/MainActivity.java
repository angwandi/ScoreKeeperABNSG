package com.example.android.scorekeeperabnsg;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* Variable declarations */
    int scoreTeamA = 0;
    int freeKick = 0;
    int redCard = 0;
    int fouls = 0;
    int players = 11;
    int playersTeamB = 11;
    int foulsTeamB = 0;
    int redCardTeamB = 0;
    int freeKickTeamB = 0;
    int scoreTeamB = 0;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.toolbar);
    }

    /* Display the score for team A*/
    public void displayScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.text_view_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Add one when button score clicked*/
    public void addOneScoreForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /* Display the freeKick for team A*/
    public void displayFreeKickForTeamA(int freeKickA) {
        TextView freeKickView = findViewById(R.id.text_view_freeKick);
        freeKickView.setText(String.valueOf(freeKickA));
    }

    /*Add one when button freeKick clicked*/
    public void addOnefreeKickForTeamA(View view) {
        freeKick = freeKick + 1;
        displayFreeKickForTeamA(freeKick);
    }

    /* Display the redCard for team A*/
    public void displayRedCardForTeamA(int redcardA) {
        TextView redCardView = findViewById(R.id.text_view_redCard);
        redCardView.setText(String.valueOf(redcardA));
        TextView playerView = findViewById(R.id.text_view_players);
        playerView.setText(String.valueOf(players));
    }

    /*Add one and subtract one form players when redCard Button clicked and no more than eleven red cards*/
    public void addOneRedCardForTeamA(View view) {
        if (redCard == 11) {
            //Show an error message as a toast
            Toast.makeText(this,"No more than 11 Red Cards", Toast.LENGTH_SHORT).show();
            return;}
        redCard = redCard + 1;
        players = players - 1;
        displayRedCardForTeamA(redCard);
    }

    /* Display the fouls for team A*/
    public void displayFoulsForTeamA(int foulsA) {
        TextView foulsView = findViewById(R.id.text_view_fouls);
        foulsView.setText(String.valueOf(foulsA));
    }

    /*Add one when button fouls clicked*/
    public void addOneFoulsForTeamA(View view) {
        fouls = fouls + 1;
        displayFoulsForTeamA(fouls);
    }

    /* CODE FOR TEAM B*/

    /* Display the score for team B*/
    public void displayScoreForTeamB(int scoreb) {
        TextView scorebView = findViewById(R.id.text_view_scoreb);
        scorebView.setText(String.valueOf(scoreb));
    }

    /*Add one when button scoreb clicked*/
    public void addOneScoreForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /* Display the freeKick for team B*/
    public void displayFreeKickForTeamB(int freeKickB) {
        TextView freeKickbView = findViewById(R.id.text_view_freeKickb);
        freeKickbView.setText(String.valueOf(freeKickB));
    }

    /*Add one when button freeKickb clicked*/
    public void addOnefreeKickForTeamB(View view) {
        freeKickTeamB = freeKickTeamB + 1;
        displayFreeKickForTeamB(freeKickTeamB);
    }

    /* Display the redCard for team B*/
    public void displayRedCardForTeamB(int redcardB) {
        TextView redCardbView = findViewById(R.id.text_view_redCarb);
        redCardbView.setText(String.valueOf(redcardB));
        TextView playerbView = findViewById(R.id.text_view_playersb);
        playerbView.setText(String.valueOf(playersTeamB));
    }

    /*Add one and subtract one form players when redCard Button clicked and no more than 11 red cards*/
    public void addOneRedCardForTeamB(View view) {
        if (redCardTeamB == 11) {
            //Show an error message as a toast
            Toast.makeText(this,"No more than 11 Red Cards", Toast.LENGTH_SHORT).show();
            return;}
        redCardTeamB = redCardTeamB + 1;
        playersTeamB = playersTeamB - 1;
        displayRedCardForTeamB(redCardTeamB);
    }

    /* Display the fouls for team B*/
    public void displayFoulsForTeamB(int foulsB) {
        TextView foulsbView = findViewById(R.id.text_view_foulsb);
        foulsbView.setText(String.valueOf(foulsB));
    }

    /*Add one when button foulsb clicked*/
    public void addOneFoulsForTeamB(View view) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }

/* Reset All.*/

    public void resetAll(View view) {
        scoreTeamA = 0;
        players = 11;
        playersTeamB = 11;
        scoreTeamB = 0;
        freeKick = 0;
        freeKickTeamB = 0;
        redCard = 0;
        redCardTeamB = 0;
        fouls = 0;
        foulsTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFreeKickForTeamA(freeKick);
        displayFreeKickForTeamB(freeKickTeamB);
        displayRedCardForTeamA(redCard);
        displayRedCardForTeamB(redCardTeamB);
        displayFoulsForTeamA(fouls);
        displayFoulsForTeamB(foulsTeamB);

    }

}

