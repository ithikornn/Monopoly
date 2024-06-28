//6510451131 Ithikorn Ungniyom

import java.util.HashMap;
import java.util.Map;

public class CityDictionary {
    private Map<Integer, String> cityMap;

    public CityDictionary() {
        cityMap = new HashMap<>();
        populateCityMap();
    }

    private void populateCityMap() {
        cityMap.put(0, "New York City, USA");
        cityMap.put(1, "London, UK");
        cityMap.put(2, "Paris, France");
        cityMap.put(3, "Tokyo, Japan");
        cityMap.put(4, "Sydney, Australia");
        cityMap.put(5, "Rome, Italy");
        cityMap.put(6, "Los Angeles, USA");
        cityMap.put(7, "Dubai, UAE");
        cityMap.put(8, "Hong Kong, China");
        cityMap.put(9, "Singapore, Singapore");
        cityMap.put(10, "Barcelona, Spain");
        cityMap.put(11, "Berlin, Germany");
        cityMap.put(12, "Istanbul, Turkey");
        cityMap.put(13, "Bangkok, Thailand");
        cityMap.put(14, "Beijing, China");
        cityMap.put(15, "Mumbai, India");
        cityMap.put(16, "Rio de Janeiro, Brazil");
        cityMap.put(17, "Moscow, Russia");
        cityMap.put(18, "Cairo, Egypt");
        cityMap.put(19, "Toronto, Canada");
        cityMap.put(20, "San Francisco, USA");
        cityMap.put(21, "Shanghai, China");
        cityMap.put(22, "Seoul, South Korea");
        cityMap.put(23, "Amsterdam, Netherlands");
        cityMap.put(24, "Buenos Aires, Argentina");
        cityMap.put(25, "Mexico City, Mexico");
        cityMap.put(26, "Johannesburg, South Africa");
        cityMap.put(27, "Vienna, Austria");
        cityMap.put(28, "Athens, Greece");
        cityMap.put(29, "Madrid, Spain");
        cityMap.put(30, "Kuala Lumpur, Malaysia");
        cityMap.put(31, "Sao Paulo, Brazil");
        cityMap.put(32, "Chicago, USA");
        cityMap.put(33, "Venice, Italy");
        cityMap.put(34, "Lisbon, Portugal");
        cityMap.put(35, "Prague, Czech Republic");
        cityMap.put(36, "Zurich, Switzerland");
        cityMap.put(37, "Melbourne, Australia");
        cityMap.put(38, "Dublin, Ireland");
        cityMap.put(39, "Montreal, Canada");
    }

    public String getCity(int key) {
        return cityMap.get(key);
    }
}
