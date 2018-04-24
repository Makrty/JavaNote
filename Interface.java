public class Interface {
    public static void main(String[] args) {
        cat c = new cat("wusheng",1);
        c.jump();
        c.eat();
    }
}
class Animal {
    String name;
    int age;

    public Animal() {       //最好写出空参构造

    }
    public Animal(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

interface Training {
    public abstract void jump();
}

class cat extends Animal implements Training {

    cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("cat chase mouse");
    }
}

