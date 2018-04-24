import java.util.Arrays;

public class Main {

    public static void change(String s) {
        s+="plus";
    }
    private static void change(StringBuffer stringBuffer) {
        stringBuffer.append("plus");
    }
    public static void main(String[] args) {
         StringBuffer s = new StringBuffer("I think ");
         s.capacity();    //构造一个没有字符的字符串缓冲区，初始容量为16个字符;
       s.append("hello") ;
       System.out.println(s);

       String string = "string";
       StringBuffer stringBuffer = new StringBuffer("stringBuffer");

       change(string);             //String类型虽然是引用但是无法改变
       change(stringBuffer);        //StringBuffer不是基本数据类型故可以改变值

       System.out.println(string);
       System.out.println(stringBuffer);

       int[] arr = new int[]{11,10,7,8,9,17,16};

       //冒泡排序 每相邻两个比较
            for (int i = arr.length; i > 0 ; i--) {
                for (int j = 0; j < i - 1 ; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j]  =  arr[j+1];
                        arr[j+1] = temp;
                    }
                }
        }

        System.out.println(Arrays.toString(arr));


       //选择排序  每次取一个与其它所有比较
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i]  =  arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


        Integer i = 127;
        Integer p = 127;
        System.out.println(i == p);   //true

        Integer q = 128;
        Integer m = 128;
        System.out.println(q == m);    //false

        //-128到127是byte的取值范围，在这个范围内自动装箱不会创造对象，而是从常量池中获取，超过范围再创造对象
    }


}
