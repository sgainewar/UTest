package test;

import java.util.Scanner;


class MyAnnTest{  
  void printName(Object obj){  
  Class c=obj.getClass();    
  System.out.println(c.getName());  
  }  
  public static void main(String args[]){  
   a s=new a();  
   
   MyAnnTest t=new MyAnnTest();  
   t.printName(s);  
 }  
}  

	


















/*
Scanner s=new Scanner(System.in);

System.out.println("Enter the number");

int n=s.nextInt();

    for(int i=1;i<=n;i++)
    {
        if(i%5==0)
        System.out.println("Buzz");
        else if(i%3==0)
        System.out.println("Fizz");
        else if((i%3==0)&&(i%5==0))
        System.out.println("FizzBuzz");
        else System.out.println(i);
    }*/