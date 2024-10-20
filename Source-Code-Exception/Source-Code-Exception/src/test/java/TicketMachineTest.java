import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketMachineTest {
    
    private TicketMachine machine;

    @BeforeEach
    public void setUp() {
        // Inicializa uma máquina com um valor de bilhete fixo, por exemplo, 10.
        machine = new TicketMachine(10);
    }

    @Test
    public void testInserirValidMoeda() throws Exception {
        machine.inserir(5); // Insere uma quantia válida
        assertEquals(5, machine.getSaldo()); // Verifica se o saldo é atualizado corretamente
    }

    @Test
    public void testInserirInvalidMoeda() {
        try {
            // A máquina só aceita as denominações 2, 5, 10, 20, 50, 100.
            // Vamos inserir uma quantia inválida, como 3.
            machine.inserir(3); // Quantia inválida
            fail("Esperado PapelMoedaInvalidaException, mas não foi lançada.");
        } catch (PapelMoedaInvalidaException e) {
            // Exceção esperada, o teste deve passar
        }
    }

    @Test
    public void testGetSaldo() {
        assertEquals(0, machine.getSaldo()); // Verifica se o saldo inicial é 0
        machine.inserir(20);
        assertEquals(20, machine.getSaldo()); // Verifica o saldo após inserir 20
    }

    @Test
    public void testGetTroco() {
        machine.inserir(20); // Insere um valor maior que o do bilhete
        Iterator<PapelMoeda> troco = machine.getTroco();
        assertNotNull(troco); // Verifica se o troco não é nulo
        // Verificação adicional pode ser feita dependendo da implementação da classe Troco
    }

    @Test
    public void testImprimirComSaldoSuficiente() throws Exception {
        machine.inserir(10); // Insere o valor exato do bilhete
        String resultadoEsperado = "*****************\n*** R$ 10,00 ****\n*****************\n";
        assertEquals(resultadoEsperado, machine.imprimir()); // Verifica a impressão correta
    }

    @Test
    public void testImprimirComSaldoInsuficiente() {
        try {
            machine.imprimir(); // Tenta imprimir com saldo insuficiente
            fail("Esperado SaldoInsuficienteException, mas não foi lançada.");
        } catch (SaldoInsuficienteException e) {
            // Exceção esperada, o teste deve passar
        }
    }
}
