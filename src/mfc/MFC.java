package mfc;

import java.util.Scanner;
public class MFC {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String name;
       int byear;
       
       System.out.print("Enter name: ");
       name = sc.nextLine();
       System.out.print("Enter birth year");
       byear = sc.nextInt();
       System.out.println("Hello "+name+" your age is "+ (2025-byear));
       int age = 2025-byear;
       
       if(age >= 18){
           System.out.println("votable");
       }else{
           System.out.println("monirity");
       }
    }
    
}
