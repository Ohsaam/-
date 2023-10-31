package 이팩티브.팩토리;

public class FactoryMethod{

	public static void main(String[] args) {
		Grade grade = Grade.of(95);
		System.out.println(grade);
	}

}