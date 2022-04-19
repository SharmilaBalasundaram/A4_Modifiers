package s3_staticTest;

public class CountTest {
    
	public static int i=1;
	
	// public static int i=0; if we given static variable shares same memory, 
	// so values will change. o/p 123
	public static void main(String[] args) {
		CountTest a=new CountTest();
		CountTest b=new CountTest();
		CountTest c=new CountTest();

		a.add();
		a.sub();
		b.add();
		c.add();
	}
	
    public void add(){
	    i++;
    	System.out.println(i);
	
}
    
    public void sub(){
	    i--;
    	System.out.println(i);
	
}

}


