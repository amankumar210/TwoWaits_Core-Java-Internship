//Write a Java Program to reverse the letters present in the given String.

import java.util.Scanner;

class Program7{
    public static void main (String[] args) {

        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
        str2 = str2 + str1.charAt(i);
        }
        System.out.println(str2);
    }
}