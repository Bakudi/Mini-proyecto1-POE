import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Metodos {

    public static void agregarCandidato(ArrayList<Candidato> lista){
        Candidato p = null;
        System.out.println("A continuacion agregue la informacion del candidato en el orden indicado");
        Scanner teclado = new Scanner(System.in);

        System.out.println("inserte el nombre del candidato: ");
        var nombre = teclado.next();
        System.out.println("inserte la cedula del candidato");
        var cedula = teclado.nextInt();
        Ciudad origen = null;
        while(origen == null){
            System.out.println("inserte el origen del candidato (solo ciudades del valle del cauca)");
            var nombreCiudad = teclado.next();
            origen = Ciudad.obtenerCiudad(nombreCiudad);
            if(origen == null){
                System.out.println("ciudad invalida, intentelo de nuevo");
            }
        }
        System.out.println("¿ es el candidato de derecha? inserte true en caso de que si, y false en caso de que no");
        var derecha = teclado.nextBoolean();

        Partido partido = null;
        while(partido == null){
        System.out.println("inserte el partido del candidato(solo partidos validos en colombia)");
        var nombrepartido = teclado.next();
        partido = Partido.obtenerpartido(nombrepartido);
        if(partido == null){
            System.out.println("partido invalido, intentelo de nuevo"); }}

        System.out.println("inserte las ment... promesas del candidato");
        var promesas = teclado.next();
        var votos = 0;
        p = new Candidato(nombre,cedula,origen,derecha,partido, promesas, votos);
        lista.add(p);
    }

    public static void mostrarListaCandidatos(ArrayList<Candidato> lista) {
        System.out.println("Lista de candidatos:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + 1 + ". " + lista.get(i).getNombre()); // Muestra el nombre del candidato
        }
    }

    public static void actualizarCandidato(ArrayList<Candidato> lista){
        Scanner teclado = new Scanner(System.in);
        if(lista.isEmpty()){
            System.out.println("no hay candidatos para editar");
            return;
        }
        
        System.out.println("seleccione el numero del candidato que desea editar");
        mostrarListaCandidatos(lista);
        var indice = teclado.nextInt();

        if(indice < 1 || indice > lista.size()){
           System.out.println("numero de candidato no valido");
           return; 
        }

        Candidato candidato = lista.get(indice-1);

        System.out.println("¿que atributo desea actualizar? (escriba la palabra)");
        String atributo = teclado.next();

        switch (atributo) {
            case "nombre":
                System.out.println("inserte el nuevo nombre");
                String nuevonombre = teclado.next();
                candidato.setNombre(nuevonombre);
                break;
            case "cedula":
                System.out.println("inserte la nuevo cedula");
                int nuevacedula = teclado.nextInt();
                candidato.setCedula(nuevacedula);
                break;
            case "ciudad":
              System.out.println("inserte la nueva ciudad de origen");
              String nuevaciudad = teclado.next();
              Ciudad ciudadenum = Ciudad.obtenerCiudad(nuevaciudad);

              if(ciudadenum != null){
                candidato.setOrigen(ciudadenum);
              }else{
                System.out.println("ciudad no valida, intentelo de nuevo");
              }
                break;
            case "derecha":
                System.out.println("inserte si el candidato es de derecha (true = si, false = no)");
                boolean nuevoderecha = teclado.nextBoolean();
                candidato.setDerecha(nuevoderecha);
                break;
            case "partido":
                System.out.println("inserte el nuevo nombre");
                String nuevopartido = teclado.next();
                Partido partidoenum = Partido.obtenerpartido(nuevopartido);

                if(partidoenum != null){
                    candidato.setPartidoc(partidoenum);
                }else{
                    System.out.println("partido invalido, intentelo de nuevo");}
                break;
            case "promesas":
                System.out.println("inserte las nuevas ment... promesas del candidato");
                String nuevaspromesas = teclado.next();
                candidato.setPromesas(nuevaspromesas);
                break; 
        
            default:
            System.out.println("opcion invalida, intentelo de nuevo");
                break;
        }

    }


  

  
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

