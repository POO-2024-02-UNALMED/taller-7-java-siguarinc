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
        String n=letras[0]+", ";
        while (c+1!=letras.length){
            n+=letras[c]+", ";
            c+=1;
        }if(c+1==letras.length){
            n+=letras[c];
            c+=1;
        }
        return n;
    }
    
}
