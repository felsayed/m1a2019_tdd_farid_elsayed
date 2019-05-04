package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissors;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {

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
        // il faut faire ça pour chaque provider 
    /*@DataProvider(name = "winData")
    public static Object[][] subtractMethodDataProvider() {
        return new Object[][] { { PAPER, ROCK}, { ROCK, PAPER}, { ,  } };
    }*/
}