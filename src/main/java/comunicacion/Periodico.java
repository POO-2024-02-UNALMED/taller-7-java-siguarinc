package comunicacion;

public class Periodico extends Escrito {
    private String fecha;
    private String primaria;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primaria, String interpretacion) {
        super(origen, titulo, autor,paginas);
        this.fecha = fecha;
        this.primaria = primaria;
        this.interpretacion = interpretacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimaria() {
        return primaria;
    }

    public void setPrimaria(String primaria) {
        this.primaria = primaria;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int par){
        int fac=10;
        return ((this.getPaginas()*fac)*par);
    }
    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString() {
        return getOrigen() + "\n" +getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + fecha+ "\n" +primaria;
    }

}

