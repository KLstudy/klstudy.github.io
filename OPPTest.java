package cn.hanamura.exer.oop;

/**
 * @Package: cn.hanamura.exer.oop
 * @ClassName: OPPTest
 * @Author: Eric Lee
 * @CreateTime: 10/24/2020 10:57 AM
 * @Description:
 */
public class OPPTest {
    public static void main(String[] args) {
        //多态性的体现,父类的引用指向子类的对象（或子类的对象赋给父类的引用）
        Person p = new Student();
        /*
        多态性常用到的转型问题说明：
        向上转型：多态   Student --->  Person
        向下转型：强制转换   Person  ---> Student
         */
        Person p1 = new Person();
        //Student t = (Student)p1;  //这就是向下转型
        /*
        向下转型容易出现的异常：
        ① 使用强转时，可能出现ClassCastException的异常。
        ② 为了避免在向下转型时出现ClassCastException的异常，
        我们在向下转型之前，先进行instanceof的判断，一旦返回true，
        就进行向下转型。如果返回false，不进行向下转型。
         */
        if(p1 instanceof Student){
            Student t = (Student)p1;
        }

    }
}
