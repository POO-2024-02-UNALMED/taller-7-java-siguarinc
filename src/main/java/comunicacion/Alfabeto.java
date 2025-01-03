package comunicacion;
public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto (String origen,String[] letras, String interpretacion){
        super(origen);
        this.letras= letras;
        this.interpretacion=interpretacion;
    }
    
    public String[] getLetras() {
        return letras;
    }
    
    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    
    public String getInterpretacion() {
        return interpretacion;
    }
    
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int cantidadLetras(){
        return letras.length;
    }
    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString() {
        int c=1;
        String n=null;
        while (c!=(letras.length-1)){
            n+=letras[c-1]+", ";
            c+=1;
        }if(c==letras.length){
            n+=letras[c-1];
            c+=1;
        }
        return n;
    }
    
}
