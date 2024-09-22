import exceptions.CalculadoraExceptions;

public class App {
    public static void main(String[] args) throws Exception {
        // ------------------------------------------------------------------------------------------------------------
        // POO configurado con atributos publicos y además isntanciando una clase Carrera en la clase persona. 
        // Abstracción.
        System.out.println("Hello, World from App!");

        // Instanciar
        Persona persona1 = new Persona("Juan", "Ceron", 19, "Ing informatico", 10, false);

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y está estudiando "+ persona1.carrera.nombre + " que tiene una duración de " + persona1.carrera.duracion + " semestres.");
        System.out.println(persona1.enviarSaludo("Camilo") + "\n");

        // ------------------------------------------------------------------------------------------------------------
        // POO configurada con atributos privados, encapsulamiento getters y setters
        // Abstracción - Encapsulamiento.
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "TXL", 2024);

        vehiculo1.setMarca("TOYOTA");
        vehiculo1.setModelo("Prado TX");

        System.out.println("Bienvenido " + vehiculo1.darEspecificacionesDelVehiculo() + "\n");

        // ------------------------------------------------------------------------------------------------------------
        // POO configurado con herencia de la clase Animal y con polimorfismo de la misma.
        // Abstracción - Herencia - Polimorfismo.
        Animal animal1 = new Animal("Pepe", "Blanco", 12);
        Gato gato1 = new Gato("Max", "Café", 3);
        Perro perro1 = new Perro("Peluche", "Amarillo", 5);

        System.out.println("El animal llamado: " + animal1.nombre + " hace.");
        System.out.println(animal1.hacerSonido());
        System.out.println("El gato llamado: " + gato1.nombre + " hace.");
        System.out.println(gato1.hacerSonido());
        System.out.println("El perro llamado: " + perro1.nombre + " hace.");
        System.out.println(perro1.hacerSonido());
        
        System.out.println("El total de los animales creados es de: " + Animal.getCantidadAnimal());
        System.out.println("Yo atiendo a mis animalitos en la veterinaria: " + Veterinaria.nombre + "\n");

        // ------------------------------------------------------------------------------------------------------------
        // POO configurado con herencia de la clase Figura y con polimorfismo de la misma con datos estaticos y abstractos.
        // Abstracción - Herencia - Polimorfismo.
        Circulo circulo1 = new Circulo(10);
        Rectangulo rectangulo1 = new Rectangulo(8, 6);

        circulo1.imprimirInformacion();
        System.out.println("El área del circulo es: " + circulo1.calcularArea());

        rectangulo1.imprimirInformacion();
        System.out.println("El área del rectangulo es: " + rectangulo1.calcularArea() + "\n");

        // ------------------------------------------------------------------------------------------------------------
        // Interfaces.
        // Se extendieron de una clase abstracta llamada CriaturasMarinas y implementaron mas de una interfas 
        Delfin delfin1 = new Delfin("Camilito");
        Pulpo pulpo1 = new Pulpo("Gonzales", 8);

        delfin1.nadar();
        delfin1.alimentarse();
        delfin1.comunicarse();
        
        pulpo1.nadar();
        pulpo1.alimentarse();
        pulpo1.comunicarse();

        System.out.println("\n");

        // Excepciones
        // Son eventos que interrumpen el flujo normal de la aplicación.
        // Unchecked y checked

        double numero1 = 10;
        int numero2 = 0;
        int resultado;

        // System.out.println(numero1 / numero2); // Aqui nos mostrará error java debido a que no se puede dividir con 0, esto no nos dejará ejecutar lo que sigue.
        
        try {
            // Existe un tema de casteo, el cual significa que no se pueden realizar operaciones con números de diferentes atributos, en caso de ser asi se debe castear los números, agregando el atributo al inicio del número a castear, for example:
            resultado = (int) numero1 / numero2;
            System.out.println(resultado);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Esto va después de la excepción. \n");
        }

        // Manejo de excepciones.
        Calculadora calculadora1 = new Calculadora();

        try {
            resultado = calculadora1.dividir((int) numero1, numero2);
            System.out.println(resultado);
        } catch (CalculadoraExceptions e) {
            e.printStackTrace();
        } finally {
            // Es opcional utilizar el metodo finally el cual da la opción de agregar un mensaje al finalizar la ejecución o utilización del try_catch.
            System.out.println("Hemos finalizado el calculo, ya sea exitoso o no.");
        }

        // Coleccion (set, list, map)
        // Es un objeto que agrupa multiples elementos en una sola unidad [masomenos un array]
    }
}