import Creatures.Character;
import Creatures.Thing;
import Creatures.MainChar;
import Exceptions.Checked;
import Exceptions.Unchecked;
import enums.Material;
import enums.SeaCreatures;

public class Story {
    static class DayNight {
        private final String time;
        public DayNight(String time){
            this.time = time;
        }
        public String getTime() {
            return time;
        }
    }
    public static void main(String[] args) throws Checked {
        DayNight Today = new DayNight("Утро");
        MainChar me = new MainChar("Я", "студент", "хочу спать");
        Character [] newCharacters = {new MainChar("Дуглас", "ученый", "недовольный"),
                new MainChar("Я", "Рассказчик", "безэмоциональный"), new MainChar("Пэбоди", "Пилот", "крутой"),
        new Character("Мы")};
        Thing [] newThings = {new Thing("Горючее"),
                new Thing("Палатки"), new Thing("Пещера"), new Thing("Пустота"), new Thing("Костное мессиво")};
        Character [] characters = {new MainChar("Лейк", "ученый", "изменчивое настроение"),
                new Character("Бурильщики"), new MainChar("Гедни", "мальчик на побегушках", "резкий"),
                new Character("Остальные")};
        Thing [] things = {new Thing("Деятельность"), new Thing("Обзорный полёт"), new Thing("Скалы"),
                new Thing("Пласты"), new Thing("Порода")};
        System.out.println(Today.getTime());
        newCharacters[1].tell("хорошо тут, в горах");
        newCharacters[0].Do("Согласился", "перенос");
        characters[0].Do("Согласился", "перенос");
        newCharacters[2].Do("доставит", "");
        System.out.println(newCharacters[0] + ", " + newCharacters[1] + ", " + characters[1] + ", " + newThings[0]);
        newCharacters[3].Do("решили подождать несколько дней", "перенос");
        newThings[0].AreThere("есть"); newThings[0].HowMuch("много");
        newCharacters[2].Do("Ждет", "перенос");
        newThings[1].AreThere("есть"); newThings[1].HowMuch("много");
        if (newThings[1].IsImportant(true)){
            System.out.println("Это важно");
        }
        characters[0].Happy("да");
        newCharacters[1].tell("уже через сутки мы с Пэбоди готовы вылететь на новое место.");
        characters[0].time("4");
        characters[0].tell("деятельность затормозилась");
        System.out.println(characters[0].Disappointed("да"));
        things[1].Do("показал, что в ", "" + things[2] + " ");
        things[3].AreThere("нет");
        System.out.print("На вершинах хребтов ");
        things[3].AreThere("есть");
        things[3].HowMuch("много");
        System.out.println("Они " + Material.древнейшие + ", " + Material.архейские + ", " + Material.кристаллические);
        things[4].Do("поблескивала", "");
        System.out.println(characters[0].Disappointed("нет"));
        characters[0].Do("начал буровые работы и поручил остальным работать", "");
        characters[3].Happy("да");
        characters[1].Do("работают", "перенос");
        things[4].Do("бурится легко", "перенос");
        characters[1].excited();
        characters[1].Run("да", 1);
        characters[1].Do("сообщают новость!", "перенос");
        characters[0].excited();
        characters[1].Do("нашли", "");
        newThings[2].AreThere("есть");
        if (newThings[2].IsImportant(true)){
            System.out.println("\nЭто важно");
        }
        characters[1].Happy("да");
        characters[1].excited();
        newThings[3].AreThere("есть"); System.out.println(" в " + things[4]);
        characters[1].Do("взорвали", "перенос");
        try {
            newCharacters[0].Run("да", 0);
        }
        catch (ArithmeticException e){
            System.out.println("Хахаха");
        }
        newCharacters[0].excited();
        System.out.print(SeaCreatures.Амфибии + ", " + SeaCreatures.Моллюски + ", " + SeaCreatures.Ракообразные);
        System.out.println(" в " + newThings[4]);
        Character.anon();
        MainChar.HowAreYou state = me.getCondition();
        System.out.println(me + " " + state.getProfession() + " " + state.getMood());
        Character.infinity();
    }
}