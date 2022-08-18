package playground.PatronDao.servicios;

import playground.PatronDao.daos.IDao;
import playground.PatronDao.entidades.Estudiante;

import java.util.List;

public class EstudianteService {
    private IDao<Estudiante> estudianteIDao;


    public IDao<Estudiante> getEstudianteIDao() {
        return estudianteIDao;
    }

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }


    public Estudiante guardarEstudiante(Estudiante e){
        //delegarle la responsabilidad de guardar al DAO
        return estudianteIDao.guardar(e);
    }

    public void eliminarEstudiante(Long id){
        //delega al dao
        estudianteIDao.eliminar(id);
    }

    public Estudiante buscarEstudiante(Long id){
        //delega al dao
        return estudianteIDao.buscar(id);
    }

    public List<Estudiante> buscarTodos(){
        //delega al dao
        return estudianteIDao.buscarTodos();
    }
}
