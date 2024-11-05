package cofeeshop;

public class cofeeItems 
{
	private String name;
	private double add;
	
	public void menu()
	{
		System.out.println("[1] Mocha - 105 Pesos [4] Hazelnut - 125");
		System.out.println("[2] Americano - 95    [5] Vanilla - 135");
		System.out.println("[3] Brewed - 100      [6] Caramel - 150");
	}
	
	
	public void sizeCupSelection()
	{
		System.out.println("[1] 24oz + 10");
		System.out.println("[2] 16oz ");
	}
	
	
	
	
	public void sizeCup(int size)
	{
		if(size == 1)
		{
			add += 10;
		}
	}
	
	double getadd()
	{
		return add;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	
	
}
