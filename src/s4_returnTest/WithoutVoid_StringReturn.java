package s4_returnTest;

public class WithoutVoid_StringReturn {
	
	
	public static void main(String[] args) {
		String a= add()+add();
		System.out.print(a);
	
	}

	public static String add(){
		
		int i = 4 ;
		int j = 10;
		int k = i*j;
		String s= " Multiplication of two numbers: "+k; //highlight
		String b = s+i; //highlight
		System.out.println(s);
		System.out.println(b);
		return s;
		
	
	}
	
	
}
