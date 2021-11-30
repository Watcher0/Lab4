package Creatures;
import Interfaces.*;

public class Character extends Some implements Tell, Run, Disappointed, Excited, Happy, Time{
    private String name;
    public Character(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public boolean equals(Some create) {
        if (this == create) return true;
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
    public void Run(String confirm) {
        if (confirm.equals("да")) {
            System.out.println(this.name + " побежал");
        }
        else{
            System.out.println(this.name + " остался стоять");
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
        if (confirm == "да"){
            System.out.println(this.name + " очень счастлив");
        }
        else {
            System.out.println(this.name + " грустит");
        }
    }
}