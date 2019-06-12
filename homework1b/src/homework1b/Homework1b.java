package homework1b;

import java.util.Scanner;

public class Homework1b {

    public static void main(String[] args) {
        System.out.println("type in speed in km/h");
        Scanner first = new Scanner(System.in);
        double speed = first.nextInt();
        System.out.println("type in distance in km");
        Scanner  second= new Scanner(System.in);
        double distance = second.nextInt();
        
        System.out.println("time taken "+ distance/speed +" of an hours");
	

    }
} 
