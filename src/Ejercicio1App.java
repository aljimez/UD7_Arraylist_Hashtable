import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio1App {
	public static void main(String[]args) {
		Hashtable<String,Integer> listaNotas = new Hashtable<String,Integer>();
	//Hashtable listaNotas  = new Hashtable<>();
Enumeration l = listaNotas.elements();
		
			int nt = 0;
			int nota;
		for(int i = 1;i < 5 ; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nota de marc en el ejercicio"+i);
		 nota = nt += sc.nextInt();
		if(i == 5) {
			int resm = nota/5; 
			listaNotas.put("Marc", resm);

		}
		}

	for(int i = 1;i < 5 ; i++) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce la nota de paula en el ejercicio"+i);
	 nota = nt += sc.nextInt();
	if(i == 5) {
		int resm = nota/5; 
		listaNotas.put("Paula", resm);

	}
}

for(int i = 1;i < 5 ; i++) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduce la nota de camila en el ejercicio"+i);
 nota = nt += sc.nextInt();
if(i == 5) {
	int resm = nota/5; 
	listaNotas.put("Camila", resm);

}
}

for(int i = 1;i < 5 ; i++) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduce la nota de alejandro en el ejercicio"+i);
 nota = nt += sc.nextInt();
if(i == 5) {
	int resm = nota /5; 
	listaNotas.put("Alejandro", resm);
}
}

	}
}
