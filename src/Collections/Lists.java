package Collections;

import java.util.List;
import java.util.Vector;

public class Lists {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la fiesta de los superhéroes");

        // Las colleciones: Son estructuras de datos que permiten almacenar y manipular grupos de objetos. Las colecciones proporcionan diferentes maneras de almacenar elementos, facilitando operaciones como añadir, eliminar, buscar y recorrer datos.
        // Colecciones List:
        // ArrayList - LinkedList - Vector.

        List<String> superHeroes = new Vector<>();
        /*
         * List<String> superHeroes = new ArrayList<>();
         * ArrayList: Permite agregar, eliminar y verificar la existencia de un elemento en la colección. Permite duplicados, tiene un orden en el que se agregaron.
         */

         /*
         * List<String> superHeroes = new LinkedList<>();
         * LinkedList: Permite agregar, eliminar y verificar la existencia de un elemento en la colección. Permite duplicados, tiene un orden en el que se agregaron.
         * Se caracteriza por ser una coleccion más rápida en cuanto a la modificación y la obtención de los datos, porque esta doblemente enlazado con dichos datos.
          */

         /*
         * List<String> superHeroes = new Vector<>();
         * Vector: Permite agregar, eliminar y verificar la existencia de un elemento en la colección. Permite duplicados, tiene un orden en el que se agregaron.
         * Es más utilizado cuando se manejan multi-hielo, ya que esta colección maneja una mejor sincronización. 
          */

        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("CatWoman");
        superHeroes.add("Hulk");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Superman");

        // Después llego tarde los superHéroes estrella:
        superHeroes.add("Iron Man");

        if(superHeroes.contains("Spiderman")){
            System.out.println("Spiderman esta en la fiesta");
        }

        System.out.println("Hay un superhéroe que ya está ebrio, el superhéroe ebrio es: " + superHeroes.get(3));

        superHeroes.set(6, "Tony Stark");
        System.out.println("Iron Man se saca el traje mostrando su verdadera identidad que es " + superHeroes.get(6));

        // Cualquiera de las dos siguientes maneras se puede utilizar para eliminar un dato
        superHeroes.remove("Hulk");
        superHeroes.remove(3);

        if(!superHeroes.contains("Hulk")){
            System.out.println("Hulk se ha ido de la fiesta");
        }

        // Fue y volvió tan rápido a la tienda que no nos dimos cuenta que se fue
        superHeroes.add("Superman");
        superHeroes.add("Superman");
        superHeroes.add("Superman");
        
        if(superHeroes.isEmpty()){
            System.out.println("La fiesta ha terminado, todos se han ido");
        }else {
            System.out.println("la fiesta continúa aún hay " + superHeroes.size() + " superhéroes");
        }

        System.out.println("¿Quiénes están aún en la fiesta?");
        for (String superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }
    }
}
