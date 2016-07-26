package Personal;

public class StringtoArray {
	String nombre;
	int posicion;
	char []charArray;
	
	public StringtoArray(String nombre){
		this.nombre=nombre;
		this.charArray = nombre.toCharArray();
		}
	
	public char dimeLetra(int posicion){
		this.posicion=posicion;
		assert posicion < nombre.length();
		return charArray[posicion];
	}

}
