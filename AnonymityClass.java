

//       为什么要使用内部类？在《Think in java》中有这样一句话：使用内部类最吸引人的原因是：每个内部类都能独立地继承一个（接口的）实现，
//       所以无论外围类是否已经继承了某个（接口的）实现，对于内部类都没有影响。

//       在我们程序设计中有时候会存在一些使用接口很难解决的问题，
//       这个时候我们可以利用内部类提供的、可以继承多个具体的或者抽象的类的能力来解决这些程序设计问题。
//       可以这样说，接口只是解决了部分问题，而内部类使得多重继承的解决方案变得更加完整。




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
