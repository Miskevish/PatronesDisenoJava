package singleton;

public class MainSingleton {

    public static void main(String[] args) {

        ConfiguracionJuego configuracion1 = ConfiguracionJuego.getInstancia();

        configuracion1.setVolumen(80);
        configuracion1.setDificultad("Difícil");
        configuracion1.setIdioma("Español");

        ConfiguracionJuego configuracion2 = ConfiguracionJuego.getInstancia();

        System.out.println("Configuración 1:");
        System.out.println("Volumen: " + configuracion1.getVolumen());
        System.out.println("Dificultad: " + configuracion1.getDificultad());
        System.out.println("Idioma: " + configuracion1.getIdioma());

        System.out.println();

        System.out.println("Configuración 2:");
        System.out.println("Volumen: " + configuracion2.getVolumen());
        System.out.println("Dificultad: " + configuracion2.getDificultad());
        System.out.println("Idioma: " + configuracion2.getIdioma());

        System.out.println();

        System.out.println("¿Son la misma instancia?");
        System.out.println(configuracion1 == configuracion2);
    }
}