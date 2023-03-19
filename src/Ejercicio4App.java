import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

public class Ejercicio4App {
	public static void main(String[]args) {
double suma=0;
int i = 0;
		Hashtable<String, Integer> stock = new Hashtable<String, Integer>();
        Enumeration<Integer> senumera = stock.elements();
        //Lista de articulos en Hashtable
        stock.put("patinete", 70);
        stock.put("Pelota", 20);
        stock.put("zapatillas", 20);
        stock.put("camisetas", 10);
        stock.put("chaqueta", 15);
        stock.put("agua", 4);
        stock.put("zumo", 5);
        stock.put("Vaso", 2);
        stock.put("cantimplora", 20);
        //Creación de articulos
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de articulos"));
        for ( i = 0; i < cantidad; i++) {
            String nombre = JOptionPane.showInputDialog("Introduce nombre del articulo");
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce nombre del articulo"));
            stock.put(nombre, precio);
        }
        //Busqueda de datos segun criterio
        String criterio = JOptionPane.showInputDialog("Introduce el criterio de busqueda de los datos");
        while (senumera.hasMoreElements() == true) {
         System.out.println( senumera.nextElement());
        }

		while (senumera.hasMoreElements()) {
			suma += senumera.nextElement();
	   i++;
		 }
         System.out.println( stock.get(senumera));

		 double total_iva = suma * 0.4;
		 double precio = total_iva + suma;
		 double pagado = 50;
		 System.out.println("El cliente ha pagado: "+pagado);
		 System.out.println("Se han comprado "+i+"articulos");
		  double cambio = precio - pagado;
		  System.out.println("El cambio a devolver es:"+cambio);
		 
}
}