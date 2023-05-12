public class ExemploLong {
    public static void main(String[] args) {
        long populacaoMundial = 7794798739L;
        long distanciaEstrelaProxima = 40208000000000L;
        long saldoBancario = 1578923456789L;

        long soma = populacaoMundial + distanciaEstrelaProxima;
        long subtracao = distanciaEstrelaProxima - saldoBancario;
        long multiplicacao = saldoBancario * 2;
        long divisao = saldoBancario / populacaoMundial;

        System.out.println("População Mundial: " + populacaoMundial);
        System.out.println("Distância até a Estrela Próxima: " + distanciaEstrelaProxima);
        System.out.println("Saldo Bancário: " + saldoBancario);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
