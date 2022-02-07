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
public class Cyber {
     //ATRIBUTOS
    private Usuario[] arrayUsuarios;
    private int cuantos = 0;
    
    //METODOS
    
    //Constructor
    public Cyber(){
        arrayUsuarios = new Usuario[100];
    }
    
    //Ver usuarios
    public void verUsuarios(){
        System.out.println("USUARIOS:");
        for (int i = 0; i < cuantos; i++){
            System.out.print(i + ". ");
            arrayUsuarios[i].verInfo();
            System.out.println("");
        }
    }
    
    //Agregar usuario
    public void agregarUsuario(Usuario x){
        if (cuantos < 100){
            arrayUsuarios[cuantos] = x;
            cuantos++;
        }
        else
            System.out.println("No es posible agregar más usuarios");
    }
    
    //Eliminar usuario
    public void eliminarUsuario(int posi){
        if (cuantos > 0 && posi >= 0 && posi < cuantos){
            for (int i = posi; i < cuantos - 1; i++){
                arrayUsuarios[i] = arrayUsuarios[i + 1];
                cuantos--;
            }
        }
        else
            System.out.println("No es posible eliminar ese usuario");
    }
    
    //Buscar usuario
    public void buscarUsuario(String username){
        Cyber usuarios = new Cyber();
        for (int i = 0; i < cuantos; i++){
            if (arrayUsuarios[i].getUsername().toUpperCase().contains(username.toUpperCase())){
                System.out.print(i + ". ");
                arrayUsuarios[i].verInfo();
            }
        }
    }
    
    //Ver sinsaldo
    public void verSinsaldo(){
        boolean comp = false;
        for (int i = 0; i < cuantos; i++){
            if (arrayUsuarios[i].getSaldo() == 0){
                System.out.print(i + ". ");
                arrayUsuarios[i].verInfo();
                comp = true;
            }
        }
        if (!comp){
            System.out.println("No hay usuarios sin saldo");
        }
    }
    
    //Ingresar saldo
    public void ingresarSaldo(double cuanto, int posi){
        arrayUsuarios[posi].ingresarSaldo(cuanto);
    }
    
    //Retirar saldo
    public void consumirSaldo(double cuanto, int posi){
        arrayUsuarios[posi].retirarSaldo(cuanto);
    }
    
    //Tranferir saldo
    public void transferirSaldo(double cuanto, int pos1, int pos2){
        if (cuanto>0){
            if(arrayUsuarios[pos1].getSaldo()>cuanto){
                arrayUsuarios[pos1].retirarSaldo(cuanto);
                arrayUsuarios[pos2].ingresarSaldo(cuanto);
            }else{
                throw new IllegalArgumentException("Saldo insuficiente");
            } 
        }else{
            throw new IllegalArgumentException("Cantidad invalida");
        }
    }
}
