public enum Partido {
    LIBERAL,CONSERVADOR,CAMBIORADICAL,ALIANZAVERDE,AICO,ASI,DELAU
,POLO,UP,CENTRODEMOCRATICO,MAIS,COMUNES,COLOMBIAJUSTA,RENACIENTE
,ALIANZADEMOCRATICA,DIGNIDADYCOMPROMISO,COLOMBIAHUMANA,NUEVOLIBERALISMO
,SALVACIONNACIONAL,VERDEOXIGENO,COMUNISTA,LIGA,DEMOCRATA,LAFUERZADELAPAZ
,FUERZACIUDADANA,ENMARCHA,FUERZADEMOCRATICA,ESPERANZADEMOCRATICA,INDEPENDIENTES
,TODOSSOMOSCOLOMBIA,CREEMOS,GENTEENMOVIMIENTO,PTC;

    public static Partido obtenerpartido(String nombrepartido) {
        for (Partido partido : Partido.values()) {
            if (partido.name().equalsIgnoreCase(nombrepartido)) {
                return partido;}}
                return null;}

}
