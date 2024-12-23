import java.util.*;

public class lab3orig {
    public static void main(String[] args) {
        System.out.println("\nЛабораторна робота №3\nВиконала студентка групи КМ-21 Марченко Єва\n");

        Animal lion = new Lion();
        Animal parrot = new Parrot();
        Animal turtle = new Turtle();

        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(parrot);
        animals.add(turtle);

        for (Animal animal : animals) {
            animal.eat();
            animal.sound();
            animal.care();
        }
    }
}

interface Animal {
    void eat();
    void sound();
    void care();
}

class Lion implements Animal {
    public void eat() {
        System.out.println("Лев їсть мʼясо");
    }

    public void sound() {
        System.out.println("Лев ричить");
    }

    public void care() {
        System.out.println("Лев повинен жити у волʼєрі");
    }
}

class Parrot implements Animal {
    public void eat() {
        System.out.println("\nПапуга їсть пшоно");
    }

    public void sound() {
        System.out.println("Папуга цвірінькає");
    }

    public void care() {
        System.out.println("Папуга повинен жити у чистій клітці.");
    }
}

class Turtle implements Animal {
    public void eat() {
        System.out.println("\nЧерепаха їсть рослини");
    }

    public void sound() {
        System.out.println("Черепаха не видає звуків");
    }

    public void care() {
        System.out.println("Черепаха повинна жити у акваріумі");
    }
}
