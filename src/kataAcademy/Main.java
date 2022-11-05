package kataAcademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите математическое выражение типа '2 + 3'");
        String st = scan.nextLine();
        String result2 = Roman.calc(st);
        System.out.println(result2);
    }
}










