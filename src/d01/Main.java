package d01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //System.out.println(' '+1);
        short s = 1;

        String a ="";
        MainDemo2 mainDemo2 = new MainDemo2();
        System.out.println(mainDemo2.run1(a));

        System.out.println(a);
        //s = s+1;


        List<String> list  = new ArrayList<String>();
        System.out.println(list.size());
        mainDemo2.run2(list);
        System.out.println(list.size());

    }


}
