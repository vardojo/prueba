package Personal;

public class Recktangles {
	String nombre;
	String imprimir = "";
	int j=1;
	
	public Recktangles(String nombre){
	this.nombre=nombre;
	}
	
	public String imprimirPrimeraLinea(){
		StringtoArray nombreArray = new StringtoArray(nombre);
		for (int i=0; i<nombre.length();i++){
			imprimir+=nombreArray.dimeLetra(i) +" ";
		}
		return imprimir;
	}
	
	public String imprimirMedioLinea(){
		StringtoArray nombreArray = new StringtoArray(nombre);
		imprimir="";
		imprimir+=nombreArray.dimeLetra(j);
		for (int i=1; i<nombre.length()*2-2;i++){
			imprimir+=" ";
		}
		
		imprimir+=nombreArray.dimeLetra(nombre.length()-1-j);
		return imprimir;
		
	}
	public String imprimirUltimaLinea(){
		StringtoArray nombreArray = new StringtoArray(nombre);
		imprimir="";
		for (int i=nombre.length()-1; i>-1;i--){
			imprimir+=nombreArray.dimeLetra(i) +" ";
		}
		return imprimir;
	}
	
	public String escribirNombre(){
		return imprimirPrimeraLinea();	
		
	}
	public void escribirCuadrado(){
		System.out.println(imprimirPrimeraLinea());
		for (int i=1;i<nombre.length()-1;i++ ){
			System.out.println(imprimirMedioLinea());
			j++;
		}
		System.out.println(imprimirUltimaLinea());
	}
	
	
	public static void main(String[] arg){
		Recktangles nueva =new Recktangles("Esteban");
		nueva.escribirCuadrado();	
	}
	}
	


