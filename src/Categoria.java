public class Categoria {

    private int id;
    private String nome;

    public Categoria (int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void setNomeCat(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
}
