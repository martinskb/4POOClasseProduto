/*
4. Classe Produto (Setters com Validação)
• Crie a classe Produto com atributos privados:
◦ nome (String)
◦ preco (double)
• Crie getters e setters, mas o setPreco() deve validar:
◦ não permitir preços negativos.
• No main, teste criando produtos e tentando atribuir valores
inválidos.
*/
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 2500.00);
        Produto p2 = new Produto("Mouse", 50.00);

        System.out.println(p1.getNome() + ": R$" + p1.getPreco());
        System.out.println(p2.getNome() + ": R$" + p2.getPreco());


        p1.setPreco(-100);
        p2.setPreco(75.50);

        System.out.println("Preços atualizados:");
        System.out.println(p1.getNome() + ": R$" + p1.getPreco());
        System.out.println(p2.getNome() + ": R$" + p2.getPreco());
    }
}
