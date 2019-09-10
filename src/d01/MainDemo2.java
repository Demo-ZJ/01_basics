package d01;

import java.util.List;

/**
 * @Description: TODO
 * @author: ZJ
 * @time: 2019/8/26 11:56
 * @Version: 1.0.0
 */
public class MainDemo2 {

    public String run1( String a ){

        String str = "run1";

        a = str;
        System.out.println("MainDemo2 run1:--> "+ a);
        System.out.println("MainDemo2 run1:--> "+ str);
        return str;
    }

    public void run2(List<String> list) {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

    }
}
