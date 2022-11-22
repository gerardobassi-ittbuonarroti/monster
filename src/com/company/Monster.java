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
        if(arma == null){
            if(danno>vita){
                puntiferita = 0;
            } else{
                puntiferita = vita - danno;
            }
        } else{
            if((danno+arma.getDanni())>vita){
                puntiferita = 0;
            } else{
                puntiferita = puntiferita - danno-arma.getDanni();
            }
        }
        return puntiferita;
    }

    public void raccogli(Arma arma){
        this.arma = arma;
    }

    public void lascia(){
        arma = null;
    }

}
