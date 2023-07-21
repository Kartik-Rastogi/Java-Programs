package animals;
class Dog implements Animals
{
	public void eat()
	{
		System.out.println("Dog drinks milk");
	}
	public void travel()
	{
		System.out.println("Dog walks on four legs");
	}
}

class Cat implements Animals
{
	public void eat()
	{
		System.out.println("Cat eats fish");
	}
	public void travel()
	{
		System.out.println("Cat have four legs");
	}
}

public class CP6
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.eat();
		d.travel();
		Cat c=new Cat();
		c.eat();
		c.travel();
	}
}


	