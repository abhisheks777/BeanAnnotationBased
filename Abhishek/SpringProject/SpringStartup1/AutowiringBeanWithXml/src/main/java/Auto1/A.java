package Auto1;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
 
	B b;

	
	void print()
	{
		System.out.println("This is class A method print");
		
	}
	
	public B getB() {  
	    return b;  
	}  
	public void setB(B b) {  
	    this.b = b;
	}
	void display()
	{
		
		print();
		b.print();
		
	}
	
	
}
