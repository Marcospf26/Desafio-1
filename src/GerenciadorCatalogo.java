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

    public void adicioanrCategoria(Categoria categoria) {
        categorias.add(categoria);
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

    public boolean buscarProdutoPorCategoria(int idCategoria){
        for(Produto prods : produtos) {
            if(prods.getCategoria().getId() == idCategoria) {
                System.out.println(prods);
                return true;
            }

        }
        return false;
    }

    public Categoria buscarCategoriaNaHashSet(int id) {
        for(Categoria cats: categorias) {
            if(cats.getId() == id)
            {
                return cats;
            }
        }
        return null;
    }

    public boolean alterarCategoriaDoProduto(int idProduto, int idCategoria) {
        Categoria cats = buscarCategoriaNaHashSet(idCategoria);
        for(Produto prods: produtos){
            if(prods.getId() == idProduto) {
                prods.setCategoria(cats);
                return true;
            }
        }
        return false;
    }


}


