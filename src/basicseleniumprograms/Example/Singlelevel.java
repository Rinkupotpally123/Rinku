package basicseleniumprograms.Example;

 class Father
{
	public void home()
	{ 
		System.out.println("2bhk");
	}
	public void car()
	{ 
		System.out.println("kia-seltos");
	}
	public void money()
	{ 
		System.out.println("50lakhs");
	}
}

 class Child extends Father
{
	public void secondhandbike()
	{ 
		System.out.println("ktm");
	}
}


public class Singlelevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Child c=new Child();
    c.car();
    c.home();
    c.money();
    c.secondhandbike();
	}

}
