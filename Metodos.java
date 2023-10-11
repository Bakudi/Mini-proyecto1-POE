

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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


    public static void buscarNombreCandidato(ArrayList<Candidato> lista){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del candidato que desea consultar: ");
        String nomCandidato = scanner.nextLine();
        for(int i=0 ; i< lista.size(); i++){
            if(lista.get(i).getNombre() == nomCandidato){
                System.out.println("Nombre : " + lista.get(i).getNombre() + "\n");
                System.out.println("Cédula : " + lista.get(i).getCedula() + "\n");
                System.out.println("Origen : " + lista.get(i).getOrigen() + "\n");
                System.out.println("Candidato de : " + lista.get(i).isDerecha() + "\n");
                System.out.println("Partido político : " + lista.get(i).getPartidoc() + "\n");
                System.out.println("Promesas : " + lista.get(i).getPromesas() + "\n");
            }
        }
    }

  
	public static void borrarCandidato(ArrayList<Candidato> lista){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del candidato que deseas borrar: ");

        String borrar = scanner.nextLine();
        Iterator<Candidato> iterator = lista.iterator();
        while (iterator.hasNext()){
            Candidato objeto = iterator.next();
            if (objeto.getNombre().equals(borrar)) {
                iterator.remove();
                System.out.println("El candidato " + borrar + " ha sido eliminado de la lista.");
            }else{
                System.out.println("No existe ese candidato.");
            }
        }
    }


    public static void listarCandidato(ArrayList<Candidato> lista){
        System.out.println("Lista de candidatos mostrada en pantalla:\n");
        for(int i=0; i< lista.size(); i++){
            System.out.println("-----------------------------------------------------");
            System.out.println("Nombre: " + lista.get(i).nombre);
            System.out.println("Cédula: " + lista.get(i).cedula);
            System.out.println("Origen: " + lista.get(i).origen);
            System.out.println("¿Es de derecha?: " + lista.get(i).isDerecha());
            System.out.println("Partido politico: " + lista.get(i).getPartidoc());
            System.out.println("Promesas: " + lista.get(i).getPromesas());
            System.out.println("-----------------------------------------------------");
        }
    }

    public static void asignarVotos(ArrayList<Candidato> lista){
        Scanner scanner = new Scanner(System.in);
        int j = 0;
        System.out.println("Comienza la asignación de votos.\n");
        for(int i=0 ; i< lista.size(); i++){
            System.out.println("Ingrese la cantidad de votos del candidato " + lista.get(i).getNombre());
            j = scanner.nextInt();
            lista.get(i).setVotos(j);
            System.out.println(j + "votos para el candidato " + lista.get(i).getNombre() + "registrados.\n");
            j = 0;
        }
        
    }

    public static void contarVotos(ArrayList<Candidato> lista){
        ArrayList<Integer> todosVotos  = new ArrayList<>();
        for(int i=0; i< lista.size(); i++){
            todosVotos.add(lista.get(i).getVotos());
        }
        int numeroMayor = Collections.max(todosVotos);
        System.out.println("prueba"+numeroMayor);
        for(int i=0; i< lista.size(); i++){
            if(numeroMayor == lista.get(i).getVotos()){
                System.out.println("El gandor de las votaciones fue: " + lista.get(i).nombre+"\n");
                System.out.println("con numero de cedula: " + lista.get(i).cedula+"\n");
                System.out.println("Propuestas de " + lista.get(i).nombre +" : "+ lista.get(i).getPromesas()+"\n");
            }
        }
    }

    public static void cadidatoPartido(ArrayList<Candidato> lista) {
        // Usamos un mapa para contabilizar los candidatos por partido.
        Map<Partido, Integer> conteoPartidos = new HashMap<>();
    
        for (Candidato candidato : lista) {
            Partido partido = candidato.getPartidoc();
            conteoPartidos.put(partido, conteoPartidos.getOrDefault(partido, 0) + 1);
        }
    
        // Encontramos el partido con más candidatos inscritos.
        Partido partidoGanador = null;
        int maxCandidatos = 0;
    
        for (Map.Entry<Partido, Integer> entry : conteoPartidos.entrySet()) {
            if (entry.getValue() > maxCandidatos) {
                maxCandidatos = entry.getValue();
                partidoGanador = entry.getKey();
            }
        }
    
        if (partidoGanador != null) {
            System.out.println("El partido con más candidatos es: " + partidoGanador);
        } else {
            System.out.println("No se encontraron candidatos.");
        }
    }
    
    public static void top3Candidatos(ArrayList<Candidato> lista){
        // Mapa para realizar un seguimiento del recuento de candidatos por ciudad de origen
        Map<Ciudad, Integer> recuentoPorCiudad = new HashMap<>();

        
        for (Candidato candidato : lista) {
            Ciudad ciudadOrigen = candidato.getOrigen();
            recuentoPorCiudad.put(ciudadOrigen, recuentoPorCiudad.getOrDefault(ciudadOrigen, 0) + 1);
        }

        // Ordena las ciudades por el recuento de candidatos en orden ascendente
        List<Map.Entry<Ciudad, Integer>> listaOrdenada = new ArrayList<>(recuentoPorCiudad.entrySet());
        listaOrdenada.sort(Comparator.comparing(Map.Entry::getValue));

        
        List<Ciudad> top3CiudadesMenosCandidatos = new ArrayList<>();
        int numCiudades = listaOrdenada.size();
        for (int i = 0; i < Math.min(3, numCiudades); i++) {
            top3CiudadesMenosCandidatos.add(listaOrdenada.get(i).getKey());
        }

        System.out.println("Top 3 ciudades con menos candidatos:");
        int posicion = 1;
        for (Ciudad ciudad : top3CiudadesMenosCandidatos) {
            System.out.println("top " + posicion +"  "+ ciudad);
            posicion++;
        }
    }

}
