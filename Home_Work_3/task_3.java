// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.


package Home_Work_3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task_3 {
    
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Pluto");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Jupiter");
        planets.add("Saturn");
        
        Map<String, Integer> planetCounts = new HashMap<>();
        for (String planet : planets) {
            if (planetCounts.containsKey(planet)) {
                int count = planetCounts.get(planet);
                planetCounts.put(planet, count + 1);
            } else {
                planetCounts.put(planet, 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : planetCounts.entrySet()) {
            String planet = entry.getKey();
            int count = entry.getValue();
            System.out.println(planet + ": " + count);
        }
    }
}
