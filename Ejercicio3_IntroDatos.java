import java.util.Scanner;

public class Ejercicio3_IntroDatos {
  public static void main(String[] args) {

    // 1.- Mensaje de bienvenida
    // Crear mensaje de bienvenida en la consola
    System.out.println();
    System.out.println("Caracter Creation");
    System.out.println("-------------------");

    // 2.- Lectura de entradas
    // Crear objeto Scanner para leer entradas desde la consola.
    Scanner sc = new Scanner(System.in);

    // Lectura del nombre
    // Solicitar al usuario que introduzca el nombre.
    System.out.println("Insert character name");
    String name = sc.next();

    // Lectura de la clase del personaje
    // Solicitar al usuario que elija una clase para el personaje.
    System.out.println("Insert character class (Fighter, Cleric, Thief, Mage)");
    String type = sc.next();

    // Lectura de la edad
    // Pedir al usuario que introduzca la edad del personaje.
    System.out.println("Insert character age (15-40)");
    int age = sc.nextInt();

    // Lectura de la fuerza
    // Solicitar al usuario que introduzca el valor de la fuerza.
    System.out.println("Insert character strength (2-10)");
    int strength = sc.nextInt();

    // Lectura de la velocidad
    // Solicitar al usuario que introduzca el valor de la velocidad.
    System.out.println("Insert character speed (8-20)");
    int speed = sc.nextInt();

    // Lectura de la inteligencia
    // Solicitar al usuario que introduzca el valor de la inteligencia.
    System.out.println("Insert character intelligence (7-15)");
    int intelligence = sc.nextInt();

    // 3.- Cálculo de los atributos restantes
    // --------------------------------------

    // Nivel
    // El nivel del personaje se calcula en función de la edad. Cuanto mayor es el
    // personaje, mayor es el nivel.
    int level = (age - 15) / 2 + 1;

    // Cálculo de los puntos de vida (HP) en una sola línea
    // Los puntos de vida (HP) dependen de la fuerza del personaje y su nivel.
    int hp = (int) Math.ceil((30 + level * ((strength - 2.0) / 3)));

    // Cálculo de los puntos de vida (HP) en varias partes
    // Se desglosa el cálculo anterior en pasos individuales.
    double part1 = (strength - 2.0) / 3;
    double part2 = part1 * level;
    double part3 = Math.ceil(part2 + 30);
    int hp2 = (int) part3;

    // 4.- Mostrar los atributos en la consola
    // Se imprimen todos los atributos del personaje.
    System.out.println("Character Attributes");
    System.out.println("--------------------");

    System.out.println("Name: " + name);
    System.out.println("Type: " + type);
    System.out.println("Age: " + age);
    System.out.println("Strength: " + strength);
    System.out.println("Speed: " + speed);
    System.out.println("Intelligence: " + intelligence);

    System.out.println("Level: " + level);
    System.out.println("HP: " + hp);
    System.out.println("HP (vers. 2): " + hp2);

    // 5.- Cerrar el Scanner
    // Se cierra el objeto Scanner para liberar recursos.
    sc.close();
  }
}