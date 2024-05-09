/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;

import java.text.DecimalFormat;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author Raul
 */
public class NumeroIncognitas2 extends javax.swing.JFrame {
    double X1, X2, Y1, Y2, R1, R2;
    int pos = 0;
    int pos2 = 0;
    double[][] matriz = new double[3][2];
    DecimalFormat df = new DecimalFormat("0.00");
    DecimalFormat ent = new DecimalFormat("0");
    String Redondeado = "";
    String Redondeado1 = "";


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

    public void matrices() {
        matriz[0][0] = X1;
        matriz[0][1] = X2;
        matriz[1][0] = Y1;
        matriz[1][1] = Y2;
        matriz[2][0] = R1;
        matriz[2][1] = R2;
    }
    public String formato(double valor){
        if (valor %1 == 0) {
           return ent.format(valor) ;
        }else {
           return df.format(valor) ;
        }
    }
    public NumeroIncognitas2() {
        super("Calculadora Gauss Jordan 2x2");
        initComponents();
        this.setLocationRelativeTo(null);// al momento de ejecutar la aplicacion lo ventana se  centra en la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTxtX1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtY1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtR1 = new javax.swing.JTextField();
        jTxtX2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtY2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtR2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jBtnCalcular = new javax.swing.JButton();
        jBClean = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtYR1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTxtRes1 = new javax.swing.JTextField();
        jTxtRes2 = new javax.swing.JTextField();
        jTxtXR2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTxtXR1 = new javax.swing.JTextField();
        jTxtYR2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTxtSol1 = new javax.swing.JTextField();
        jTxtSol2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextDiv1 = new javax.swing.JTextField();
        jTextRD = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextDiv2 = new javax.swing.JTextField();
        jBtnDiv = new javax.swing.JButton();
        jLabelMess = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelMsI = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(32, 32, 32));
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(35, 35, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Solucion del Método de Gauss Jordan 2x2");

        jPanel2.setBackground(new java.awt.Color(56, 56, 56));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTxtX1.setBackground(new java.awt.Color(27, 27, 27));
        jTxtX1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtX1.setHorizontalAlignment(JTextField.RIGHT);
        jTxtX1.setForeground(new java.awt.Color(255, 255, 255));
        jTxtX1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtX1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        jTxtX1.addKeyListener( new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                char character = e.getKeyChar();
                if (!Character.isDigit(character) && character != '+' && character != '-' && character != '.') {
                    e.consume(); // Evita que se ingrese el caracter no permitido
                }
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("+");

        jTxtY1.setBackground(new java.awt.Color(27, 27, 27));
        jTxtY1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtY1.setForeground(new java.awt.Color(255, 255, 255));
        jTxtY1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtY1.setHorizontalAlignment(JTextField.RIGHT);
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
        jTxtY1.addKeyListener( new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                char character = e.getKeyChar();
                if (!Character.isDigit(character) && character != '+' && character != '-'&& character != '.') {
                    e.consume(); // Evita que se ingrese el caracter no permitido
                }
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Y");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("=");

        jTxtR1.setBackground(new java.awt.Color(27, 27, 27));
        jTxtR1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtR1.setForeground(new java.awt.Color(255, 255, 255));
        jTxtR1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtR1.setHorizontalAlignment(JTextField.RIGHT);
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
        jTxtR1.addKeyListener( new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                char character = e.getKeyChar();
                if (!Character.isDigit(character) && character != '+' && character != '-' && character != '.') {
                    e.consume(); // Evita que se ingrese el caracter no permitido
                }
            }
        });

        jTxtX2.setBackground(new java.awt.Color(27, 27, 27));
        jTxtX2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtX2.setForeground(new java.awt.Color(255, 255, 255));
        jTxtX2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtX2.setHorizontalAlignment(JTextField.RIGHT);
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
        jTxtX2.addKeyListener( new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                char character = e.getKeyChar();
                if (!Character.isDigit(character) && character != '+' && character != '-' && character != '.') {
                    e.consume(); // Evita que se ingrese el caracter no permitido
                }
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("+");

        jTxtY2.setBackground(new java.awt.Color(27, 27, 27));
        jTxtY2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtY2.setForeground(new java.awt.Color(255, 255, 255));
        jTxtY2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtY2.setHorizontalAlignment(JTextField.RIGHT);
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
        jTxtY2.addKeyListener( new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                char character = e.getKeyChar();
                if (!Character.isDigit(character) && character != '+' && character != '-' && character != '.') {
                    e.consume(); // Evita que se ingrese el caracter no permitido
                }
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Y");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("=");

        jTxtR2.setBackground(new java.awt.Color(27, 27, 27));
        jTxtR2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtR2.setForeground(new java.awt.Color(255, 255, 255));
        jTxtR2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtR2.setHorizontalAlignment(JTextField.RIGHT);
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
        jTxtR2.addKeyListener( new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                char character = e.getKeyChar();
                if (!Character.isDigit(character) && character != '+' && character != '-' && character != '.') {
                    e.consume(); // Evita que se ingrese el caracter no permitido
                }
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTxtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(jTxtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtR2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTxtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(jTxtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtR1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTxtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTxtR1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jTxtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTxtR2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Si tienes una fraccion, puedes realizar aqui");

        jBtnCalcular.setBackground(new java.awt.Color(227, 36, 66));
        jBtnCalcular.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jBtnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCalcular.setText("Calcular");
        jBtnCalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        jBClean.setBackground(new java.awt.Color(227, 36, 66));
        jBClean.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jBClean.setForeground(new java.awt.Color(255, 255, 255));
        jBClean.setText("Limpiar");
        jBClean.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBClean.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCleanActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Solucion:");

        jPanel1.setBackground(new java.awt.Color(56, 56, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("+");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("=");

        jTxtYR1.setEditable(false);
        jTxtYR1.setBackground(new java.awt.Color(27, 27, 27));
        jTxtYR1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtYR1.setForeground(new java.awt.Color(255, 255, 255));
        jTxtYR1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtYR1.setHorizontalAlignment(JTextField.RIGHT);
        jTxtYR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtYR1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Y");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("=");

        jTxtRes1.setEditable(false);
        jTxtRes1.setBackground(new java.awt.Color(27, 27, 27));
        jTxtRes1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtRes1.setForeground(new java.awt.Color(255, 255, 255));
        jTxtRes1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtRes1.setHorizontalAlignment(JTextField.RIGHT);
        jTxtRes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRes1ActionPerformed(evt);
            }
        });

        jTxtRes2.setEditable(false);
        jTxtRes2.setBackground(new java.awt.Color(27, 27, 27));
        jTxtRes2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtRes2.setForeground(new java.awt.Color(255, 255, 255));
        jTxtRes2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtRes2.setHorizontalAlignment(JTextField.RIGHT);
        jTxtRes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRes2ActionPerformed(evt);
            }
        });

        jTxtXR2.setEditable(false);
        jTxtXR2.setBackground(new java.awt.Color(27, 27, 27));
        jTxtXR2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtXR2.setForeground(new java.awt.Color(255, 255, 255));
        jTxtXR2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtXR2.setHorizontalAlignment(JTextField.RIGHT);
        jTxtXR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtXR2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("+");

        jTxtXR1.setEditable(false);
        jTxtXR1.setBackground(new java.awt.Color(27, 27, 27));
        jTxtXR1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtXR1.setForeground(new java.awt.Color(255, 255, 255));
        jTxtXR1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtXR1.setHorizontalAlignment(JTextField.RIGHT);
        jTxtXR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtXR1ActionPerformed(evt);
            }
        });

        jTxtYR2.setEditable(false);
        jTxtYR2.setBackground(new java.awt.Color(27, 27, 27));
        jTxtYR2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtYR2.setForeground(new java.awt.Color(255, 255, 255));
        jTxtYR2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtYR2.setHorizontalAlignment(JTextField.RIGHT);
        jTxtYR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtYR2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("X");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtXR2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtYR2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtXR1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtYR1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jTxtRes2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtXR1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel11)
                    .addComponent(jTxtYR1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jTxtRes1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtXR2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jTxtYR2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel12)
                    .addComponent(jTxtRes2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Y");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("X");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Conj Sol: [");

        jTxtSol1.setEditable(false);
        jTxtSol1.setBackground(new java.awt.Color(27, 27, 27));
        jTxtSol1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtSol1.setForeground(new java.awt.Color(255, 255, 255));
        jTxtSol1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtSol1.setHorizontalAlignment(JTextField.RIGHT);
        jTxtSol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSol1ActionPerformed(evt);
            }
        });

        jTxtSol2.setEditable(false);
        jTxtSol2.setBackground(new java.awt.Color(27, 27, 27));
        jTxtSol2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtSol2.setForeground(new java.awt.Color(255, 255, 255));
        jTxtSol2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTxtSol2.setHorizontalAlignment(JTextField.RIGHT);
        jTxtSol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSol2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText(";");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("]");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Ingrese los coeficientes del sistema en las celdas:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("su conversion a valor decimal");

        jPanel4.setBackground(new java.awt.Color(56, 56, 56));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextDiv1.setBackground(new java.awt.Color(27, 27, 27));
        jTextDiv1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextDiv1.setForeground(new java.awt.Color(255, 255, 255));
        jTextDiv1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextDiv1.setHorizontalAlignment(JTextField.RIGHT);
        jTextDiv1.addKeyListener( new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                char character = e.getKeyChar();
                if (!Character.isDigit(character) && character != '+' && character != '-' && character != '.') {
                    e.consume(); // Evita que se ingrese el caracter no permitido
                }
            }
        });

        jTextRD.setEditable(false);
        jTextRD.setBackground(new java.awt.Color(27, 27, 27));
        jTextRD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextRD.setForeground(new java.awt.Color(255, 255, 255));
        jTextRD.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("/");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("=");

        jTextDiv2.setBackground(new java.awt.Color(27, 27, 27));
        jTextDiv2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextDiv2.setForeground(new java.awt.Color(255, 255, 255));
        jTextDiv2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextDiv2.setHorizontalAlignment(JTextField.RIGHT);
        jTextDiv2.addKeyListener( new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                char character = e.getKeyChar();
                if (!Character.isDigit(character) && character != '+' && character != '-' && character != '.') {
                    e.consume(); // Evita que se ingrese el caracter no permitido
                }
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTextDiv1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextDiv2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextRD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextDiv1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDiv2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextRD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jBtnDiv.setBackground(new java.awt.Color(227, 36, 66));
        jBtnDiv.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jBtnDiv.setForeground(new java.awt.Color(255, 255, 255));
        jBtnDiv.setText("Calcular Fracción");
        jBtnDiv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivActionPerformed(evt);
            }
        });

        jLabelMess.setVisible(false);
        jLabelMess.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMess.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMess.setText("Para volver a calular una matriz pulsa \"Limpiar\"");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Procedimiento Paso a Paso");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(56, 56, 56));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        jLabelMsI.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMsI.setVisible(false);
        jLabelMsI.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMsI.setText("Sistema con Infinitas soluciones");

        jButtonAtras.setBackground(new java.awt.Color(227, 36, 66));
        jButtonAtras.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setText("Atrás");
        jButtonAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(56, 56, 56));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("AVISO:\n" + "Si su sistema de ecuaciones posee valores en fracciones debe convertirlas a decimales (Puede ayudarse de la herramienta de arriba) y colocar el resultado en el lugar correspondiente");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jBtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBClean, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelMess)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel30)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnDiv)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMsI)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(4, 4, 4)
                                .addComponent(jTxtSol1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addGap(5, 5, 5)
                                .addComponent(jTxtSol2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(773, 773, 773)
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(371, 371, 371))
            .addComponent(jSeparator1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelMsI, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnDiv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCalcular)
                    .addComponent(jBClean))
                .addGap(8, 8, 8)
                .addComponent(jLabelMess)
                .addGap(12, 12, 12)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(jTxtSol1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtSol2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22)
                                .addComponent(jButtonAtras))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtX1ActionPerformed
        // TODO addur handling code here
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

    }//GEN-LAST:event_jTxtY2ActionPerformed

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        jBtnCalcular.setEnabled(false);
        jLabelMess.setVisible(true);
        X1 = Double.parseDouble(jTxtX1.getText());
        X2 = Double.parseDouble(jTxtX2.getText());
        Y1 = Double.parseDouble(jTxtY1.getText());
        Y2 = Double.parseDouble(jTxtY2.getText());
        R1 = Double.parseDouble(jTxtR1.getText());
        R2 = Double.parseDouble(jTxtR2.getText());
        matrices();
        imprimir();
        if (X1 != 1) {
            jTextArea1.append("F1/" + formato(X1));
            jTextArea1.append("\n");
            double div = X1;
            X1 = X1 / div;
            Y1 = Y1 / div;
            R1 = R1 / div;
            matrices();
            imprimir();

        }
        if (X2 > 0) {
            jTextArea1.append("-" + formato(X2) + "(F1) + F2");
            jTextArea1.append("\n");
            double mul = -X2;
            X2 = mul * X1 + X2;
            Y2 = mul * Y1 + Y2;
            R2 = mul * R1 + R2;
            matrices();
            imprimir();
        } else {
            jTextArea1.append(formato(X2 * (-1)) + "(F1) + F2");
            jTextArea1.append("\n");
            double mul = X2 * (-1);
            X2 = mul * X1 + X2;
            Y2 = mul * Y1 + Y2;
            R2 = mul * R1 + R2;
            matrices();
            imprimir();

        }

        if (X2 == 0 && Y2 == 0 || X2 == 0 && Y2 == 0 && R2 == 0) {
            jTextArea1.append("Sistema con infinitas soluciones");
            jTxtSol1.setText("∞");
            jTxtSol2.setText("∞");
            jLabelMsI.setVisible(true);
        } else {
            if (Y2 != 1) {
                jTextArea1.append("F2/" + formato(Y2));
                jTextArea1.append("\n");
                double div = Y2;
                X2 = X2 / div;
                Y2 = Y2 / div;
                R2 = R2 / div;
                matrices();
                imprimir();
            }
            if (Y1 > 0) {
                jTextArea1.append("-" + formato(Y1) + "(F2) + F1");
                jTextArea1.append("\n");
                double mul = -Y1;
                X1 = mul * X2 + X1;
                Y1 = mul * Y2 + Y1;
                R1 = mul * R2 + R1;
                matrices();
                imprimir();
            } else {
                jTextArea1.append(formato(Y1 * (-1)) + "(F2) + F1");
                jTextArea1.append("\n");
                double mul = Y1 * (-1);
                X1 = mul * X2 + X1;
                Y1 = mul * Y2 + Y1;
                R1 = mul * R2 + R1;
                matrices();
                imprimir();
            }

            if (matriz[2][0] % 1 == 0) {
                Redondeado = String.format("%.0f", matriz[2][0]);
                jTxtRes1.setText((Redondeado));
                jTxtSol1.setText((Redondeado));
            } else {
                Redondeado = String.format("%.2f", matriz[2][0]);
                jTxtRes1.setText((Redondeado));
                jTxtSol1.setText((Redondeado));
            }
            if (matriz[2][1] % 1 == 0) {
                Redondeado1 = String.format("%.0f", matriz[2][1]);
                jTxtRes2.setText((Redondeado1));
                jTxtSol2.setText((Redondeado1));
            } else {
                Redondeado1 = String.format("%.2f", matriz[2][1]);
                jTxtRes2.setText((Redondeado1));
                jTxtSol2.setText((Redondeado1));
            }

            jTxtXR1.setText(Double.toString(X1));
            jTxtXR2.setText(Double.toString(X2));
            jTxtYR1.setText(Double.toString(Y1));
            jTxtYR2.setText(Double.toString(Y2));
        }
    }//GEN-LAST:event_jBtnCalcularActionPerformed

    private void jTxtYR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtYR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtYR1ActionPerformed

    private void jTxtRes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRes1ActionPerformed

    private void jTxtRes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRes2ActionPerformed

    private void jTxtXR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtXR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtXR2ActionPerformed

    private void jTxtXR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtXR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtXR1ActionPerformed

    private void jTxtYR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtYR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtYR2ActionPerformed

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
        //((AbstractDocument) jTxtX1.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtX1KeyTyped

    private void jTxtY1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtY1KeyTyped
        //((AbstractDocument) jTxtY1.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtY1KeyTyped

    private void jTxtR1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtR1KeyTyped
        //((AbstractDocument) jTxtR1.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtR1KeyTyped

    private void jTxtX2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtX2KeyTyped
        //((AbstractDocument) jTxtX2.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtX2KeyTyped

    private void jTxtY2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtY2KeyTyped
        //((AbstractDocument) jTxtY2.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtY2KeyTyped

    private void jTxtR2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtR2KeyTyped
        //((AbstractDocument) jTxtR2.getDocument()).setDocumentFilter(new SymbolAndNumberFilter());
    }//GEN-LAST:event_jTxtR2KeyTyped

    private void jBCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCleanActionPerformed
        jLabelMess.setVisible(false);
        jBtnCalcular.setEnabled(true);
        jLabelMsI.setVisible(false);
        jTextArea1.setText("");
        ((AbstractDocument) jTxtX1.getDocument()).setDocumentFilter(null);
        jTxtX1.setText(null);
        ((AbstractDocument) jTxtX2.getDocument()).setDocumentFilter(null);
        jTxtX2.setText(null);
        ((AbstractDocument) jTxtY1.getDocument()).setDocumentFilter(null);
        jTxtY1.setText(null);
        ((AbstractDocument) jTxtY2.getDocument()).setDocumentFilter(null);
        jTxtY2.setText(null);
        ((AbstractDocument) jTxtR1.getDocument()).setDocumentFilter(null);
        jTxtR1.setText(null);
        ((AbstractDocument) jTxtR2.getDocument()).setDocumentFilter(null);
        jTxtR2.setText(null);
        jTxtXR1.setText("");
        jTxtXR2.setText("");
        jTxtYR1.setText("");
        jTxtYR2.setText("");
        jTxtRes1.setText("");
        jTxtRes2.setText("");
        jTxtSol1.setText("");
        jTxtSol2.setText("");
    }//GEN-LAST:event_jBCleanActionPerformed

    private void jBtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivActionPerformed
      double div1 = Double.parseDouble(jTextDiv1.getText());
      double div2 = Double.parseDouble(jTextDiv2.getText());
      double res = div1/div2;
      String redondear;
      redondear = String.format("%.2f", res);
      jTextRD.setText(redondear);
    }//GEN-LAST:event_jBtnDivActionPerformed

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
    private javax.swing.JButton jBClean;
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JButton jBtnDiv;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMess;
    private javax.swing.JLabel jLabelMsI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextDiv1;
    private javax.swing.JTextField jTextDiv2;
    private javax.swing.JTextField jTextRD;
    private javax.swing.JTextField jTxtR1;
    private javax.swing.JTextField jTxtR2;
    private javax.swing.JTextField jTxtRes1;
    private javax.swing.JTextField jTxtRes2;
    private javax.swing.JTextField jTxtSol1;
    private javax.swing.JTextField jTxtSol2;
    private javax.swing.JTextField jTxtX1;
    private javax.swing.JTextField jTxtX2;
    public javax.swing.JTextField jTxtXR1;
    private javax.swing.JTextField jTxtXR2;
    private javax.swing.JTextField jTxtY1;
    private javax.swing.JTextField jTxtY2;
    private javax.swing.JTextField jTxtYR1;
    private javax.swing.JTextField jTxtYR2;
    // End of variables declaration//GEN-END:variables
}
