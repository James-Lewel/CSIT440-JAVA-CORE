/*
    Only add/edit code where it is stated in the description.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private Map<String, String> vocabulary = new HashMap<String, String>();
    
    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));
        
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        
        // Initialize vocabulary map
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
    }
    
    public void command() {
        Scanner scanner = new Scanner(System.in);

        int currentLocation = 1;
        
        while (true) {
            Location location = locations.get(currentLocation);
            System.out.println(location.getDescription());
            
            System.out.print("Available exits are ");
            for (String exit : location.getExits().keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String input = scanner.nextLine().toUpperCase();
            
            if (input.length() > 1) {
                String[] words = input.split(" ");
                StringBuilder command = new StringBuilder();
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        command.append(vocabulary.get(word));
                    } else {
                        command.append(word);
                    }
                }
                input = command.toString();
            }
            
            if (location.getExits().containsKey(input)) {
                currentLocation = location.getExits().get(input);
            } else {
                System.out.println("You cannot go in that direction");
            }

            if (input.equals("Q")) {
                System.out.println(locations.get(0).getDescription());
                break;
            }
        }
    }
}