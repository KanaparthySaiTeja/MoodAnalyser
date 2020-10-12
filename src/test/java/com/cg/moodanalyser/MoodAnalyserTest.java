package com.cg.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void nullMood_Should_returnexception() throws MoodAnalyserException {
        MoodAnalyser moodAnalyzer = new MoodAnalyser( null );
        try {
            Assert.assertEquals( moodAnalyzer.analyseMood(), "HAPPY" );
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmptyMood_Should_returnexception() throws MoodAnalyserException {
        MoodAnalyser moodAnalyzer = new MoodAnalyser( " " );
        try {
            Assert.assertEquals( moodAnalyzer.analyseMood(), "HAPPY" );
        } catch (MoodAnalyserException e){
            e.printStackTrace();
        }
    }
}