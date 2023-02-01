package com.shantanu.unitconverter.utility;

public class TemperatureConverterUtility {
    /* converting from celsius to all */
    public double FromCelsiusToCelsius(double celsius) {
        return celsius;
    }

    public double FromCelsiusToFahrenheit(double celsius) {
        return celsius * 33.8;
    }

    public double FromCelsiusToKelvin(double celsius) {
        return celsius * 274.15;
    }

    /* converting from fahrenheit to all */
    public double FromFahrenheitToFahrenheit(double fahrenheit) {
        return fahrenheit;
    }

    public double FromFahrenheitToCelsius(double fahrenheit) {
        return fahrenheit * (-17.2222222222);
    }

    public double FromFahrenheitToKelvin(double fahrenheit) {
        return fahrenheit * 255.9277777778;
    }

    /* converting from kelvin to all */
    public double FromKelvinToKelvin(double kelvin) {
        return kelvin;
    }

    public double FromKelvinToCelsius(double kelvin) {
        return kelvin * (-272.15);
    }

    public double FromKelvinToFahrenheit(double kelvin) {
        return kelvin * (-457.87);
    }
}
