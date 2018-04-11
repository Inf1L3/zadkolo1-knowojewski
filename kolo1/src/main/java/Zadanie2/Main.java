/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie2;

/**
 *
 * @author student
 */
public class Main {


    public static int fib(int n) {
        if (n<2) return n;
        return fib(n-2)+fib(n-2);
}
}