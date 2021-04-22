import classes.*;
import classes.ComplementEx_01;
public class example_01
{
    public static void main(String[] args)
    {
        Imprimir_algo();

        int a = 1,b = 2;

        System.out.println(Suma(a,b));

        int[] numbers = new int[10];


    }
    public static void Imprimir_algo()
    {
        System.out.println("Imprimo algo");
    }
    public static int Suma(int n1,int n2)
    {
        return n1 + n2;
    }


    public static int RandomNumber()
	{
		int min = 1, max = 20, randomNumber;
		randomNumber = (int)(Math.random()* ( max - min + 1) + min);
		return randomNumber;
	}
}