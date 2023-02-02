package di.atos.exercicexpgoldweek6day3;

import java.util.Scanner;

/**
 *
 * @author Koua wilfried
 */
public class Exercice2 {
    public static void main(String[] args) {
         
        double log = 1;
        
        System.out.println("nbre log :");
        int logNumber = sc.nextInt();
        
        double i = 1;
        
        while(i < logNumber) {
            if(i % 2 == 0) {
                log = log - (1/i);
            }else {
                log = log + (1/i);
            }
            i++;
        }
        
        System.out.println("le logarithme de " + userEntry + " est : " + log);
    }
}
