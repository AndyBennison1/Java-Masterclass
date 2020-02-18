package com.AndyBennison;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
	int score = 800;
	int levelCompleted = 5;
	int bonus = 100;
	int gameNumber;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);

            System.out.println("Your final score was " + finalScore);
        }

        gameOver(1, true, 10000, 8, 200);
        gameOver(2, true, 25000, 90, 2500);

int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Andy", highScorePosition);

highScorePosition = calculateHighScorePosition(900);
displayHighScorePosition("Andy2", highScorePosition);

highScorePosition = calculateHighScorePosition(400);
displayHighScorePosition("Andy3", highScorePosition);

highScorePosition = calculateHighScorePosition(50);
displayHighScorePosition("Andy4", highScorePosition);

    calculateHighScorePosition(900);
    calculateHighScorePosition(400);
    calculateHighScorePosition(50);
    }

    public static void gameOver( int gameNumber, boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score for round " + gameNumber + " was " + finalScore);
        }
    }

    public static void displayHighScorePosition (String name, int highScorePosition) {
        System.out.println("Congratulations " + name + ": You managed to reach position " + highScorePosition + " on the leaderboard!");
    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500) {
            return 2;
        }
        else if (playerScore >= 100) {
            return 3;
        }
        else {
            return 4;
        }
    }
}


