public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature) {
        int min = 25;
        int max = summer ? 45 : 35;
        
        if(temperature >= min && temperature <= max) {
            return true;
        }
        
        return false;
    }
}