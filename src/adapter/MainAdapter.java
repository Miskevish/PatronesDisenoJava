package adapter;

public class MainAdapter {

    public static void main(String[] args) {

        SensorFahrenheit sensorViejo =
                new SensorFahrenheit();

        SensorTemperatura sensorAdaptado =
                new AdaptadorTemperatura(sensorViejo);

        System.out.println(
                "Temperatura original: "
                        + sensorViejo.obtenerTemperaturaFahrenheit()
                        + " °F"
        );

        System.out.println(
                "Temperatura adaptada: "
                        + sensorAdaptado.obtenerTemperaturaCelsius()
                        + " °C"
        );
    }
}