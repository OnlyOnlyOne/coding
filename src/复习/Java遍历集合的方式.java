package 复习;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Java遍历集合的方式 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ;i < 10;i++){
            list.add(i);
        }
        //方式一：将集合变为数组，后遍历数组
        Object[] objects = list.toArray();
        for (Object o : objects) {
            System.out.print(o + " ");
        }
        System.out.println("-------------");
        //方式二：用get()方法获取，但只能在list集合中使用，只有List集合才有索引值
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        //方式三：通过迭代器
        System.out.println("-------------");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
