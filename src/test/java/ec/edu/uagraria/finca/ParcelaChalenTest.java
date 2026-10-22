package ec.edu.uagraria.finca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ParcelaChalenTest {

    @Test
    void convierteCuatroHectareasEnMetrosCuadrados() {
        Parcela parcela = new Parcela("P-03", 4.0);

        assertEquals(40_000.0, parcela.areaEnMetrosCuadrados(), 0.001);
    }
}
