package pe.edu.upc.tp_finanzas.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.tp_finanzas.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(Long idUsuario);

    public Users listarId(Long idUsuario);
    public Long UserIdByUsername(String username);
}
