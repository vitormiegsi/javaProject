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

import gamefestival.GameFestival;
import static java.awt.Color.WHITE;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author vhoa1
 */
public class JanelaBilhetesVendidos extends javax.swing.JFrame {
    private GameFestival game;
    private ArrayList<JLabel> labels;
    private ArrayList<Integer> afluencia;
    /**
     * Creates new form JanelaBilhetesVendidos
     */
    public JanelaBilhetesVendidos(GameFestival game) {
       this.game = game;
       setICon();
       initComponents();
       labels = new ArrayList<>();
       getLabels();
       printDays();
       JLabel a = new JLabel();
       afluencia = new ArrayList<>();
       getContentPane().setBackground(WHITE);
       

       a.setText("Dia de maior afluência: "+ fullest());
       painel.add(a);
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
        painel = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bilhetes Vendidos");
        setResizable(false);

        painel.setBackground(java.awt.Color.white);
        painel.setForeground(java.awt.Color.black);

        voltar.setBackground(java.awt.Color.white);
        voltar.setForeground(java.awt.Color.black);
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(voltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    

    public void getLabels(){
                int a = 0;
        int b = game.getListaDias().size();
        if (b > 0){
        for (a = 0; a < b; a++){
         
            JLabel ga  = new javax.swing.JLabel();
            JLabel ba  = new javax.swing.JLabel();
            ga.setName(game.getListaDias().getDia(a).dataFormatada());
            ga.setText("Bilhetes vendidos para o dia " + game.getListaDias().getDia(a).dataFormatada()+ ": ");
            ba.setName(Integer.toString(game.getMaxCapacityDia(game.getListaDias().getDia(a))));
            ba.setText(Integer.toString(game.getMaxCapacityDia(game.getListaDias().getDia(a))));
            labels.add(ga);
            labels.add(ba);
            
        }

    } 
    }
    /*
    public void diaMaiorAfluencia(){
        int a = 0;
        int b = game.getListaDias().size();
        if (b > 0){
        String g;
        int c = 0;
        JLabel bc  = new javax.swing.JLabel();    
        for (a = 0; a < b; a++){
            
        
        if (c < game.getMaxCapacityDia(game.getListaDias().getDia(a)))
        c =  game.getMaxCapacityDia(game.getListaDias().getDia(a));
        
        }
        bc.setName(Integer.toString(game.getMaxCapacityDia(game.getListaDias().getDia(a))));
        bc.setText(Integer.toString(c));
        painel.add(bc);
       
        painel.repaint();
        painel.revalidate();
    pack();
    }
    }
    */
    public String fullest(){
    int a = 0;
    int numPessoas = 0;
    int b = game.getListaDias().size();
    String g = "Ainda Não Foram Definidos Dias";
    
      for (a = 0; a < b; a++){
          afluencia.add(game.getMaxCapacityDia(game.getListaDias().getDia(a)));
          
      }
    for (Integer c : afluencia){
        if (c > numPessoas){
            numPessoas = c;
        }
        
    }   //variavel c tem o numero de bilhetes do dia com mais afluencia
    
     for (a = 0; a < b; a++){
         if (numPessoas == game.getMaxCapacityDia(game.getListaDias().getDia(a))){
           g =  game.getListaDias().getDia(a).dataFormatada();
         }
     }
    return g;
}
    
    
    public void printDays(){
        
        for (JLabel a : labels)
        {
        painel.add(a);
       
        painel.repaint();
        painel.revalidate();
    
        }
         pack();
    }
 private void setICon() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IconImage_1.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painel;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
