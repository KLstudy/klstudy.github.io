package cn.hanamura.exer.oop;

/**
 * @Package: cn.hanamura.exer.oop
 * @ClassName: ReviewTest
 * @Author: Eric Lee
 * @CreateTime: 10/24/2020 6:36 PM
 * @Description:
 * 		    JDK7及以前：只能定义全局常量和抽象方法
 * 			>全局常量：public static final的.但是书写时，可以省略不写
 * 			>抽象方法：public abstract的
 */
public interface ReviewTest {

    /*
    在接口中全局常量必须时public static final的，但是正如下面看到的，所有一样的这部分是可以不写的
     */
    public static final int AGE = 21;
    String ASD = "java";

    /*
    在接口中可以声明抽象方法，必须是public的，但是和属性一样，一样的部分可以省略不写，
     */
    public abstract void show();
    void eat();
}
