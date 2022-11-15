package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        int danni;
        int vita;
        String nome;

        System.out.print("inserire nome di mostro 1: ");
        nome = input.nextLine();
        System.out.print("inserire vita mostro 1: ");
        vita = input.nextInt();
        System.out.print("inserire danno mostro 1: ");
        danni = input.nextInt();
        Monster m1 = new Monster(nome, vita, danni);

        System.out.print("inserire nome di mostro 2: ");
        nome = input.nextLine();
        System.out.print("inserire vita mostro 2: ");
        vita = input.nextInt();
        System.out.print("inserire danno mostro 2: ");
        danni = input.nextInt();
        Monster m2 = new Monster(nome, vita, danni);

        System.out.print("siccome "+nome+" è pacifico, non potrà attaccare, ma essendo molto veloce una volta attaccato, se non ferito mortalmente scapperà, per il primo mostro è necessario fare un attacco potente");
        
    }
}
