package com.ms.study.dsa;

public class Problem1 {

    public static void main(String[] args) {
        CustomDS customDS = new CustomDS();
        customDS.add(10);
        customDS.add(20);
        customDS.add(30);
        customDS.add(40);

        System.out.println(customDS.getArr());
        System.out.println(customDS.getHash());

        customDS.remove(20);

        System.out.println(customDS.getArr());
        System.out.println(customDS.getHash());

        System.out.println(customDS.search(40));
        System.out.println(customDS.getRandom());


    }
}
