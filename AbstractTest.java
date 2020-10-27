package cn.hanamura.exer.oop;

/**
 * @Package: cn.hanamura.exer.oop
 * @ClassName: AbstractTest
 * @Author: Eric Lee
 * @CreateTime: 10/24/2020 6:50 PM
 * @Description:
 *
 * abstract 用来修饰类和方法
 *
 *
 */

/*
包含抽象方法的一定得是抽象类，但是抽象类是可以有非抽象方法的
 */
public abstract class AbstractTest {//修饰类：表示此类不能实例化，只能通过子类实例化（多态性，继承性）

    public abstract void show();//修饰方法：表示此方法无法被执行，只能在子类重写
    public void eat(){
        //不报错
    }

}
