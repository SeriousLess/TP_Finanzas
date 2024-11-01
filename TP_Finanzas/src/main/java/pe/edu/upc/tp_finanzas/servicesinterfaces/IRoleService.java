package pe.edu.upc.tp_finanzas.servicesinterfaces;

import pe.edu.upc.tp_finanzas.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role rol);

    public List<Role> list();

    public void delete(Long idRol);

    public Role listarId(Long idRol);
}
