public class ExemploFloat {
    public static void main(String[] args) {
        float peso = 68.5f;
        float altura = 1.75f;

        float imc = peso / (altura * altura);

        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + imc);
    }
}
