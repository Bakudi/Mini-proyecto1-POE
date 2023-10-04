public enum Ciudad {
    andalucia,bugalagrande,elcerrito,ginebra,guacari,buga,riofrio,trujillo,calima,restrepo,sanpedro,tulua,yotoco,elaguila,
    alcala,ansermanuevo,argelia,elcairo,launion,lavictoria,ulloa,bolivar,cartago,eldovio,obando,roldanillo,toro,versalles,
    zarzal,buenaventura,caicedonia,sevilla,cali,candelaria,palmira,daguaflorida,jamundi,lacumbre,pradera,vijes,yumbo;

    public static Ciudad obtenerCiudad(String nombreCiudad) {
        for (Ciudad ciudad : Ciudad.values()) {
            if (ciudad.name().equalsIgnoreCase(nombreCiudad)) {
                return ciudad;}}
                return null;}
}