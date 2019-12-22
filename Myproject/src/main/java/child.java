
public class child extends parents{
	
String getname () {
	String name = "smarttech";
	int address = 7931;
	String value = name + address;
	return value;
	}

public static void main(String[] args) {
	child obj = new child();
	System.out.println(obj.getname());   //this is child class property	
    System.out.println(child.returnmethood3(100, 263));  //this is parent class static method.


}}
