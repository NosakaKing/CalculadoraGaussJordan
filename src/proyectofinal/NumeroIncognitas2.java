/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;

import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
/**
 *
 * @author Raul
 */
public class NumeroIncognitas2 extends javax.swing.JFrame {
    double X1, X2, Y1, Y2, R1, R2;
    int pos = 0;
    int pos2 = 0;
    double x = 0;
    double [][] matriz = new double [3][2];
    DecimalFormat df = new DecimalFormat("0.00");
    DecimalFormat ent = new DecimalFormat("0");
    public class SymbolAndNumberFilter extends DocumentFilter {

        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string,AttributeSet attr) throws BadLocationException {
            // Permite solo simbolos y numeros
            if (string.matches("[0-9\\p{Punct}]+")) {
                super.insertString(fb, offset, string, attr);
            }
        }

        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            // Permite solo simbolos y numeros
            if (text.matches("[0-9\\p{Punct}]+")) {
                super.replace(fb, offset, length, text, attrs);
            }
        }
    }

    public void imprimir() {
        for (pos2 = 0; pos2 < 2; pos2++) {
            for (pos = 0; pos < 3; pos++) {
                if (matriz[pos][pos2] % 1 == 0) {
                    if (pos == 2) {
                        jTextArea1.append("|  " + ent.format(matriz[pos][pos2]));
                    } else {
                        jTextArea1.append(ent.format(matriz[pos][pos2]) + "\t");
                    }

                } else {
                    if (pos == 2) {
                        jTextArea1.append("|" + df.format(matriz[pos][pos2]));
                    } else {
                        jTextArea1.append(df.format(matriz[pos][pos2]) + "\t");
                    }

                }
            }
            jTextArea1.append("\n");
        }
        jTextArea1.append("\n");
    }
    public void matrices(){
            matriz[0][0] = X1;
            matriz[0][1] = X2;
            matriz[1][0] = Y1;
            matriz[1][1] = Y2;
            matriz[2][0] = R1;
            matriz[2][1] = R2;
    }    
