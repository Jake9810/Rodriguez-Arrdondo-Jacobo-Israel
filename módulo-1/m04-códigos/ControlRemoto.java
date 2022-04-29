package ControlRemoto;

/*
Jacobo Rodriguez
 */
public class ControlRemoto {
    static boolean encendido;
    static int volumen;
    static int canal;
    
    public ControlRemoto(){
        this.encendido=false;
        this.volumen=50;
        this.canal=1;
    }
     public void encender(){
         if(this.encendido==true)
         {
             System.out.printf("el control ya esta encendido\n");
         }
         else
         {
             this.encendido=true;
             System.out.printf("Control Encendido: %s\n",this.encendido);
         }
    }
     public void apagar(){
         if(this.encendido==false)
         {
             System.out.printf("El control ya esta apagado\n");
         }
         else
         {
             this.encendido=false;
             System.out.printf("Control Encendido: %s\n",this.encendido);
         }
     }
     public void SubirVolumen(){
         if(this.volumen>=100)
         {
             System.out.printf("MAX VOLUMEN\n");
             this.volumen=100;
         }
         else{
             this.volumen+=1;
             System.out.printf("Volumen: %d\n",this.volumen);
         }
     }
     public void BajarVolumen(){
         if(this.volumen<=0){
             System.out.printf("MIN VOLUMEN\n");
             this.volumen=0;
         }
         else{
             this.volumen-=1;
             System.out.printf("Volumen: %d\n",this.volumen);
         }
     }
     public void SigCanal(){
         if(this.canal>=255){
             this.canal=1;
             System.out.printf("Canal: %d\n",this.canal);
         }
         else{
             this.canal+=1;
             System.out.printf("Canal: %d\n",this.canal);
         }
     }
     public void RegCanal(){
         if(this.canal<=0){
             this.canal=255;
             System.out.printf("Canal: %d\n",this.canal);
         }
         else{
             this.canal-=1;
             System.out.printf("Canal: %d\n",this.canal);
         }
    }
}
