import org.junit.Test;

public class B 
{
	@Test
	public int addd()
	{
		
		A a=new A();
		int r=a.add();
	int	t=a.x=6;
	int z=r+t;
		System.out.println(z);
		return addd();
	}
}
