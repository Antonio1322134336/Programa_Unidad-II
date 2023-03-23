

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {
    DefaultTableModel tabla = new DefaultTableModel();
    Conexion con = new Conexion();
     public Connection c = con.conectar();
    public Main() {
        initComponents();
        
        Conexion con = new Conexion();
        con.conectar();
        mostrarDatos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblLugar = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        btnRegEntrada = new javax.swing.JButton();
        btnRegSalida = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblId1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Lugar de ingreso", "Hora de Entrada ", "Hora de Salida", "Fecha "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        lblId.setText("Id:");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        lblLugar.setText("Lugar al que ingreso:");

        txtLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLugarKeyTyped(evt);
            }
        });

        btnRegEntrada.setText("Registrar Entrada");
        btnRegEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegEntradaMouseClicked(evt);
            }
        });
        btnRegEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEntradaActionPerformed(evt);
            }
        });

        btnRegSalida.setText("Registrar Salida ");
        btnRegSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegSalidaActionPerformed(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblId1.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(txtId)
                            .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblId1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnRegEntrada)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegSalida)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEntradaActionPerformed
        
        if(!txtId.getText().isEmpty() && !txtLugar.getText().isEmpty() && !txtNombre.getText().isEmpty()){
            if(txtId.getText().length() > 13){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar mas de 12 caracteres en el Id");
            limpiar();
        }else{
            guardarEntrada();
            limpiar();
        }
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
        mostrarDatos();
    }//GEN-LAST:event_btnRegEntradaActionPerformed

    private void btnRegSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegSalidaActionPerformed
        if(!txtId.getText().isEmpty() && !txtLugar.getText().isEmpty() && !txtNombre.getText().isEmpty()){
            if(txtId.getText().length() > 13){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar mas de 12 caracteres en el Id");
            limpiar();
        }else{
            guardarSalida();
            limpiar();
        }
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
        mostrarDatos();
    }//GEN-LAST:event_btnRegSalidaActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        if(txtId.getText().length()>=10){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar mas de 10 caracteres");
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>=50){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar mas de 50 caracteres");
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtLugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarKeyTyped
        if(txtLugar.getText().length()>=20){
            JOptionPane.showMessageDialog(null, "No se pueden ingresar mas de 20 caracteres");
            evt.consume();
        }
    }//GEN-LAST:event_txtLugarKeyTyped

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyPressed

    private void btnRegEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegEntradaMouseClicked
        
    }//GEN-LAST:event_btnRegEntradaMouseClicked

    public boolean guardarEntrada(){
        boolean insertado = false;
        int inserta = 0;
        con = new Conexion();
        Alumno al = new Alumno();
        
        al.setId(txtId.getText());
        al.setNombre(txtNombre.getText());
        al.setLugar(txtLugar.getText());
        al.setHoraEntrada(getHora());
        al.setHoraSalida(null);
        al.setFecha(getFecha());
        
        insertado = con.RegistrarEntrada(al);
        
        return insertado;
    }
    
     public boolean guardarSalida(){
        boolean insertado = false;
        int inserta = 0;
        con = new Conexion();
        Alumno al = new Alumno();
        
        
        al.setId(txtId.getText());
        al.setNombre(txtNombre.getText());
        al.setLugar(txtLugar.getText());
        al.setHoraEntrada(null);
        al.setHoraSalida(getHora());
        al.setFecha(getFecha());
        
        insertado = con.RegistrarEntrada(al);
        
        return insertado;
    }
     
    public void mostrarDatos(){
        Conexion con = new Conexion();
        String sql = "Select * from registros";
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Lugar de ingreso");
        tabla.addColumn("Hora de entrada");
        tabla.addColumn("Hora de salida");
        tabla.addColumn("Fecha");
        tblDatos.setModel(tabla);
        
        String []datos = new String[6];
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                tabla.addRow(datos);
            }
            tblDatos.setModel(tabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo mostrar" +e);
        }
    }
    
    public String getFecha(){
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
    
    public String getHora(){
        return new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
    }
    
    public void limpiar(){
        txtId.setText(null);
        txtLugar.setText(null);
        txtNombre.setText(null);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegEntrada;
    private javax.swing.JButton btnRegSalida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblLugar;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
