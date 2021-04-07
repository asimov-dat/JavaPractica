public class Arrays_Promedio
{
	public static void main(String[] args) 
	{
		int[] numbers = new int[7];
		int add=0;

		for (int i = 0; i<7 ;i++) 
		{
			numbers[i] = Numbers.RandomNumber();	
		}
		for (int i=0; i<7 ;i++ ) 
		{
			add = add+numbers[i];
			System.out.println(numbers[i]);
		}
		System.out.println("El promedio es: "+(add/numbers.length));
	}
	public static class Numbers
	{
		public static int RandomNumber()
		{
			int min = 1, max = 100, randomNumber;
			randomNumber = (int)(Math.random()* ( max - min + 1) + min);
			return randomNumber;
		}
	}
}
