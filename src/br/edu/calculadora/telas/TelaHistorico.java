/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.calculadora.telas;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author ismae
 */
public class TelaHistorico extends JDialog {

    /**
     * Creates new form TelaHistorico
     */
    public ArrayList<String> history;

    public TelaHistorico(JFrame parent, boolean modal, ArrayList<String> historyCalculadora) {
        super(parent, modal);
        history = historyCalculadora;
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

        panelHistorico = new javax.swing.JPanel();
        notHistorico = new javax.swing.JLabel();
        clean = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        panelList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        notHistorico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        notHistorico.setText("Ainda não há histórico");

        clean.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clean.setText("Limpar histórico");
        clean.setToolTipText("");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panelList.setBorder(null);
        panelList.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        scroll.setViewportView(panelList);

        javax.swing.GroupLayout panelHistoricoLayout = new javax.swing.GroupLayout(panelHistorico);
        panelHistorico.setLayout(panelHistoricoLayout);
        panelHistoricoLayout.setHorizontalGroup(
            panelHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clean, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelHistoricoLayout.createSequentialGroup()
                        .addComponent(notHistorico)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );
        panelHistoricoLayout.setVerticalGroup(
            panelHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (!history.isEmpty()) {
            notHistorico.setVisible(false);
        } else {
            clean.setVisible(false);
        }

        javax.swing.GroupLayout panelHistoricoLayout = new javax.swing.GroupLayout(panelList);
        panelList.setLayout(panelHistoricoLayout);

        DefaultListModel list = new DefaultListModel();

        for (String itemHistory : history) {
            list.addElement(itemHistory);
        }
        panelList.setModel(list);
        panelList.revalidate();
        panelList.repaint();
    }//GEN-LAST:event_formComponentShown

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        history.clear();

        notHistorico.setVisible(true);
        clean.setVisible(false);

        panelList.removeAll();
        panelList.setModel(new DefaultListModel());
        panelList.setVisible(false);
    }//GEN-LAST:event_cleanActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clean;
    private javax.swing.JLabel notHistorico;
    private javax.swing.JPanel panelHistorico;
    private javax.swing.JList<String> panelList;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
