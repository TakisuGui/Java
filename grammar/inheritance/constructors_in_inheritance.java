package inheritance;

// 继承中构造方法的特点
public class constructors_in_inheritance {
    public static void main(String[] args) {
        stu s=new stu("张三",114,514);

        System.out.println(s.name+" "+s.age+" "+s.grade);
    }
}

/*
1. 子类不能继承父类的构造方法，但是可以通过 super 调用
2. 子构造方法的第一行，有一个默认的 super()，不写也有
3. 如果想要访问父类有参构造，必须手动书写 super(参数)
 */

class Person
{
    String name;
    int age;

    public Person()
    {
        System.out.println("父类的空参构造");
    }

    public Person(String name, int age) {
        System.out.println("父类的带参构造");
        this.name = name;
        this.age = age;
    }
}

class stu extends Person
{
    int grade;

    public stu() {
        System.out.println("子类空参构造");
    }

    public stu(String name, int age,int grade) {
        super(name, age);
        this.grade=grade;
    }
}

/*
    this 内存的角度：表示当前方法调用者的地址值
    this 代码的角度：利用 this 可以直接调用本类成员（比如：成员变量，成员方法，构造方法等）
    super 关键字：代表使用父类中的内容
 */


class f1
{
    String name;
    int age;

    public f1()
    {
        this("李四",1919);

        // this() 调用本类的其他构造方法
    }

    public f1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



