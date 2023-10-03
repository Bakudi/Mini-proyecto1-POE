import java.util.ArrayList;
import java.util.Scanner;

    

public class Metodos {
    private int votos;

    public Metodos(int votos) {
        this.votos = votos;
    }

    static ArrayList <Candidato> listaCandidatos = new ArrayList<Candidato>();
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido/a al menú de registro de candidatos\n");
        System.out.println("1. Insertar candidatos\n2. Actualizar candidato\n3. EliminarCandidato\n4. Buscar candidato por nombre\n5. Listar todos los candidatos.\n6. salir del menu registro de candidatos\n");
        System.out.println("Digite la el número de la opción a realizar: ");
        int opc = scanner.nextInt();
        switch(opc){
            case 1:
                System.out.println("+++");
                break;
            case 2:
                System.out.println("---");
                break;
            case 3:
                System.out.println("xxx");
                break;
            case 4:
                borrarCandidato(listaCandidatos);
                break;
            case 5:
                System.out.println("eee");
                break;
            case 6: 
                break;
            default:
                Metodos.menu();
        }
    }

    public static void borrarCandidato(ArrayList<Candidato> lista){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del candidato que deseas borrar: ");
        Object borrar = scanner.nextLine();
        lista.remove(borrar);
    }

    public static void listarCandidato(){

    }

    public static void votar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido/a al menú de registro de votos por candidato\n");
        System.out.println("1. Insertar votos de candidatos\n2. salir\n");
        System.out.println("Digite la el número de la opción a realizar: ");
        int opc = scanner.nextInt();
        switch(opc){
            case 1:
                System.out.println("+++");
                break;
            case 2: 
                break;
            default:
                Metodos.menu();
        }
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }    
}
