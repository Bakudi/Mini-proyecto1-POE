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
