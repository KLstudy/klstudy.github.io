package cn.hanamura.exer.oop;

/**
 * @Package: cn.hanamura.exer.oop
 * @ClassName: Student
 * @Author: Eric Lee
 * @CreateTime: 10/24/2020 10:32 AM
 * @Description:
 * 说明：(1),子类在继承了父类之后，便获得了父类所有的属性和方法，只是由于封装性的原因，导致，子类不能直接调用
 *      父类private权限的属性和方法
 *      (2),直接父类是指，子类通过extends关键字直接继承的父类，另外还有一种父类，称为间接父类，这是父类通过
 *      extends关键字继承的父类，所以称为间接父类
 *
 */
public class Student extends Person{
    //子类可以定义自己私有属性和方法
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Student() {
    }
    public Student(int id) {
        this.id = id;
    }

    public Student(String name, String gender, int high, int age, int id) {
        super(name, gender, high, age);
        /*
        对super调用构造器的说明，就是括号里的情况，没啥说的
        1  我们可以在子类的构造器中显式的使用"super(形参列表)"的方式，调用父类中声明的指定的构造器
        2 "super(形参列表)"的使用，必须声明在子类构造器的首行！
        3 我们在类的构造器中，针对于"this(形参列表)"或"super(形参列表)"只能二一，不能同时出现
        4 在构造器的首行，没显式的声明"this(形参列表)"或"super(形参列表)"，则默认调用的是父类中空参的构造器：super()
        5 在类的多个构造器中，至少一个类的构造器中使用了"super(形参列表)"，调用父类中的构造器
         */
        this.id = id;
    }

    //方法的重写，可以看到父类中有一个叫做show()的方法
    @Override
    public void show() {
        super.show();
        /*
        对super关键字的说明：
        1 我们可以在子类的方法或构造器中。通过使用"super.属性"或"super.方法"的方式，显式的调用父类中声明的属性或方法。但是，通常情况下，我们习惯省略"super."
        2 特殊情况：当子类和父类中定义了同名的属性时，我们要想在子类中调用父类中声明的属性，则必须显式的使用"super.属性"的方式，表明调用的是父类中声明的属性。
        3 特殊情况：当子类重写了父类中的方法以后，我们想在子类的方法中调用父类中被重写的方法时，则必须显式的使用"super.方法"的方式，表明调用的是父类中被重写的方法。
         */
        System.out.println(id);
    }
    /*
    这里对返回值类型做一个说明：
    >父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型只能是void
    >父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A类的子类
    >父类被重写的方法的返回值类型是基本数据类型(比如：double)，则子类重写的方法的返回值类
    型必须是相同的基本数据类型(必须也是double)
     */
}
