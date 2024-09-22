package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

    // Las colleciones: Son estructuras de datos que permiten almacenar y manipular grupos de objetos. Las colecciones proporcionan diferentes maneras de almacenar elementos, facilitando operaciones como añadir, eliminar, buscar y recorrer datos.
    // Colecciones Map:
    // HashMap - TreeMap - LinkedHashMap.

    // HashMap: Permite agregar, eliminar y verificar la existencia de un elemento en la colección. No permite duplicados, no es ordenado.
    // TreeMap: Permite agregar, eliminar y verificar la existencia de un elemento en la colección. No permite duplicados, tiene un orden alfabetico..
    // LinkedHashMap: Permite agregar, eliminar y verificar la existencia de un elemento en la colección. No permite duplicados, tiene un orden en el que se agregaron.
    
    public static void main(String[] args) throws Exception {
        // Tienda de frutas.
        System.out.println("Bienvenido a nuestra tienda de frutas.");

        Map<String, Double> inventario = new LinkedHashMap<>();

        inventario.put("Banana", 0.89);
        inventario.put("Banana", 0.89); // HashMap no deja duplicar
        inventario.put("Tomate", 0.75);
        inventario.put("Aguacate", 0.96);
        inventario.put("Fresa", 0.85);
        inventario.put("Pimiento", 0.77);

        System.out.println("Este es el inventario de frutas y verduras: ");
        // keySet: Retorna un arreglo con las keys
        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        String frutaBuscada = "Aguacate";
        System.out.println("Se acerca un cliente y nos pide la siguiente fruta: " + frutaBuscada);
        
        if(inventario.containsKey(frutaBuscada)){
            System.out.println(frutaBuscada + " está es el inventario, encantados les vendemos");
        }else {
            System.out.println("Lamentablememte nos quedamos sin: " + frutaBuscada + "s");
        }

        String sinStock = "Aguacate";
        inventario.remove(sinStock);

        System.out.println("Nos hemos quedado sin: " + sinStock);

        System.out.println("Inventario actualizado: ");
        System.out.println("La cantidad de mercadería es: " + inventario.size());
    }
}
