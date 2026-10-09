package inheritance;

/*
    Java只支持单继承，不支持多继承，但支持多层继承

    直接继承的父类叫做直接父类，间接继承的爷爷叫做间接父类

    Java中的顶级父类为：Object，每一个类都直接或者间接的继承于Object
 */

    // 继承中成员变量的特点
public class member_variables_in_inheritance {
    public void main(String[] args)
    {
        son s=new son();
        s.show();
    }
}

 class fa
{
    String name="fa";
    String address="town";
}

class son extends fa
{
    String name="son";

    public void show()
    {
        // 输出结果为 son
        System.out.println(name);
        System.out.println(this.name);

        // 输出结果为 fa
        System.out.println(super.name);

        // 输出结果位 town
        System.out.println(address);
        System.out.println(this.address);
        System.out.println(super.address);
    }

    // 就近原则 先本类位置找 如果没有再向上去父类找
}
