package Creatures;
import Interfaces.*;

public abstract class Some implements Do{
    protected String name;
    public Some(String name) {
        this.name = name;
    }

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
    public void Do(String work, String enter) {
        if (enter.equals("перенос")) {
            System.out.print(this.name + " " + work + " \n");
        }
        else {
            System.out.print(this.name + " " + work + " ");
        }
    }
}
