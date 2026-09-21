package decorator;

public class MainDecorator {

    public static void main(String[] args) {

        Personaje personaje = new Guerrero();

        System.out.println("PERSONAJE ORIGINAL");
        System.out.println("Equipamiento: " + personaje.obtenerDescripcion());
        System.out.println("Defensa: " + personaje.obtenerDefensa());

        System.out.println();

        personaje = new ConArmadura(personaje);

        System.out.println("PERSONAJE CON ARMADURA");
        System.out.println("Equipamiento: " + personaje.obtenerDescripcion());
        System.out.println("Defensa: " + personaje.obtenerDefensa());

        System.out.println();

        personaje = new ConEscudo(personaje);

        System.out.println("PERSONAJE CON ARMADURA Y ESCUDO");
        System.out.println("Equipamiento: " + personaje.obtenerDescripcion());
        System.out.println("Defensa: " + personaje.obtenerDefensa());
    }
}