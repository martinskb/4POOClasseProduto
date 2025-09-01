public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro: Preço não pode ser negativo!");
        } else {
            this.preco = preco;
        }
    }
}
