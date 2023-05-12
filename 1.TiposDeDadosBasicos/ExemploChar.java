public class ExemploChar {
    public static void main(String[] args) {
        char letra = 'A';
        char caracterEspecial = '@';

        System.out.println("Letra: " + letra);
        System.out.println("Caracter Especial: " + caracterEspecial);
        
        // Conversão de char para inteiro
        int valorNumerico = (int) letra;
        System.out.println("Valor Numérico da Letra: " + valorNumerico);
        
        // Incrementando o valor da letra
        letra++;
        System.out.println("Letra Incrementada: " + letra);
    }
}
