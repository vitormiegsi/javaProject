/*
 * Copyright (C) 2017 Filipe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Interface;

import gamefestival.GameFestival;
import static java.awt.Color.WHITE;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Filipe
 */
public class Lucro extends javax.swing.JFrame {
    private GameFestival game;
    private float contador;
    private ArrayList<Integer> afluencia;

    /**
     * Creates new form
     */
    public Lucro(GameFestival game) {
        initComponents();
        setICon();
        afluencia = new ArrayList<>();
        getContentPane().setBackground(WHITE);
        this.contador= contador;
        contador += game.getListaPatrocinios().salarioTotalPatrocinioss();
        contador -= game.getListaGameDesigners().salarioTotalGameDesigners();
        contador -= game.getListaColaboradores().salarioTotalColaboradores();
        contador += game.getBilheteira().TotalPreco();
        Cont.setText(Float.toString(contador));
        DesGD.setText(Float.toString(game.getListaGameDesigners().salarioTotalGameDesigners()));
        desCo.setText(Float.toString(game.getListaColaboradores().salarioTotalColaboradores()));
        LucroPat.setText(Float.toString(game.getListaPatrocinios().salarioTotalPatrocinioss()));
        bilhetesVendidos.setText(Integer.toString(game.getAllBilhetes()));
        dinheiroBi.setText(Float.toString(game.getBilheteira().TotalPreco()));
       
    
      
        
    }


    
    private void verLucro(){
        contador = 0;
        contador += game.getListaPatrocinios().salarioTotalPatrocinioss();
        Cont.setText(Float.toString(contador));
        
    }
    private void vendasBilhetes(){
        
        bilhetesVendidos.setText(Integer.toString(game.getAllBilhetes()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Cont = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DesGD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        desCo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LucroPat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bilhetesVendidos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dinheiroBi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informações");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Dinheiro festival:");

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setForeground(java.awt.Color.black);
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Cont.setText("jLabel2");

        jLabel2.setText("Despesa GameDesigners:");

        DesGD.setText("jLabel3");

        jLabel3.setText("Despesa Colaboradores:");

        desCo.setText("jLabel4");

        jLabel4.setText("Lucro Patrocinadores:");

        LucroPat.setText("jLabel5");

        jLabel5.setText("Total Bilhetes Vendidos:");

        bilhetesVendidos.setText("jLabel2");

        jLabel6.setText("Dinheiro Bilhetes:");

        dinheiroBi.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cont)
                            .addComponent(dinheiroBi)
                            .addComponent(bilhetesVendidos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(DesGD))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(desCo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(LucroPat)))))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DesGD))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desCo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LucroPat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bilhetesVendidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dinheiroBi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
 

    private void setICon() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IconImage_1.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cont;
    private javax.swing.JLabel DesGD;
    private javax.swing.JLabel LucroPat;
    private javax.swing.JLabel bilhetesVendidos;
    private javax.swing.JLabel desCo;
    private javax.swing.JLabel dinheiroBi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
