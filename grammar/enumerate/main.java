package enumerate;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        orderState o1 = orderState.A;
        System.out.println(o1.get_name());

        // 编辑器会默认给编辑器 value(),valueOf() 函数

        // value() 获取本类的所有的枚举项
        System.out.println();
        orderState[] arr=orderState.values();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].get_name());
        }

        // valueOf() 获取指定的枚举
        System.out.println();
        orderState temp1=orderState.valueOf("B");
        System.out.println(temp1.get_name());

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        try
        {
            orderState temp2 = orderState.valueOf(s);
            System.out.println(temp2.get_name());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("没有这个"+s+"对象存在");
            e.printStackTrace();
        }


        // for 循环迭代枚举
        System.out.println();
        for(orderState x : orderState.values()) System.out.println(x.get_name());;
    }
}
