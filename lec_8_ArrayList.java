package keerti;

import java.util.ArrayList;

public class lec_8_ArrayList {

    public static void main(String[] args) {

        //WE ARE LEARNING THE ARRAY LIST FOR INTEGERS
        int numbers=55;
        int []num={1,4,7,9,0};
        int []num1=new int[4];
        System.out.println(numbers);
        System.out.println(num);
        System.out.println(num1);
        // in array we usually get garbage value when we sout

        // now we will use the array list
        ArrayList<Integer>data=new ArrayList<Integer>();
        data.add(100);
        data.add(101);
        data.add(102);
        data.add(103);
        data.add(104);
        data.add(105);

        System.out.println(data.get(0));
        //so here the advantage is unlike array we can go on adding as many as number/data we need to add

        System.out.println(data);
        //whether we do like this, we ain't getting any garbage value

        //NOW WE WILL LEARN TO USE FOREACH LOOP AND LEARN THE DIFFERENCE BETWEEN FOREACH AND FOL LOOP

        //FOR LOOP
        for (int i=0;i<data.size(); i++)
        // while using the arraylist always write down data.size() and not data.length()
        {
            System.out.println("      "+data.get(i));
        }

        //NOW BY USING FOREACH LOOP
        for (int a:data
             ) {
            System.out.println(a);

        }
        // NOW WE WILL SEE WHILE TAKING THE STRING HOW WE WILL USE IT
        ArrayList<String>english=new ArrayList<String>();
        english.add("heeriye1");
        english.add("heeriye2");
        english.add("heeriye3");
        english.add("heeriye4");
        english.add("heeriye5");
        english.add("heeriye6");

       //using for loop
        for(int i=0;i<english.size();i++){
            System.out.println(english.get(i));
        }

       // using foreach loop
        for (String e:english
             ) {
            System.out.println(e);

        }





    }

}