public NumeroIncognitas2() {
        initComponents();
        this.setLocationRelativeTo(null);// al momento de ejecutar la aplicacion lo ventana se  centra en la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jTxtX1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtY1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtR1 = new javax.swing.JTextField();
        jTxtR2 = new javax.swing.JTextField();
        jTxtX2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtY2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBtnCalcular = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxta12 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTxtRes1 = new javax.swing.JTextField();
        jTxtRes2 = new javax.swing.JTextField();
        jTxta21 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTxta11 = new javax.swing.JTextField();
        jTxta22 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jTxtSol1 = new javax.swing.JTextField();
        jTxtSol2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Metodo de Gauss Jordan 2x2");

        jTxtX1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtX1ActionPerformed(evt);
            }
        });
        jTxtX1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtX1KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("X");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("+");

        jTxtY1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtY1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtY1ActionPerformed(evt);
            }
        });
        jTxtY1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtY1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Y");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("=");

        jTxtR1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtR1ActionPerformed(evt);
            }
        });
        jTxtR1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtR1KeyTyped(evt);
            }
        });

        jTxtR2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtR2ActionPerformed(evt);
            }
        });
        jTxtR2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtR2KeyTyped(evt);
            }
        });

        jTxtX2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtX2ActionPerformed(evt);
            }
        });
        jTxtX2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtX2KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("X");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("+");

        jTxtY2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtY2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtY2ActionPerformed(evt);
            }
        });
        jTxtY2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtY2KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Y");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("=");

        jBtnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnCalcular.setText("Calcular");
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Solucion:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("+");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("=");

        jTxta12.setEditable(false);
        jTxta12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxta12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxta12ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Y");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("=");

        jTxtRes1.setEditable(false);
        jTxtRes1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtRes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRes1ActionPerformed(evt);
            }
        });

        jTxtRes2.setEditable(false);
        jTxtRes2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtRes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRes2ActionPerformed(evt);
            }
        });

        jTxta21.setEditable(false);
        jTxta21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxta21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxta21ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("X");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("+");

        jTxta11.setEditable(false);
        jTxta11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxta11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxta11ActionPerformed(evt);
            }
        });

        jTxta22.setEditable(false);
        jTxta22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxta22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxta22ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("X");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxta21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(3, 3, 3)
                        .addComponent(jTxta22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(2, 2, 2)
                        .addComponent(jTxtRes2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxta11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(3, 3, 3)
                        .addComponent(jTxta12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(2, 2, 2)
                        .addComponent(jTxtRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxta11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel11)
                    .addComponent(jTxta12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jTxtRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxta21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jTxta22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel12)
                    .addComponent(jTxtRes2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Procedimiento");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Conj Sol: [");

        jTxtSol1.setEditable(false);
        jTxtSol1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtSol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSol1ActionPerformed(evt);
            }
        });

        jTxtSol2.setEditable(false);
        jTxtSol2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtSol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSol2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText(",");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("]");

        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7)
                                                .addGap(3, 3, 3)
                                                .addComponent(jTxtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addGap(2, 2, 2)
                                                .addComponent(jTxtR2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(3, 3, 3)
                                        .addComponent(jTxtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addGap(2, 2, 2)
                                        .addComponent(jTxtR1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButtonAtras)))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(4, 4, 4)
                        .addComponent(jTxtSol1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21)
                        .addGap(2, 2, 2)
                        .addComponent(jTxtSol2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jTxtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jTxtR1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jTxtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jTxtR2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jBtnCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAtras))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTxtSol1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSol2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtX1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtX1ActionPerformed

    private void jTxtY1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtY1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtY1ActionPerformed

    private void jTxtR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtR1ActionPerformed

    private void jTxtR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtR2ActionPerformed

    private void jTxtX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtX2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtX2ActionPerformed

    private void jTxtY2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtY2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtY2ActionPerformed

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        X1 = Double.parseDouble(jTxtX1.getText());
        X2 = Double.parseDouble(jTxtX2.getText());
        Y1 = Double.parseDouble(jTxtY1.getText());
        Y2 = Double.parseDouble(jTxtY2.getText());
        R1 = Double.parseDouble(jTxtR1.getText());
        R2 = Double.parseDouble(jTxtR2.getText());
        matrices();
        boolean flag = false;
        imprimir();
        if (X1 != 1) {
            jTextArea1.append("F1/" + X1);
            jTextArea1.append("\n");
            double div = X1;
            X1 = X1 / div;
            Y1 = Y1 / div;
            R1 = R1 / div;
            matrices();
            imprimir();
            
        }
        if (X2 > 0) {
            jTextArea1.append("-" + X2 + "(F1) + F2");
            jTextArea1.append("\n");
            double mul = -X2;
            X2 = mul * X1 + X2;
            Y2 = mul * Y1 + Y2;
            R2 = mul * R1 + R2;
            matrices();
            imprimir();
        } else {
            jTextArea1.append(X2 * (-1) + "(F1) + F2");
            jTextArea1.append("\n");
            double mul = X2 * (-1);
            X2 = mul * X1 + X2;
            Y2 = mul * Y1 + Y2;
            R2 = mul * R1 + R2;
            matrices();
            imprimir();
            
        }
        if (Y2 != 1) {
            jTextArea1.append("F2/" + Y2);
            jTextArea1.append("\n");
            double div = Y2;
            X2 = X2 / div;
            Y2 = Y2 / div;
            R2 = R2 / div;
            matrices();
            imprimir();
        }
        if (Y1 > 0) {
            jTextArea1.append("-" + Y1 + "(F2) + F1");
            jTextArea1.append("\n");
            double mul = -Y1;
            X1 = mul * X2 + X1;
            Y1 = mul * Y2 + Y1;
            R1 = mul * R2 + R1;
            matrices();
            imprimir();
        } else {
            jTextArea1.append(Y1 * (-1) + "(F2) + F1");
            jTextArea1.append("\n");
            double mul = Y1 * (-1);
            X1 = mul * X2 + X1;
            Y1 = mul * Y2 + Y1;
            R1 = mul * R2 + R1;
            matrices();
            imprimir();
            System.out.println("a");
            
        }
       //Falta por corregirr la cantidad de decimales mostrados en los cuadros de conjuto solucion y matriz respuesta
        /*jTextX1F.setText(Double.toString(X1));
        jTextX2F.setText(Double.toString(X2));
        jTextY1F.setText(Double.toString(Y1));
        jTextY2F.setText(Double.toString(Y2));
        jTextR1F.setText(Double.toString(R1));
        jTextR2F.setText(Double.toString(R2));
        
        jTxtSol1.setText(Double.toString(matriz[2][0]));
        jTxtSol2.setText(Double.toString(matriz[2][1]));
        */
    }//GEN-LAST:event_jBtnCalcularActionPerformed

    private void jTxta12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxta12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxta12ActionPerformed

    private void jTxtRes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRes1ActionPerformed

    private void jTxtRes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRes2ActionPerformed

    private void jTxta21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxta21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxta21ActionPerformed

    private void jTxta11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxta11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxta11ActionPerformed

    private void jTxta22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxta22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxta22ActionPerformed

    private void jTxtSol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSol1ActionPerformed

    private void jTxtSol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSol2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSol2ActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        MetodoGaussJordan menuP = new MetodoGaussJordan();
        menuP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jTxtX1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtX1KeyTyped
        ((AbstractDocument) jTxtX1.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtX1KeyTyped

    private void jTxtY1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtY1KeyTyped
         ((AbstractDocument) jTxtY1.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtY1KeyTyped

    private void jTxtR1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtR1KeyTyped
        ((AbstractDocument) jTxtR1.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtR1KeyTyped

    private void jTxtX2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtX2KeyTyped
        ((AbstractDocument) jTxtX2.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtX2KeyTyped

    private void jTxtY2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtY2KeyTyped
        ((AbstractDocument) jTxtY2.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtY2KeyTyped

    private void jTxtR2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtR2KeyTyped
        ((AbstractDocument) jTxtR2.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtR2KeyTyped
                                                     
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
            java.util.logging.Logger.getLogger(NumeroIncognitas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumeroIncognitas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumeroIncognitas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumeroIncognitas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumeroIncognitas2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTxtR1;
    private javax.swing.JTextField jTxtR2;
    private javax.swing.JTextField jTxtRes1;
    private javax.swing.JTextField jTxtRes2;
    private javax.swing.JTextField jTxtSol1;
    private javax.swing.JTextField jTxtSol2;
    private javax.swing.JTextField jTxtX1;
    private javax.swing.JTextField jTxtX2;
    private javax.swing.JTextField jTxtY1;
    private javax.swing.JTextField jTxtY2;
    private javax.swing.JTextField jTxta11;
    private javax.swing.JTextField jTxta12;
    private javax.swing.JTextField jTxta21;
    private javax.swing.JTextField jTxta22;
    // End of variables declaration//GEN-END:variables
}
