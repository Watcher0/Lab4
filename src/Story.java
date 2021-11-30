import Creatures.Character;
import Creatures.Thing;
import enums.Material;

public class Story {
    public static void main(String[] args) {
        Character [] characters = {new Character("Лейк"), new Character("Бурильщики"), new Character("Гедни"),
                new Character("Остальные")};
        Thing [] things = {new Thing("Деятельность"), new Thing("Обзорный полёт"), new Thing("Скалы"),
                new Thing("Пласты"), new Thing("Порода")};
        characters[0].time("4");
        characters[0].tell("деятельность затормозилась");
        System.out.println(characters[0].Disappointed("да"));
        things[1].Do("показал, что в " + things[2] + " ");
        things[3].AreThere("нет");
        System.out.print("На вершинах хребтов ");
        things[3].AreThere("есть");
        things[3].HowMuch("много");
        System.out.println("Они " + Material.древнейшие + ", " + Material.архейские + ", " + Material.кристаллические);
        things[4].Do("поблескивала");
        System.out.println(characters[0].Disappointed("нет"));
        characters[0].Do("начал буровые работы и поручил остальным работать");
        characters[3].Happy("да");
        characters[1].Do("работают");
        things[4].Do("бурится легко");
        characters[1].excited();
        characters[1].Run("да");
        characters[1].Do("сообщают новость!");
        characters[0].excited();

    }
}