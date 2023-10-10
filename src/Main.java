import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<City> cities = CityUtils.parse();

        // Сортировка массива по наименованию городов, используя lambda-выражения
        sortListNameCity(cities);
        print(cities);

        // Сортировка массива по федеральным округам и наименваниям городов в них
        sortListDistrictAndNameCity(cities);
        print(cities);



    }

    private static void sortListNameCity(List<City> cities) {
        cities.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    }

    private static void sortListDistrictAndNameCity(List<City> cities) {
        cities.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
    }

    public static void print(List<City> cities) {
        cities.forEach(System.out::println);
    }

}