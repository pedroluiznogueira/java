package importantclasses.hashmaps;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        // instanciating hash maps
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // adding items
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // accessing values
        String capital = capitalCities.get("England");

        // removing an item
        capitalCities.remove("England");

        // hash map size
        capitalCities.size();

        // looping through hashmaps
        for (String key: capitalCities.keySet()) System.out.println("Printing keys: " + key);
        for (String value: capitalCities.values()) System.out.println("Printing values: " + value);

        System.out.println(capitalCities);
    }
}
