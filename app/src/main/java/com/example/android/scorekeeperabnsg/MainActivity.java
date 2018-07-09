package com.example.android.scorekeeperabnsg;

import android.annotation.TargetApi;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    public TeamsViewModel teamsViewModel;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.toolbar);

        /*COMPLETED todo 02 and todo 03*/
        teamsViewModel = ViewModelProviders.of(this).get(TeamsViewModel.class);
        /*For screen configuration changes*/
        displayFreeKickForTeamB(teamsViewModel.freeKickTeamB);
        displayFreeKickForTeamA(teamsViewModel.freeKick);
        displayRedCardForTeamB(teamsViewModel.redCardTeamB);
        displayRedCardForTeamA(teamsViewModel.redCard);
        displayFoulsForTeamB(teamsViewModel.foulsTeamB);
        displayFoulsForTeamA(teamsViewModel.fouls);
        displayScoreForTeamB(teamsViewModel.scoreTeamB);
        displayScoreForTeamA(teamsViewModel.scoreTeamA);
    }

    /* Display the score for team A*/
    public void displayScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.text_view_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Add one when button score clicked*/
    public void addOneScoreForTeamA(View view) {
        teamsViewModel.scoreTeamA = teamsViewModel.scoreTeamA + 1;
        displayScoreForTeamA(teamsViewModel.scoreTeamA);
    }

    /* Display the freeKick for team A*/
    public void displayFreeKickForTeamA(int freeKickA) {
        TextView freeKickView = findViewById(R.id.text_view_freeKick);
        freeKickView.setText(String.valueOf(freeKickA));
    }

    /*Add one when button freeKick clicked*/
    public void addOnefreeKickForTeamA(View view) {
        teamsViewModel.freeKick = teamsViewModel.freeKick + 1;
        displayFreeKickForTeamA(teamsViewModel.freeKick);
    }


    /* Display the redCard for team A*/

    public void displayRedCardForTeamA(int redcardA) {
        TextView redCardView = findViewById(R.id.text_view_redCard);
        redCardView.setText(String.valueOf(redcardA));
        TextView playerView = findViewById(R.id.text_view_players);
        playerView.setText(String.valueOf(teamsViewModel.players));
    }

    /*Add one and subtract one form players when redCard Button clicked and no more than eleven red cards*/
    public void addOneRedCardForTeamA(View view) {
        if (teamsViewModel.redCard == 11) {
            //Show an error message as a toast
            Toast.makeText(this, "No more than 11 Red Cards", Toast.LENGTH_SHORT).show();
            return;
        }
        teamsViewModel.redCard = teamsViewModel.redCard + 1;
        teamsViewModel.players = teamsViewModel.players - 1;
        displayRedCardForTeamA(teamsViewModel.redCard);
    }

    /* Display the fouls for team A*/
    public void displayFoulsForTeamA(int foulsA) {
        TextView foulsView = findViewById(R.id.text_view_fouls);
        foulsView.setText(String.valueOf(foulsA));
    }

    /*Add one when button fouls clicked*/
    public void addOneFoulsForTeamA(View view) {
        teamsViewModel.fouls = teamsViewModel.fouls + 1;
        displayFoulsForTeamA(teamsViewModel.fouls);
    }

    /* CODE FOR TEAM B*/

    /* Display the score for team B*/
    public void displayScoreForTeamB(int scoreb) {
        TextView scorebView = findViewById(R.id.text_view_scoreb);
        scorebView.setText(String.valueOf(scoreb));
    }

    /*Add one when button scoreb clicked*/
    public void addOneScoreForTeamB(View view) {
        teamsViewModel.scoreTeamB = teamsViewModel.scoreTeamB + 1;
        displayScoreForTeamB(teamsViewModel.scoreTeamB);
    }

    /* Display the freeKick for team B*/
    public void displayFreeKickForTeamB(int freeKickB) {
        TextView freeKickbView = findViewById(R.id.text_view_freeKickb);
        freeKickbView.setText(String.valueOf(freeKickB));
    }

    /*Add one when button freeKickb clicked*/
    public void addOnefreeKickForTeamB(View view) {
        teamsViewModel.freeKickTeamB = teamsViewModel.freeKickTeamB + 1;
        displayFreeKickForTeamB(teamsViewModel.freeKickTeamB);
    }

    /* Display the redCard for team B*/
    public void displayRedCardForTeamB(int redCardB) {
        TextView redCardbView = findViewById(R.id.text_view_redCarb);
        redCardbView.setText(String.valueOf(redCardB));
        TextView playerbView = findViewById(R.id.text_view_playersb);
        playerbView.setText(String.valueOf(teamsViewModel.playersTeamB));
    }

    /*Add one and subtract one form players when redCard Button clicked and no more than 11 red cards*/
    public void addOneRedCardForTeamB(View view) {
        if (teamsViewModel.redCardTeamB == 11) {
            //Show an error message as a toast
            Toast.makeText(this, "No more than 11 Red Cards", Toast.LENGTH_SHORT).show();
            return;
        }
        teamsViewModel.redCardTeamB = teamsViewModel.redCardTeamB + 1;
        teamsViewModel.playersTeamB = teamsViewModel.playersTeamB - 1;
        displayRedCardForTeamB(teamsViewModel.redCardTeamB);
    }

    /* Display the fouls for team B*/
    public void displayFoulsForTeamB(int foulsB) {
        TextView foulsbView = findViewById(R.id.text_view_foulsb);
        foulsbView.setText(String.valueOf(foulsB));
    }

    /*Add one when button foulsb clicked*/
    public void addOneFoulsForTeamB(View view) {
        teamsViewModel.foulsTeamB = teamsViewModel.foulsTeamB + 1;
        displayFoulsForTeamB(teamsViewModel.foulsTeamB);
    }

    /* Reset All.*/

    public void resetAll(View view) {
        teamsViewModel.scoreTeamA = 0;
        teamsViewModel.players = 11;
        teamsViewModel.playersTeamB = 11;
        teamsViewModel.scoreTeamB = 0;
        teamsViewModel.freeKick = 0;
        teamsViewModel.freeKickTeamB = 0;
        teamsViewModel.redCard = 0;
        teamsViewModel.redCardTeamB = 0;
        teamsViewModel.fouls = 0;
        teamsViewModel.foulsTeamB = 0;
        displayScoreForTeamA(teamsViewModel.scoreTeamA);
        displayScoreForTeamB(teamsViewModel.scoreTeamB);
        displayFreeKickForTeamA(teamsViewModel.freeKick);
        displayFreeKickForTeamB(teamsViewModel.freeKickTeamB);
        displayRedCardForTeamA(teamsViewModel.redCard);
        displayRedCardForTeamB(teamsViewModel.redCardTeamB);
        displayFoulsForTeamA(teamsViewModel.fouls);
        displayFoulsForTeamB(teamsViewModel.foulsTeamB);
    }
}

