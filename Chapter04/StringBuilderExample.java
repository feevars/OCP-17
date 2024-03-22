public class StringBuilderExample {
    public static void main(String[] args){

        // exercise1();
        // usingCommonMethods();
    }

    
    private static void exercise1() {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("----------------");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
    private static void usingCommonMethods() {
        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        System.out.println("sb=" + sb);
        System.out.println("sub=" + sub);
        System.out.println("----------------");
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
    }
}