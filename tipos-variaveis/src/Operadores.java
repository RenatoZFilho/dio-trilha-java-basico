public class Operadores {

    public static void main(String[] args) {

        // = | operador de atribuição
        int idade = 22; // idade recebe valor 22 do tipo inteiro

        // operadores aritmetico:
        // + -> Soma
        // - -> Subtração
        // * -> Multiplicação
        // / -> Divisão

        // Operadores Aritmeticos

        int n1 = 5, n2 = 2;
        String nome = "Renato", sobrenome = " Zanotelli";

        int soma = n1 + n2;

        String concatenacao = nome + sobrenome;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        float divisao = n1 / n2;
        float modulo = n1 % n2;

        System.out.println("Soma: " + soma);
        System.out.println("Concatenação: " + concatenacao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + modulo);
        System.out.println();

        // Operador Unario

        int unario = 5;
        boolean unarioBool = true;

        System.out.println("Unario -: " + -unario);
        System.out.println("Unario ++: " + ++unario);
        System.out.println("Unario --: " + --unario);
        System.out.println("Unario ~: " + ~unario);
        System.out.println("Unario Bool ~: " + !unarioBool);
        System.out.println();

        // Operadores De Incremento

        int incremento = 5;
        System.out.println("incremento padrão: " + incremento);
        incremento++;
        System.out.println("Incremento ++: " + incremento);
        incremento--;
        System.out.println("Incremento --: " + incremento);
        System.out.println();

        // ou

        incremento = 5;
        System.out.println("Incremento antes da variavel: " + ++ incremento);
        System.out.println("Depois de incrementar: " + incremento);
        incremento = 5;
        System.out.println("Incremento depois da variavel: " + incremento ++);
        System.out.println("Depois de incrementar: " + incremento);
        System.out.println();

        // operador ternário

        int a = 5;
        int b = 6;

        // forma padrão se fazer um IF:

        if(a==b)
            System.out.println("If padrão: " + a + " é igual a " + b + " ? Verdadeiro");
        else
            System.out.println("If padrão: " + a + " é igual a " + b + " ? Falso");

        // Utilizando Operador Ternario

        System.out.println ((a==b)? ("Ternario: " + a + " é igual a " + b + " ? Verdadeiro") : ("Ternario: " + a + " é igual a " + b + " ? Falso"));

        // Exemplo atribuindo:

        String resultado = (a==b)? "Verdadeiro" : "Falso";
        System.out.println("Resultado atribuindo: " + resultado);
        System.out.println();


        // Operadores Relacionais:

        System.out.println("Operador Relacional: " +  a + " é igual a " + b + "? " + (a==b));
        System.out.println("Operador Relacional: " +  a + " é maior que " + b + "? " + (a>b));
        System.out.println("Operador Relacional: " +  a + " é menor que " + b + "? " + (a<b));
        System.out.println("Operador Relacional: " +  a + " é maior ou igual a " + b + "? " + (a>=b));
        System.out.println("Operador Relacional: " +  a + " é menor ou igual a " + b + "? " + (a<=b));
        System.out.println("Operador Relacional: " +  a + " é diferente de " + b + "? " + (a!=b));
        System.out.println();

        // Para Strings ou Objetos utilizar .equals:

        String nome1 = "Renato";
        String nome2 = "Renato";

        System.out.println("Equals: '" + nome1 + "' possui o mesmo conteudo que '" + nome2 + "'? " + nome1.equals(nome2));

        nome1 = "Renato";
        nome2 = "Zanotelli";

        System.out.println("Equals: '" + nome1 + "' possui o mesmo conteudo que '" + nome2 + "'? " + nome1.equals(nome2));
        System.out.println();

        // Operadores Lógicos

        a = 5;
        b = 6;
        int c = 5;

        System.out.println((a<b) && (a==c)?
                "Lógico E: " + a + " é menor que " + b + " E " + a + " é igual a " + c + ": Verdadeiro" :
                "Lógico E: " + a + " é menor que " + b + " E " + a + " é igual a " + c + ": Falso");

        System.out.println((a<b) || (a==c)?
                "Lógico OU: " + a + " é menor que " + b + " OU " + a + " é igual a " + c + ": Verdadeiro" :
                "Lógico OU: " + a + " é menor que " + b + " OU " + a + " é igual a " + c + ": Falso");

        System.out.println((a<b) &&! (a==c)?
                "Lógico E Invertido: " + a + " é menor que " + b + " E " + a + " é igual a " + c + ": (Invertido) Verdadeiro" :
                "Lógico E Invertido: " + a + " é menor que " + b + " E " + a + " é igual a " + c + ": (Invertido) Falso");
        System.out.println();
    }
}
