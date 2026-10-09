package inheritance;


// 继承中成员方法的特点
public class member_methods_in_inheritance
{
    public static  void main(String[] args) {
        phone p=new phone();
        p.name="a";
        p.price=4999;

        System.out.println(p.payment());
    }
}

class SmartDevice
{
    String name;
    double price;

    public double payment()
    {
        /*
            [ 0 ~ 1000 ) 元，不打折
            [ 1000 ~ 5000 ) 元，9折
            [ 5000 ~ 10000 ) 元，8折
            10000元及以上，7折
        */
        if(price>=0 && price<1000) return price;
        else if(price>=1000 && price<5000) return price*0.9;
        else if(price>=5000 && price<10000) return price*0.8;
        else if(price>=10000) return price*0.7;
        else return 0;
    }
}


class phone extends SmartDevice
{
    @Override
    public double payment()
    {
        double cur_pay=super.payment();
        return cur_pay*0.9;
    }
}


/*
1. 重写方法的名称、形参列表必须与父类中的一致，方法体按照实际需求书写。
2. 子类重写父类方法时，访问权限子类必须大于等于父类（空着不写 < protected < public）。
3. 子类重写父类方法时，返回值类型子类必须小于等于父类。
4. final 修饰类为最终类，里面所有的方法不能被重写。
5. private 私有方法、static 静态方法、final 最终方法不能被重写。  (也即非虚方法)
*/



