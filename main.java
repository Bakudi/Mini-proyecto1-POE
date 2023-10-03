import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception{
        ArrayList <Candidato> listaCandidatos = new ArrayList<Candidato>();
        Byte num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido/a al menú de registro de candidatos\n");
        System.out.println("1. Insertar candidatos\n2. Actualizar candidato\n3. EliminarCandidato\n4. Buscar candidato por nombre\n5. Listar todos los candidatos.\n6. Terminar con el registro y pasar al menú de votos");
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
                Metodos.borrarCandidato(listaCandidatos);
                break;
            case 5:
                Metodos.listarCandidato(listaCandidatos);
                break;
            case 6:
                Metodos.votar();
            default:
                break;
        }
    
    
}
}