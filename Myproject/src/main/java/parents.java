
public class parents {
	public static void main(String[] args) {
		
		parents obj = new parents();
		System.out.println("This is return method "+obj.returnmethood());	
		System.out.println("This is a parameter methode "+obj.parametermethood(20, 30));
		obj.parametermethood2(50 , 50);
		}
	int returnmethood() { 
		int a = 20;
		int b = 30;
		int abc = a + b;
		return abc;
	}
	void voidmethood() {
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

	int returnmethood1() { 
		int a = 20;
		int b = 30;
		int abc = a + b;
		return abc;
	}
	void voidmethood1() {
	int a = 30;
	int b = 50;
	int c = a + b;System.out.println(c);
	}

	int parametermethood1(int a, int b) { 
		int value = a + b;
		return value;
	}
	void parametermethood21(int a, int b) { 
		int value = a+b;
		System.out.println(value);
	}
	int returnmethood31(int x ,int y) {  
	int z;
	return z = x/y; 
	}

	

}
