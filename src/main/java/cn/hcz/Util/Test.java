package cn.hcz.Util;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int count=0;
        int num=0;
        for (int i = 0; i <=100; i++) {
            num=num+i;
            count=++count;
        }
        System.out.println(num);
        System.out.println(count);
        List list=new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.remove("2");
        //Map<String,Object> map =new HashMap<>();
        /*Double i1=3.3;
        Double i2=3.3;
        System.out.println(i1==i2);

        Set<String>  o = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        o.add("A");
        o.add("G");
        o.add("E");
        o.add("C");
        for (String s:o) {
            System.out.println(s);
        }
    }*/
    }
}
