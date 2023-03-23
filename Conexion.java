
import java.beans.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Conexion {
    
    public static Connection con;
    public ResultSet rs;
    public PreparedStatement ps;
    
    public Connection conectar(){
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegistroPoo", "root", "");
            //JOptionPane.showMessageDialog(null, "Se conecto");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"No se pudo conectar" + e);
            
        }
        return con;
    }
    
    public boolean RegistrarEntrada(Alumno al){
        boolean guardado = false;
        String sql = "insert into registros (Id, Nombre, Lugar, HoraEntrada, HoraSalida, Fecha) values (?,?,?,?,?,?)";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, al.getId());
            ps.setString(2, al.getNombre());
            ps.setString(3, al.getLugar());
            ps.setString(4, al.getHoraEntrada());
            ps.setString(5, al.getHoraSalida());
            ps.setString(6, al.getFecha());
            guardado = ps.execute();
            
            if(guardado != true){
                JOptionPane.showMessageDialog(null, "Se guardo el registro exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo guardar el registro");
                conectar().close();
                ps.close();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Huno un error al guardar "+ e);
        }
        
        return guardado;
    }
   

}
