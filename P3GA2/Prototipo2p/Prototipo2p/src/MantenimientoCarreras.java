/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class MantenimientoCarreras extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoCarreras
     */
    public MantenimientoCarreras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_codigocarrera = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_codigofac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_estadocarrera = new javax.swing.JTextField();
        buttonPrueba1 = new buttonPrueba.buttonPrueba();
        txt_nombrecarrera = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();
        buttonG1 = new BottonGuardar.buttonG();
        buttonEliminar1 = new BottonEliminar.buttonEliminar();
        buttonEditar1 = new BottonEditar.buttonEditar();

        jLabel6.setText("jLabel6");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_buscar.setBackground(new java.awt.Color(227, 227, 227));
        txt_buscar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Código de la Carrera:");

        txt_codigocarrera.setBackground(new java.awt.Color(227, 227, 227));
        txt_codigocarrera.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_codigocarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigocarreraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de la Carrera:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Código de Facultad:");

        txt_codigofac.setBackground(new java.awt.Color(227, 227, 227));
        txt_codigofac.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Estado de la Carrera:");

        txt_estadocarrera.setBackground(new java.awt.Color(227, 227, 227));
        txt_estadocarrera.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        buttonPrueba1.setText("buttonPrueba1");
        buttonPrueba1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPrueba1MouseClicked(evt);
            }
        });

        txt_nombrecarrera.setBackground(new java.awt.Color(227, 227, 227));
        txt_nombrecarrera.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        buttonG1.setText("buttonG1");
        buttonG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonG1MouseClicked(evt);
            }
        });

        buttonEliminar1.setText("buttonEliminar1");
        buttonEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEliminar1MouseClicked(evt);
            }
        });

        buttonEditar1.setText("buttonEditar1");
        buttonEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_codigocarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txt_nombrecarrera)
                            .addComponent(txt_codigofac)
                            .addComponent(txt_estadocarrera)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(191, 191, 191))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(buttonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigocarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombrecarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txt_codigofac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_estadocarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigocarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigocarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigocarreraActionPerformed

    private void buttonPrueba1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPrueba1MouseClicked
  //Codigo que permite consultar registros en la base de datos
        if ( txt_buscar.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR EL CAMPO VACIO");

            txt_buscar.setText("");
            
        }else{
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select * from carreras where codigo_carrera = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txt_codigocarrera.setText(rs.getString("codigo_carrera"));
                txt_nombrecarrera.setText(rs.getString("nombre_carrera"));
                txt_codigofac.setText(rs.getString("codigo_facultad"));
                txt_estadocarrera.setText(rs.getString("estatus_carrera"));
            } else {
                JOptionPane.showMessageDialog(null, "CARRERA no registrado.");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al buscar");
        }
      }
    }//GEN-LAST:event_buttonPrueba1MouseClicked

    private void buttonEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminar1MouseClicked
      //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("delete from carreras where codigo_carrera = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_codigocarrera.setText("");
            txt_nombrecarrera.setText("");
            txt_codigofac.setText("");
            txt_estadocarrera.setText("");

            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
            label_status.setText("Error al eliminar");
        }

    }//GEN-LAST:event_buttonEliminar1MouseClicked

    private void buttonEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditar1MouseClicked
    //Codigo que permite actualizar registros en la base de datos
        if ( txt_codigocarrera.getText().isEmpty() || txt_nombrecarrera.getText().isEmpty() || txt_codigofac.getText().isEmpty() || txt_estadocarrera.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR CAMPOS VACIOS");

            txt_codigocarrera.setText("");
            txt_nombrecarrera.setText("");
            txt_codigofac.setText("");
            txt_estadocarrera.setText("");
            
        }else{
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("update carreras set codigo_carrera = ?, nombre_carrera=?, codigo_facultad=?,estatus_carrera=?  where codigo_carrera = " + ID);

            pst.setString(1, txt_codigocarrera.getText().trim());
            pst.setString(2, txt_nombrecarrera.getText().trim());
            pst.setString(3, txt_codigofac.getText().trim());
            pst.setString(4, txt_estadocarrera.getText().trim());
            pst.executeUpdate();

            txt_codigocarrera.setText("");
            txt_nombrecarrera.setText("");
            txt_codigofac.setText("");
            txt_estadocarrera.getText().trim();
            label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
            label_status.setText("Error al modificar");
        }
      }

    }//GEN-LAST:event_buttonEditar1MouseClicked

    private void buttonG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonG1MouseClicked
     //Codigo que permite insertar registros en al base de datos
        if ( txt_codigocarrera.getText().isEmpty() || txt_nombrecarrera.getText().isEmpty() || txt_codigofac.getText().isEmpty() || txt_estadocarrera.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR CAMPOS VACIOS");

            txt_codigocarrera.setText("");
            txt_nombrecarrera.setText("");
            txt_codigofac.setText("");
            txt_estadocarrera.setText("");
            
        }else{
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("insert into carreras values(?,?,?,?)");

            pst.setString(1, txt_codigocarrera.getText().trim());
            pst.setString(2, txt_nombrecarrera.getText().trim());
            pst.setString(3, txt_codigofac.getText().trim());
            pst.setString(4, txt_estadocarrera.getText().trim());
            pst.executeUpdate();

            txt_codigocarrera.setText("");
            txt_nombrecarrera.setText("");
            txt_codigofac.setText("");
            txt_estadocarrera.setText("");
            label_status.setText("Registro exitoso.");
        }catch (Exception e){
            label_status.setText("Error al registrar");
        }
      }

    }//GEN-LAST:event_buttonG1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BottonEditar.buttonEditar buttonEditar1;
    private BottonEliminar.buttonEliminar buttonEliminar1;
    private BottonGuardar.buttonG buttonG1;
    private buttonPrueba.buttonPrueba buttonPrueba1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigocarrera;
    private javax.swing.JTextField txt_codigofac;
    private javax.swing.JTextField txt_estadocarrera;
    private javax.swing.JTextField txt_nombrecarrera;
    // End of variables declaration//GEN-END:variables
}
