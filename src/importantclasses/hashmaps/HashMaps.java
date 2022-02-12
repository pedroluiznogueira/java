package importantclasses.hashmaps;

import java.util.HashMap;

public class HashMaps {

    // can contain items in a key: value format
    // flexible
    // don't store items in the inserted order
    // implements Map interface
    // duplicate keys are not allowed
    // duplicate values are allowed
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
