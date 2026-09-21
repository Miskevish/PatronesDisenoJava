package abstractfactory;

public class FabricaWindows implements FabricaInterfaz {

    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaWindows();
    }
}