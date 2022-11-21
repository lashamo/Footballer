package com.learn;

import java.util.Scanner;

public class Group implements IGroup {
    public static final int MAX_ARR_SIZE = 20;
    private FootBaller[] footBallers;
    private int footBallersCount;

    public Group() {
        footBallers = new FootBaller[MAX_ARR_SIZE];
    }

    @Override
    public void addFootBaller(FootBaller footBaller) {
        footBallers[footBallersCount] = footBaller;
        footBallersCount++;
    }


    @Override
    public FootBaller bestFootballer() {
        FootBaller best = footBallers[0];
        for (int i = 1; i < footBallersCount; i++) {
            if (best.getGoals() < footBallers[i].getGoals()) {
                best = footBallers[i];
            }
        }
        return best;
    }

    @Override
    public FootBaller whichOneFootBallerSmallGoals() {
        FootBaller fewerGoals = null;
        for (int i = 0; i < footBallersCount; i++) {
            if (footBallers[i].getNumber().equals("7")) {
                if (fewerGoals == null || fewerGoals.getGoals() > footBallers[i].getGoals()) {
                    fewerGoals = footBallers[i];
                }
            }
        }
        return fewerGoals;
    }

    @Override
    public int sum(String team) {
        int sum = 0;
        for (int i = 0; i < footBallersCount; i++) {
            if (footBallers[i].getTeam().equals(team)){
                sum = sum + footBallers[i].getGoals();
            }
        }
        return sum;
    }
}
