package Chapter02;

public class Exercises {

    public static void main(String[] args) {
        
        exercise2();
        
    }

    private static void exercise2() {
        byte apples = 5;
        short oranges = 10;
        // int bananas = apples + oranges; -- OK
        // long bananas = apples + oranges; -- OK
        // boolean bananas = apples + oranges; -- DOES NOT COMPILE
        // double bananas = apples + oranges; -- OK
        // short bananas = apples + oranges; -- DOES NOT COMPILE (INT TO SHORT)
        // byte bananas = apples + oranges; -- DOES NOT COMPILE (INT TO BYTE)
    }
}
