import java.lang.reflect.InvocationTargetException;
import java.sql.*;

// TODO: Corrige las XXXX, puntos y comas, throws e importaciones faltantes
public class Test3 {

    public static void main(String[] args) {
        String driver ="com.mysql.cj.jdbc.Driver"; // TODO: Coloca la cadena del Driver de MySQL

        try {
            Class.forName(driver).getConstructor().newInstance();
            System.out.println("Driver cargado exitosamente");
        } catch (InstantiationException e) {
            System.out.println("Ha ocurrido un error: "+e);//throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            System.out.println("Ha ocurrido un error: "+e);//throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            System.out.println("Ha ocurrido un error: "+e);//throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            System.out.println("Ha ocurrido un error: "+e);//throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Ha ocurrido un error: "+e);//throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "tienda";
        String user = "root";
        String password = "password";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url+dbName,user,password);
            System.out.println("Conectado a la BD exitosamente");

            String sql = "SELECT NOW() as Fecha";
            // TODO: Crea una instancia de PreparedStatement llamada `stament`
            // NOTA: Usa la conexión `conn` para crearla y el query `sql`
            PreparedStatement stament=conn.prepareStatement(sql);

            ResultSet resultSet = stament.executeQuery();

            resultSet.next();

            String fecha = resultSet.getString(1);

            System.out.printf("La fecha es: %s\n", fecha);

            conn.close();
            System.out.println("La base de datos ha sido cerrada exitosamente");

        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al crear la conexión: "+e);
            //throw new RuntimeException(e);
        }


    }//main

}//class