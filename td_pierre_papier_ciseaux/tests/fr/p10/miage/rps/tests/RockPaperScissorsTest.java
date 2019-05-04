package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissors;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    @DataProvider(name="winData")
            public Object[][]createWinData(){
        return new Object[][]{
                {RPSEnum.ROCK,RPSEnum.SCISSORS},
                {RPSEnum.PAPER,RPSEnum.ROCK},
                {RPSEnum.SCISSORS,RPSEnum.PAPER}
        };
    }
    @DataProvider(name="tieData")
            public Object[][] createTieData(){
        return new Object[][]{
                {RPSEnum.ROCK,RPSEnum.SCISSORS},
                {RPSEnum.PAPER,RPSEnum.ROCK},
                {RPSEnum.SCISSORS,RPSEnum.PAPER}
        };

    }

    @DataProvider(name="lostData")
            public Object[][]createLostData(){
        return new Object[][]{
                {RPSEnum.SCISSORS,RPSEnum.ROCK},
                {RPSEnum.ROCK,RPSEnum.PAPER},
                {RPSEnum.PAPER,RPSEnum.SCISSORS}
        };
    }





    //RockPaperScissorsTest rps;
    RockPaperScissors rps;
    RockPaperScissors rp;

    @BeforeMethod
    public void setUp() throws Exception {
        rps=new RockPaperScissors();
       // rps=new RockPaperScissorsTest();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        rps=null;

    }
    @Parameters({"paper","rock"})
    @Test
    public void testWinPlay(String p1,String p2) {
        assertEquals(rps.play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)),Result.WIN);//valueof transforme les string en RPSenum
    }

    @Parameters({"paper","paper"})
    @Test
    public void testTiePlay(String p1,String p2) {
        assertEquals(rps.play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)),Result.TIE);//valueof transforme les string en RPSenum
    }

    @Parameters({"paper","scissors"})
    @Test
    public void testLostPlay(String p1,String p2) {
        assertEquals(rps.play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)),Result.LOST);//valueof transforme les string en RPSenum
    }

    @Test(dataProvider = "winData")
    void testWinPlay(RPSEnum p1,RPSEnum p2){
        assertEquals(rps.play(p1,p2),Result.WIN);
    }

    @Test(dataProvider = "tieData")
    void testTiePlay(RPSEnum p1,RPSEnum p2){
        assertEquals(rps.play(p1,p2),Result.TIE);
    }

    @Test(dataProvider = "lostData")
    void testLostPlay(RPSEnum p1,RPSEnum p2){
        assertEquals(rps.play(p1,p2),Result.LOST);
    }

}