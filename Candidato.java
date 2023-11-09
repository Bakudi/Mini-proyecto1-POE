
public class Candidato extends Ciudadano {
    

    private boolean derecha;
    private Partido partidoc;
    private String promesas;


    private int votos;
    

    public Candidato(String nombre, int cedula, Ciudad origen, boolean derecha, Partido partidoc,
			String promesas, int votos) {
		super(nombre, cedula, origen);
		this.derecha = derecha;
		this.partidoc = partidoc;
		this.promesas = promesas;

	}

	public boolean isDerecha() {
        return derecha;
    }

    public Partido getPartidoc() {
        return partidoc;
    }

    public String getPromesas() {
        return promesas;
    }

    public void setDerecha(boolean derecha) {
        this.derecha = derecha;
    }

    public void setPartidoc(Partido partidoc) {
        this.partidoc = partidoc;
    }

    public void setPromesas(String promesas) {
        this.promesas = promesas;
    }


      
    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }


      

    }

