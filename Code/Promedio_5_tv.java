import Integer;

public class Promedio
{
	public static void main(String[] args) 
	{
		int V1 = 45;
		double V2 = 476;
		float V3 = 4.7f;
		byte V4 = 4;
		short V5 = 3;

		V1 = TiposVariables.Convercion(V1);
		V2 = TiposVariables.Convercion(V2);
		V3 = TiposVariables.Convercion(V3);
		V4 = TiposVariables.Convercion(V4);
		V5 = TiposVariables.Convercion(V5);

		System.out.println(TiposVariables.Promedio(V1, V2, V3, V4, V5));

	}
	public static class TiposVariables
	{
		public static int convercion(double VariableConvert)
		{
			int Numero;
			Numero = (int)VariableConvert;
			return Numero;
		}
		public static int convercion(float VariableConvert)
		{
			int Numero;
			Numero = (int)VariableConvert;
			return Numero;
		}
		public static int convercion(byte VariableConvert)
		{
			int Numero;
			Numero = (int)VariableConvert;
			return Numero;
		}
		public static int convercion(short VariableConvert)
		{
			int Numero;
			Numero = (int)VariableConvert;
			return Numero;
		}
		public static int promedio(int N1, int N2, int N3, int N4, int N5)
		{
			int Promedionumeros;
			Promedionumeros = (N1 + N2 + N3 + N4 + N5)/5;
			return Promedionumeros;
		} 
	}
}