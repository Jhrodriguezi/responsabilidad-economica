/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.EventController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author DELL
 */
public class EventView extends javax.swing.JPanel {
    private EventController eventController;
    /**
     * Creates new form DebtView
     */
    public EventView() {
        initComponents();
        eventController=new EventController(this);
        this.deshabilitarBotones();
        eventController.showEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalE = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEvents = new javax.swing.JTable(){
            public boolean isCellEditable(int i, int j){
                return false;
            }
        };
        btnCompletarEvent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxDeudas = new javax.swing.JComboBox<>();
        btnConsultarPorDeuda = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setLayout(new java.awt.CardLayout());

        tableEvents.setModel(new javax.swing.table.DefaultTableModel(
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
        tableEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEventsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEvents);

        btnCompletarEvent.setText("Completar evento");
        btnCompletarEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarEventActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EVENTOS");

        cbxDeudas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConsultarPorDeuda.setText("Buscar por deuda");
        btnConsultarPorDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPorDeudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalELayout = new javax.swing.GroupLayout(panelPrincipalE);
        panelPrincipalE.setLayout(panelPrincipalELayout);
        panelPrincipalELayout.setHorizontalGroup(
            panelPrincipalELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalELayout.createSequentialGroup()
                .addGroup(panelPrincipalELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalELayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalELayout.createSequentialGroup()
                                .addComponent(btnCompletarEvent)
                                .addGap(18, 18, 18)
                                .addComponent(cbxDeudas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultarPorDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelPrincipalELayout.setVerticalGroup(
            panelPrincipalELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalELayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompletarEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(cbxDeudas)
                    .addComponent(btnConsultarPorDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(panelPrincipalE, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompletarEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarEventActionPerformed
        eventController.CompleteEvent(evt);
    }//GEN-LAST:event_btnCompletarEventActionPerformed

    private void tableEventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEventsMouseClicked
        eventController.TableMouseClicked(evt);
    }//GEN-LAST:event_tableEventsMouseClicked

    private void btnConsultarPorDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPorDeudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarPorDeudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompletarEvent;
    private javax.swing.JButton btnConsultarPorDeuda;
    private javax.swing.JComboBox<String> cbxDeudas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipalE;
    private javax.swing.JTable tableEvents;
    // End of variables declaration//GEN-END:variables
    //METODO PARA LLENAR EL COMBOBOX
    /*public void itemsComboTiposHab(ArrayList<String> listItems){
        this.comboItems.removeAllItems();
        this.comboItems.addItem("");
        for(String l : listItems){
            this.comboItems.addItem(l);
        }
        this.jPanel2.updateUI();
    }*/
    
    public void deshabilitarBotones(){
        this.btnCompletarEvent.setEnabled(false);
    }
    
    public void habilitarBotones(){
        this.btnCompletarEvent.setEnabled(true);
    }
   

    public JPanel getPanelPrincipalD() {
        return panelPrincipalE;
    }

    public void setPanelPrincipalD(JPanel panelPrincipalD) {
        this.panelPrincipalE = panelPrincipalD;
    }

    public EventController getEventController() {
        return eventController;
    }

    public void setEventController(EventController eventController) {
        this.eventController = eventController;
    }

    public JButton getBtnCompletarEvent() {
        return btnCompletarEvent;
    }

    public void setBtnCompletarEvent(JButton btnCompletarEvent) {
        this.btnCompletarEvent = btnCompletarEvent;
    }

    public JButton getBtnConsultarPorDeuda() {
        return btnConsultarPorDeuda;
    }

    public void setBtnConsultarPorDeuda(JButton btnConsultarPorDeuda) {
        this.btnConsultarPorDeuda = btnConsultarPorDeuda;
    }

    public JComboBox<String> getCbxDeudas() {
        return cbxDeudas;
    }

    public void setCbxDeudas(JComboBox<String> cbxDeudas) {
        this.cbxDeudas = cbxDeudas;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTableEvents() {
        return tableEvents;
    }

    public void setTableEvents(JTable tableEvents) {
        this.tableEvents = tableEvents;
    }
    
   
    
}