
public enum Partido {
    liberal,conservador,cambioradical,alianzaverde,aico,asi,delau
    ,polo,up,centrodemocratico,mais,comunes,colombiajusta,renaciente
    ,AlianzaDemocratica,DignidadyCompromiso,ColombiaHumana,NuevoLiberalismo
    ,salvacionnacional,verdeoxigeno,comunista,liga,democrata,lafuerzadelapaz
    ,fuerzaciudadana,enmarcha,fuerzademocratica,esperanzademocratica,independientes
    ,todossomoscolombia,creemos,genteenmovimiento,ptc;

    public static Partido obtenerpartido(String nombrepartido) {
        for (Partido partido : Partido.values()) {
            if (partido.name().equalsIgnoreCase(nombrepartido)) {
                return partido;}}
                return null;}

}

public enum Partido {
    Liberal,Conservador,CambioRadical,AlianzaVerde,AICO,ASI,DeLaU
    ,Polo,UP,CentroDemocratico,MAIS,Comunes,ColombiaJusta,Renaciente
    ,AlianzaDemocratica,DignidadyCompromiso,ColombiaHumana,NuevoLiberalismo
    ,SalvacionNacional,VerdeOxigeno,Comunista,LIGA,Democrata,LaFuerzaDeLaPaz
    ,FuerzaCiudadana,EnMarcha,FuerzaDemocratica,EsperanzaDemocratica,Independientes
    ,TodosSomosColombia,Creemos,GenteEnMovimiento,PTC;

    public static Partido obtenerpartido(String nombrepartido) {
        for (Partido partido : Partido.values()) {
            if (partido.name().equalsIgnoreCase(nombrepartido)) {
                return partido;}}
                return null;}

}

