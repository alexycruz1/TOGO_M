/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package togo;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexy jr
 */
public class TOGO extends javax.swing.JFrame {

    /**
     * Creates new form TOGO
     */
    public TOGO() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
        Red = new Grafo();
        Red.addVertice(central);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jd_mapa = new javax.swing.JDialog();
        jp_mapa = new javax.swing.JPanel();
        jd_modificar_eliminar_rc = new javax.swing.JDialog();
        cb_routers_modificar = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cb_tipo_r_modificar = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        tf_num_serie_modificar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cb_tipo_router = new javax.swing.JComboBox();
        cb_vertices1 = new javax.swing.JComboBox();
        cb_vertices2 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_longitud_cable = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_ancho_banda = new javax.swing.JTextField();
        rb_cable_cobre = new javax.swing.JRadioButton();
        rb_cable_fibra = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tf_num_serie = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jmi_mapa = new javax.swing.JMenuItem();
        jmi_modificar_eliminar = new javax.swing.JMenuItem();
        jm_analisis = new javax.swing.JMenu();
        jmi_r = new javax.swing.JMenuItem();
        jmi_p = new javax.swing.JMenuItem();
        jmi_m = new javax.swing.JMenuItem();

        jd_mapa.setResizable(false);

        javax.swing.GroupLayout jp_mapaLayout = new javax.swing.GroupLayout(jp_mapa);
        jp_mapa.setLayout(jp_mapaLayout);
        jp_mapaLayout.setHorizontalGroup(
            jp_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        jp_mapaLayout.setVerticalGroup(
            jp_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_mapaLayout = new javax.swing.GroupLayout(jd_mapa.getContentPane());
        jd_mapa.getContentPane().setLayout(jd_mapaLayout);
        jd_mapaLayout.setHorizontalGroup(
            jd_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mapaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_mapaLayout.setVerticalGroup(
            jd_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mapaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton4.setText("Eliminar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Cambiar a");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        cb_tipo_r_modificar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Repetidor de red domestica", "Repetidor de red empresarial", "Antena celular", "Conexion dedicada" }));

        jLabel7.setText("Numero de serie");

        javax.swing.GroupLayout jd_modificar_eliminar_rcLayout = new javax.swing.GroupLayout(jd_modificar_eliminar_rc.getContentPane());
        jd_modificar_eliminar_rc.getContentPane().setLayout(jd_modificar_eliminar_rcLayout);
        jd_modificar_eliminar_rcLayout.setHorizontalGroup(
            jd_modificar_eliminar_rcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificar_eliminar_rcLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jd_modificar_eliminar_rcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_eliminar_rcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificar_eliminar_rcLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_num_serie_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addComponent(cb_routers_modificar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_tipo_r_modificar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jd_modificar_eliminar_rcLayout.setVerticalGroup(
            jd_modificar_eliminar_rcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificar_eliminar_rcLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jd_modificar_eliminar_rcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_routers_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(27, 27, 27)
                .addGroup(jd_modificar_eliminar_rcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(cb_tipo_r_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificar_eliminar_rcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_num_serie_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("PRUEBAS");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Añadir router ");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Añadir conexion");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        cb_tipo_router.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Repetidor de red domestica", "Repetidor de red empresarial", "Antena celular", "Conexion dedicada" }));

        jLabel1.setText("ROUTERS");

        jLabel2.setText("CONEXIONES");

        jLabel3.setText("Longitud de cable");

        jLabel4.setText("Ancho de banda");

        buttonGroup1.add(rb_cable_cobre);
        rb_cable_cobre.setText("Cable de cobre");

        buttonGroup1.add(rb_cable_fibra);
        rb_cable_fibra.setText("Cable de fibra");

        jLabel5.setText("Numero de serie");

        jLabel6.setText("MB/S");

        jm_archivo.setText("Archivo");

        jmi_mapa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jmi_mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/map-icon.gif"))); // NOI18N
        jmi_mapa.setText("Ver mapa");
        jmi_mapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_mapaActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_mapa);

        jmi_modificar_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_edit_topic.gif"))); // NOI18N
        jmi_modificar_eliminar.setText("Modificar/Eliminar");
        jmi_modificar_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificar_eliminarActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_modificar_eliminar);

        jMenuBar1.add(jm_archivo);

        jm_analisis.setText("Analisis");

        jmi_r.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmi_r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/router2.jpg"))); // NOI18N
        jmi_r.setText("Router a router");
        jm_analisis.add(jmi_r);

        jmi_p.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmi_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ancho_banda.gif"))); // NOI18N
        jmi_p.setText("Probar ancho de banda");
        jm_analisis.add(jmi_p);

        jmi_m.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jmi_m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cables.png"))); // NOI18N
        jmi_m.setText("Minima cantidad de cable");
        jm_analisis.add(jmi_m);

        jMenuBar1.add(jm_analisis);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tf_longitud_cable, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_cable_fibra)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb_cable_cobre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_ancho_banda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_num_serie))
                            .addComponent(cb_tipo_router, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cb_vertices1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_vertices2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cb_tipo_router, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_num_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_vertices1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_vertices2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tf_longitud_cable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_ancho_banda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_cable_cobre)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_cable_fibra)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Red.print();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        String nombre = cb_tipo_router.getSelectedItem().toString();
        int numero_serie = Integer.parseInt(tf_num_serie.getText());
        Lista temp = new Lista();

        Vertice v = new Vertice(nombre, temp, numero_serie);
        Red.addVertice(v);
        vertices_temp.push_back(v);

        cb_vertices1.addItem(v);
        cb_vertices2.addItem(v);
        cb_routers_modificar.addItem(v);

        tf_num_serie.setText("");

        Arista a = new Arista(v, 10, 10);
        Arista b = new Arista(central, 10, 10);

        central.addArista(a);
        v.addArista(b);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        Vertice temp1 = ((Vertice) cb_vertices1.getSelectedItem());
        Vertice temp2 = ((Vertice) cb_vertices2.getSelectedItem());

        int Ancho_banda = Integer.parseInt(tf_ancho_banda.getText());
        int Longitud_cable = Integer.parseInt(tf_longitud_cable.getText());

        if (rb_cable_cobre.isSelected()) {
            if (Ancho_banda > 0 && Ancho_banda <= 100) {
                Arista a = new Arista(temp1, Longitud_cable, Ancho_banda);
                Arista b = new Arista(temp2, Longitud_cable, Ancho_banda);

                temp1.addArista(b);
                temp2.addArista(a);

                aristas_temp.push_back(a);
                aristas_temp.push_back(b);

                DrawEdge(temp1, temp2, Longitud_cable);
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error al establecer la conexion",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else if (rb_cable_fibra.isSelected()) {
            if (Ancho_banda > 0 && Ancho_banda <= 10000) {
                Arista a = new Arista(temp1, Longitud_cable, Ancho_banda);
                Arista b = new Arista(temp2, Longitud_cable, Ancho_banda);

                temp1.addArista(b);
                temp2.addArista(a);

                aristas_temp.push_back(a);
                aristas_temp.push_back(b);

                DrawEdge(temp1, temp2, Longitud_cable);
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error al establecer la conexion",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

        tf_ancho_banda.setText("");
        tf_longitud_cable.setText("");
        rb_cable_cobre.setSelected(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jmi_mapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_mapaActionPerformed
        // TODO add your handling code here:
        CrearGrafo();
        
        jd_mapa.setModal(true);
        jd_mapa.pack();
        jd_mapa.setLocationRelativeTo(this);
        jd_mapa.setVisible(true);

        //drawGraph();

    }//GEN-LAST:event_jmi_mapaActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        int pos = cb_routers_modificar.getSelectedIndex();
        Red.deleteVertice(pos);
        vertices_temp.erase(pos);

        cb_routers_modificar.removeAllItems();
        cb_vertices1.removeAllItems();
        cb_vertices2.removeAllItems();

        for (int i = 0; i < vertices_temp.size(); i++) {
            cb_routers_modificar.addItem(((Vertice) (vertices_temp.at(i))));
            cb_vertices1.addItem(((Vertice) (vertices_temp.at(i))));
            cb_vertices1.addItem(((Vertice) (vertices_temp.at(i))));
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        int pos = cb_routers_modificar.getSelectedIndex();
        String nombre = cb_tipo_r_modificar.getSelectedItem().toString();
        int num_serie = Integer.parseInt(tf_num_serie_modificar.getText());

        ((Vertice) Red.getVertices().at(pos)).setNombre(nombre);
        ((Vertice) Red.getVertices().at(pos)).setNumero_serie(num_serie);

        ((Vertice) vertices_temp.at(pos)).setNombre(nombre);
        ((Vertice) vertices_temp.at(pos)).setNumero_serie(num_serie);

        cb_routers_modificar.removeAllItems();
        cb_vertices1.removeAllItems();
        cb_vertices2.removeAllItems();

        for (int i = 0; i < vertices_temp.size(); i++) {
            cb_routers_modificar.addItem(((Vertice) (vertices_temp.at(i))));
            cb_vertices1.addItem(((Vertice) (vertices_temp.at(i))));
            cb_vertices1.addItem(((Vertice) (vertices_temp.at(i))));
        }

        tf_num_serie_modificar.setText("");
    }//GEN-LAST:event_jButton5MouseClicked

    private void jmi_modificar_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificar_eliminarActionPerformed
        // TODO add your handling code here:
        jd_mapa.setModal(true);
        jd_mapa.pack();
        jd_mapa.setLocationRelativeTo(this);
        jd_mapa.setVisible(true);
    }//GEN-LAST:event_jmi_modificar_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(TOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TOGO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TOGO().setVisible(true);
            }
        });
    }

