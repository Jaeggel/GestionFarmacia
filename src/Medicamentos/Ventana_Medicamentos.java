/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicamentos;

import Empleado.Metodos;
import Farmacia.Procesos_Farmacia;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author JL
 */
public class Ventana_Medicamentos extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Medicamentos
     */
    Statement estSQL=null;
    DefaultTableModel modelo=null;
    boolean swCMB=true;
    public Ventana_Medicamentos() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/icono.png"));
        setIconImage(icon);
        txtIdFarmActual.setVisible(false);
        lblID.setVisible(false);
        insertImage();
        cerrar();
        BaseDeDatos obj=new BaseDeDatos();
        estSQL=obj.ConectionDB("sa", "sa.1","Farmacia", "JOEL-PC\\SQLSERVER2");
        String cabecera[]={};
        String datos[][]={};
        
        swCMB=false;
        genClave();
        cargarComboCiudad();
        genNombreCiudad();
        cargarComboIdFarmacia();
        cargarComboPresentacion();
        swCMB=true;
        modelo=new DefaultTableModel(datos,cabecera);
        //modelo=new DefaultTableModel(datos,null);
        tablaMed.setModel(modelo);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMed = new javax.swing.JPanel();
        btnLaboratorio = new javax.swing.JButton();
        btnMedicamentos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMed = new javax.swing.JTable();
        txtIdFarmActual = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPres = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAcc = new javax.swing.JTextField();
        txtPrec = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIDM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox();
        txtCiudad = new javax.swing.JTextField();
        cmbIDFarmacia = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnConsultarMedPres = new javax.swing.JButton();
        cmbMedicamentos = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAviso = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMed.setPreferredSize(new java.awt.Dimension(896, 650));

        btnLaboratorio.setBackground(new java.awt.Color(255, 255, 255));
        btnLaboratorio.setFont(new java.awt.Font("Calibri Light", 0, 13)); // NOI18N
        btnLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ventana.png"))); // NOI18N
        btnLaboratorio.setText("Ventana Laboratorio");
        btnLaboratorio.setPreferredSize(new java.awt.Dimension(213, 55));
        btnLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratorioActionPerformed(evt);
            }
        });

        btnMedicamentos.setBackground(new java.awt.Color(255, 255, 255));
        btnMedicamentos.setFont(new java.awt.Font("Calibri Light", 0, 13)); // NOI18N
        btnMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        btnMedicamentos.setText("Consultar * Medicamentos");
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Calibri Light", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.png"))); // NOI18N
        jButton1.setText("Guardar Registro");
        jButton1.setPreferredSize(new java.awt.Dimension(213, 55));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaMed);

        txtIdFarmActual.setEditable(false);
        txtIdFarmActual.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N

        lblID.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        lblID.setText("Id. Farmacia Actual: ");
        lblID.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel10.setText("Presentación: ");

        txtPres.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel9.setText("Acción Terapéutica: ");

        txtAcc.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N

        txtPrec.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel8.setText("Precio:");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad: ");

        txtCant.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel11.setText("Nombre del Medicamento: ");

        txtNM.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtNM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNMActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel5.setText("Id. Medicamento: ");

        txtIDM.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtIDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDMActionPerformed(evt);
            }
        });
        txtIDM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDMKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel4.setText("INGRESAR DATOS DEL MEDICAMENTO: ");

        cmbCiudad.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudadItemStateChanged(evt);
            }
        });

        txtCiudad.setEditable(false);
        txtCiudad.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N

        cmbIDFarmacia.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        cmbIDFarmacia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbIDFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDFarmaciaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel2.setText("SELECCIONAR FARMACIA: ");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel3.setText("SELECCIONAR CIUDAD:");

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 28)); // NOI18N
        jLabel1.setText("REGISTRO DE MEDICAMENTOS");

        btnConsultarMedPres.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultarMedPres.setFont(new java.awt.Font("Calibri Light", 0, 13)); // NOI18N
        btnConsultarMedPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/stock.png"))); // NOI18N
        btnConsultarMedPres.setText("Consultar Medicamentos");
        btnConsultarMedPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMedPresActionPerformed(evt);
            }
        });

        cmbMedicamentos.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        cmbMedicamentos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel6.setText("SELECCIONAR PRESENTACIÓN: ");

        lblAviso.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(204, 204, 204));
        lblAviso.setText("Escriba el Id. y luego \"B\" para Buscar.");
        lblAviso.setEnabled(false);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/medicina.png"))); // NOI18N

        javax.swing.GroupLayout panelMedLayout = new javax.swing.GroupLayout(panelMed);
        panelMed.setLayout(panelMedLayout);
        panelMedLayout.setHorizontalGroup(
            panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMedLayout.createSequentialGroup()
                        .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMedLayout.createSequentialGroup()
                                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPres, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdFarmActual, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDM, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelMedLayout.createSequentialGroup()
                                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelMedLayout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMedicamentos)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConsultarMedPres)
                                    .addComponent(jLabel6)
                                    .addComponent(cmbMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMedLayout.createSequentialGroup()
                        .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMedLayout.createSequentialGroup()
                                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelMedLayout.createSequentialGroup()
                                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbIDFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMedLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAviso))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(32, 32, 32))))
        );
        panelMedLayout.setVerticalGroup(
            panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMedLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbIDFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAviso)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(16, 16, 16)
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtIdFarmActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMedLayout.createSequentialGroup()
                        .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMedicamentos)
                            .addComponent(btnLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMedLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(panelMedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMedLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnConsultarMedPres)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelMed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelMed, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbIDFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIDFarmaciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIDFarmaciaActionPerformed

    private void cmbCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudadItemStateChanged
        if (evt.getSource()==cmbCiudad && swCMB)
        {
            genNombreCiudad();   
        }
    }//GEN-LAST:event_cmbCiudadItemStateChanged

    private void txtIDMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDMKeyTyped
        if(!Character.isDigit(evt.getKeyChar())|| txtIDM.getText().length()==10)
        evt.consume();
    }//GEN-LAST:event_txtIDMKeyTyped

    private void txtIDMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDMKeyReleased
        if(evt.getKeyChar()==KeyEvent.VK_B)
        {
            txtIdFarmActual.setVisible(true);
            lblID.setVisible(true);
            txtIDM.setBackground(Color.red);
            //////////////////////////////////////
            String sentenciaSQL="select distinct m.id_medicamento,m.nombre_medic,m.cantidad_medic,m.precio,m.accion_terap,m.id_farmacia,p.descripcion from medicamentos m,presentacion p where m.id_medicamento='"+txtIDM.getText().trim()+"' and p.id_medicamento=m.id_medicamento";
            Metodos obj=new Metodos();
            ResultSet rs=obj.consultaDatos(estSQL, sentenciaSQL);

            try{
                rs.next();
                if(rs!=null)
                {
                    txtNM.setText(String.valueOf(rs.getObject(2)));
                    txtAcc.setText(String.valueOf(rs.getObject(5)));
                    txtPrec.setText(String.valueOf(rs.getObject(4)));
                    txtCant.setText(String.valueOf(rs.getObject(3)));
                    txtIdFarmActual.setText(String.valueOf(rs.getObject(6)));
                    txtPres.setText(String.valueOf(rs.getObject(7)));
                }else
                {
                    String sentenciaSQL1="select * from  medicamentos where m.id_medicamento='"+txtIDM.getText().trim()+"'";
                    
                    ResultSet rs1=obj.consultaDatos(estSQL, sentenciaSQL1);
                    rs1.next();
                    txtNM.setText(String.valueOf(rs.getObject(2)));
                    txtAcc.setText(String.valueOf(rs.getObject(5)));
                    txtPrec.setText(String.valueOf(rs.getObject(4)));
                    txtCant.setText(String.valueOf(rs.getObject(3)));
                    txtIdFarmActual.setText(String.valueOf(rs.getObject(6)));
                }
                

            }
            catch(Exception E1)
            {
               JOptionPane.showMessageDialog(null,"El Id seleccionado no existe","Error",JOptionPane.ERROR);
                E1.printStackTrace();
            }

        }
    }//GEN-LAST:event_txtIDMKeyReleased

    private void txtIDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDMActionPerformed

    }//GEN-LAST:event_txtIDMActionPerformed

    private void txtNMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNMActionPerformed

    private void txtCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sentenciaSQL="insert into medicamentos values ('"+txtIDM.getText()+"',"+Integer.parseInt(txtCant.getText().trim())+","+Double.parseDouble(txtPrec.getText())+",'"+txtNM.getText().trim()+"','"+txtAcc.getText()+"','"+cmbIDFarmacia.getSelectedItem().toString()+"')";
        String sentencia1SQL="insert into presentacion values('"+txtPres.getText()+"','"+txtIDM.getText()+"')";
        JOptionPane.showMessageDialog(null, "Datos Agregados Exitosamente.");
        BaseDeDatos obj=new BaseDeDatos();
        obj.Ingresar_Datos(estSQL, sentenciaSQL);
        obj.Ingresar_Datos(estSQL, sentencia1SQL);
        limpiar();
        txtNM.requestFocus();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        limpiarTabla(tablaMed);
        Procesos_Farmacia sql=new Procesos_Farmacia();
        //ResultSet rs=sql.consultarDatos(estSQL, "Select * from farmacia");
        ResultSet rs=sql.consultarDatos(estSQL, "select * from medicamentos");
        sql.procesarRB(rs, modelo);

        limpiar();
        editarCabecera();
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnConsultarMedPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMedPresActionPerformed
        limpiarTabla(tablaMed);
        Procesos_Farmacia sql=new Procesos_Farmacia();
        //ResultSet rs=sql.consultarDatos(estSQL, "Select * from farmacia");
        ResultSet rs=sql.consultarDatos(estSQL, "select distinct m.id_medicamento,m.nombre,m.cantidad_medic,m.precio,m.accion_terap,m.id_farmacia,p.descripcion\n" +
        "from medicamentos m,presentacion p where p.descripcion='"+cmbMedicamentos.getSelectedItem().toString().trim()+"'\n" +
        "and p.id_medicamento=m.id_medicamento");
        sql.procesarRB(rs, modelo);
        
        limpiar();
        editarCabecera(); 
    }//GEN-LAST:event_btnConsultarMedPresActionPerformed

    private void btnLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboratorioActionPerformed
        Ventana_Laboratorio vtn=new Ventana_Laboratorio();
        vtn.setVisible(true);
    }//GEN-LAST:event_btnLaboratorioActionPerformed
    public void conexion()
   {
       BaseDeDatos obj=new BaseDeDatos();
       estSQL=obj.ConectionDB("sa", "sa.1","Farmacia", "JOEL-PC\\SQLSERVER2");
   }
   public class ImagePanel extends JPanel 
    {
        public ImagePanel()
        {
            //Se crea un método cuyo parámetro debe ser un objeto Graphics
            this.setSize(905,692);
        }
    @Override
    public void paint(Graphics grafico)
    {
        Dimension height = getSize();
        //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
        ImageIcon Img = new ImageIcon(getClass().getResource("/Img/fondo1.jpg")); 
        //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafico);
    }
    
    }
   public void limpiar()
    {
        txtIDM.setBackground(Color.white);
        txtIDM.setText("");
        txtPrec.setText("");
        txtCiudad.setText("");
        txtCant.setText("");
        txtAcc.setText("");
        txtPres.setText("");
        txtNM.setText("");
        genClave();
        genNombreCiudad();
        cargarComboPresentacion();
        swCMB=true;
    }
   public void cargarComboPresentacion()
    {
        cmbMedicamentos.removeAllItems();
        swCMB=false;
        Procesos_Farmacia sql=new Procesos_Farmacia();
        ResultSet rs=sql.consultarDatos(estSQL, "select distinct descripcion from presentacion");
        sql.buscarDatosCombo(rs, cmbMedicamentos);
    }
  public void editarCabecera()
    {
        JTableHeader th; 
        th = tablaMed.getTableHeader(); 
        Font fuente = new Font("Consolas", Font.BOLD, 12); 
        th.setFont(fuente); 
    }
  public void insertImage()
    {
        ImagePanel Imagen = new ImagePanel();
        panelMed.add(Imagen);
        panelMed.repaint();
    }
  public void cerrar()
    {
        try
        {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter ()
            {
                public void windowClosing(WindowEvent e)
                {
                    dispose();
                }
            });        
        this.setVisible(true);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
   public void genNombreCiudad()
    {
        Procesos_Farmacia sql=new Procesos_Farmacia();
        
        ResultSet rsP=sql.consultarDatos(estSQL, "select nombre_ciudad from ciudad");
        Object valorO;
        try
        {
            rsP.next();
            valorO=rsP.getObject(1);
            if(valorO==null)
            {
                System.out.println("NO HAY VALORES");
            }else
            {
        
                String idFarmacia=cmbCiudad.getSelectedItem().toString().trim();    
                ResultSet rs=sql.consultarDatos(estSQL, "select nombre_ciudad from ciudad where id_ciudad='"+idFarmacia+"'");
                
                try
                {
                    rs.next();
                    txtCiudad.setText(String.valueOf(rs.getObject(1).toString().trim()));
                }catch(java.lang.NullPointerException e)
                {

                }
                catch(Exception e){
                }
            }
        }catch(Exception e)
        {}
        cargarComboIdFarmacia();
    }
     public void cargarComboIdFarmacia()
    {
        cmbIDFarmacia.removeAllItems();
        
        Procesos_Farmacia sql=new Procesos_Farmacia();
        ResultSet rs=sql.consultarDatos(estSQL, "select distinct f.id_farmacia from ciudad c, farmacia f\n" +
        "where c.nombre_ciudad='"+txtCiudad.getText().trim()+"'\n" +
        "and f.id_ciudad=c.id_ciudad");
        sql.buscarDatosCombo(rs, cmbIDFarmacia);
    }
     public void limpiarTabla(JTable tabla)
    {
        while(tabla.getRowCount()>0)
        {
            ((DefaultTableModel) tabla.getModel()).removeRow(0);
        }
    }
    public void cargarComboCiudad()
    {
        cmbCiudad.removeAllItems();
        swCMB=false;
        Procesos_Farmacia sql=new Procesos_Farmacia();
        ResultSet rs=sql.consultarDatos(estSQL, "select id_ciudad from ciudad order by id_ciudad asc");
        sql.buscarDatosCombo(rs, cmbCiudad);
    }
    public void genClave()
    {
        Procesos_Farmacia sql=new Procesos_Farmacia();
        String cadeql="select max(id_medicamento) from medicamentos";
        ResultSet rs=sql.consultarUltimoId(estSQL,cadeql);
        Object valorO;
        try
        {   
            rs.next();
            valorO=rs.getObject(1);    
            if(valorO!=null)
            {
                txtIDM.setText(Integer.parseInt(valorO.toString().trim())+1+"");
            }else
            {
                txtIDM.setText(111000+"");
            }
        }catch(Exception e)
        {    
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarMedPres;
    private javax.swing.JButton btnLaboratorio;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JComboBox cmbCiudad;
    private javax.swing.JComboBox cmbIDFarmacia;
    private javax.swing.JComboBox cmbMedicamentos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblID;
    private javax.swing.JPanel panelMed;
    private javax.swing.JTable tablaMed;
    private javax.swing.JTextField txtAcc;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtIDM;
    private javax.swing.JTextField txtIdFarmActual;
    private javax.swing.JTextField txtNM;
    private javax.swing.JTextField txtPrec;
    private javax.swing.JTextField txtPres;
    // End of variables declaration//GEN-END:variables
}
