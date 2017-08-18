package techno;
abstract  class Abstract {
	abstract  disp();
	void display()
	{
		System.out.println("Hello.......!");
	}

	public static void main(String[] args) {
	Abstract1 obj=new Abstract1(); 
	obj.disp();
	obj.display();
	}
 }
class  Abstract1 extends Abstract{
	void disp()
	{
	System.out.println("Hello World.......!");
	}
}

