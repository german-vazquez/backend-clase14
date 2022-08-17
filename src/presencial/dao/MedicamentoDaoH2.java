package presencial.dao;

import presencial.modelo.Medicamento;

import java.sql.*;

public class MedicamentoDaoH2 implements IDao<Medicamento> {
    private static final String SQL_INSERT = "insert into medicamentos(nombre, laboratorio, cantidad, precio) values (?,?,?,?)";

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        //conectarnos a la base y guardar el medicamento
        Connection connection = null;

        try {
            connection = BD.getConnection();
            PreparedStatement ps = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, medicamento.getNombre());
            ps.setString(2, medicamento.getLaboratorio());
            ps.setInt(3, medicamento.getCantidad());
            ps.setDouble(4, medicamento.getPrecio());
            ps.executeUpdate();
            //procesar la clave autogenerada para que quede su registro en java
            ResultSet claveGenerada = ps.getGeneratedKeys();
            while (claveGenerada.next()) {
                medicamento.setId(claveGenerada.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medicamento;
    }
}
