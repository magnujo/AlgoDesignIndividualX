package com.company;
//import javafx.util.Pair;

import com.company.Pair;
import java.util.*;

public class Main {
    static int counter = 1;
    public static void main(String[] args) {
        Parser parser = new Parser();

        ArrayList<Pair <Integer,Integer>> set = parser.Scan();
        //parser.Print();

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
    ArrayList<Pair<Integer, Integer>> set = new ArrayList<Pair<Integer, Integer>>();
    Scanner sc = new Scanner(System.in);
    Boolean firstRun = true;

    public ArrayList<Pair<Integer, Integer>> Scan() {
        int number = sc.nextInt();
        //System.out.println(number);

        for (int i = 0; i < number; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            Pair<Integer, Integer> pair = new Pair<Integer, Integer>(first, second);

           // System.out.println("Printing set");
            /*for (int k = 0; k < set.size(); k++) {
                System.out.println(set.get(k));
            }*/

           // System.out.println("Pair" + pair);

            if (firstRun==true){
                //System.out.println("added" + pair);
                set.add(pair);

            }

            else if(pair.getValue()<set.get(0).getValue()){
                set.add(0, pair);
            }

            else {
                for (int j = 0; j < set.size(); j++) {
                   // System.out.println("For J=" + j);
                        if(set.size()== j+1 || pair.getValue() < set.get(j+1).getValue()){
                            set.add(j+1, pair);
                            break;
                        }


                }
            }
            firstRun=false;
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


