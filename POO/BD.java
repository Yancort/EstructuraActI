import java.util.Scanner;


public class BD
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int opcion, hu;
        BaseDatos[] bds = new BaseDatos[4];
        String correo, nombreBaseDatos;
        
        
        System.out.println("Escriba el número de requirimiento según HU");
        hu = sc.nextInt();
        
        boolean existeBaseDatos = false;
        
        System.out.println("Ingrese el nombre de la BD");
        nombreBaseDatos = sc.next();

        System.out.println("Ingrese el correo para envio de pruebas de la BD");
        correo = sc.next();
        
        switch (hu) {
            case 1:
                String baseDatos;
                int j = 1;
                int x = 0;
                System.out.println("Ingrese el nombre de la BD");
                baseDatos = sc.next();

                do {
                    if (baseDatos.equals(bds[j - 1])) {
                        x = 1;
                    } else {
                        x = 0;
                    }
                    j++;
                } while (j <= 4 && x != 1);

                j = 0;

                if (x == 1) {
                    System.out.println("La base de datos si existe");
                    System.out.println("...");
                    System.out.println("La base de datos se esta revisando si tiene funcionalidades agregadas desde otro servicio");
                    System.out.println("¿Desea desmontar la base de datos?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    j = sc.nextInt();
                    if (j == 1) {
                        System.out.println("...");
                        System.out.println("La base de datos ha sido desmontada exitosamente se adjunta imagenes al correo: " + correo);
                    }
                } else {
                    System.out.println("La base de datos especificada no existe");
                }
                break;
            default:
                System.out.println("No se encuentra la HU especificada");
                break;
            }
    }
}
