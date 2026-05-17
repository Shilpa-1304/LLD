package com.sk.LLD.Generics;

public class Client {
    public static void main(String[] args) {
        Box<String> str_box=new Box();
        str_box.putS("Shilpa");
        String str=str_box.getS();

        Box<Double> db_box=new Box();
        db_box.putS(11.111);
        Double val=db_box.getS();

        Pair<String , Integer> pair=new Pair<>("Shilpa",100);
        String name=pair.getVal1();
        //NOTE:
        Integer[] arr={1,3,5,7,9,2,4,6,8};
        Box.printArr(arr);

        String[] res={"ABCDE","BCDEF"};
        Box.printArr(res);

        //NOTE:
        Integer[] arr1={1,3,5,7,9,2,4,6,8};
        Box.printIntegerArr(arr);

        String[] res1={"ABCDE","BCDEF"};
//        Box.printIntegerArr(res); // Compile time-error.
    }
}
