/*
 * Proyecto EntregableCyber - Archivo EntregableCyber.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package entregablecyber;

/**
 *
 * @author Luis Rodríguez <isguezdez@gmail.com>
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        Cyber cyber = new Cyber();
        
        int opcion, pos, pos1, pos2;
        String nombre, username, correo, telf;
        double saldo;
        
        
        do{
            System.out.println("-----OPCIONES-----");
            System.out.println("1. Ver usuarios. \n" +
            "2. Agregar usuario.\n" +
            "3. Eliminar usurario.\n" +
            "4. Buscar usuario. \n" +
            "5. Ver los 'sinsaldo' .\n" +
            "6. Ingresar saldo.\n" +
            "7. Consumir saldo.\n" +
            "8. Transferir saldo.\n" +
            "9. Salir.\n");
            System.out.println("Elija opción: ");
            opcion = cin.nextInt();
            if (opcion > 0 && opcion < 10){
                switch (opcion){
                    case 1://Ver usuarios
                        cyber.verUsuarios();
                        break;
                        
                    case 2://Agregar usuario
                        cin.nextLine();
                        System.out.println("Introduce el nombre: ");
                        nombre = cin.nextLine();
                        System.out.println("Introduce el username: ");
                        username = cin.nextLine();
                        System.out.println("Introduce el correo: ");
                        correo = cin.nextLine();
                        System.out.println("Introduce el teléfono: ");
                        telf = cin.nextLine();
                        System.out.println("Introduce el saldo: ");
                        saldo = cin.nextDouble();
                        
                        Usuario usuario = new Usuario(nombre, username, correo, saldo, telf);
                        cyber.agregarUsuario(usuario);
                        break;
                    
                    case 3://Eliminar usuario
                        System.out.println("Elija la posición del usuario a eliminar:");
                        pos = cin.nextInt();
                        cyber.eliminarUsuario(pos);
                        break;
                        
                    case 4://Buscar usuario
                        System.out.println("Introduce el username a buscar:");
                        username = cin.next();
                        cyber.buscarUsuario(username);
                        break;
                    
                    case 5://Ver sinsaldo
                        cyber.verSinsaldo();
                        break;
                        
                    case 6://Ingresar saldo
                        System.out.println("Elija la posición a quien ingresar:");
                        pos = cin.nextInt();
                        System.out.println("Introduce saldo a ingresar:");
                        saldo = cin.nextDouble();
                        cyber.ingresarSaldo(saldo, pos);
                        break;
                        
                    case 7://Consumir saldo
                        System.out.println("Elija la posición a quien consumir:");
                        pos = cin.nextInt();
                        System.out.println("Introduce saldo a gastar:");
                        saldo = cin.nextDouble();
                        cyber.consumirSaldo(saldo, pos);
                        break;
                    
                    case 8://Transferir saldo
                        System.out.println("Quien ofrece saldo:");
                        pos1 = cin.nextInt();
                        System.out.println("Quien lo recibe:");
                        pos2 = cin.nextInt();
                        System.out.println("Introduce saldo a transferir:");
                        saldo = cin.nextDouble();
                        cyber.transferirSaldo(saldo, pos1, pos2);
                        break;                                          
                }
            }
            else
                System.out.println("Eleccion invalida");
        }
        while (opcion != 9);
    }
}
