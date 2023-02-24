public class TiposVariaveis {
    public static void main(String[] args) {

        // tipos primitivos:
        byte tipo1 = 127;
        short tipo2 = 32767;
        int tipo3 = 2147483647;
        long tipo4 = 9223372036854775807L;
        float tipo5 = 3.14F;
        double tipo6 = 1500.99;
        char tipo7 = 'a';
        boolean tipo8 = true;

        // variaveis (valores que podem sofrer alteração):

        byte numero1 = 5; // pode sofrer alteração
        byte numero2 = 6; // pode sofrer alteração

        int resultado = numero1 + numero2; // pode sofrer alteração


        // constantes (falores fixos, não podem ser alterados):
        // acrescentando "final" antes do tipo, impede de sofrer alteração.
        final float PI = 3.14F; // PI é sempre 3.14... ele não muda.

        System.out.println("variavel: " + resultado);
        System.out.println("constante: " + PI);
    }
}

// Observação, podemos passar um tipo menor
// para um tipo maior, mas não o inverso.

// Exemplo:
// byte = short ERRO
// byte = int   ERRO
// int = byte OK
// int = short OK.