package Project3;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

import java.util.*;


public class LadderGame {
    private int lives;
    private int[][] ladder;
    private List<Integer> userSelections;
    private int panels;

    public LadderGame(int lives, int panels) {
        this.lives = lives;
        this.panels = panels;
        this.ladder = createLadder(panels);
        this.userSelections = new ArrayList<>();
    }

    public int[][] createLadder(int panels) {
        int[][] ladder = new int[panels][2];
        Random rand = new Random();
        for (int i = 0; i < panels; i++) {
            int glass1 = rand.nextInt(2);
            int glass2 = rand.nextInt(2);
            // Ensure that no row has two 0s or two 1s
            while (glass2 == glass1) {
                glass2 = rand.nextInt(2);
            }
            ladder[i][0] = glass1;
            ladder[i][1] = glass2;
        }
        return ladder;
    }

    public int getLives() {
        return lives;
    }

    public void death() {
        lives--;
    }

    public void printLadder(int[][] ladder) {
        System.out.println("|||||| ---- Start");
        for (int i = 0; i < ladder.length; i++) {
            System.out.println("|" + ladder[i][0] + "||" + ladder[i][1] + "|");
        }
        System.out.println("|||||| ---- Finish");
    }

    public void printCurrentLadder() {
        int[][] currentLadder = new int[userSelections.size()][2];
        for (int i = 0; i < userSelections.size(); i++) {
            int selection = userSelections.get(i);
            currentLadder[i][0] = ladder[i][0];
            currentLadder[i][1] = ladder[i][1];
            if (selection == 0) {
                currentLadder[i][0] = 0;
            } else if (selection == 1) {
                currentLadder[i][1] = 0;
            }
        }
        printLadder(currentLadder);
    }

    public int getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter 'R' or 'L': ");
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("R")) {
                return 1;
            } else if (input.equals("L")) {
                return 0;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public boolean play() {
        System.out.println("Welcome to the Ladder Game!");
        System.out.println("You have " + lives + " lives.");
        printLadder(ladder);

        for (int i = 0; i < panels; i++) {
            int selection = getUserSelection();
            userSelections.add(selection);
            if (selection != ladder[i][0] && selection != ladder[i][1]) {
                System.out.println("You lost 1 life.");
                death();
                if (lives == 0) {
                    System.out.println("Total Lives: 0");
                    System.out.println("YOU DIED");
                    return false;
                }
            } else {
                System.out.println("Good job!");
            }
            printCurrentLadder();
        }

        System.out.println("Congrats! You won!!");
        printLadder(ladder);
        return true;
    }
    public static void main(String[] args) {
        LadderGame game = new LadderGame(3, 8);
        game.play();
    }
}
