/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farmaceutico;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Empleado.*;
import Farmacia.Procesos_Farmacia;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author FRANCISCO
 */
public class Farmaceutico extends javax.swing.JFrame {

    Statement estSQL1=null;
    DefaultTableModel modelo=null;
    public Farmaceutico()
    {
        initComponents();
        insertImage();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img/icono.png"));
        setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.setTitle("Farmaceutico");
        this.setResizable(false);
        txtActual.setVisible(false);
        labell.setVisible(false);
        cerrar();
        Metodos obj=new Metodos();    
        estSQL1=obj.coneccionDB("sa", "sa.1","Farmacia", "JOEL-PC\\SQLSERVER2");
        String cabecera[]={};
        String datos[][]={};
        modelo=new DefaultTableModel(datos,cabecera);
        Table.setModel(modelo); 
        cargarCombo();
        cargarComboCiudad();
        limpiarTabla(Table);
        genClave();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFarm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId_farmacia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre_FARMACEUTICO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbId_farmacia = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        labell = new javax.swing.JLabel();
        txtActual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnFarmaceutico_Enc = new javax.swing.JButton();
        cmbCiudad = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 28)); // NOI18N
        jLabel1.setText("REGISTRO DE FARMACÉUTICOS");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel2.setText("Id. Farmaceutico:");

        txtId_farmacia.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtId_farmacia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtId_farmaciaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtId_farmaciaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombre_FARMACEUTICO.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtNombre_FARMACEUTICO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombre_FARMACEUTICOKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre_FARMACEUTICOKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel4.setText("Id Farmacia:");

        cmbId_farmacia.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Calibri Light", 0, 13)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar Registro");
        btnGuardar.setPreferredSize(new java.awt.Dimension(211, 55));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Calibri Light", 0, 13)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        btnBuscar.setText("Mostrar Farmacéuticos");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Calibri Light", 0, 13)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setPreferredSize(new java.awt.Dimension(211, 55));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        labell.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        labell.setText("Farmacia actual:");
        labell.setEnabled(false);

        txtActual.setEditable(false);
        txtActual.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Escriba el Id. y luego B para Buscar.");
        jLabel5.setEnabled(false);

        Table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table);

        btnFarmaceutico_Enc.setBackground(new java.awt.Color(255, 255, 255));
        btnFarmaceutico_Enc.setFont(new java.awt.Font("Calibri Light", 0, 13)); // NOI18N
        btnFarmaceutico_Enc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/personal.png"))); // NOI18N
        btnFarmaceutico_Enc.setText("Farmacéutico Encargado");
        btnFarmaceutico_Enc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmaceutico_EncActionPerformed(evt);
            }
        });

        cmbCiudad.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 13)); // NOI18N
        jLabel6.setText("SELECCIONAR CIUDAD:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/doctor-icon.png"))); // NOI18N

        javax.swing.GroupLayout panelFarmLayout = new javax.swing.GroupLayout(panelFarm);
        panelFarm.setLayout(panelFarmLayout);
        panelFarmLayout.setHorizontalGroup(
            panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFarmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFarmLayout.createSequentialGroup()
                        .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFarmLayout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFarmLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelFarmLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(panelFarmLayout.createSequentialGroup()
                                .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFarmaceutico_Enc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(panelFarmLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelFarmLayout.createSequentialGroup()
                        .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFarmLayout.createSequentialGroup()
                                .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(labell))
                                .addGap(28, 28, 28)
                                .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtActual)
                                    .addComponent(cmbId_farmacia, 0, 303, Short.MAX_VALUE)
                                    .addComponent(txtNombre_FARMACEUTICO)
                                    .addComponent(txtId_farmacia)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        panelFarmLayout.setVerticalGroup(
            panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFarmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFarmLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId_farmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre_FARMACEUTICO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFarmLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbId_farmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labell)
                    .addComponent(txtActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFarmLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFarmaceutico_Enc)
                        .addContainerGap())
                    .addGroup(panelFarmLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFarmLayout.createSequentialGroup()
                                .addGroup(panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBuscar)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFarmLayout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFarm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFarm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtActual.setVisible(false);
        labell.setVisible(false);
        String sentenciaSQL="UPDATE farmaceutico SET nombre_farmaceutico='"+txtNombre_FARMACEUTICO.getText().trim()+"',id_farmacia='"+cmbId_farmacia.getSelectedItem().toString()+"' WHERE id_farmaceutico='"+txtId_farmacia.getText().trim()+"'";
        Metodos obj=new Metodos();
        obj.ingresarDatos(estSQL1, sentenciaSQL);
        txtNombre_FARMACEUTICO.setText("");
        txtId_farmacia.requestFocus();
        limpiar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarTabla(Table);
        Procesos_Farmacia sql=new Procesos_Farmacia();
        //ResultSet rs=sql.consultarDatos(estSQL, "Select * from farmacia");
        ResultSet rs=sql.consultarDatos(estSQL1, "select * from farmaceutico");
        sql.procesarRB(rs, modelo);
        editarCabecera();    
        limpiar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        txtActual.setVisible(false);
        labell.setVisible(false);
        Metodos sql=new Metodos();
        Metodos obj=new Metodos();
        String cadeql="select max(id_farmacia) from farmacia";
        ResultSet rs=sql.consultarUltimoId(estSQL1,cadeql);
        Object valorO;
        try
        {   
            rs.next();
            valorO=rs.getObject(1);    
            if(valorO==null)
            {
                
                String sentenciaSQL="Insert into farmaceutico values('"+txtId_farmacia.getText().trim()+"','"+txtNombre_FARMACEUTICO.getText().trim()+"',null)";
                obj.ingresarDatos(estSQL1, sentenciaSQL);
            }else
            {
                String sentenciaSQL="Insert into farmaceutico values('"+txtId_farmacia.getText().trim()+"','"+txtNombre_FARMACEUTICO.getText().trim()+"','"+cmbId_farmacia.getSelectedItem().toString()+"')";
                obj.ingresarDatos(estSQL1, sentenciaSQL);
            }
        }catch(Exception e){}
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombre_FARMACEUTICOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_FARMACEUTICOKeyTyped
        if(Character.isDigit(evt.getKeyChar()))
        evt.consume();
    }//GEN-LAST:event_txtNombre_FARMACEUTICOKeyTyped

    private void txtNombre_FARMACEUTICOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_FARMACEUTICOKeyReleased

    }//GEN-LAST:event_txtNombre_FARMACEUTICOKeyReleased

    private void txtId_farmaciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtId_farmaciaKeyTyped
        if(!Character.isDigit(evt.getKeyChar())|| txtId_farmacia.getText().length()==10)
        evt.consume();
    }//GEN-LAST:event_txtId_farmaciaKeyTyped

    private void txtId_farmaciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtId_farmaciaKeyReleased
        if(evt.getKeyChar()==KeyEvent.VK_B)
        {
            txtActual.setVisible(true);
            labell.setVisible(true);
            txtId_farmacia.setBackground(Color.red);
            //////////////////////////////////////
            String sentenciaSQL="select *from farmaceutico where id_farmaceutico='"+txtId_farmacia.getText()+"'";
            Metodos obj=new Metodos();
            ResultSet rs=obj.consultaDatos(estSQL1, sentenciaSQL);

            try
            {
                rs.next();
                txtNombre_FARMACEUTICO.setText(String.valueOf(rs.getObject(2)));
                txtActual.setText(String.valueOf(rs.getObject(3)));
                cmbId_farmacia.removeAllItems();
                cargarCombo();
            }
            catch(Exception E1)
            {
                JOptionPane.showMessageDialog(null,"El id seleccionado no existe");
                E1.printStackTrace();
            }

        }
    }//GEN-LAST:event_txtId_farmaciaKeyReleased

    private void btnFarmaceutico_EncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmaceutico_EncActionPerformed
        limpiarTabla(Table);
        Procesos_Farmacia sql=new Procesos_Farmacia();
        ResultSet rs=sql.consultarDatos(estSQL1, "select distinct  f.id_farmaceutico,fc.nombre_farmaceutico,f.id_ciudad,c.nombre_ciudad\n" +
"  from farmaceutico fc, ciudad c, farmacia f\n" +
"  where fc.id_farmaceutico=f.id_farmaceutico\n" +
"  and c.id_ciudad=f.id_ciudad\n" +
"  and c.nombre_ciudad='"+cmbCiudad.getSelectedItem().toString().trim()+"'");
        sql.procesarRB(rs, modelo);
        editarCabecera(); 
        limpiar();
    }//GEN-LAST:event_btnFarmaceutico_EncActionPerformed
    public void limpiar()
    {
        txtId_farmacia.setBackground(Color.white);
        txtId_farmacia.setText("");
        txtNombre_FARMACEUTICO.setText("");
        txtId_farmacia.requestFocus();
        genClave();
        cargarCombo();
        cargarComboCiudad();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFarmaceutico_Enc;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox cmbCiudad;
    private javax.swing.JComboBox cmbId_farmacia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labell;
    private javax.swing.JPanel panelFarm;
    private javax.swing.JTextField txtActual;
    private javax.swing.JTextField txtId_farmacia;
    private javax.swing.JTextField txtNombre_FARMACEUTICO;
    // End of variables declaration//GEN-END:variables
    public void cargarCombo ()
    {
        ResultSet rs;
        Metodos obj=new Metodos();
        rs=obj.consultaDatos(estSQL1,"SELECT id_farmacia FROM farmacia");
        obj.procesarRSCombo(rs, cmbId_farmacia);

    }
    public void cargarComboCiudad()
    {
        cmbCiudad.removeAllItems();
        ResultSet rs;
        Metodos obj=new Metodos();
        rs=obj.consultaDatos(estSQL1,"SELECT nombre_ciudad FROM ciudad");
        obj.procesarRSCombo(rs, cmbCiudad);

    }
 public void limpiarTabla(JTable tabla)
    {
        while(tabla.getRowCount()>0)
        {
            ((DefaultTableModel) tabla.getModel()).removeRow(0);
        }
    }
 
  public void genClave()
    {
        Metodos sql=new Metodos();
        String cadeql="select max(id_farmaceutico) from farmaceutico";
        ResultSet rs=sql.consultarUltimoId(estSQL1,cadeql);
        Object valorO;
        try
        {   
            rs.next();
            valorO=rs.getObject(1);    
            if(valorO!=null)
            {
                txtId_farmacia.setText(Integer.parseInt(valorO.toString().trim())+1+"");
            }else
            {
                txtId_farmacia.setText(555000+"");
            }
        }catch(Exception e)
        {    
        }
        
    }
   public class ImagePanel extends JPanel 
    {
        public ImagePanel()
        {
            //Se crea un método cuyo parámetro debe ser un objeto Graphics
            this.setSize(905,470);
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
  public void editarCabecera()
    {
        JTableHeader th; 
        th = Table.getTableHeader(); 
        Font fuente = new Font("Consolas", Font.BOLD, 12); 
        th.setFont(fuente); 
    }
  public void insertImage()
    {
        ImagePanel Imagen = new ImagePanel();
        panelFarm.add(Imagen);
        panelFarm.repaint();
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

}
