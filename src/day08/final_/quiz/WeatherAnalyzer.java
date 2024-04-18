package day08.final_.quiz;

public class WeatherAnalyzer {

    public static boolean checkTemperatureAlert(double currentTemperature) {
        return WeatherConstants.MAX_TEMPERATURE_ALERT <= currentTemperature
                || WeatherConstants.MIN_TEMPERATURE_ALERT >= currentTemperature;
    }

    public static boolean checkPrecipitationAlert(double currentPrecipitation) {
        return WeatherConstants.PRECIPITATION_ALERT <= currentPrecipitation;
    }

}
