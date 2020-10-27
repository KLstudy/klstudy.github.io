package cn.hanamura.exer.oop;

/**
 * @Package: cn.hanamura.exer.oop
 * @ClassName: StaticTest
 * @Author: Eric Lee
 * @CreateTime: 10/24/2020 5:42 PM
 * @Description:
 */
public class KeyTest {

    String name;
    private int age;
    //以上是非静态方法，也就是实例属性，与对象息息相关，每个对象都有自己的一套name和age属性

    public static String field;
    //以上是静态方法，也就是类属性，它随着类的加载而加载，每个对象都共享着这个属性

    //这是非静态方法，就是很普通，没啥说的，方法中可以调用静态和非静态
    public void show(){
        System.out.println("人");
    }

    //这是静态方法，特殊在可以被类名直接调用，当然实例也可以调用它。
    //其次呢就是，静态方法中只能调用静态属性。
    public static void eat(){
        System.out.println("吃");
    }

    //代码块

    /**
     *
     * 1，静态代码块（随着类的加载而执行）
     *     （1），总体来说是在类加载的时候，来装饰这个类或者说，解释这个类的。
     *     （2），静态代码块里面只能调用静态的属性和方法
     */
    static{
        System.out.println("这个类是来说明static、代码块、内部类的");
        field = "人";
        // age = 21;  调用非静态属性会报错
    }

    /**
     * 2，非静态代码块（随着对象的创建而运行，每创建一个对象就运行一次）
     *     （1），来修饰当前类的实例
     *     （2），非静态代码块可以调用非静态的属性方法也可以调用非静态的属性方法
     */
    {
        System.out.println("这个类可以生成的对象应该怎么怎样杨");
        age = 21;
        //可以对类的属性进行初始化，虽然构造器也可以干这事儿，但构造器每造一个对象都要显式的对每个属性赋值
        //而代码块可以提前写好，只写一次

    }


    //内部类

    /**
     * 所谓内部类不就是声明在另一个类内部的类嘛，就像是属性一样也属于外部类的一个成员罢了，只不过这个成员有点胖
     * 若用static修饰，也只不过就是让它随着类的加载而加载，并且只存在一份
     */
    static class inclass{

        private static String a;
        private String a1;
        public static String field;


        public static void e(){

        }
        /*
        内部类的调用问题
         */
        public void show(){
            //调用内部类自己属性
            System.out.println(this.a1);
            /*
            静态与非静态时相对的，静态的内部类只能调用静态的结构，这是内部类相对于外部类说的
            在上面的语句中可以看到通过this调用的时一个非静态的属性，是因为这里的方法是非静态的
            这是相对于自己的内部类而言的
             */
            //调用外部类的属性
            System.out.println(KeyTest.field);
            /*
            这里有一个特殊的问题，由于这个内部类是静态的，所以只能调用静态，这就致使，在内部类调用外部静态属性
            时，直接可以用类名调用（KeyTest.field）。可以看到在内部类当中也同样有field这个属性，如果在非静
            态的结构中，调用外部的同名属性应该这样写（KeyTest.this.field）.
             */
        }

    }


}
