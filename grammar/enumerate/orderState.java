package enumerate;

import javax.swing.*;

public enum orderState
{
    // 所有枚举项默认使用 public static final 修饰
    A("张三"),B("李四"),C("王五");

    private String name;

    // 构造必须用 private 修饰 防止外界创造对象 (编辑器默认 不写也可以)
    private orderState(){};
    private orderState(String s)
    {
        // 创建一个类的其中一个对象时 会先把所有的枚举对象创建
        System.out.println("已执行"+" "+s);
        this.name=s;
    }

    public String get_name()
    {
        return name;
    }
}