    public void DrawEdge(Vertice v1, Vertice v2, int peso) {
        graph.getModel().beginUpdate();
        String nombre1 = v1.getNombre();
        String nombre2 = v2.getNombre();

        Object arista1 = graph.insertVertex(parent, null, nombre1, x, y, 50, 50);
        x+=200;
        y+=200;
        Object arista2 = graph.insertVertex(parent, null, nombre2, x, y, 50, 50);
        
        graph.insertEdge(parent, null, peso, arista1, arista2);
        graph.insertEdge(parent, null, peso, arista2,arista1); 
        
        graph.insertEdge(parent, null, 2, central_siempre, arista1);
        graph.insertEdge(parent, null, 2, arista1, central_siempre);
        
        graph.insertEdge(parent, null, 2, central_siempre, arista2);
        graph.insertEdge(parent, null, 2, arista2, central_siempre);
    }

    public void CrearGrafo() {
        graph.insertVertex(parent, null, "", 500, 500, 0, 0);
        graph.getModel().endUpdate();
        jp_mapa.add(cmp);
        jp_mapa.setLayout(new FlowLayout());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cb_routers_modificar;
    private javax.swing.JComboBox cb_tipo_r_modificar;
    private javax.swing.JComboBox cb_tipo_router;
    private javax.swing.JComboBox cb_vertices1;
    private javax.swing.JComboBox cb_vertices2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JDialog jd_mapa;
    private javax.swing.JDialog jd_modificar_eliminar_rc;
    private javax.swing.JMenu jm_analisis;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenuItem jmi_m;
    private javax.swing.JMenuItem jmi_mapa;
    private javax.swing.JMenuItem jmi_modificar_eliminar;
    private javax.swing.JMenuItem jmi_p;
    private javax.swing.JMenuItem jmi_r;
    private javax.swing.JPanel jp_mapa;
    private javax.swing.JRadioButton rb_cable_cobre;
    private javax.swing.JRadioButton rb_cable_fibra;
    private javax.swing.JTextField tf_ancho_banda;
    private javax.swing.JTextField tf_longitud_cable;
    private javax.swing.JTextField tf_num_serie;
    private javax.swing.JTextField tf_num_serie_modificar;
    // End of variables declaration//GEN-END:variables
    Grafo Red;
    Lista aristas_temp = new Lista();
    Lista vertices_temp = new Lista();
    Lista aristas_centrales = new Lista();
    Vertice central = new Vertice("Router Central", aristas_centrales, 1);
    
    int y = 0;
    int x = 0;

    mxGraph graph = new mxGraph();
    mxGraphComponent cmp = new mxGraphComponent(graph);
    Object parent = graph.getDefaultParent();
    Object central_siempre = graph.insertVertex(parent, null, central, 200, 200, 50, 50);
}
