public class Ejemplo2
{
	public static void main(String[] args)
	{
		float N1 = 3.65f, Resultado;
		byte N2 = 6;
		short N3 = 45;
		char N4 = '9';
		int Nchar = N4 - '0';

		Resultado = (N1+N2+N3+Nchar)/5;

		System.out.println("\nfloat "+N1+" byte "+N2+" short "+N3+" char "+Nchar+",Resultado: "+Resultado+"\n");
		System.out.println("---------------------------\n");
		System.out.println("float"+N1+"\nbyte "+N2+"\nshort "+N3+"\nchar "+Nchar+"\nResultado: "+Resultado+"");
	}
}