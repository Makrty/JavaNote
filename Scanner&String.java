public class Note {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("input an integer");
       if (sc.hasNextInt()) {

           //hasNextInt可以判断键盘读入的是否为int类型

           int i = sc.nextInt();
           System.out.println(i);
       } else {
           System.out.println("input type error");
       }

       System.out.println("input string");
       String s = sc.nextLine();

       //nextLine是录入下一行的字符串的方法
       //键盘录入整数的时候该方法在录入的数后面会带上转义字符\r\n表示换行
       //nextInt方法只获取前面的整数，留下了\r\n
       //nextLine方法获取一行，判断该行结束就是根据\r\n,遇到\r\n即表示录入结束

       System.out.println(s);


     String s = "abc";
     System.out.println(s.toString());

     //String类 "abc"是该类的一个字符串对象
     //String类重写了toString方法，s调用toString时返回该对象本身，这也是该对象为什么可以直接输出它所代表的字符串

       byte[] arr = {97,98,99};
       String d = new String(arr);
       System.out.println(d);

       //String构造方法 public String（byte【】byte）传入一个数组，转化成对应的字符串


       char[] arr = {'a','b','c'};
       String convert = new String(arr);
       System.out.println(convert);

       //String构造方法 public String （char【】char）可将字符数组转换成字符串

       //java面试题
       String a = "abc";
       String b = "abc";
       String c = new String("abc");
       System.out.println( a == b );       //true
       System.out.println(a == c);         //false

//        主流编程语言中多数都会把字符串常量统一组织起来放到特定地址，并且所有内容相同的字符串会指向同一个地址。
//        一部分「字符串不可修改」的语言还会把字符串变量也做成这种形式。
//        换句话说但凡内容相同的字符串都会指向同一个地址，这使得在这样的语言中，字符串的相等比较具有与整数比较一样的效率。
//        后一种语言中，字符串变量往往不需要用单独的equals方法去比较
//        a跟b真的是指向相同的地址
//          对于字符串c，通过构造方法传入的字符串是常量池中的字符串，然后String再在堆中拷贝一份常量，地址值交给c，所以c与a地址不同

       System.out.println("a" == "a");  //true
       System.out.println(new String("a") ==  new String("a"));//false

       //new就是从堆区新申请的内存区域，虽然说装的东西一样，但是默认比较的是内存地址，所以答案是false

       System.out.println(a.equals(b));    //true
       //String类重写了equals方法，使得只要两个字符串内容相等及返回true
       //object类中的equals方法是利用==来进行地址相等与否判断，故两者相等

        //Java String常用方法
        String substringMethod = "何滨是大佬啊嗷嗷";
        System.out.println(substringMethod.substring(0,5));   //包含头不包含尾index

        String s = "你好你好";
        byte[] arr = s.getBytes();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
