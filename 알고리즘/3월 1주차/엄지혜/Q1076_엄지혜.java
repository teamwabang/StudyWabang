package test;

import java.util.Scanner;

public class B1076 {
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        String C = sc.next();

        long one = 0;
        long two = 0;
        long three = 0;
        switch (A) {
            case "black":
                one = 0;
                break;
            case "brown":
                one = 1;
                break;
            case "red":
                one = 2;
                break;
            case "orange":
                one = 3;
                break;
            case "yellow":
                one = 4;
                break;
            case "green":
                one = 5;
                break;
            case "blue":
                one = 6;
                break;
            case "violet":
                one = 7;
                break;
            case "grey":
                one = 8;
                break;
            case "white":
                one = 9;
                break;
        }

        one = one * 10;

        switch (B) {
            case "black":
                two = 0;
                break;
            case "brown":
                two = 1;
                break;
            case "red":
                two = 2;
                break;
            case "orange":
                two = 3;
                break;
            case "yellow":
                two = 4;
                break;
            case "green":
                two = 5;
                break;
            case "blue":
                two = 6;
                break;
            case "violet":
                two = 7;
                break;
            case "grey":
                two = 8;
                break;
            case "white":
                two = 9;
                break;
        }

        switch (C) {
            case "black":
                three = 1;
                break;
            case "brown":
                three = 10;
                break;
            case "red":
                three = 100;
                break;
            case "orange":
                three = 1000;
                break;
            case "yellow":
                three = 10000;
                break;
            case "green":
                three = 100000;
                break;
            case "blue":
                three = 1000000;
                break;
            case "violet":
                three = 10000000;
                break;
            case "grey":
                three = 100000000;
                break;
            case "white":
                three = 1000000000;
                break;
        }

        three = (one+two)*three;

        System.out.println(three);

    }
}