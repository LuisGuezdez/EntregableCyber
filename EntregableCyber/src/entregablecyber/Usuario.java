/*
 * Proyecto EntregableCyber - Archivo Usuario.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package entregablecyber;

/**
 *
 * @author Luis  Rodríguez <isguezdez@gmail.com>
 * @version 1.0
 * @date 2 feb. 2022 18:43:40
 */
public class Usuario 
{
    //ATRIBUTOS
    private String nombre;
    private String username;
    private String correo;
    private double saldo;
    private String telf;
    
    //METODOS
    
    //Constructor

    public Usuario(String nombre, String username, String correo, double saldo, String telf) 
    {
        this.nombre = nombre;
        this.username = username;
        this.correo = correo;
        this.saldo = saldo;
        this.telf = telf;
    }
    
    
    //Mostrar info de usuario
    public void verInfo()
    {
        System.out.println("Nombre de usuario: " + username);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telf);
        System.out.println("Saldo: " + saldo + " €");
        System.out.print("Minutos restantes: ");
        saldoMinutos();
    }
    
    private void saldoMinutos()
    {
        double coste = 3, min;
        min = ( saldo / coste) * 60;
        System.out.println(min);
    }
    
    //Ingresar Saldo
    
    
}
