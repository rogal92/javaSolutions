package codewars;

import java.util.ArrayList;

public class Bus {
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(value -> value[0] - value[1])
                .sum();
    }
}
