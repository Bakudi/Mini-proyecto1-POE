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
