package strings;

public class TextBlock {
    public static void main(String[] args) {
        String textBlock = """
             "Java Study Guide"
                by Scott and Jeanne""";
    
        System.out.println(textBlock);
        
        /* primeira linha: adiciona 2 essential whitespaces
           segunda linha: adiciona 1 essential whitespaces
           terceira linha: não adiciona whitespaces
           não possui incidental whitespaces nesse caso */
        String pyramid = """
                   *
                  * *
                *  *  *
                """;
        System.out.println(pyramid);

        String block1 = """
                doe \
                deer1""";
        System.out.println(block1);

        String block2 = """
            doe \n
            deer2""";
        System.out.println(block2);

        /*
         * todos os "" estão escape então aparecem.
         */
        String block3 = """
            doe\"\"\"
            \"deer3\"""
            """;
        System.out.println(block3);
    }
}