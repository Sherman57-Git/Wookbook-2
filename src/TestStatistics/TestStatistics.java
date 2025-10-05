package TestStatistics;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        // Create an array of 10 test scores
        int[] testScores = { 50, 60, 80, 90, 40, 100, 20, 10, 30};
        // average
        double sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        double average = sum / testScores.length;
        System.out.println("Average score: " + average);
        Arrays.sort(testScores);
        //high score
        System.out.println("high score: " + testScores[testScores.length -1]);
        //low score
        System.out.println("low score: " + testScores[0]);
        //median
        if (testScores.length % 2 == 0) {
            double median = testScores[testScores.length / 2-1] + testScores[testScores.length / 2];
            System.out.println("Median is " + median);
        } else {
            System.out.println("Median is: " + testScores[(testScores.length / 2)]);
        }
        }

    }

