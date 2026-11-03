public class Categoria {
    public static int proximoIdCat = 1;

    private int id;
    private String nome;

    public Categoria (String nome) {
        this.id = proximoIdCat++;
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

    @Override
    public String toString() {
        return String.format("Id: %d  Nome: %s", this.id, this.nome);
    }


}
