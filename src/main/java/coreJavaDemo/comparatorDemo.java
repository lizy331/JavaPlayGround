package coreJavaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class comparatorDemo {
    public static void main(String[] args) {
        String[] strs = new String[]{"H","G","C","A"};
        mySort ms = new mySort();
        // Arrays.sort(strs,ms);
        // 使用 lambda expression 定义排序规则
        Arrays.sort(strs,(a,b)->a.compareTo(b));
        System.out.println(Arrays.toString(strs));
    }
    // 必须使用对 comparator 添加 generic 泛型
    static class mySort implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}
