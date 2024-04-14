import java.util.Random;
//import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Random rand = new Random();
        List < Integer > list = new SortedList < Integer > ();
        int n, num;
        System.out.println("insert");
        long start = System.currentTimeMillis();
        //Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < (num = args.length == 1 ?
                Integer.parseInt(args[0]) : 11); ++i) {
            //System.out.println("enter number to insert");
            //n = myObj.nextInt();
            n = rand.nextInt(num);
            list.insert(n);
            System.out.print(n + ": ");
            for (Integer j: list) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
        System.out.println("search");
        //Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < num / 2; ++i) {
            //System.out.println("enter number");
            //n = myObj.nextInt();
            n = rand.nextInt(num);
            System.out.println(n + ": " + list.search(n));
        }
        System.out.println("retrieve");
        //Scanner my = new Scanner(System.in);
        for (int i = -1; i < num + 1; ++i) {
            //System.out.println("index of number you want to retrieve");
            //n = my.nextInt();
            System.out.println(i + ": " + list.retrieve(i));
        }
        // rand = new Random(1);
        System.out.println("remove");
        start = System.currentTimeMillis();
        //Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < num; ++i) {
           //System.out.println("Enter number to delete");
            //n = myObj.nextInt();
            n = rand.nextInt(num);
            list.remove(n);
            System.out.print(n + ": ");
            for (Integer j: list) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
        System.out.println("insert");
        start = System.currentTimeMillis();
        for (int i = 0; i < (num = args.length == 1 ?
                Integer.parseInt(args[0]) : 11); ++i) {
            n = rand.nextInt(num);
            list.insert(n);
            System.out.print(n + ": ");
            for (Integer j: list) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
        System.out.println(list);
    }
}


/*
Random rand = new Random(1);
        List < Integer > list = new SortedList < Integer > ();
        int n;
        Scanner firstObj = new Scanner(System.in);

        System.out.println("insert");
        long start = System.currentTimeMillis();

        System.out.println("Enter list length");
        int num = firstObj.nextInt();
        for (int i = 0; i <num ; ++i) {
            System.out.println("Enter a number");
            n= firstObj.nextInt();
            //n = rand.nextInt(num);
            list.insert(n);
            System.out.print(n + ": ");
            for (Integer j: list) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
        System.out.println("search");
        Scanner myObj = new Scanner(System.in);
        
        for (int i = 0; i < num / 2; ++i) {
            //n = rand.nextInt(num);
            n = myObj.nextInt();
            System.out.println(n + ": " + list.search(n));
        }
        System.out.println("retrieve");
        for (int i = -1; i < num + 1; ++i) {
            System.out.println(i + ": " + list.retrieve(i));
        }
        // rand = new Random(1);
        System.out.println("remove");
        start = System.currentTimeMillis();
        for (int i = 0; i < num; ++i) {
            n = rand.nextInt(num);
            list.remove(n);
            System.out.print(n + ": ");
            for (Integer j: list) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
        System.out.println("insert");
        start = System.currentTimeMillis();
        for (int i = 0; i < (num = args.length == 1 ?
                Integer.parseInt(args[0]) : 11); ++i) {
            n = rand.nextInt(num);
            list.insert(n);
            System.out.print(n + ": ");
            for (Integer j: list) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
        System.out.println(list);
---------------
        Random rand = new Random(1);
        List < Integer > list = new SortedList < Integer > ();
        int n, num;
        System.out.println("insert");
        long start = System.currentTimeMillis();
        for (int i = 0; i < (num = args.length == 1 ?
                Integer.parseInt(args[0]) : 11); ++i) {
            n = rand.nextInt(num);
            list.insert(n);
            System.out.print(n + ": ");
            for (Integer j: list) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
        System.out.println("search");
        Scanner myObj = new Scanner(System.in);
        
        for (int i = 0; i < num / 2; ++i) {
            //n = rand.nextInt(num);
            n = myObj.nextInt();
            System.out.println(n + ": " + list.search(n));
        }
        System.out.println("retrieve");
        for (int i = -1; i < num + 1; ++i) {
            System.out.println(i + ": " + list.retrieve(i));
        }
        // rand = new Random(1);
        System.out.println("remove");
        start = System.currentTimeMillis();
        for (int i = 0; i < num; ++i) {
            n = rand.nextInt(num);
            list.remove(n);
            System.out.print(n + ": ");
            for (Integer j: list) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
        System.out.println("insert");
        start = System.currentTimeMillis();
        for (int i = 0; i < (num = args.length == 1 ?
                Integer.parseInt(args[0]) : 11); ++i) {
            n = rand.nextInt(num);
            list.insert(n);
            System.out.print(n + ": ");
            for (Integer j: list) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
        System.out.println(list);
 */

