package com.cg.moodanalyser;

public class MoodAnalyser {


    public String analyseMood(String message){
        if(message.contains( "Sad" )){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood analyzer");

    }
}