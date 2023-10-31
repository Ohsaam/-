package 이팩티브.팩토리;

public interface Grade {
	String toText();
	
	public static Grade of(int score)
	{
		if(score > 90)
		{
			return new A();
		}
		else if (score > 80)
		{
			return new B();
		}
		else
		{
			return new C();
		}
		
	}

}
