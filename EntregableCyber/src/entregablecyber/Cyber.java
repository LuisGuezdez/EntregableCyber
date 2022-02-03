/*
 * Proyecto EntregableCyber - Archivo Cyber.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package entregablecyber;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 2 feb. 2022 18:43:23
 */
public class Cyber 
{
    //ATRIBUTOS
    private Usuario[] arrayUsuarios;
    private int cuantos = 0;
    
    //METODOS
    
    //Constructor
    public Cyber()
    {
        arrayUsuarios = new Usuario[100];
    }
    
    //Ver usuarios
    public void verUsuarios()
    {
        for (int i = 0; i < 10; i++) 
        {
            System.out.print(i + 1 + ". ");
            arrayUsuarios[i].verInfo();
            System.out.println("");
        }
    }
    
    //Agregar usuario
    public void agregarUsuario(Usuario x)
    {
        if (cuantos < 100) 
        {
            arrayUsuarios[cuantos] = x;
            cuantos++;
        }
        else
            System.out.println("No es posible agregar más usuarios");
    }
    
    //Eliminar usuario
    public void eliminarUsuario(int posi)
    {
        posi = posi - 1;
        if (cuantos > 0 && posi >= 0 && posi < cuantos) 
        {
            for (int i = posi; i < cuantos - 1; i++) 
            {
                arrayUsuarios[i] = arrayUsuarios[i + 1];
                cuantos--;
            }
        }
        else
            System.out.println("No es posible eliminar ese usuario");
    }
    
    //Buscar usuario
    public Cyber buscarUsuario(String username)
    {
        Cyber usuarios = new Cyber();
        for (int i = 0; i < cuantos; i++) 
        {
            if (arrayUsuarios[i].getUsername().toUpperCase().contains(username.toUpperCase())) 
            {
                usuarios.agregarUsuario(arrayUsuarios[i]);
            }
        }
        
        
        return usuarios;
    }
    
    //Ver sinsaldo
    public void verSinsaldo()
    {
        boolean comp = false;
        for (int i = 0; i < cuantos; i++) 
        {
            if (arrayUsuarios[i].getSaldo() == 0) 
            {
                arrayUsuarios[i].verInfo();
                comp = true;
            }
        }
        if (!comp)
        {
            System.out.println("No hay usuarios sin saldo");
        }
    }
    
}
