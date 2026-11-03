public class Produto {
    public static int ProximoId = 1;

    private int id;
    private String nome;
    private double preco;
    private Categoria categoria;

    public Produto(String nome, double preco, Categoria categoria) {
        this.id = ProximoId++;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }


    public Categoria getCategoria(){
        return this.categoria;
    }



}
