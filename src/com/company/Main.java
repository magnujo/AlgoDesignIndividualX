package com.company;
//import javafx.util.Pair;

import com.company.Pair;
import java.util.*;

public class Main {
    static int counter = 1;
    public static void main(String[] args) {
        Parser parser = new Parser();

        ArrayList<Pair> set = parser.Scan();
        //parser.Print();
        Collections.sort(set);

        System.out.println("Printing Last List");
        for (int i = 0; i < set.size(); i++) {
            System.out.println(set.get(i));
        }

        int first = set.get(0).getValue();

        for (int i = 1; i < set.size(); i++) {
            if(first<=set.get(i).getKey()){
                counter++;
                first = set.get(i).getValue();
            }
        }

        System.out.println(counter);


    }
}


class Parser {
    ArrayList<Pair> set = new ArrayList<Pair>();
    Scanner sc = new Scanner(System.in);
    Boolean firstRun = true;

    public ArrayList<Pair> Scan() {
        int number = sc.nextInt();
        //System.out.println(number);

        for (int i = 0; i < number; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            Pair pair = new Pair<>(first, second);

           // System.out.println("Printing set");
            /*for (int k = 0; k < set.size(); k++) {
                System.out.println(set.get(k));
            }*/

           // System.out.println("Pair" + pair);

                set.add(pair);

        }

        return set;
        //firstRun=false;
    }


    public Boolean Print() {
        //System.out.println("Printing Last List");
        for (int i = 0; i < set.size(); i++) {
           // System.out.println(set.get(i));
        }
        return true;
    }
}


