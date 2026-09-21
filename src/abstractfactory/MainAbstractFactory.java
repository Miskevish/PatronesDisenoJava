package abstractfactory;

public class MainAbstractFactory {

    public static void main(String[] args) {

        System.out.println("INTERFAZ WINDOWS");

        FabricaInterfaz fabricaWindows = new FabricaWindows();

        Boton botonWindows = fabricaWindows.crearBoton();
        Ventana ventanaWindows = fabricaWindows.crearVentana();

        botonWindows.mostrar();
        ventanaWindows.mostrar();

        System.out.println();

        System.out.println("INTERFAZ LINUX");

        FabricaInterfaz fabricaLinux = new FabricaLinux();

        Boton botonLinux = fabricaLinux.crearBoton();
        Ventana ventanaLinux = fabricaLinux.crearVentana();

        botonLinux.mostrar();
        ventanaLinux.mostrar();
    }
}