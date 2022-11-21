package com.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        String filePath = args[0];
        Group group = new Group();
        File sourceFile = new File(filePath);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))) {
            String line = bufferedReader.readLine();
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] wordsLine = line.split(",");
                String firstName = wordsLine[0];
                String lastName = wordsLine[1];
                String number = wordsLine[2];
                String team = wordsLine[3];
                int goal = Integer.parseInt(wordsLine[4]);
                FootBaller footBaller = new FootBaller(firstName, lastName, number, team, goal);
                group.addFootBaller(footBaller);
            }

            FootBaller bestFootBaller = group.bestFootballer();
            System.out.println("Best footballer");
            System.out.println(bestFootBaller);

            FootBaller whichOneFootBallerSmallGoals = group.whichOneFootBallerSmallGoals();
            System.out.println("whichOneFootBallerSmallGoals");
            System.out.println(whichOneFootBallerSmallGoals);

            Scanner scanner = new Scanner(System.in);
            String teamName = scanner.nextLine();
            int sum = group.sum(teamName);
            System.out.println("sum");
            System.out.println(sum);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
