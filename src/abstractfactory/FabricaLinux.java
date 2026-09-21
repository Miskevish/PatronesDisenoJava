package abstractfactory;

public class FabricaLinux implements FabricaInterfaz {

    @Override
    public Boton crearBoton() {
        return new BotonLinux();
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaLinux();
    }
}