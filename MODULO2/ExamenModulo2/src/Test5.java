import java.io.*;
    public class Test5 {
        public static void main(String[] args) {
            try {
                InputStream inputStream = new FileInputStream("D:\\docs\\teoria de la informacion\\maquina_de_estados.doc");
                OutputStream outputStream = new FileOutputStream("D:\\docs\\DIPLIMADOS\\JAVA\\MODULO 2\\ExamenModulo2\\cpi_maquina_de_estados.doc");
                byte[] bytes = inputStream.readAllBytes();

                for(int i=bytes.length-1; i>=0; i--)
                {
                    outputStream.write(bytes[i]);
                }
                inputStream.close();
                outputStream.close();
                System.out.println("El archivo se ha copiado correctamente");
            }catch (FileNotFoundException e){
                System.out.println("Ha ocurrido un error: "+e);
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error: "+e);
            }
        }
    }
