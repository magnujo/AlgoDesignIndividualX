package com.company;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();

        ArrayList<Pair<Integer, Integer>> set = parser.Scan();
        parser.Print();





    }
}


class Parser {
    ArrayList<Pair<Integer, Integer>> set = new ArrayList<Pair<Integer, Integer>>();
    Scanner sc = new Scanner(System.in);
    Boolean firstRun = true;
    public ArrayList<Pair<Integer, Integer>> Scan (){
        int number = sc.nextInt();
        System.out.println(number);
        for (int i = 0; i < number; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            Pair<Integer, Integer> pair = new Pair<Integer, Integer>(first,second);
            if(firstRun==false && set.get(0).getValue()>=pair.getValue()){
                set.add(pair);
            }
            else for (int j = 0; j < set.size(); j++) {
                if (set.get(j).getValue()>=pair.getValue())
                    set.add(j, pair);

            }

            firstRun=false;
        }
        return set;
    }

    public Boolean Print(){
        for (int i = 0; i < set.size(); i++) {
            System.out.println(set.get(i));
        }
        return true;
    }

}

