package strings;

public class MultipleVars {
    public static void main(String[] args) {
        /* s1, s2, s3 e s4 declaradas, s3 e s4 inicializadas. */
        String s1, s2;
        String s3 = "3", s4 = "4";

        /* i1 e i2 declaradas, mas apenas i3 está inicializada. */
        int i1, i2, i3 = 3;

        /* Tipos diferentes não podem ser declarados na mesma linha / mesmo statement. */
        int num, String value;
    
    
        boolean b1, b2;
        String s5 = "5", s6;
        double d1, double d2; // não pode declarar o tipo da variável na mesma linha, mesmo que for igual. se quiser, precisa ser double d1, d2;
        int i4; int i5;
        int i6; i7; // ponto e vírgula finaliza o statement, então o i7 está incompleto.
    }
}