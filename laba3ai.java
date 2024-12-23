import java.util.*;

public class laba3ai {
    public static void main(String[] args) {
        System.out.println("\nЛабораторна робота №3\nВиконала студентка групи КМ-21 Марченко Єва\n");
        List<Animal> animals = new ArrayList<>(); //додаємо тварин
        animals.add(new Lion());
        animals.add(new Parrot());
        animals.add(new Turtle());

        System.out.println("Їжа:"); //метод годування
        for (Animal animal : animals) {
            System.out.println(animal.getType() + ": " + animal.getFood());
        }

        System.out.println("\nЗвуки:"); //метод звуків
        for (Animal animal : animals) {
            System.out.println(animal.getType() + ": " + animal.getSound());
        }

        System.out.println("\nДогляд:"); //метод доглядання
        for (Animal animal : animals) {
            System.out.println(animal.getType() + ": " + animal.getCare());
        }
    }
}

interface Animal {
    String getType(); //тварина
    String getFood(); //годування
    String getSound(); //звук
    String getCare(); //доглядання
}

class Lion implements Animal {
    public String getType() {
        return "Лев";
    }
    public String getFood() {
        return "мʼясо";
    }
    public String getSound() {
        return "рик";
    }
    public String getCare() {
        return "великий волʼєр";
    }
}

class Parrot implements Animal {
    public String getType() {
        return "Папуга";  
    }
    public String getFood() {
        return "пшоно";
    }
    public String getSound() {
        return "цвіріньк";
    }
    public String getCare() {
        return "чиста клітка";
    }
}

class Turtle implements Animal {
    public String getType() {
        return "Черепаха";
    }
    public String getFood() {
        return "рослини";
    }
    public String getSound() {
        return "мовчить";
    }
    public String getCare() {
        return "акваріум";
    }
}
