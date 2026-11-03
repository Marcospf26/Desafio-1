import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    int x;
    GerenciadorCatalogo gerenciadorCatalogo = new GerenciadorCatalogo();
    do {
        System.out.println("Selecione a opcao desejada");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Listar produtos");
        System.out.println("4 - Buscar produto por ID");
        System.out.println("5 - Buscar produto por Categoria");
        System.out.println("6 - Alterar categoria do produto");
        System.out.println("0 - Sair");

        x = ler.nextInt();
        ler.nextLine();
        switch(x) {

            case 1:
                System.out.println(" Adicionar produto");

                System.out.println("Nome do produto");
                String n = ler.nextLine();

                System.out.println("Preco");
                double p = ler.nextDouble();

                System.out.println("Nome da Categoria");
                ler.nextLine();
                String nC = ler.nextLine();

                Categoria cat = new Categoria(nC);

                Produto prod = new Produto(n, p, cat);

                if(gerenciadorCatalogo.adicionarProduto(prod)) {
                    System.out.println(" Produto adicionado com sucesso");
                    gerenciadorCatalogo.adicioanrCategoria(cat);
                } else {
                    System.out.println(" Nao foi possivel adicionar o produto");

                }



            break;
            case 2:
                System.out.println(" Remover produto");
                System.out.println("Insira o ID do produto a ser removido");
                int idRemove = ler.nextInt();
                if(gerenciadorCatalogo.removerProduto(idRemove)) {
                    System.out.println("Produto removido com sucesso");
                } else {
                    System.out.println(" Nao foi possivel remover o produto");

                }


            break;
            case 3:

                gerenciadorCatalogo.listarProdutos();
            break;
            case 4:
                System.out.println(" Buscar produto por ID");
                System.out.println("Insira o ID do produto ");
                int idBusca = ler.nextInt();
                if(gerenciadorCatalogo.buscarProdutoId(idBusca) != null) {
                    System.out.println(gerenciadorCatalogo.buscarProdutoId(idBusca));
                } else {
                    System.out.println("Nao foi possivel encontrar o produto");
                }


                break;
            case 5:
                System.out.println(" Buscar produto por Categoria");
                System.out.println("Insira o ID da categoria ");
                int buscaPorCategoria = ler.nextInt();
                gerenciadorCatalogo.buscarProdutoPorCategoria(buscaPorCategoria);


                break;
            case 6:
                System.out.println(" Alterar categoria do produto");
                System.out.println(" Insira o id do produto e depois o id da categoria que quer colocar");
                int idProds = ler.nextInt();
                int idCats = ler.nextInt();
                gerenciadorCatalogo.alterarCategoriaDoProduto(idProds, idCats);

            break;
            default:
                System.out.println("Insira uma opcao valida");

            break;
        }




    }while(x != 0);
}
