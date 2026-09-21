package factorymethod;

public class MainFactoryMethod {

    public static void main(String[] args) {

        CreadorEnemigo creadorZombie = new CreadorZombie();
        CreadorEnemigo creadorRobot = new CreadorRobot();

        System.out.println("Creando enemigo tipo Zombie:");
        creadorZombie.generarAtaque();

        System.out.println();

        System.out.println("Creando enemigo tipo Robot:");
        creadorRobot.generarAtaque();
    }
}