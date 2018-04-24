ls-当前目录
pwd-当前路径
cd-进入指定目录
cd .. -回到上级目录
cd ~回到home目录
clear-清屏
 
 代码风格问题
左大括号前面加空格，并且下一行要缩进，运算符左右要加空格
 
开发中包命名规范
包的命名规则：全部要求小写，一般是公司域名倒着写
www.heima.com
com.heima.包的作用
 
类/接口命名
类或接口需遵循驼峰命名法（首字母大写）
 
char类型内容规范
单引号扩起来的字符常量里面只可以放单个数字，单个字母或单个符号，什么也不放也不行（代表不了任何字符）但可以放空格 
char取值范围为0—65535，并且可以存储一个汉字
 
原码反码补码
原码是二进制表示法，最高位为符号位 0为正，1为负，其余位表示数值大小 通过一个字节（8个二进制位表示数字）
反码：正数反码与原码相同，负数反码是对原码逐位取反，符号位除外
补码：正数补码与原码相同，负数补码是在反码末位加一
计算机运算是通过补码运算的，超过符号位去掉
 
字节位数相关
一个字节八位，一位代表一个数值，比如int类型4个字节，32位
 
long类型表示法
Long类型加上l进行标示一般加L
 
运算级提升
byte b3 = b1 + b2；（有误）
Byte与byte（或short，char）进行运算时会提升为int
byte b4 = 3+ 4；（无误）
Java编译器有常量优化机制，会先计算右目的结果，再进行类型比较
 
a++ = a
++a = a+1
 
Byte b = 1; 
b++;                       //系统自动强制转换
b = b+1;                    //1为int类型
 
•如果两个操作数中有一个是 double 类型， 另一个操作数就会转换为 double 类型。 
•否则， 如果其中一个操作数是 float 类型， 另一个操作数将会转换为 float 类型。 
•否则 如果其中一个操作数是 long 类型 另一个操作数将会转换为 long 类型。 
•否则 两个操作数都将被转换为 int 类型 
 
 
 
+数据类型与字符串转换
任何数据类型与字符串用+连接都会变成新的字符串
 
逻辑运算符
&逻辑与:有false则false。
 |逻辑或:有true则true。
 ^逻辑异或:相同为false，不同为true。
 !逻辑非:非false则true，非true则false。
 特点：偶数个不改变本身。
&&和&的区别?
a:最终结果一样。
b:&&具有短路效果。左边是false，右边不执行。
&是无论左边是false还是true,右边都会执行
 
 位运算符及其二进制转化运算
 位运算符的基本用法（&,|,^,~）
&:有0则0
|:有1则1
^:相同则0，不同则1
~:按位取反
eg. ~6 = -7       先将int类型6化为补码形式取反，求得结果补码，再转化为原码
 
数据键入方法
键盘录入数据(录入整数)
import java.util.Scanner;
Scanner sc = new Scanner(System.in);创建键盘录入对象
int x = sc.nextInt();
 
判断语句范围
if(true)
int x = 10;
有误，if只管到下方一句话，int x = 10；是两句话，int x 与 x=10 组成
 
floorMod 方法的目的是解决一个长期存在的有关整数余数的问题。 考虑表达式 n % 2。 所有人都知道， 如果 n 是偶数， 这个表达式为 0 ; 如果 n 是奇数， 表达式则为 1。 当然， 除 非 n 是负数 如果 n 为负， 这个表达式则为 -1。 为什么呢? 设计最早的计算机时， 必须有人 制定规则， 明确整数除法和求余对负数操作数该如何处理。数学家们几百年来都知道这样一 个最优(或“ 欧几里德”)规则:余数总是要& 0。不过，最早制定规则的人并没有翻开数学 书好好研究， 而是提出了一些看似合理但实际上很不方便的规则。 
下面考虑这样一个问题: 计算一个时钟时针的位置。这里要做一个时间调整， 而且要归 一化为一个 0 ~ 11 之间的数。 这很简单:(position + adjustment) % 12。 不过， 如果这个调 整为负会怎么样呢? 你可能会得到一个负数。 所以要引入一个分支， 或者使用((position + adjustment) % 12 + 12) % 12。不管怎样， 总之都很麻烦。 
floorMod 方法就让这个问题变得容易了: floorMod(position + adjustment, 12) 总会得到一 个 0 ~ 11 之间的数。(遗憾的是， 对于负除数， floorMod 会得到负数结果， 不过这种情况在 实际中很少出现。) 
 
