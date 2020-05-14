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
public class MantenimientoSedes extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoSedes
     */
    public MantenimientoSedes() {
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

        jPanel1 = new javax.swing.JPanel();
        label_status = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        buttonPrueba1 = new buttonPrueba.buttonPrueba();
        jLabel1 = new javax.swing.JLabel();
        txt_codigosede = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombresede = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_estadosede = new javax.swing.JTextField();
        buttonG1 = new BottonGuardar.buttonG();
        buttonEditar1 = new BottonEditar.buttonEditar();
        buttonEliminar1 = new BottonEliminar.buttonEliminar();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento de Sedes");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_buscar.setBackground(new java.awt.Color(227, 227, 227));
        txt_buscar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        buttonPrueba1.setText("buttonPrueba1");
        buttonPrueba1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPrueba1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Código de la Sede:");

        txt_codigosede.setBackground(new java.awt.Color(227, 227, 227));
        txt_codigosede.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_codigosede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigosedeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de la Sede:");

        txt_nombresede.setBackground(new java.awt.Color(227, 227, 227));
        txt_nombresede.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_nombresede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresedeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Esatdo de la Sede:");

        txt_estadosede.setBackground(new java.awt.Color(227, 227, 227));
        txt_estadosede.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_estadosede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estadosedeActionPerformed(evt);
            }
        });

        buttonG1.setText("buttonG1");
        buttonG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonG1MouseClicked(evt);
            }
        });

        buttonEditar1.setText("buttonEditar1");
        buttonEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditar1MouseClicked(evt);
            }
        });

        buttonEliminar1.setText("buttonEliminar1");
        buttonEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEliminar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_codigosede, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txt_nombresede)
                            .addComponent(txt_estadosede)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(buttonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_codigosede, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombresede, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_estadosede, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigosedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigosedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigosedeActionPerformed

    private void txt_nombresedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresedeActionPerformed

    private void txt_estadosedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estadosedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estadosedeActionPerformed

    private void buttonPrueba1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPrueba1MouseClicked
   //Codigo que permite consultar registros en la base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select * from sedes where codigo_sede = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txt_codigosede.setText(rs.getString("codigo_sede"));
                txt_nombresede.setText(rs.getString("nombre_sede"));
                txt_estadosede.setText(rs.getString("estatus_sede"));
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no registrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_buttonPrueba1MouseClicked

    private void buttonEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminar1MouseClicked
   //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("delete from sedes where codigo_sede = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_codigosede.setText("");
            txt_nombresede.setText("");
            txt_estadosede.setText("");

            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_buttonEliminar1MouseClicked

    private void buttonEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditar1MouseClicked
  //Codigo que permite actualizar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("update sedes set codigo_sede = ?, nombre_sede=?, estatus_sede=?  where codigo_sede = " + ID);

            pst.setString(1, txt_codigosede.getText().trim());
            pst.setString(2, txt_nombresede.getText().trim());
            pst.setString(3, txt_estadosede.getText().trim());
            pst.executeUpdate();

            txt_codigosede.setText("");
            txt_nombresede.setText("");
            txt_estadosede.setText("");
            label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_buttonEditar1MouseClicked

    private void buttonG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonG1MouseClicked
    //Codigo que permite insertar registros en al base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("insert into sedes values(?,?,?)");

            pst.setString(1, txt_codigosede.getText().trim());
            pst.setString(2, txt_nombresede.getText().trim());
            pst.setString(3, txt_estadosede.getText().trim());
            pst.executeUpdate();

            txt_codigosede.setText("");
            txt_nombresede.setText("");
            txt_estadosede.setText("");
            label_status.setText("Registro exitoso.");
        }catch (Exception e){

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigosede;
    private javax.swing.JTextField txt_estadosede;
    private javax.swing.JTextField txt_nombresede;
    // End of variables declaration//GEN-END:variables
}
