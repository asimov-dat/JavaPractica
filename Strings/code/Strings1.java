public class Strings1{
	public static void main(String[] args){
		String texto="Hola mundo";

		System.out.println(texto);

		texto = new String();
		System.out.println(texto);

		texto = new String("Hola");
		System.out.println(texto);

		String texto2 = "Hola mundo",temp;

		System.out.println(texto2.toUpperCase());

		for (int i=0;i<texto2.length() ;i++ ) 
		{
			temp = ""+texto2.charAt(i);
			System.out.println(temp);
		}
	}
}