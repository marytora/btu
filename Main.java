package com.BTU;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*დავალება 1*/
        String cpp = "c++";
        String JVMpascal = "java\rpascal";
        String JS = "JavaScript\n";
        System.out.println(cpp + "\n" + "c#\r" + JVMpascal + "\nphp" + "\r" + JS + "ActionScript");
//another way
        String[] languages = {"c++", "c#", "java", "pascal", "php", "JavaScript", "ActionScript"};
        for (String i : languages) {
            System.out.println(i);
        }

//  2) მეორე ნომერი
        Scanner inputN1 = new Scanner(System.in);
        System.out.println("enter the first number:");
        int x = inputN1.nextInt();
        Scanner inputN2 = new Scanner(System.in);
        System.out.println("Enter the second number:");
        int y = inputN2.nextInt();

        int Devide = (x / y);
        int Part = (y % x);

        System.out.println("devide for two int is: " + Devide);
        System.out.println("Part of them is:" + Part);

        // 3) ნომერი
        Scanner num1 = new Scanner(System.in);
        int a;
        System.out.println("Enter Num1: ");
        a = num1.nextInt();
        System.out.println("first number is: " + a);

        Scanner num2 = new Scanner(System.in);
        int b;
        System.out.println("Enter Num2: ");
        b = num2.nextInt();
        System.out.println("second number is:" + "" + b);

        Scanner num3 = new Scanner(System.in);
        int c;
        System.out.println("Enter Num3: ");
        c = num3.nextInt();
        System.out.println("third number is:" + "" + c + "\r");
        System.out.println(a + b + c);
        int multpaly = a * b * c;
        System.out.println(multpaly);


//  4-5 ნომერი

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int numb = input.nextInt();
        System.out.println("print it out as an individual digit");
        int digit1 = numb / 100;
        int digit2 = (numb % 100) / 10;
        int digit3 = numb % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println("Enter a four digit number");
        Scanner input2 = new Scanner(System.in);
        int numb2 = input2.nextInt();
        int AnotherDigit1 = numb2 / 1000;
        int AnotherDigit2 = (numb2 / 100) % 10; //  (number % 1000)/100;
        int AnotherDigit3 = (numb2 % 100) / 10;//(numb2 /10)%10;
        int AnotherDigit4 = numb2 % 10;
        int sumOfAnotherDigits = AnotherDigit1 + AnotherDigit2 + AnotherDigit3 + AnotherDigit4;
        System.out.println("sum of digits is " + sumOfAnotherDigits);


//   6  ნომერი
        System.out.println("Enter any numb and will print out each digit");
        Scanner inputt = new Scanner(System.in);
        int number = inputt.nextInt();
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // 8 დავალება
        Scanner mde = new Scanner(System.in);
        System.out.println("m is ");
        int m = mde.nextInt();
        System.out.println("n is ");
        int n = mde.nextInt();
        System.out.println("print digits from m to n are:");
        while (m <= n) {
            System.out.println(m);
            m++;
        }


        // 10 ნომერი
        int[] arr = new int[]{9, 3, 10, 17, 12, 21, 0, 1 };
        int temp = 0;

        System.out.println("Elements of original array: ");
        for (int e = 0; e < arr.length; e++) {
            System.out.print(arr[e] + " ");
        }

        for (int e = 0; e < arr.length; e++) {
            for (int d = e + 1; d < arr.length; d++) {
                if (arr[e] > arr[d]) {
                    temp = arr[e];
                    arr[e] = arr[d];
                    arr[d] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for (int e = 0; e < arr.length; e++) {
            System.out.print(arr[e] + " ");
        }
    }

    // ნომერი 9

    class MinandMax {
        public static void main(String args[]) {
            int array[] = new int[]{9, 3, 10, 17, 12, 21, 0, 1};

            //
            int max = getMax(array);
            System.out.println("Maximum Value is: " + max);

            //
            int min = getMin(array);
            System.out.println("Minimum Value is: " + min);
        }
        //
        public static int getMax(int[] inputArray) {
            int maxValue = inputArray[0];
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] > maxValue) {
                    maxValue = inputArray[i];
                }
            }
            return maxValue;
        }
        //

        public static int getMin(int [] inputArray) {
            int minValue = inputArray[0];
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] < minValue) {
                    minValue = inputArray[i];
                }
            }
            return minValue;
        }
    }


    // ნომერი 7

    class usj{
        static int gcd(int a, int b) {
            if (b == 0)
                return a;
            else
                return gcd(b, a % b);
        }

        static int lcm(int a, int b, int gcdValue)
        {
            return Math.abs(a * b) / gcdValue;
        }

        public static void main(String[] args) {
            int a = 28, b = 56, gcdValue;
            gcdValue = gcd(a, b);

            System.out.println("GCD = " + gcdValue);
            System.out.println("LCM = " + lcm(a, b, gcdValue));
        }
    }
}




