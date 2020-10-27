package cn.hanamura.exer.oop;

/**
 * @Package: cn.hanamura.exer.oop
 * @ClassName: FinalTest
 * @Author: Eric Lee
 * @CreateTime: 10/24/2020 6:46 PM
 * @Description:
 */
public class FinalTest {

    public final String GENDER = "male";//final修饰属性，表示全局常量，第一次复制后便不可以被修改

    public final void show(){//final修饰方法：表示此方法不可以被重写
        System.out.println(1);
    }

    final class inclass{//final修饰类：表示此类不能被其它类所继承

    }

}
