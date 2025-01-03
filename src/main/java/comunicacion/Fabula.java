package comunicacion;
public class Fabula extends Escrito {
    private String ensenanzas;
    private String interpretacion;
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion){
        super(origen, titulo, autor,paginas);
        this.ensenanzas = ensenanzas; 
        this.interpretacion = interpretacion;
    }    
    public String getEnsenanza() {
        return ensenanzas;
    }
    
    public void setEnsenanza(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }
    
    public String getInterpretacion() {
        return interpretacion;
    }
    
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int par){
        int fac=1;
        return ((this.getPaginas()*fac)*par);
    }
    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString() {
        return getOrigen() + "\n" +getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + ensenanzas;
    }

}