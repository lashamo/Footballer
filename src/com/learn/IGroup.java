package com.learn;

import java.util.Scanner;

public interface IGroup {

    void addFootBaller(FootBaller footBaller);

    FootBaller bestFootballer();

    FootBaller whichOneFootBallerSmallGoals();

    int sum(String team);
}
