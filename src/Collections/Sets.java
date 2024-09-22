package Collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la fiesta de los superhéroes");

        // Las colleciones: Son estructuras de datos que permiten almacenar y manipular grupos de objetos. Las colecciones proporcionan diferentes maneras de almacenar elementos, facilitando operaciones como añadir, eliminar, buscar y recorrer datos.
        // Colecciones Set:
        // HashSet - TreeSet - LinkedHashSet.

        Set<String> superHeroes = new HashSet<>();
        /*
         * Set<String> superHeroes = new HashSet<>();
         * HashSet: Permite agregar, eliminar y verificar la existencia de un elemento en la colección. No permite duplicados, no es ordenado.
         */

         /*
         * Set<String> superHeroes = new TreeSet<>();
         * TreeSet: Permite agregar, eliminar y verificar la existencia de un elemento en la colección. No permite duplicados, tiene un orden alfabetico.
          */

         /*
         * Set<String> superHeroes = new LinkedHashSet<>();
         * TreeSet: Permite agregar, eliminar y verificar la existencia de un elemento en la colección. No permite duplicados, tiene un orden en el que se agregaron.
          */

        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("CatWoman");
        superHeroes.add("Hulk");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Superman");

        // Después llego tarde los superHéroes estrella:
        superHeroes.add("Iron man");

        if(superHeroes.contains("Spiderman")){
            System.out.println("Spiderman esta en la fiesta");
        }

        superHeroes.remove("Hulk");

        if(!superHeroes.contains("Hulk")){
            System.out.println("Mulk se ha ido de la fiesta");
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
