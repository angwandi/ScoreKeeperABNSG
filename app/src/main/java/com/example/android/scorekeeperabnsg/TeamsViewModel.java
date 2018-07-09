package com.example.android.scorekeeperabnsg;

import android.arch.lifecycle.ViewModel;
public class TeamsViewModel extends ViewModel {
    /* TODO 1 Separate out your data from your UI controller
     *by creating a class that extends ViewModel
     *TODO 2 Set up communications between
     *your ViewModel and your UI controller
     *TODO 3 Use your ViewModel in your UI controller */

    /*I’ve chosen to have the data stored as public
     *members in my TeamsViewModel class for brevity,
     *but creating getters and setters to better
     *encapsulate the data is a good idea.*/
    public int scoreTeamA = 0;
    public int freeKick = 0;
    public int redCard = 0;
    public int fouls = 0;
    public int players = 11;
    public int playersTeamB = 11;
    public int foulsTeamB = 0;
    public int redCardTeamB = 0;
    public int freeKickTeamB = 0;
    public int scoreTeamB = 0;
}
