package basicseleniumprograms.Example;
class GrandFathers
{
	public void land()
	{ 
		System.out.println("2acres");
	}
	
}

class Fathers extends GrandFathers
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

 class Childs extends Fathers
{
	public void secondhandbike()
	{ 
		System.out.println("ktm");
	}
}



public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childs c=new Childs();
	    c.car();
	    c.home();
	    c.money();
	    c.secondhandbike();
	    c.land();

	}

}
