package p25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        //5. Zadatak
        //Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red.. Broj zvezdica je odredjen parametrom N.
        //Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
        //N=5, print je=> * * * * *
        //Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
        //N=9, print je=> * * * * * * * * *
        //(DOPUNA)
        //Napisati main program koji koristi kreiranu metodu tako da stampa sledecu sliku za M. M unosi korisnik. Zadatak resiti koristeci petlju u main metodi.
        //Primer izvrsenja:
        //Unesite M: 6
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        //* * * * * *

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite M: ");
        int m = s.nextInt();

        for (int i = 1; i <= m; i++) {
            zvezdica(i);
            System.out.println();
        }
    }
    public static void zvezdica(int n)  {
        for (int i = 0; i < n; i ++) {
            System.out.print("* ");
        }
    }
}
