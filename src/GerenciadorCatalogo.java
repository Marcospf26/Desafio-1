import java.util.ArrayList;
import java.util.HashSet;

public class GerenciadorCatalogo {

    ArrayList<Produto> produtos = new ArrayList<>();
    HashSet<Categoria> categorias = new HashSet<>();

    public boolean adicionarProduto(Produto produto){
        if(produtos.add(produto)){
            return true;
        }
        return false;
    }


    public Produto buscarProdutoId(int id) {
        for(Produto prods: produtos){
            if(prods.getId() == id) {
                return prods;
            }
        }
        return null;
    }

    public boolean removerProduto(int id){
        Produto p = buscarProdutoId(id);
        if(p!= null) {
            for(Produto prods: produtos) {
                if(prods == p) {
                    produtos.remove(prods);
                    return true;
                }
            }
        }
        return false;
    }

    public void listarProdutos() {
        for(Produto prods: produtos){
            System.out.println(prods);
        }
    }

    public boolean buscarProdutoPorCategoria(Categoria categoria){
        for(Produto prods : produtos) {
            if(prods.getCategoria() == categoria) {
                System.out.println(prods);
                return true;
            }

        }
        return false;
    }
    

}


