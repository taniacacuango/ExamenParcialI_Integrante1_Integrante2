/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author HP
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        jLabel1 = new javax.swing.JLabel();
        lblTexto4 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblTexto6 = new javax.swing.JLabel();
        txtAnioPublicacion = new javax.swing.JTextField();
        lblTexto5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblTexto7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblTexto2 = new javax.swing.JLabel();
        txtBibliografia = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblTexto8 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        lblTexto9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTexto1 = new javax.swing.JLabel();
        txtNombreAutor = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        lblTexto3 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblTexto10 = new javax.swing.JLabel();
        lblTexto11 = new javax.swing.JLabel();
        txtBiografia = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText(" LIBROS");

        lblTexto4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto4.setText("Título");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        lblTexto6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto6.setText("Autor ");

        txtAnioPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioPublicacionActionPerformed(evt);
            }
        });

        lblTexto5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto5.setText("Código");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        lblTexto7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto7.setText("Año de publicación");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        lblTexto2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto2.setText("Apellido autor ");

        txtBibliografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBibliografiaActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(102, 153, 255));
        btnAgregar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar libro");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblTexto8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto8.setText("Bibliografía");

        txtEditorial.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialActionPerformed(evt);
            }
        });

        lblTexto9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto9.setText("Editorial");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("AUTOR");

        lblTexto1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto1.setText("Nombre autor");

        txtNombreAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAutorActionPerformed(evt);
            }
        });

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        lblTexto3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto3.setText("Nacionalidad");

        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre Autor", "Apellido Autor", "Nacionalidad", "Biografía", "Edad", "Título", "Código", "Autor", "Año de publicación", "Bibliografía", "Editorial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblTexto10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto10.setText("Biografía");

        lblTexto11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTexto11.setText("Edad");

        txtBiografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBiografiaActionPerformed(evt);
            }
        });

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(173, 173, 173))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTexto2)
                    .addComponent(lblTexto3)
                    .addComponent(lblTexto1)
                    .addComponent(lblTexto10)
                    .addComponent(lblTexto11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellido)
                    .addComponent(txtNombreAutor)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBiografia)
                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTexto7)
                            .addComponent(lblTexto8)
                            .addComponent(lblTexto9)
                            .addComponent(lblTexto6))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAnioPublicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTexto4)
                            .addComponent(lblTexto5))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTexto4)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTexto1)
                    .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTexto5)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTexto2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTexto3)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTexto6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnioPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTexto7)
                    .addComponent(lblTexto10)
                    .addComponent(txtBiografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBibliografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTexto8)
                    .addComponent(lblTexto11)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTexto9))
                .addGap(35, 35, 35)
                .addComponent(btnAgregar)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnioPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioPublicacionActionPerformed
        String anioPublicacion = txtAnioPublicacion.getText();
    }//GEN-LAST:event_txtAnioPublicacionActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombreAutor = txtNombreAutor.getText();
        String apellidoAutor = txtApellido.getText();
        String nacionalidad = txtNacionalidad.getText();
        String biografia = txtBiografia.getText();
        String edad = txtEdad.getText();
        String titulo = txtTitulo.getText();
        String codigo = txtCodigo.getText();
        String autor = txtAutor.getText();
        String anioPublicacion = txtAnioPublicacion.getText();
        String bibliografia = txtBibliografia.getText();
        String editorial = txtEditorial.getText();
        
        
        
        ////////////////////////////////////
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
    model.addRow(new Object[]{nombreAutor, apellidoAutor, nacionalidad, biografia,edad, titulo, codigo, autor, anioPublicacion, bibliografia, editorial});
    
    
    txtNombreAutor.setText("");
    txtApellido.setText("");
    txtNacionalidad.setText("");
    txtBiografia.setText("");
    txtEdad.setText("");
    txtTitulo.setText("");
    txtCodigo.setText("");
    txtAutor.setText("");
    txtAnioPublicacion.setText("");
    txtBibliografia.setText("");
    txtEditorial.setText("");
    
    
    
        
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        String titulo = txtTitulo.getText();
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtNombreAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAutorActionPerformed
        String nombreAutor = txtNombreAutor.getText();
    }//GEN-LAST:event_txtNombreAutorActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        String apellidoAutor = txtApellido.getText();
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        String nacionalidad = txtNacionalidad.getText();
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        String codigo = txtCodigo.getText();
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        String autor = txtAutor.getText();
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtBibliografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBibliografiaActionPerformed
        String bibliografia = txtBibliografia.getText();
    }//GEN-LAST:event_txtBibliografiaActionPerformed

    private void txtEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialActionPerformed
        String editorial = txtEditorial.getText();
    }//GEN-LAST:event_txtEditorialActionPerformed

    private void txtBiografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiografiaActionPerformed
        String biografia = txtBiografia.getText();
    }//GEN-LAST:event_txtBiografiaActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        String edad = txtEdad.getText();
    }//GEN-LAST:event_txtEdadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTexto10;
    private javax.swing.JLabel lblTexto11;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JLabel lblTexto3;
    private javax.swing.JLabel lblTexto4;
    private javax.swing.JLabel lblTexto5;
    private javax.swing.JLabel lblTexto6;
    private javax.swing.JLabel lblTexto7;
    private javax.swing.JLabel lblTexto8;
    private javax.swing.JLabel lblTexto9;
    private javax.swing.JTextField txtAnioPublicacion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBibliografia;
    private javax.swing.JTextField txtBiografia;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombreAutor;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
