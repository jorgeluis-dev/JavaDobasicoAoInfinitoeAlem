public class ExemploBoolean {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isRaining = false;

        System.out.println("Está ensolarado? " + isSunny);
        System.out.println("Está chovendo? " + isRaining);

        // Exemplo de condição com operadores lógicos
        boolean isWeatherGood = isSunny && !isRaining;
        System.out.println("O clima está bom? " + isWeatherGood);

        // Exemplo de condição utilizando if-else
        if (isWeatherGood) {
            System.out.println("Aproveite o dia!");
        } else {
            System.out.println("Leve um guarda-chuva.");
        }
    }
}
