package com.company;

public class Monster {
    private String nome;
    private int puntiferita;
    private int danno;

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

    public int difesa(int danni){
        if(puntiferita<danni){
            puntiferita = 0;
        } else{
            puntiferita = puntiferita - danni;
        }
        return puntiferita;
    }

    
}
