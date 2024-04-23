package Chapter02;

public class AssignmentOperators {
    public static void main(String[] args) {
        
        castingWorks();

        castingDoesntWork();
    }

    /*
     * Casting is required when converting to a smaller or narrowing data type.
     */
    private static void castingWorks() {
       int fur = (int)5;
       int hair = (short)2;
       String type = (String) "Bird";
       short tail = (short)(4+10);
    }

    private static void castingDoesntWork() {
        // long feathers = 10(long);
        // larger value in a smaller data type
        float egg =  2.0 / 9; // double, not float. add (float) to cast to float
        int tadpole = (int) 5 * 2L; // cannot cast from long to int because its bigger
        short frog = 3 - 2.0; // its a double, cannot be 'shortened'
    }

    private static void castingPrimitiveAssignmentsWrong() {
        int fish = 1.0; // double
        short bird = 19212222; // int
        int mammal = 9f; // float
        long reptile = 192_301_398_193; // int
    }

    private static void castingCorrection() {
        int fish = (int) 1.0;
        short bird = (short) 19212222; // stored as 20678. Number is too large to be stores as a short
        int mammal = (int) 9f; // float
        long reptile = (long) 192_301_398_193; // first interpreted as an int, so by the compiler is out of range
        long newReptile = 192_301_398_193L;
    }
}
