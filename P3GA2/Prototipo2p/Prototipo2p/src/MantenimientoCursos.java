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
public class MantenimientoCursos extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoCursos
     */
    public MantenimientoCursos() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_codcurso = new javax.swing.JTextField();
        txt_nombrecurso = new javax.swing.JTextField();
        txt_estadocurso = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonPrueba1 = new buttonPrueba.buttonPrueba();
        label_status = new javax.swing.JLabel();
        buttonG1 = new BottonGuardar.buttonG();
        buttonEditar1 = new BottonEditar.buttonEditar();
        buttonEliminar1 = new BottonEliminar.buttonEliminar();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento cursos");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE CURSO:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("ESTADO CURSO:");

        txt_codcurso.setBackground(new java.awt.Color(227, 227, 227));
        txt_codcurso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_codcurso.setSelectionColor(new java.awt.Color(204, 204, 204));
        txt_codcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codcursoActionPerformed(evt);
            }
        });

        txt_nombrecurso.setBackground(new java.awt.Color(227, 227, 227));
        txt_nombrecurso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_estadocurso.setBackground(new java.awt.Color(227, 227, 227));
        txt_estadocurso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_estadocurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estadocursoActionPerformed(evt);
            }
        });

        txt_buscar.setBackground(new java.awt.Color(227, 227, 227));
        txt_buscar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("CODIGO CURSO:");

        buttonPrueba1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPrueba1MouseClicked(evt);
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_estadocurso, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txt_nombrecurso)
                                    .addComponent(txt_codcurso)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(buttonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonPrueba1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombrecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_estadocurso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPrueba1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPrueba1MouseClicked
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select * from cursos where codigo_curso = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txt_codcurso.setText(rs.getString("codigo_curso"));
                txt_nombrecurso.setText(rs.getString("nombre_curso"));
                txt_estadocurso.setText(rs.getString("estatus_curso"));
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no registrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_buttonPrueba1MouseClicked

    private void txt_estadocursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estadocursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estadocursoActionPerformed

    private void txt_codcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codcursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codcursoActionPerformed

    private void buttonG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonG1MouseClicked
       //Codigo que permite actualizar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("update cursos set codigo_curso = ?, nombre_curso=?, estatus_curso=?  where codigo_curso = " + ID);

            pst.setString(1, txt_codcurso.getText().trim());
            pst.setString(2, txt_nombrecurso.getText().trim());
            pst.setString(3, txt_estadocurso.getText().trim());
            pst.executeUpdate();

            txt_codcurso.setText("");
            txt_nombrecurso.setText("");
            txt_estadocurso.setText("");
            label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
                                          
    }//GEN-LAST:event_buttonG1MouseClicked

    private void buttonEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditar1MouseClicked
    //Codigo que permite actualizar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("update cursos set codigo_curso = ?, nombre_curso=?, estatus_curso=?  where codigo_curso = " + ID);

            pst.setString(1, txt_codcurso.getText().trim());
            pst.setString(2, txt_nombrecurso.getText().trim());
            pst.setString(3, txt_estadocurso.getText().trim());
            pst.executeUpdate();

            txt_codcurso.setText("");
            txt_nombrecurso.setText("");
            txt_estadocurso.setText("");
            label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_buttonEditar1MouseClicked

    private void buttonEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminar1MouseClicked
   //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("delete from cursos where codigo_curso = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_codcurso.setText("");
            txt_nombrecurso.setText("");
            txt_estadocurso.setText("");

            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_buttonEliminar1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BottonEditar.buttonEditar buttonEditar1;
    private BottonEliminar.buttonEliminar buttonEliminar1;
    private BottonGuardar.buttonG buttonG1;
    private buttonPrueba.buttonPrueba buttonPrueba1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codcurso;
    private javax.swing.JTextField txt_estadocurso;
    private javax.swing.JTextField txt_nombrecurso;
    // End of variables declaration//GEN-END:variables
}
