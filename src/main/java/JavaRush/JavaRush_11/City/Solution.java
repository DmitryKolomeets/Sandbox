package JavaRush.JavaRush_11.City;

public class Solution {
    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
      City city = new City("Odessa", 40);
      showWeather(city);
    }

}
