import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    public static void borrarCandidato(ArrayList<Candidato> lista){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del candidato que deseas borrar: ");
        Object borrar = scanner.nextLine();
        lista.remove(borrar);
    }

    public static void listarCandidato(ArrayList<Candidato> lista){
        System.out.println("Lista de candidatos mostrada en pantalla:\n");
        for(int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    public static void votar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido/a al menú de registro de votos por candidato\n");
        System.out.println("1. Insertar votos de candidatos\n2. Mostrar resultados finales.\n");
        System.out.println("Digite la el número de la opción a realizar: ");
        int opc = scanner.nextInt();
        switch(opc){
            case 1:
                System.out.println("+++");
                break;
            case 2: 
                break;
            default:
                break;
        }
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
}

