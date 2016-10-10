package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissors;
import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 * Created by mouna on 03/10/2016.
 */
public class RockPaperScissorsTest {

    private RockPaperScissors rps;

    @BeforeMethod
    public void setUp() throws Exception {
        rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        rps = null;

    }

    @Parameters({"paper","rock"})
    @Test
    public void testWinPlay1(String p1, String p2){
        assertEquals(rps.playW(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }


    @Parameters({"paper","rock"})
    @Test
    public void testLostPlay1(String p1, String p2){
        assertEquals(rps.playL(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }

    @Parameters({"paper","rock"})
    @Test
    public void testTiePlay1(String p1, String p2){
        assertEquals(rps.playT(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

    @Parameters({"paper","scissors"})
    @Test
    public void testWinPlay2(String p1, String p2){
        assertEquals(rps.playW(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

    @Parameters({"paper","scissors"})
    @Test
    public void testLostPlay2(String p1, String p2){
        assertEquals(rps.playL(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }

    @Parameters({"paper","scissors"})
    @Test
    public void testTiePlay2(String p1, String p2){
        assertEquals(rps.playT(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

    @Parameters({"rock","scissors"})
    @Test
    public void testWinPlay3(String p1, String p2){
        assertEquals(rps.playW(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

    @Parameters({"rock","scissors"})
    @Test
    public void testLostPlay3(String p1, String p2){
        assertEquals(rps.playL(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }

    @Parameters({"rock","scissors"})
    @Test
    public void testTiePlay3(String p1, String p2){
        assertEquals(rps.playT(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }


    @DataProvider(name="testWin")
    public static Object[][] createWinData(){
        return new Object[][]{
                {RPSEnum.ROCK,RPSEnum.SCISSORS},
                {RPSEnum.SCISSORS,RPSEnum.PAPER},
                {RPSEnum.PAPER,RPSEnum.ROCK}
        };
    }

    @Test(dataProvider = "testWin")
    public void testWinPlay(RPSEnum p1, RPSEnum p2){
        assertEquals(rps.playW(p1,p2), Result.WIN);
    }


     @DataProvider(name="testTie")
    public static Object[][] createTieData(){
        return new Object[][]{
                {RPSEnum.ROCK,RPSEnum.ROCK},
                {RPSEnum.SCISSORS,RPSEnum.SCISSORS},
                {RPSEnum.PAPER,RPSEnum.PAPER}
        };
    }

    @Test(dataProvider = "testTie")
    public void testTiePlay(RPSEnum p1, RPSEnum p2){
        assertEquals(rps.playT(p1,p2), Result.TIE);
    }

     @DataProvider(name="testLost")
    public static Object[][] createLostData(){
        return new Object[][]{
                {RPSEnum.SCISSORS,RPSEnum.ROCK},
                {RPSEnum.PAPER,RPSEnum.SCISSORS},
                {RPSEnum.ROCK,RPSEnum.PAPER}
        };
    }

    @Test(dataProvider = "testLost")
    public void testLostPlay(RPSEnum p1, RPSEnum p2){
        assertEquals(rps.playL(p1,p2), Result.LOST);
    }

}