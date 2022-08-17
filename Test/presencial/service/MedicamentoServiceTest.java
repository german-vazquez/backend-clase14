package presencial.service;

import org.junit.jupiter.api.Test;
import presencial.dao.BD;
import presencial.dao.MedicamentoDaoH2;
import presencial.modelo.Medicamento;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoServiceTest {
    private MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDaoH2());
    @Test
    public void guardarMedicamentoTest() throws Exception{
        BD.crearBD();
        Medicamento medicamento = new Medicamento("ibuprofeno", "lab123", 5, 40d);
        medicamentoService.guardar(medicamento);
        assertTrue(medicamento.getId()==1);
    }
}