有些时候， 需要由较短的字符串构建字符串， 例如， 按键或来自文件中的单词。 采用字 符串连接的方式达到此目的效率比较低。 每次连接字符串， 都会构建一个新的 String 对象， 既耗时， 又浪费空间。使用 StringBuilder类就可以避免这个问题的发生。 
 
a:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
 b:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
 注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法
 
* b:构造代码块 (初始化块)
* 在类中方法外出现；多个构造方法方法中相同的代码存放到一起，每次调用构造都执行，并且在构造方法前执行
 
静态代码块 
* 在类中方法外出现，并加上static修饰；用于给类进行初始化，在加载的时候就执行，并且只执行一次。
* 一般用于加载驱动
*优先于主方法（main）执行
 
子父类同名变量调用遵循就近原则（开发中一般不会出现）
 
* 子类中所有的构造方法默认都会访问父类中空参数的构造方法
* 子类会继承父类中的数据，可能还会使用父类的数据，子类初始化之前，一定要先完成父类数据的初始化。
调用构造方法
 this(...)            调用本类的构造方法
 super(...） 调用父类的构造方法
两个不可同时出现，两个都需要在构造器第一行
 
子类重写父类方法时，访问权限不能更低,最好一致
 
final修饰特点
* 修饰类，类不能被继承
* 修饰变量，变量就变成了常量，只能被赋值一次
* 修饰方法，方法不能被重写
 
 修饰局部变量:
 基本类型，是值不能被改变
 引用类型，是地址值不能被改变,对象中的属性可以改变
 
final修饰变量的初始化时机
* 显示初始化 
* 在对象构造完毕前即可

 

 

 

 
 
 
 
 
 
对于前两条语句的结果我们很容易理解，那第三条和第四条的，为什么结果和我们想的不一样，不应该是"B and B"吗？
要理解这是为什么，我们要先理解下面这句话：
当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，
但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法。 
（但是如果强制把超类转换成子类的话，就可以调用子类中新添加而超类没有的方法了）
看一下标红的那句话，我们知道问题所在了吗？
当运行 a2.show(b) 的时候，实际是要调用一个 show(B obj) 的方法，但是 A 中有这样一个方法吗？
没有！但是由于 B 继承自 A，所以会调用 A 中的 show(A obj) 的方法，但是调用时候发现这个方法已经被 B 重写了，
所以就会转向来调用 B 中的 show(A obj) 方法。所以才会打印出"B and A"。
实际上这里涉及方法调用的优先问题 ，优先级由高到低依次为：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
让我们来看看它是怎么工作的。
比如，a2.show(b)，a2是一个引用变量，类型为A，则this为a2，b是B的一个实例，于是它到类A里面找show(B obj)方法，没有找到，于是到A的super(超类)找，而A没有超类，因此转到第三优先级this.show((super)O)，this仍然是a2，这里O为B，(super)O即(super)B即A，因此它到类A里面找show(A obj)的方法，类A有这个方法，但是由于a2引用的是类B的一个对象，B覆盖了A的show(A obj)方法，因此最终锁定到类B的show(A obj)，输出为"B and A”。
怎么样？理解了吗？
 
问题还要继续，现在我们再来看上面的分析过程是怎么体现出红色字体那句话的内涵的。
它说：当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，
但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法。还是拿a2.show(b)来说吧。
 
a2是一个引用变量，类型为A，它引用的是B的一个对象，因此这句话的意思是由B来决定调用的是哪个方法。
因此应该调用B的show(B obj)从而输出"B and B”才对。但是为什么跟前面的分析得到的结果不相符呢？！问题在于我们不要忽略了蓝色字体的后半部分，那里特别指明：这个被调用的方法必须是在超类中定义过的，也就是被子类覆盖的方法。B里面的show(B obj)在超类A中有定义吗？没有！那就更谈不上被覆盖了。
实际上这句话隐藏了一条信息：它仍然是按照方法调用的优先级来确定的。它在类A中找到了show(A obj)，如果子类B没有覆盖show(A obj)方法，那么它就调用A的show(A obj)（由于B继承A，虽然没有覆盖这个方法，但从超类A那里继承了这个方法，
从某种意义上说，还是由B确定调用的方法，只是方法是在A中实现而已）；现在子类B覆盖了show(A obj)，因此它最终锁定到B的show(A obj)。这就是那句话的意义所在，到这里，我们可以清晰的理解Java的多态性了。
 
接口成员变量默认修饰符 public static final ；接口中没有构造方法（与继承区分开来）；接口中方法被重写时必须使用public
接口与接口可以多继承
package语句必须是程序的第一条可执行的代码
 
elipse快捷键
Alt+/ 起提示作用
main+alt+/,syso+alt+/,给出其他提示

