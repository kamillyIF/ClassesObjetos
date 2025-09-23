package execicio.execicio;

import exercicio.NovoEstudante;
import org.junit.jupiter.api.Test;

public class NovoEstudanteTest {
    @Test
    public void testGetMedia() {
        NovoEstudante e1 = new NovoEstudante("nome", 12345, 45, 56, 67);
        assertEquals(56, e1.getMedia());
        e1.setNotas(40, 60, 9);
        assertEquals(36.3, e1.getMedia(), 0.1);
    }

    @Test
    public void testGetNotas() {
        NovoEstudante e1 = new NovoEstudante("nome", 12345, 45, 56, 67);
        assertEquals(45, e1.getNota(0));
        assertEquals(56, e1.getNota(1));
        assertEquals(67, e1.getNota(2));
        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> e1.getNota(3)
        );
    }

}
