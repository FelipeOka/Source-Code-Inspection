import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vitor
 */
public class PapelMoedaTest {
    
    private PapelMoeda papelMoeda; // Variável de instância para testes

    @BeforeAll
    public static void setUpClass() {
        // Executado uma vez antes de todos os testes
    }
    
    @AfterAll
    public static void tearDownClass() {
        // Executado uma vez após todos os testes
    }
    
    @BeforeEach
    public void setUp() {
        // Inicializa uma instância de PapelMoeda antes de cada teste
        papelMoeda = new PapelMoeda(100, 5);  // Exemplo: valor de 100 e quantidade de 5
    }
    
    @AfterEach
    public void tearDown() {
        // Executado após cada teste, pode ser usado para limpeza, se necessário
        papelMoeda = null;  // Limpa a variável após o teste
    }

   
    @Test
    public void testGetValor() {
        System.out.println("Testando getValor");
        int expResult = 100;  // Valor esperado
        int result = papelMoeda.getValor();  // Chama o método
        assertEquals(expResult, result);  // Verifica se o valor retornado é o esperado
    }

  
    @Test
    public void testGetQuantidade() {
        System.out.println("Testando getQuantidade");
        int expResult = 5;  // Quantidade esperada
        int result = papelMoeda.getQuantidade();  // Chama o método
        assertEquals(expResult, result);  // Verifica se a quantidade retornada é a esperada
    }
}
