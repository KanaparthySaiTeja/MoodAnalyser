package com.cg.moodanalyser;
import java.util.Scanner;
public class MoodAnalyser {
    private static String message;

    enum ERROR{
        EMPTY,NULL
    }

    public MoodAnalyzer(String message) {
        this.message=message;
    }


    public String analyseMood() throws MoodAnalyserException {

        if (message.contains( "Sad" ))
            return "SAD";
        else if(message.contains( " " ))
            throw new MoodAnalyserException( " Empty moood !! Enter valid mood"  );
        else if (message.contains( null ))
            throw new MoodAnalyserException( "Null mood!! Enter valid mood" ) ;
        else
            return "HAPPY";
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood analyzer");

    }
}