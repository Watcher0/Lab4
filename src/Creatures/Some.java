package Creatures;
import Interfaces.*;

public abstract class Some implements Do{
    private String name;
    public Some(String name) {
        this.name = name;
    }
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
    public void Do(String work){
        System.out.println(this.name + " " + work);
    }
}
