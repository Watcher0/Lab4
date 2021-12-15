package Creatures;

import Interfaces.*;

public class Thing extends Some implements AreThere, HowMuch, Do, IsImportant{
    private String name;
    public Thing(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void AreThere(String confirm) {
        if (confirm.equals("есть")){
            System.out.print(this.name + " есть");
        }
        else{
            System.out.println(this.name + " нет");
        }
    }
    @Override
    public void HowMuch(String HowMuch) {
        if (HowMuch.equals("много")){
            System.out.println(" очень даже много");
        }
        else{
            System.out.println(", совсем мало");
        }
    }
    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public boolean IsImportant(boolean confirm) {
        return confirm;
    }
}
