

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
import javax.swing.table.DefaultTableModel;

public class AsignacionCursoAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form AsignacionCursoAlumno
     */
    public AsignacionCursoAlumno() {
        initComponents();
        comboDBCursoAlumnos();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idasig = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonG1 = new BottonGuardar.buttonG();
        cmbCarnteAlumno = new javax.swing.JComboBox<>();
        cmbCodigoCarrera = new javax.swing.JComboBox<>();
        cmbCodigoJornada = new javax.swing.JComboBox<>();
        cmbCodigoCurso = new javax.swing.JComboBox<>();
        cmdCodigoSeccion = new javax.swing.JComboBox<>();
        cmbCodigoAula = new javax.swing.JComboBox<>();
        cmbCodigoSede = new javax.swing.JComboBox<>();
        lblNombreAlumno = new javax.swing.JLabel();
        lblCodigoCarrera = new javax.swing.JLabel();
        lblCodigoJornada = new javax.swing.JLabel();
        lblCodigoCurso = new javax.swing.JLabel();
        lblCodigoSeccion = new javax.swing.JLabel();
        lblCodigoAula = new javax.swing.JLabel();
        lblCodigoSede = new javax.swing.JLabel();
        limpiarbtn1 = new temaclaro.Limpiarbtn();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Asignación de Cursos Alumnos");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Código de la Sede:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Código de Sección:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Carnet del Alumno:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("ID Asignación");

        txt_idasig.setBackground(new java.awt.Color(227, 227, 227));
        txt_idasig.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Código de la Carrera:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Código de la Jornada:");
        jLabel2.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Código de Aula:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Código del Curso:");

        buttonG1.setText("buttonG1");
        buttonG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonG1MouseClicked(evt);
            }
        });

        cmbCarnteAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCarnteAlumnoActionPerformed(evt);
            }
        });

        cmbCodigoCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoCarreraActionPerformed(evt);
            }
        });

        cmbCodigoJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoJornadaActionPerformed(evt);
            }
        });

        cmbCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoCursoActionPerformed(evt);
            }
        });

        cmdCodigoSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCodigoSeccionActionPerformed(evt);
            }
        });

        cmbCodigoAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoAulaActionPerformed(evt);
            }
        });

        cmbCodigoSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoSedeActionPerformed(evt);
            }
        });

        lblNombreAlumno.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblCodigoCarrera.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblCodigoJornada.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblCodigoCurso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblCodigoSeccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblCodigoAula.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblCodigoSede.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        limpiarbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarbtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCodigoAula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbCodigoSede, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdCodigoSeccion, 0, 220, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbCarnteAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbCodigoJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbCodigoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_idasig, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCodigoJornada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCodigoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCodigoSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCodigoAula, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(lblCodigoSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(374, 374, 374)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(limpiarbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(555, 555, 555))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 357, Short.MAX_VALUE)
                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_idasig, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(limpiarbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCarnteAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCodigoJornada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(cmbCodigoJornada, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdCodigoSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoAula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoAula, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCodigoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonG1MouseClicked
        //Codigo que permite insertar registros en al base de datos
        if (cmbCodigoCarrera.getSelectedItem().toString() == "Seleccione una opción" || cmbCodigoSede.getSelectedItem().toString() == "Seleccione una opción" || cmbCodigoJornada.getSelectedItem().toString() == "Seleccione una opción" || cmdCodigoSeccion.getSelectedItem().toString() == "Seleccione una opción" || cmbCodigoAula.getSelectedItem().toString() == "Seleccione una opción" || cmbCodigoCurso.getSelectedItem().toString() == "Seleccione una opción" || cmbCarnteAlumno.getSelectedItem().toString() == "Seleccione una opción" || txt_idasig.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "NO SE PUEDE DEJAR CAMPOS VACIOS", "WARNING", JOptionPane.WARNING_MESSAGE);

            cmbCodigoCarrera.setSelectedIndex(0);
            cmbCodigoSede.setSelectedIndex(0);
            cmbCodigoJornada.setSelectedIndex(0);
            cmdCodigoSeccion.setSelectedIndex(0);
            cmbCodigoAula.setSelectedIndex(0);
            cmbCodigoCurso.setSelectedIndex(0);
            cmbCarnteAlumno.setSelectedIndex(0);
            lblCodigoCarrera.setText("");
            lblCodigoSede.setText("");
            lblCodigoJornada.setText("");
            lblCodigoSeccion.setText("");
            lblCodigoAula.setText("");
            lblCodigoCurso.setText("");
            lblNombreAlumno.setText("");
            txt_idasig.setText("");

        }
        String departamento = cmbCarnteAlumno.getSelectedItem().toString();
        if (departamento.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No selecciono ninguna opcion!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("insert into asignacioncursosalumnos values(?,?,?,?,?,?,?,?)");

                pst.setString(1, txt_idasig.getText().trim());
                pst.setString(2, lblCodigoCarrera.getText().trim());
                pst.setString(3, lblCodigoSede.getText().trim());
                pst.setString(4, lblCodigoJornada.getText().trim());
                pst.setString(5, lblCodigoSeccion.getText().trim());
                pst.setString(6, lblCodigoAula.getText().trim());
                pst.setString(7, lblCodigoCurso.getText().trim());
                pst.setString(8, cmbCarnteAlumno.getSelectedItem().toString());

                pst.executeUpdate();

                cmbCodigoCarrera.setSelectedIndex(0);
                cmbCodigoSede.setSelectedIndex(0);
                cmbCodigoJornada.setSelectedIndex(0);
                cmdCodigoSeccion.setSelectedIndex(0);
                cmbCodigoAula.setSelectedIndex(0);
                cmbCodigoCurso.setSelectedIndex(0);
                cmbCarnteAlumno.setSelectedIndex(0);
                lblCodigoCarrera.setText("");
                lblCodigoSede.setText("");
                lblCodigoJornada.setText("");
                lblCodigoSeccion.setText("");
                lblCodigoAula.setText("");
                lblCodigoCurso.setText("");
                lblNombreAlumno.setText("");
                txt_idasig.setText("");

                JOptionPane.showMessageDialog(this, "Registro exitoso.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "Error al registrar.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_buttonG1MouseClicked

    private void cmbCarnteAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCarnteAlumnoActionPerformed
//Nombre alumno de carnet
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select nombre_alumno from alumnos where carnet= ?");

            pst.setString(1, cmbCarnteAlumno.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lblNombreAlumno.setText(rs.getString("nombre_alumno"));
            } else {
                lblNombreAlumno.setText("");
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_cmbCarnteAlumnoActionPerformed

    private void cmbCodigoCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoCarreraActionPerformed
        // codico carrera de nombre carrera
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select  codigo_carrera from carreras where nombre_carrera= ?");

            pst.setString(1, cmbCodigoCarrera.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lblCodigoCarrera.setText(rs.getString("codigo_carrera"));
            } else {
                lblCodigoCarrera.setText("");
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_cmbCodigoCarreraActionPerformed

    private void cmbCodigoJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoJornadaActionPerformed
        // TODO add your handling code here:

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select  codigo_jornada from jornadas where nombre_jornada= ?");

            pst.setString(1, cmbCodigoJornada.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lblCodigoJornada.setText(rs.getString("codigo_jornada"));
            } else {
                lblCodigoJornada.setText("");
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_cmbCodigoJornadaActionPerformed

    private void cmbCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoCursoActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select  codigo_curso from cursos where nombre_curso= ?");

            pst.setString(1, cmbCodigoCurso.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lblCodigoCurso.setText(rs.getString("codigo_curso"));
            } else {
                lblCodigoCurso.setText("");
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_cmbCodigoCursoActionPerformed

    private void cmdCodigoSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCodigoSeccionActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select  codigo_seccion from secciones where nombre_seccion= ?");

            pst.setString(1, cmdCodigoSeccion.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lblCodigoSeccion.setText(rs.getString("codigo_seccion"));
            } else {
                lblCodigoSeccion.setText("");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmdCodigoSeccionActionPerformed

    private void cmbCodigoAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoAulaActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select  codigo_aula from aulas where nombre_aula= ?");

            pst.setString(1, cmbCodigoAula.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lblCodigoAula.setText(rs.getString("codigo_aula"));
            } else {
                lblCodigoAula.setText("");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbCodigoAulaActionPerformed

    private void cmbCodigoSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoSedeActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select  codigo_sede from sedes where nombre_sede= ?");

            pst.setString(1, cmbCodigoSede.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lblCodigoSede.setText(rs.getString("codigo_aula"));
            } else {
                lblCodigoSede.setText("");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbCodigoSedeActionPerformed

    private void limpiarbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarbtn1MouseClicked
        
        cmbCodigoCarrera.setSelectedIndex(0);
        cmbCodigoSede.setSelectedIndex(0);
        cmbCodigoJornada.setSelectedIndex(0);
        cmdCodigoSeccion.setSelectedIndex(0);
        cmbCodigoAula.setSelectedIndex(0);
        cmbCodigoCurso.setSelectedIndex(0);
        cmbCarnteAlumno.setSelectedIndex(0);
        lblCodigoCarrera.setText("");
        lblCodigoSede.setText("");
        lblCodigoJornada.setText("");
        lblCodigoSeccion.setText("");
        lblCodigoAula.setText("");
        lblCodigoCurso.setText("");
        lblNombreAlumno.setText("");
        txt_idasig.setText("");    
        
        comboDBCursoAlumnos();
        
    }//GEN-LAST:event_limpiarbtn1MouseClicked

    public void comboDBCursoAlumnos() {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");

            PreparedStatement pst = cn.prepareStatement("select nombre_carrera from carreras");
            ResultSet rs = pst.executeQuery();

            cmbCodigoCarrera.addItem("Seleccione una opción");
            while (rs.next()) {
                cmbCodigoCarrera.addItem(rs.getString("nombre_carrera"));
            }
            PreparedStatement pst1 = cn.prepareStatement("select nombre_sede from sedes");
            ResultSet rs1 = pst1.executeQuery();

            cmbCodigoSede.addItem("Seleccione una opción");
            while (rs1.next()) {
                cmbCodigoSede.addItem(rs.getString("nombre_sede"));
            }
            PreparedStatement pst2 = cn.prepareStatement("select nombre_jornada from jornadas");
            ResultSet rs2 = pst2.executeQuery();

            cmbCodigoJornada.addItem("Seleccione una opción");
            while (rs2.next()) {
                cmbCodigoJornada.addItem(rs.getString("nombre_jornada"));
            }
            PreparedStatement pst3 = cn.prepareStatement("select nombre_seccion from secciones");
            ResultSet rs3 = pst3.executeQuery();

            cmdCodigoSeccion.addItem("Seleccione una opción");
            while (rs3.next()) {
                cmdCodigoSeccion.addItem(rs.getString("nombre_seccion"));
            }
            PreparedStatement pst4 = cn.prepareStatement("select nombre_aula from aulas");
            ResultSet rs4 = pst4.executeQuery();

            cmbCodigoAula.addItem("Seleccione una opción");
            while (rs4.next()) {
                cmbCodigoAula.addItem(rs.getString("nombre_aula"));
            }
            PreparedStatement pst5 = cn.prepareStatement("select nombre_curso from cursos");
            ResultSet rs5 = pst5.executeQuery();

            cmbCodigoCurso.addItem("Seleccione una opción");
            while (rs5.next()) {
                cmbCodigoCurso.addItem(rs.getString("nombre_curso"));
            }
            PreparedStatement pst6 = cn.prepareStatement("select carnet_alumno from alumnos");
            ResultSet rs6 = pst6.executeQuery();

            cmbCarnteAlumno.addItem("Seleccione una opción");
            while (rs6.next()) {
                cmbCarnteAlumno.addItem(rs.getString("carnet_alumno"));
            }

        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BottonGuardar.buttonG buttonG1;
    private javax.swing.JComboBox<String> cmbCarnteAlumno;
    private javax.swing.JComboBox<String> cmbCodigoAula;
    private javax.swing.JComboBox<String> cmbCodigoCarrera;
    private javax.swing.JComboBox<String> cmbCodigoCurso;
    private javax.swing.JComboBox<String> cmbCodigoJornada;
    private javax.swing.JComboBox<String> cmbCodigoSede;
    private javax.swing.JComboBox<String> cmdCodigoSeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    private javax.swing.JLabel lblCodigoAula;
    private javax.swing.JLabel lblCodigoCarrera;
    private javax.swing.JLabel lblCodigoCurso;
    private javax.swing.JLabel lblCodigoJornada;
    private javax.swing.JLabel lblCodigoSeccion;
    private javax.swing.JLabel lblCodigoSede;
    private javax.swing.JLabel lblNombreAlumno;
    private temaclaro.Limpiarbtn limpiarbtn1;
    private javax.swing.JTextField txt_idasig;
    // End of variables declaration//GEN-END:variables
}
