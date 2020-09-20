package Aman.ExceptionPractice;

import java.io.IOException;

public class Exceptionmain {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Practice1 P1=new Practice1();
		P1.setX(5);
		System.out.println(P1.getX());
		try{
			System.out.println(P1.P2.getY());	
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		Integer[] a = {1,2,3,4,5};
		int i;
		for(i=0;i<10;i++){
			try{
			System.out.println("Value is " + a[i].toString());
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("In first catch " + e);
			}
			catch(Exception e){
				System.out.println("In second catch " + e);
			}
		}
		Practice3 P3=new Practice3();
		try{
		P3.userinput();
		}
		catch(IOException e){
			System.out.println(e);
		}
		Practice4 P4=new Practice4();
		try{
		P4.throwMyException();
		}
		catch(MyCustumException e){
			System.out.println(e.displayMessage());
		}
	}

}
