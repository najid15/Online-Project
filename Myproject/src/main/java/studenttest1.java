

public class studenttest1 {
	public static void main(String[] args) {
		
		studenttest1 obj = new studenttest1();
		System.out.println("This is return method "+obj.returnmethood());	
		System.out.println("This is a parameter methode "+obj.parametermethood(20, 30));
		
		studenttest1.voidmethood();
		obj.parametermethood2(50 , 50);
		System.out.println(studenttest1.returnmethood3(50, 2));
		}
	

	int returnmethood() { 
		int a = 20;
		int b = 30;
		int abc = a + b;
		return abc;
	}
	static void voidmethood() {
	int a = 30;
	int b = 50;
	int c = a + b;System.out.println(c);
	}

	int parametermethood(int a, int b) { 
		int value = a + b;
		return value;
	}
	void parametermethood2(int a, int b) { 
		int value = a+b;
		System.out.println(value);
	}
	static int returnmethood3(int x ,int y) {  
	int z;
	return z = x/y; 
	}



}
