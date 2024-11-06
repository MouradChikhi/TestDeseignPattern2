package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /**
     * Calcule la factorielle d'un entier positif
     * @param x;
     * @return x!
     */
    public static int Fact(int x){
        if(x==1){
            return 1;
        }else{
            return x * Fact(x-1);
        }
    }
    public static void main(String[] args) {

    }
}