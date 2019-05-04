package fr.p10.miage.rps.model;

public class RockPaperScissors {
    public RockPaperScissors() {
    }

    public Result play(RPSEnum p1,RPSEnum p2){
        //if(p1.equals(RPSEnum.valueOf("PAPER"))&& p2.equals(RPSEnum.valueOf("ROCK")))
        //if(p1.equals(p2)) return Result.TIE;
        //else return Result.WIN;
        //else return Result.LOST;
        if(p1.equals(RPSEnum.SCISSORS))
            return Action.playerJoueCiseau(p2);
        if(p1.equals(RPSEnum.ROCK))
            return Action.playerJouePierre(p2);
        else return Action.playerJoueFeuille(p2);

    }





    public Result play(Player p1,Player p2){
        return Result.LOST;
    }

}
