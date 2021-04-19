public class StringsBonificacion{
	public static void main(String[] args){

		String[] sarray = new String[] {"nombre1","nombre2","nombre3","nombre4"};
		String temp="";
		for (int i=0;i<sarray.length ;i++ ) 
		{
			System.out.println(sarray[i]);	
		}

		for (int i=0;i<sarray.length ;i++ ) 
		{
			System.out.println(sarray[i].charAt(0));	
		}
		for (int i=0;i<sarray.length ;i++ ) 
		{
			System.out.println(capitalize(sarray[i]));	
		}
	}
	public static String capitalize(String str) {
    if(str == null || str.isEmpty()) {
        return str;
    }

    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}