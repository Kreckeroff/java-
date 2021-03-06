import javax.xml.namespace.QName;
import java.util.Scanner;
public class Program {
    static int fact(int n) {
        int result4 = 1;
        for (int i5 = 1; i5 <= n; i5++) {
            result4 = result4 * i5;
        }
        return result4;
    }

    static void task1() {
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
        System.out.println("\nсумма 5 чисел = " + result + "\n");
    }

    static void task2() {
        double result = 0f;
        double buff;
        System.out.println("this is the second task, I will show the first 10 numbers of the harmonic series and their sum\n");
        for (int i = 1; i < 11; i++) {
            buff = 1d / i;
            result = result + buff;
            System.out.println(i + ".   " + 1. / i);
        }
        System.out.println("\nsum = " + result + "\n");

    }

    static void task3() {
        int i = 5;
        int count = 0;
        int a = 0;
        int b = 10;
        int buff;
        int[] array = new int[i];
        boolean isSorted = false;
        System.out.println("\ntask number 3\n");
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
        while (!isSorted) {
            isSorted = true;
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] > array[k + 1]) {
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
        System.out.println("\n");
    }

    static void task4() {
        int count;
        System.out.println("\nin this task I can calculate the factorial of a number\n" +
                "enter a number from 1 to 10 and I will count it for you\n");
        Scanner scanner = new Scanner(System.in);//запись из консоли
        String a = scanner.nextLine();
        count = Integer.parseInt(a);
        System.out.println("\nfactorial of number = " + count + " will be " + fact(count) +"\n");
    }

    static void task5() {
        System.out.println("\ntask number 5\n");
        Book book;
        book = new Book();
        book.name = "Vasya's story";
        book.pages = 10;
        book.Autor = "Ivan";
        book.info();
    }

    static void task6() {
        Scanner scanner = new Scanner(System.in);
        int q;
        int r;
        int count;
        String nam;
        String buff;
        String db;

        System.out.println("\ntask number 6\n");
        System.out.println("\nВведите количесво собак:\n");
        buff = scanner.nextLine();
        r = Integer.parseInt(buff);
        Dog[] dogs = new Dog[r];
        for (int i = 0; i < r; i++) {
            dogs[i] = new Dog();
            System.out.println("\nenter the age of the " + (i + 1) + " " + "dog\n");
            buff = scanner.nextLine();
            count = Integer.parseInt(buff);
            dogs[i].SetAge(count);
            System.out.println("\nenter the name of the " + (i + 1) + " " + "dog\n");
            nam = scanner.nextLine();
            dogs[i].SetName(nam);
        }
        q = 0;
        while (q < r) {
            db = dogs[q].toString();
            System.out.println("\n");
            System.out.println(db);
            q++;
        }
    }

    public static void main(String[] args) {
        boolean bool = true;
        int count;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Для просмотра заданий введите номер задания (1-6)\n");
            System.out.println("№1 - задание №1 \n");
            System.out.println("№2 - задание №2 \n");
            System.out.println("№3 - задание №3 \n");
            System.out.println("№4 - задание №4 \n");
            System.out.println("№5 - задание №5 \n");
            System.out.println("№6 - задание №6 \n");
            System.out.println("№7 - выход из программы \n");
            String ridder = scanner.nextLine();
            switch (ridder) {
                case ("1"):
                    task1();
                    break;
                case ("2"):
                    task2();
                    break;
                case ("3"):
                    task3();
                    break;
                case ("4"):
                    task4();
                    break;
                case ("5"):
                    task5();
                    break;
                case ("6"):
                    task6();
                    break;
                case ("7"):
                    bool = false;
                    break;
                default: {
                    System.out.println("неверный ввод! \nПопробуйте еще раз.\n");
                    break;
                }
            }
        } while (bool);
    }
}
