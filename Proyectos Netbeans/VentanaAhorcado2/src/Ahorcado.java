/*
DEBERES:
-Que el juego tenga fin
-Hacer un contenedor array con diferentes palabras a elegir por el programa 
para iniciar el juego con una de ellas
-Que pinte los guiones bajos automaticamente dependiendo del tamaño de la palabra

*/

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Ahorcado extends javax.swing.JFrame {

    String palabraOculta = "";
    
    //contador para saber el numero de fallos
    int numeroFallos = 0;
    
    /**
     * Creates new form Ahorcado
     */
    public Ahorcado() {
        initComponents();
        //aqui va el codigo que poniamos en el run en ACM
        cambiaImagenAhorcado();
        
        eligePalabraOculta();
        textoInicio();
    }
    
    private void eligePalabraOculta(){
        String [] listaDePalabras = new String[10];
        Random r = new Random();
        
            listaDePalabras[0] = "hormiga";
            listaDePalabras[1] = "cigarro";
            listaDePalabras[2] = "magenta";
            listaDePalabras[3] = "pelo";
            listaDePalabras[4] = "murcielago";
            listaDePalabras[5] = "columna";
            listaDePalabras[6] = "arbol";
            listaDePalabras[7] = "pelota";
            listaDePalabras[8] = "portero";
            listaDePalabras[9] = "cigarra";
            
            
            palabraOculta = listaDePalabras[r.nextInt(9)];
            System.out.println(palabraOculta);
    }
    
    private void textoInicio(){
        jLabel1.setText("_ ");
        for (int i=0;i<palabraOculta.length();i++){
            jLabel1.setText(jLabel1.getText() +"_ ");
            
        }
    }
    
    
   private void cambiaImagenAhorcado(){
       String nombreImagen ="";
       
               switch(numeroFallos){
                case 0: nombreImagen = "/ahorcado_0.png"; break;
                case 1: nombreImagen = "/ahorcado_1.png"; break;
                case 2: nombreImagen = "/ahorcado_2.png"; break;
                case 3: nombreImagen = "/ahorcado_3.png"; break;
                case 4: nombreImagen = "/ahorcado_4.png"; break;
                case 5: nombreImagen = "/ahorcado_5.png"; break;
                case 6: nombreImagen = "/ahorcado_fin.png"; break;
                case -1:  nombreImagen = "/acertasteTodo.png"; break;     
                default: nombreImagen = "/ahorcado_fin.png"; break;                  
            } 
       ImageIcon a = new ImageIcon(getClass().getResource(nombreImagen));
       Image auxiliar = a.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
       ImageIcon imageIcon = new ImageIcon(auxiliar);
       jLabel2.setIcon(imageIcon);
   } 
           
//   @Override
//   public void paint(Graphics g){
//       super.paint(g);
//       //con esto indicamos que vamos a dibujar en el panel
//       g = jLabel2.getGraphics();
//       Image miImagen = null;
//        try {
//            //cargamos una imagen
//            switch(numeroFallos){
//                case 0: miImagen = ImageIO.read(getClass().getResource("/ahorcado_0.png")); break;
//                case 1: miImagen = ImageIO.read(getClass().getResource("/ahorcado_1.png")); break;
//                case 2: miImagen = ImageIO.read(getClass().getResource("/ahorcado_2.png")); break;
//                case 3: miImagen = ImageIO.read(getClass().getResource("/ahorcado_3.png")); break;
//                case 4: miImagen = ImageIO.read(getClass().getResource("/ahorcado_4.png")); break;
//                case 5: miImagen = ImageIO.read(getClass().getResource("/ahorcado_5.png")); break;
//                case 6: miImagen = ImageIO.read(getClass().getResource("/ahorcado_fin.png")); break;
//                case -1:  miImagen = ImageIO.read(getClass().getResource("/acertasteTodo.png")); break;     
//                default: miImagen = ImageIO.read(getClass().getResource("/ahorcado_fin.png")); break;     
//                    
//            } 
//        } catch (IOException ex) {
//            Logger.getLogger(Ahorcado.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        g.drawImage(miImagen, 0, 0, jPanel1.getWidth(), jPanel1.getHeight(),null);
//   }
    
    private void chequeaLetra(JButton boton){
       if(boton.isEnabled()){
        String letra = boton.getText().toLowerCase();
        boton.setEnabled(false);
        String palabraConGuiones = jLabel1.getText();
        
        if(palabraOculta.contains(letra)){
            for (int i=0; i < palabraOculta.length(); i++){
                if(palabraOculta.charAt(i) == letra.charAt(0)){
                    palabraConGuiones = palabraConGuiones.substring(0, 2*i)
                            + letra
                            + palabraConGuiones.substring(2*i + 1);
                }
            }
            jLabel1.setText(palabraConGuiones);
            //compruebo si en  la palabraConGuiones hay guiones o no
            //si hay algun guionn no hago nada, debo indicar de alguna forma que
            //he ganado la partida
            if(!palabraConGuiones.contains("_")){
                numeroFallos = -1;
            }
        }
        else{
            numeroFallos++;
           
        }
       }
        cambiaImagenAhorcado();
    }
            
            
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton22.setText("jButton1");

        jButton23.setText("jButton1");

        jButton24.setText("jButton1");

        jButton25.setText("jButton1");

        jButton26.setText("jButton1");

        jButton27.setText("jButton1");

        jButton28.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Narkisim", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _ ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 358, 66));

        jButton33.setText("G");
        jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton33MousePressed(evt);
            }
        });
        getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 40, 40));

        jButton36.setText("A");
        jButton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton36MousePressed(evt);
            }
        });
        getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 40, 40));

        jButton37.setText("D");
        jButton37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton37MousePressed(evt);
            }
        });
        getContentPane().add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 40, 40));

        jButton38.setText("E");
        jButton38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton38MousePressed(evt);
            }
        });
        getContentPane().add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 40, 40));

        jButton39.setText("F");
        jButton39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton39MousePressed(evt);
            }
        });
        getContentPane().add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 40, 40));

        jButton40.setText("B");
        jButton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton40MousePressed(evt);
            }
        });
        getContentPane().add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 40, 40));

        jButton41.setText("C");
        jButton41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton41MousePressed(evt);
            }
        });
        getContentPane().add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 40, 40));

        jButton42.setText("N");
        jButton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton42MousePressed(evt);
            }
        });
        getContentPane().add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 40, 40));

        jButton43.setText("H");
        jButton43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton43MousePressed(evt);
            }
        });
        getContentPane().add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 40, 40));

        jButton44.setText("K");
        jButton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton44MousePressed(evt);
            }
        });
        getContentPane().add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 40, 40));

        jButton45.setText("L");
        jButton45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton45MousePressed(evt);
            }
        });
        getContentPane().add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 40, 40));

        jButton46.setText("M");
        jButton46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton46MousePressed(evt);
            }
        });
        getContentPane().add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 40, 40));

        jButton47.setText("I");
        jButton47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton47MousePressed(evt);
            }
        });
        getContentPane().add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 40, 40));

        jButton48.setText("J");
        jButton48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton48MousePressed(evt);
            }
        });
        getContentPane().add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 40, 40));

        jButton49.setText("T");
        jButton49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton49MousePressed(evt);
            }
        });
        getContentPane().add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 40, 40));

        jButton50.setText("Ñ");
        jButton50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton50MousePressed(evt);
            }
        });
        getContentPane().add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 40, 40));

        jButton51.setText("Q");
        jButton51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton51MousePressed(evt);
            }
        });
        getContentPane().add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 40, 40));

        jButton52.setText("R");
        jButton52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton52MousePressed(evt);
            }
        });
        getContentPane().add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 40, 40));

        jButton53.setText("S");
        jButton53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton53MousePressed(evt);
            }
        });
        getContentPane().add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 40, 40));

        jButton54.setText("O");
        jButton54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton54MousePressed(evt);
            }
        });
        getContentPane().add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 40, 40));

        jButton55.setText("P");
        jButton55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton55MousePressed(evt);
            }
        });
        getContentPane().add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 40, 40));

        jButton56.setText("Z");
        jButton56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton56MousePressed(evt);
            }
        });
        getContentPane().add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 40, 40));

        jButton57.setText("U");
        jButton57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton57MousePressed(evt);
            }
        });
        getContentPane().add(jButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 40, 40));

        jButton59.setText("X");
        jButton59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton59MousePressed(evt);
            }
        });
        getContentPane().add(jButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 70, 40));

        jButton60.setText("Y");
        jButton60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton60MousePressed(evt);
            }
        });
        getContentPane().add(jButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 40, 40));

        jButton61.setText("V");
        jButton61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton61MousePressed(evt);
            }
        });
        getContentPane().add(jButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 40, 40));

        jButton62.setText("W");
        jButton62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton62MousePressed(evt);
            }
        });
        getContentPane().add(jButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 70, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 210, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton36MousePressed
       chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton36MousePressed

    private void jButton40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton40MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton40MousePressed

    private void jButton41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton41MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton41MousePressed

    private void jButton37MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton37MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton37MousePressed

    private void jButton38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton38MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton38MousePressed

    private void jButton39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton39MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton39MousePressed

    private void jButton33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton33MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton33MousePressed

    private void jButton43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton43MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton43MousePressed

    private void jButton47MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton47MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton47MousePressed

    private void jButton48MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton48MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton48MousePressed

    private void jButton44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton44MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton44MousePressed

    private void jButton45MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton45MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton45MousePressed

    private void jButton46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton46MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton46MousePressed

    private void jButton42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton42MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton42MousePressed

    private void jButton50MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton50MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton50MousePressed

    private void jButton54MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton54MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton54MousePressed

    private void jButton55MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton55MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton55MousePressed

    private void jButton51MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton51MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton51MousePressed

    private void jButton52MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton52MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton52MousePressed

    private void jButton53MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton53MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton53MousePressed

    private void jButton49MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton49MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton49MousePressed

    private void jButton57MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton57MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton57MousePressed

    private void jButton61MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton61MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton61MousePressed

    private void jButton62MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton62MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton62MousePressed

    private void jButton59MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton59MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton59MousePressed

    private void jButton60MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton60MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton60MousePressed

    private void jButton56MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton56MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_jButton56MousePressed

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
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ahorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
