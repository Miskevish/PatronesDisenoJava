package adapter;

public class AdaptadorTemperatura implements SensorTemperatura {

    private SensorFahrenheit sensorFahrenheit;

    public AdaptadorTemperatura(SensorFahrenheit sensorFahrenheit) {
        this.sensorFahrenheit = sensorFahrenheit;
    }

    @Override
    public double obtenerTemperaturaCelsius() {

        double fahrenheit =
                sensorFahrenheit.obtenerTemperaturaFahrenheit();

        return (fahrenheit - 32) * 5 / 9;
    }
}