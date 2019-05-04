package fr.p10.miage.rps.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Action {

    public static Result playerJoueCiseau(RPSEnum p2){
        if(p2.equals(RPSEnum.SCISSORS)){
            return Result.TIE;
        }
        if(p2.equals(RPSEnum.PAPER)){
            return Result.WIN;
        }
        else return Result.LOST;
    }

    public static Result playerJouePierre(RPSEnum p2){
        if(p2.equals(RPSEnum.SCISSORS)){
            return Result.WIN;
        }
        if(p2.equals(RPSEnum.ROCK)){
            return Result.TIE;
        }
        else return Result.LOST;
    }

    public static Result playerJoueFeuille(RPSEnum p2){
        if(p2.equals(RPSEnum.PAPER)){
            return Result.TIE;
        }
        if(p2.equals(RPSEnum.ROCK)){
            return Result.WIN;
        }
        else return Result.LOST;
    }


}
