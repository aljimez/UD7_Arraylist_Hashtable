import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio2App {
	public static void main(String[]args) {
        String[] x = null;
        String linea = "";
        double suma=0;
        int i = 0;

        Hashtable<String,Integer> listaCompra = new Hashtable<String,Integer>();
        Enumeration<Integer> senumera = listaCompra.elements();

        //Cantidad de productos a comprar key:Nombre del producto value:precio
        listaCompra.put("Pan", 3);
        listaCompra.put("Pan", 3);
        listaCompra.put("Pan", 3);
        listaCompra.put("Pan", 3);

        listaCompra.put("Pepinillos", 5);
        listaCompra.put("Pepinillos", 5);
        listaCompra.put("Pepinillos", 5);

        listaCompra.put("Platanos", 7);
        listaCompra.put("Platanos", 7);
        listaCompra.put("Platanos", 7);

        System.out.println(listaCompra.put("Platanos", 7));
       /*      
        for (int h = 1; h<=9; h++){
            suma =0;
            for(int j=1; j<listaCompra.size();j++){
                x[j] = listaCompra.get(j);
                cambio=Integer.parseInt(x[5]);
                if(cambio == h){
//System.out.print(x[5] + " | "+ x[15] + "   |   "+ x[29] + "\n");
                    suma += Double.parseDouble(x[29]);
                }
            }
   
}
*/

while (senumera.hasMoreElements()) {
     suma += senumera.nextElement();
i++;
  }

  //Aplicaremos el iva reducido para los alimentos básicos 4% 
double total_iva = suma * 0.4;
double precio = total_iva + suma;
double pagado = 50;
System.out.println("El cliente ha pagado: "+pagado);
System.out.println("Se han comprado "+i+"articulos");
 double cambio = precio - pagado;
 System.out.println("El cambio a devolver es:"+cambio);

}
}
