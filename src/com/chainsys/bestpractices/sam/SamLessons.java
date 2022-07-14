package com.chainsys.bestpractices.sam;
//SAM - Single Abstract Method
//An interface with only one abstract method is known as single Adstract Method

import java.util.ArrayList;

interface IntegerFunction{
	Integer doOperations(int x,int y);
	
}
interface StringFunction{
	String execute(String s);
}
class ImplementerA implements IntegerFunction{

	@Override
	public Integer doOperations(int x, int y) {
		return x+y;
	}
	
}
public class SamLessons {
public static void demoA()
{
	IntegerFunction total = new ImplementerA();
	
	IntegerFunction add=(x,y)->x+y;	// Lambda expression
	//(x,y) this is parameters for the method
	// -> x+y this is the implementations for the method.
	// add is an implementations of doOperations method of interface implementations 
	IntegerFunction multiply=(x,y)->x*y;	
	IntegerFunction divide=(x,y)->x/y;
	Integer result=add.doOperations(2, 6); // we can use the int also
	System.out.println("result:"+result);
	result=total.doOperations(5, 6);
	System.out.println("result:"+result);
	result=multiply.doOperations(5, 4);
	System.out.println("result:"+result);
	result=divide.doOperations(50, 10);
	System.out.println("result:"+result);
	System.out.println(add.getClass().getName());
	System.out.println(total.getClass().getName());
}

public static void demoB()
{
	StringFunction upper=(s)->s.toUpperCase();
	StringFunction lower=(s)->s.toLowerCase();
	String result=upper.execute("Deepa");
	System.out.println("result:"+result);
	result=lower.execute("Ravi");
	System.out.println("result:"+result);
}
public static void demoC()
{
	ArrayList<Integer> nos=new ArrayList<Integer>();
	nos.add(100);
	nos.add(20);
	nos.add(30);
	nos.add(25);
	nos.add(80);
	nos.forEach((n)-> System.out.println(n));	
	// Single line statements
}
public static void demoD()
{
	IntegerFunction getTotal=(x,y)->x+y;
	ArrayList<Integer> nos=new ArrayList<Integer>();
	nos.add(100);
	nos.add(20);
	nos.add(30);
	nos.add(25);
	nos.add(80);
	int i=100;
	nos.forEach((n)-> 
	{
		int result=0;
		result=getTotal.doOperations(n, i);
		System.out.println(" total: "+result);
	}
	);
	// Multi line Statements
}
}
