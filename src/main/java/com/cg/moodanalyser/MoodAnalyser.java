package com.cg.moodanalyser;
import java.util.Scanner;
public class MoodAnalyser {
    private static String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message=message;
    }


    public String analyseMood() {
        try {
            if (message.contains( "Sad" )) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Mood analyzer");

    }
}