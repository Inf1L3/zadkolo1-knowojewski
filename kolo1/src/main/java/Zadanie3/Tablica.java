/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie3;
import java.util.Scanner;

/**
 *
 * @author student
 */

public class Tablica {
    public int liczba;
    public int tab;
    public int srednia;
    

    public Tablica(int liczba) {
    Scanner input = new Scanner(System.in);
    int a;
    a = input.nextInt();
    
    int[] tab1 = new int[10];
    for(int i=0;i<10;i++){
        tab1[i]=a;
    }
    public Tablica(int tab) {  
    int[] tab1 = new int[10];
    for(int i=0;i<10;i++){
        System.out.println(tab1[i]);
    }
    

}
    
    
    
}
