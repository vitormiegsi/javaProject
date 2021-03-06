/*
 * Copyright (C) 2017 vhoa1
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

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import gamefestival.Bilhete;

import gamefestival.GameFestival;
import static java.awt.Color.WHITE;
import java.awt.Toolkit;
import static java.lang.String.format;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vhoa1
 */
public class comprarBilhete extends javax.swing.JFrame {
    private GameFestival game;
    ArrayList<JCheckBox> boxes;


    /**
     * Creates new form compraDeBilhete
     */
    public comprarBilhete(GameFestival game) {
        initComponents();
        boxes = new ArrayList<>();
        this.game = game;
        getCheck();
        setICon();
        printDays();
        getContentPane().setBackground(WHITE);
        
        if (game.getListaDias().size() == 0){
            jLabel1.setText("Ainda não foram definidos dias para o festival, tente mais tarde.");
        }else{
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        numeroBilhetes = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comprar Bilhete");
        setResizable(false);

        painel.setBackground(java.awt.Color.white);
        painel.setForeground(java.awt.Color.black);

        jLabel1.setText("Escolha os Dias Por Favor:");

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setForeground(java.awt.Color.black);
        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        numeroBilhetes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        numeroBilhetes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        numeroBilhetes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeroBilhetes.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroBilhetes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numeroBilhetes))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Integer.parseInt(numeroBilhetes.getText()) < 1 ){
           JOptionPane.showMessageDialog(this, "Introduza um número de bilhetes válido P.F");            
            numeroBilhetes.requestFocus();
            return;
    
            }   
        int e = 0; 
            int b = game.getListaDias().size();
            int numBilhetes = Integer.parseInt(numeroBilhetes.getText());
            int c = 1;
            int counter = 0;
       
                 
  
        while (counter < numBilhetes ) { 
        for (JCheckBox a : boxes){
            if (a.isSelected()){
              String name  =   a.getName();
            for (e = 0; e < b; e++){
                
              if (name.equals(game.getListaDias().getDia(e).toString())){
         
               if( game.getListaDias().getDia(e).getCapMax() > game.getMaxCapacityDia(game.getListaDias().getDia(e))){
                  
                   game.adicionarBilhete(new Bilhete( c , game.getListaDias().getDia(e).getDia()));
                   c++;
                  
               
            }else{    JOptionPane.showMessageDialog(this, "Este dia está esgotado, selecone outro Por favor");     
               break;
              }
              }
           }
            
            }
            counter++;
        }
    
        
        
        
}
    }//GEN-LAST:event_jButton1ActionPerformed


    
    public void printDays(){
        
        for (JCheckBox a : boxes)
        {
        painel.add(a);
       
        painel.repaint();
        painel.revalidate();
    
        }
         pack();
    }
    
    
    public void getCheck(){
    
        int a = 0;
        int b = game.getListaDias().size();
        
        for (a = 0; a < b; a++){
         
            JCheckBox ga  = new javax.swing.JCheckBox() ;
            ga.setName(game.getListaDias().getDia(a).toString());
            ga.setText(game.getListaDias().getDia(a).getMes().toString() + " "+ game.getListaDias().getDia(a).getDiaDoMes());
            boxes.add(ga);
            
        }

    }
  
     private void setICon() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IconImage_1.png")));
    }


  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JFormattedTextField numeroBilhetes;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
