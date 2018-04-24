public class Main {

    public static void main(String[] args) {

//        Outter.Inner te  =new Outter().new Inner();  //创造内部类对象才可以访问
////        te.method();
        Outer outer = new Outer();
        outer.creatObj();
        //当内部类私有时，可以通过其外部类创建对象的方式，来访问私有的内部类成员函数

        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        innerStatic.method();

        //静态内部类访问方式

        InterviewTest.Inner oi = new InterviewTest().new Inner();
        oi.show();

    }
}

class Outer {
    private int num = 10;

    private class Inner{
        public void method() {
            System.out.println(num);
        }
    }

    static class InnerStatic {
        public void method() {
            System.out.println("static class called");
        }
    }

    public void creatObj() {
        Inner inner = new Inner();
        inner.method();
    }
}

class InterviewTest {
    public int num = 10;
    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(InterviewTest.this.num);  //内部类可获得外部类成员方法：通过InterviewTest.this这个外部类对象
            System.out.println(Inner.this.num);   //等同于this.num
            System.out.println((InterviewTest.this)instanceof InterviewTest);
        }
    }
}
