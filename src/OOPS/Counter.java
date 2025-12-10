package OOPS;

public class Counter {

    private static int count = 0;   // static variable

    public Counter() {
        count++;   // increments every time object is created
    }

    public static int getCount() {  // static method
        return count;
    }
}
