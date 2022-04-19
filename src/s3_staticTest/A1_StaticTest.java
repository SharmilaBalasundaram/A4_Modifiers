package s3_staticTest;

public class A1_StaticTest {
	
	public static void main(String[] args) {
		//creating object... static can't call non-static
		
		A1_StaticTest a= new A1_StaticTest();
		a.exec();
		//a.sub();
	}

	public static void add(){
		System.out.println("add");

}
	public  void sub(){
		System.out.println("sub"); // non static
	}
	
	public  void exec(){
		add(); // non static call static
		sub(); // non static call non static
	}
}


