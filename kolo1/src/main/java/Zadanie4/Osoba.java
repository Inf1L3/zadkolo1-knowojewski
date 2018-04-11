/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie4;

/**
 *
 * @author student
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int wzrost;
    private int waga;
    
    
    public Osoba(String imie, String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    public Osoba(int wiek, int wzrost, int waga){
        this.waga=waga;
        this.wiek=wiek;
        this.wzrost=wzrost;        
    }
    public Osoba(String imie, String nazwisko, int wiek, int wzrost, int waga){
        this.waga=waga;
        this.wiek=wiek;
        this.wzrost=wzrost;  
        this.imie=imie;
        this.nazwisko=nazwisko;
    }


           public void wyswietl() {
           System.out.println("Osoba");
           System.out.println("Imię:" +this.imie);
           System.out.println("Nazwisko: " +this.nazwisko);
           System.out.println("Wzrost: " +this.wzrost);
           System.out.println("Waga: " +this.waga);
           System.out.println("Wiek: " +this.wiek);         
       }
    
    
}
