package s4_returnTest;

public class VoidMethod {
	
	public static void main(String[] args) {
		add();
		sub();
		
		// int result = add()*sub(); 
		/* if add & sub func have void, main method only can call
		 * it doesn't return the value to it
		 */
	
	}

	public static int add(){ //  void misses, return type should be datatype
		// also must declare return statement
		// only one return statement within function
		int i=0;
		int j=2;
		int k=i+j;
		System.out.println(k);
		return k;
	}
	
	public static void sub(){
		int i=2;
		int j=5;
		int k=j-i;
		System.out.println(k);
	}
	
}
