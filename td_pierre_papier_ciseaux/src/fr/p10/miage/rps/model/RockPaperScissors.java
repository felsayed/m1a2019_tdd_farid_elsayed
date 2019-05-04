package fr.p10.miage.rps.model;

public class RockPaperScissors {
    public RockPaperScissors() {
    }

    public Result play(RPSEnum p1,RPSEnum p2){
        //if(p1.equals(RPSEnum.valueOf("PAPER"))&& p2.equals(RPSEnum.valueOf("ROCK")))
        if(p1.equals(p2)) return Result.TIE;
        else return Result.WIN;
        //else return Result.LOST;
    }


}
