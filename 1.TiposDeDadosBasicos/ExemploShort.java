public class ExemploShort {
    public static void main(String[] args) {
        short quantidadeEstoque = 150;
        short quantidadeVendida = 50;

        // Verificando se a quantidade vendida é maior do que a quantidade em estoque
        if (quantidadeVendida > quantidadeEstoque) {
            System.out.println("Erro: Quantidade vendida maior do que a quantidade em estoque.");
        } else {
            // Atualizando a quantidade em estoque após a venda
            quantidadeEstoque -= quantidadeVendida;
            System.out.println("Venda realizada com sucesso. Quantidade em estoque: " + quantidadeEstoque);
        }
    }
}
