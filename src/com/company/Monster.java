package com.company;

public class Monster {
    private String nome;
    private int puntiferita;
    private int danno;
    private Arma arma;

    Monster(String nome, int puntiferita, int danno){
        this.nome = nome;
        this.puntiferita = puntiferita;
        this.danno = danno;
    }

    public int attacco(int vita){
        if(danno>vita){
            vita = 0;
        } else{
            vita = vita-danno;
        }
        return vita;
    }

}
