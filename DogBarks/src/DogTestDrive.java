
public class DogTestDrive {

	
	static int x='a';
	static int a,b,c,d;
	//a=b=c=d=20;
	public static void main(String[] args) 
	{
	
    Dog one = new Dog();
    one.size = 70;
    Dog two = new Dog();
    two.size = 8;
    Dog three = new Dog();
    three.size = 35;
    one.bark();
    two.bark();
    three.bark();
    System.out.println(x);// type castig
    int a=b=c=d=20;
	System.out.println(a+"", b+"", c+"", d+"");
			
	}

}
