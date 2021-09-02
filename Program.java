import javax.xml.namespace.QName;
import java.util.Scanner;
public class Program {
    static int fact(int n){
        int result4 = 1;
        for(int i5 = 1; i5 <= n; i5++){
            result4 = result4*i5;
        }
        return result4;
    }
    static void task1(){
        int i = 5;
        int result = 0;
        int count = 0;
        int[] array = new int[i]; //создание массива интов

        System.out.println("hello, this is the first task, enter 5 numbers and I will calculate their sum\n");

        while (count < i) {
            Scanner scanner = new Scanner(System.in);//запись из консоли
            String a = scanner.nextLine();
            array[count] = Integer.parseInt(a);
            count++;
        }
        count = 0;
        while (count < i) {
            result = array[count] + result;
            // System.out.println(array[count1]);
            count++;
        }
        System.out.println("result = " + result + "\n");
    }
    static void task2(){
        double result = 0f;
        double buff;
        System.out.println("this is the second task, I will show the first 10 numbers of the harmonic series and their sum\n");
        for (int i = 1; i < 11; i++) {
            buff =  1d / i;
            result = result + buff;
            System.out.println(i + ".   " + 1. / i);
        }
        System.out.println("sum = " + result);

    }
    static void task3(){
        int i = 5;
        int count = 0;
        int a = 0;
        int b = 10;
        int buff;
        int[] array = new int[i];
        boolean isSorted = false;
        System.out.println("\n\ntask number 3\n");
        while (count < i) {
            array[count] = a + (int) (Math.random() * b);//random numbers
            count++;
        }
        count = 0;
        System.out.println("random numbers from 0 to 10 \n");
        while (count < i) {
            System.out.println(array[count]);
            count++;
        }
        while(!isSorted) {
            isSorted = true;
            for (int k = 0; k < array.length-1; k++) {
                if(array[k] > array[k+1]){
                    isSorted = false;

                    buff = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = buff;
                }
            }
        }
        count = 0;
        System.out.println("sorted numbers");
        while (count < i) {

            System.out.println(array[count]);
            count++;
        }
    }
    static void task4(){
        int count;
        System.out.println("in this task I can calculate the factorial of a number\n" +
                "enter a number from 1 to 10 and I will count it for you\n");
        Scanner scanner = new Scanner(System.in);//запись из консоли
        String a = scanner.nextLine();
        count = Integer.parseInt(a);
        System.out.println("factorial of number = " + count + " will be " + fact(count));
    }
    static void task5(){
        System.out.println("\n\ntask number 5\n");
        Book book;
        book = new Book();
        book.name = "Vasya's story";
        book.pages = 10;
        book.Autor = "Ivan";
        book.info();
    }
    static void task6(){
        int q = 0;
        int r = 3;
        int count;
        String nam;
        String a;
        String db;
        Dog[] dogs = new Dog[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\ntask number 6\n");
        for(int i = 0 ; i < 3 ; i++) {
            dogs[i]= new Dog();
            System.out.println("\nenter the age of the dog\n");
            a = scanner.nextLine();
            count = Integer.parseInt(a);
            dogs[i].SetAge(count);
            System.out.println("\nenter the name of the dog\n");
            nam = scanner.nextLine();
            dogs[i].SetName(nam);
        }
        while(q < r){
            db = dogs[q].toString();
            System.out.println("\n");
            System.out.println(db);
            q++;
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        }
    }
