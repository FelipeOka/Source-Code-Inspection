import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.Troco;
import java.util.Iterator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrocoTest {

    private Troco troco;

    @BeforeEach
    public void setUp() {
        // Inicializando com um valor para gerar o troco
        troco = new Troco(187); // Exemplo: R$ 186,00 em notas
    }

    @Test
    public void testGetIterator() {
        // Verifica se o iterador é retornado corretamente
        Iterator<PapelMoeda> iterator = troco.getIterator();
        assertNotNull(iterator, "O iterador não deve ser nulo");
    }

    @Test
    public void testIteratorHasNext() {
        // Testa se o iterador identifica corretamente se há próximos elementos
        Iterator<PapelMoeda> iterator = troco.getIterator();
        assertTrue(iterator.hasNext(), "O iterador deve ter pelo menos um item");
    }

    @Test
    public void testIteratorNext() {
        // Testa se o método next do iterador retorna as notas corretas
        Iterator<PapelMoeda> iterator = troco.getIterator();
        
        PapelMoeda pm = iterator.next();
        assertEquals(100, pm.getValor(), "A primeira nota deve ser de 100");
        assertEquals(1, pm.getQuantidade(), "Deve haver uma nota de 100");

        pm = iterator.next();
        assertEquals(50, pm.getValor(), "A segunda nota deve ser de 50");
        assertEquals(1, pm.getQuantidade(), "Deve haver uma nota de 50");

        pm = iterator.next();
        assertEquals(20, pm.getValor(), "A terceira nota deve ser de 20");
        assertEquals(1, pm.getQuantidade(), "Deve haver uma nota de 20");

        pm = iterator.next();
        assertEquals(10, pm.getValor(), "A quarta nota deve ser de 10");
        assertEquals(1, pm.getQuantidade(), "Deve haver uma nota de 10");

        pm = iterator.next();
        assertEquals(5, pm.getValor(), "A quinta nota deve ser de 5");
        assertEquals(1, pm.getQuantidade(), "Deve haver uma nota de 5");

        pm = iterator.next();
        assertEquals(2, pm.getValor(), "A sexta nota deve ser de 2");
        assertEquals(3, pm.getQuantidade(), "Devem haver três notas de 2");

        assertFalse(iterator.hasNext(), "Não deve haver mais notas");
        
    }
}
