
abstract class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();
}


interface Inter {
    abstract void show();
}

class Outer {
    public static Inter method() {
        return new Inter() {
            @Override
            public void show() {
                System.out.println("called");
            }
        };
    }
}

public class Main {

    public void testMethod(Bird bird){
        System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.testMethod(new Bird() {        //建立一个匿名内部类，实质上为所实现的接口or父类的一个对象

            public int fly() {
                return 1000;
            }

            public String getName() {
                return "大雁";
            }
        });

        Outer.method().show();        //实现这个方法首先要发现这个method方法为静态，然后返回的必须是抽象类的一个对象，故想到匿名内部类构造对象
    }
