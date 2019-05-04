package fr.p10.miage.rps.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

private String nom;
private int score;
private List<RPSEnum> mouvement=new ArrayList<RPSEnum>();
private final static int nb_mouv=20;
private int tour;

    public Player(String nom, List<RPSEnum> mouvement) {
        this.nom = nom;
        this.mouvement = mouvement;
    }

    public Player(int score) {
        this.score = score;
    }

    public Player(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public List<RPSEnum> getMouvement() {
        return mouvement;
    }

    public static int getNb_mouv() {
        return nb_mouv;
    }

    public int getTour() {
        return tour;
    }

    public RPSEnum getNextMove(){
        return this.mouvement.get(tour+1);
    }

    public void setScore(int score) {
        this.score = score;
    }
}
