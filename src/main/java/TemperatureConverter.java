public class TemperatureConverter {

    /**
     * Converts a temperature from degrees Celsius to degrees Fahrenheit.
     *
     * @param celsius temperature in degrees Celsius
     * @return temperature in degrees Fahrenheit
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    /**
     * Converts a temperature from degrees Fahrenheit to degrees Celsius.
     *
     * @param fahrenheit temperature in degrees Fahrenheit
     * @return temperature in degrees Celsius
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
