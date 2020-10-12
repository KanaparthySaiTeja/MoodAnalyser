package com.cg.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyserobj=new MoodAnalyser();
    @Test
    public void should_returnSad(){
        Assert.assertEquals(moodAnalyserobj.analyseMood( "I am in Sad Mood" ),"SAD");
    }

    @Test
    public void should_returnHappy(){
        Assert.assertEquals(moodAnalyserobj.analyseMood( "I am in any Mood" ),"HAPPY");
    }
    @Test
    public void givenNull_Should_returnHappy(){
        Assert.assertEquals(moodAnalyserobj.analyseMood(null),"HAPPY");
    }
}