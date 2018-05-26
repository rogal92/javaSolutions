
//Nathan loves cycling.
//
//Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour 
//of cycling.
//
//You get given the time in hours and you need to return the number of 
//litres Nathan will drink, rounded to the smallest value.
//
//For example:
//
//time = 3 ----> litres = 1
//
//time = 6.7---> litres = 3
//
//time = 11.8--> litres = 5

package codewars;

public class KeepHydrated {
    public static void main(String[] args) {
        double time = 11.8;
        int result = Liters(time);
        System.out.println(result);
    }
    public static int Liters(double time) {
        return (int)(time * 0.5);
    }
}
