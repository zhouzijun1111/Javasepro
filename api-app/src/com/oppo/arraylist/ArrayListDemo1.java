package com.oppo.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("前海");
        list.add("后海");
        list.add("OPPO");
        System.out.println(list);

        list.add(1, "MySQL");
        System.out.println(list);

        String rs = list.get(1);
        System.out.println(rs);

        System.out.println(list.size());
    }
}
