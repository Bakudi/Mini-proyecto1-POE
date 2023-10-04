import java.util.ArrayList;
import java.util.Collections;
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

    public static void contarVotos(ArrayList<Candidato> lista){
        for(int i=0; i< lista.size(); i++){
            ArrayList<Integer> todosVotos  = new ArrayList<>();
            todosVotos.add(lista.get(i).getVotos());
            int numeroMayor = Collections.max(todosVotos);
            int j = 0;
            while(numeroMayor == lista.get(j).getVotos()){
                 System.out.println("El gandor de las votaciones fue: " + lista.get(j).nombre+"\n");
                 System.out.println("con numero de cedula: " + lista.get(j).cedula+"\n");
                 j++;
            }
        }
    }

}

