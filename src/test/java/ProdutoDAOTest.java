import dao.ProdutoDAO;
import domain.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoDAOTest {

    private ProdutoDAO produtoDAO;

    @BeforeEach
    void setup() {
        produtoDAO = new ProdutoDAO();
    }

    @Test
    void testeCadastrar() throws Exception {
        Produto produto = new Produto();
        produto.setNome("Produto teste");
        produto.setPreco(String.valueOf(10.0));

        Integer resultado = produtoDAO.cadastrar(produto);
        assertEquals(1, resultado);
    }
}
