package cn.hanamura.exer.oop;

import java.security.PrivateKey;

/**
 * @Package: cn.hanamura.exer.oop
 * @ClassName: Person
 * @Author: Eric Lee
 * @CreateTime: 10/24/2020 9:05 AM
 * @Description:
 */
public class Person<getSum> {
    //属性,数据类型前面的叫做权限修饰符，从大到小排序是 public(工程) > protected（不同包的子类） > 缺省（包） > private（类）
    public String name;
    protected int high;
    String gender;
    private int age;
    //构造器（空参），什么？构造器是干嘛的？构造器使用来造对象的
    public Person() {
    }
    //构造器（带参），什么叫带参？就是带有形似参数，在创建对象的时候，给这个对象赋予初始化的姓名，年龄等信息
    public Person(String name, String gender, int high, int age) {
        this.name = name;//这里的this表示当前对象或者正在创建的对象
        this.gender = gender;
        this.high = high;
        this.age = age;
    }
    //这个叫做方法：相当于人的行为，就像是要是有人为你多少岁了，你得知道，然后告诉他
    public String getName() {//String表示这个方法，需要返回一个String类型的值，作为返回值
        return name;//return : 作为Java的一个关键字（1），结束方法（2），返回方法对应的类型的数值
    }
    //这里的setName是，方法名
    public void setName(String name) {//这里的String name 就是传说中的形式参数，就是给你起名字，总得想个好名字把
        this.name = name;
    }

    //方法名是可以重复的，也就是说一个类里面可以有同样名字的方法，这就是方法的重载
    public void getSum(int i,int j){
        System.out.println(1);
    }

    public void getSum(double i,double j){//看吧，两个方法的名字一样，只是[参数类型]不一样的方法是可以共存的，这就是方法的重载
        System.out.println(2);
    }

    public void show(){
        System.out.println(name + " " + age);

    }
}
