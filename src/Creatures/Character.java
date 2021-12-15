package Creatures;
import Exceptions.Unchecked;
import Interfaces.*;
import java.util.Scanner;

public class Character extends Some implements Tell, Run, Disappointed, Excited, Happy, Time {

    public static void infinity() throws Unchecked{
        Scanner cycle = new Scanner(System.in);
        int rounds = cycle.nextInt();
        while (rounds>0){
            rounds--;
            System.out.println("lol");
        }
    }

    public static void anon() {
        Character nothing = new Character("Ничто") {
            void method() {
            }
        };
    }
    protected String name;
    public Character(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return false;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public void time(String time){
        System.out.print("В " + time + " часа ");
    }
    @Override
    public void excited(){
        System.out.println(this.name + " Взволнован и возбужден");
    }
    @Override
    public void tell(String phrase) {
        System.out.println(this.name + " сказал, что " + phrase + ".");
    }
    @Override
    public void Run(String confirm, int n) {
        if (10 / n == 10) {
            if (confirm.equals("да")) {
                System.out.println(this.name + " побежал");
            } else {
                System.out.println(this.name + " остался стоять");
            }
            class FallDown {
                void FallDown(String phrase) {
                    System.out.print("Упаль :(");
                }
            }
        }
    }
    @Override
    public String Disappointed(String confirm){
        if (confirm.equals("да")) {
            return name + " разочарован";
        }
        return name + " в нормальном состоянии";
    }
    @Override
    public void Happy(String confirm) {
        if (confirm.equals("да")){
            System.out.println(this.name + " очень счастлив");
        }
        else {
            System.out.println(this.name + " грустит");
        }
    }
}