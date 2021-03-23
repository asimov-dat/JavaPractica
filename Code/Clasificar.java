
public class Clasificar
{
	public static void main(String[] args)
	{
		int[] arrNumbers = new int[10];

		for (int i = 0; i < 10 ; i++ ) 
		{
			arrNumbers[i] = Numbers.RandomNumber();	
		}

		for (int i = 0; i < 10 ; i++ ) 
		{
			System.out.println(arrNumbers[i]);	
		}

		Conditions.Sipar(arrNumbers);
		Conditions.Siimpar(arrNumbers);

	}
	public static class Numbers
	{
		public static int RandomNumber()
		{
			int min = -3690, max = 2520, randomNumber;
			randomNumber = (int)(Math.random()* ( max - min + 1) + min);
			return randomNumber;
		}
	}

	public static class Conditions
	{
		public static void Sipar(int[] arrNumbers)
		{
			for (int i = 0; i<10; i++ ) 
			{
				if ((arrNumbers[i]%2) == 0) 
				{
					System.out.println(arrNumbers[i]+" : Es par");
				}	
			}
		}

		public static void Siimpar(int[] arrNumbers)
		{
			for (int i = 0; i<10; i++ ) 
			{
				if ((arrNumbers[i]%2) != 0) 
				{
					System.out.println(arrNumbers[i]+" : Es Impar");
				}	
			}
		}
	}
}
