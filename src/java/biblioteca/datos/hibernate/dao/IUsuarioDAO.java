package biblioteca.datos.hibernate.dao;

import biblioteca.modelo.dominio.Usuario;

public interface IUsuarioDAO {
    /**
     * Valida la existencia de un usuario.
     * @param nombreUsuario
     * @param password
     * @return null si no existe.
     */
    Usuario validarUsuario(String nombreUsuario, String password);
    
    void modificarUsuario(Usuario usuario);
}
