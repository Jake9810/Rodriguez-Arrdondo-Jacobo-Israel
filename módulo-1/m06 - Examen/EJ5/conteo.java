package EJ5;

public class conteo {
    private int conteo;
    private String nombre;

    public conteo(int cnt, String name){
        this.conteo=cnt;
        this.nombre=name;
    }
    public void incrementar(){
        this.conteo+=1;
    }
    public void decrementar(){
        this.conteo-=1;
    }
    public int getConteo(){
        int n=this.conteo;
        return n;
    }
    public String getNombre(){
        String na=this.nombre;
        return na;
    }
}
