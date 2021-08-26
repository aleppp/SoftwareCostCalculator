
package C3;

import java.io.*;
import javax.swing.*;
import java.util.*;

public class UnadjustedFunctionPoint extends javax.swing.JFrame {
    int[] userInputs = new int[3];
    int[] userOutputs = new int[3];
    int[] userInquiries = new int[3];
    int[] internalFiles = new int[3];
    int[] externalFiles = new int[3];
    
    UFP ufp = new UFP();

    public UnadjustedFunctionPoint() {
        initComponents();
        
        this.setLocationRelativeTo(null);  
    }
    
    public void userInputs(){
        userInputs[0]=Integer.parseInt(userInputs1.getText().trim());
        userInputs[1]=Integer.parseInt(userInputs2.getText().trim());
        userInputs[2]=Integer.parseInt(userInputs3.getText().trim());
        
        ufp.setUserInputs(userInputs);
        ufp.displayUFP();
    }
    
    public void userOutputs(){
        userOutputs[0]=Integer.parseInt(userOutput1.getText().trim());
        userOutputs[1]=Integer.parseInt(userOutput2.getText().trim());
        userOutputs[2]=Integer.parseInt(userOutput3.getText().trim());
        
        ufp.setUserOutputs(userOutputs);
    }
    
    public void userInquiries(){
        userInquiries[0]=Integer.parseInt(userInquiries1.getText().trim());
        userInquiries[1]=Integer.parseInt(userInquiries2.getText().trim());
        userInquiries[2]=Integer.parseInt(userInquiries3.getText().trim());
        
        ufp.setUserInquiries(userInquiries);
    }
    
    public void internalFiles(){
        internalFiles[0]=Integer.parseInt(InternalFiles1.getText().trim());
        internalFiles[1]=Integer.parseInt(internalFiles2.getText().trim());
        internalFiles[2]=Integer.parseInt(internalFiles3.getText().trim());
        
        ufp.setInternalFiles(internalFiles);
    }
    
    public void externalFiles(){
        externalFiles[0]=Integer.parseInt(externalFiles1.getText().trim());
        externalFiles[1]=Integer.parseInt(externalFiles2.getText().trim());
        externalFiles[2]=Integer.parseInt(externalFiles3.getText().trim());
        
        ufp.setExternalFiles(externalFiles);
    }
    
    void verifyInputs(){
        if(userInputs1.getText().isEmpty() || userInputs2.getText().isEmpty() || userInputs3.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Please enter all values before proceeding to the next section");
        }
        
        else if(userOutput1.getText().isEmpty() || userOutput3.getText().isEmpty() || userOutput2.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Please enter all values before proceeding to the next section");    
        }
        
        else if(userInquiries1.getText().isEmpty() || userInquiries3.getText().isEmpty() || userInquiries2.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Please enter all values before proceeding to the next section"); 
        }
        
        else if(InternalFiles1.getText().isEmpty() || internalFiles2.getText().isEmpty() || internalFiles3.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Please enter all values before proceeding to the next section");
        }
        
        else if(externalFiles1.getText().isEmpty() || externalFiles2.getText().isEmpty() || externalFiles3.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all values before proceeding to the next section");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        userInputs1 = new javax.swing.JTextField();
        userInputs2 = new javax.swing.JTextField();
        userInputs3 = new javax.swing.JTextField();
        userOutput1 = new javax.swing.JTextField();
        userOutput2 = new javax.swing.JTextField();
        userInquiries1 = new javax.swing.JTextField();
        userOutput3 = new javax.swing.JTextField();
        InternalFiles1 = new javax.swing.JTextField();
        externalFiles1 = new javax.swing.JTextField();
        internalFiles2 = new javax.swing.JTextField();
        externalFiles2 = new javax.swing.JTextField();
        userInquiries2 = new javax.swing.JTextField();
        externalFiles3 = new javax.swing.JTextField();
        internalFiles3 = new javax.swing.JTextField();
        userInquiries3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENTER UNADJUSTED FUNCTION POINT");

        jPanel2.setBackground(new java.awt.Color(188, 139, 194));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(800, 530));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 530));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(800, 91));
        jPanel4.setMinimumSize(new java.awt.Dimension(800, 91));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CRAFTING COST CALCULATOR");

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel2.setText("Fill the following table with the estimate that pertain");

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel3.setText("the software you are developing.");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/C3/homeicon3.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(680, 270));

        jPanel6.setBackground(new java.awt.Color(249, 208, 252));

        jLabel4.setBackground(new java.awt.Color(188, 139, 194));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Number of user input.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBackground(new java.awt.Color(249, 208, 252));
        jPanel7.setMaximumSize(new java.awt.Dimension(172, 24));
        jPanel7.setMinimumSize(new java.awt.Dimension(172, 24));

        jLabel5.setBackground(new java.awt.Color(188, 139, 194));
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Number of user output.");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.setBackground(new java.awt.Color(249, 208, 252));
        jPanel8.setMaximumSize(new java.awt.Dimension(172, 24));
        jPanel8.setMinimumSize(new java.awt.Dimension(172, 24));

        jLabel6.setBackground(new java.awt.Color(188, 139, 194));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Number of user inquiries.");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel9.setBackground(new java.awt.Color(249, 208, 252));
        jPanel9.setMaximumSize(new java.awt.Dimension(172, 24));
        jPanel9.setMinimumSize(new java.awt.Dimension(172, 24));

        jLabel7.setBackground(new java.awt.Color(188, 139, 194));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("Number of files.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel10.setBackground(new java.awt.Color(249, 208, 252));
        jPanel10.setMaximumSize(new java.awt.Dimension(172, 24));
        jPanel10.setMinimumSize(new java.awt.Dimension(172, 24));

        jLabel8.setBackground(new java.awt.Color(188, 139, 194));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Number of external interfaces");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel11.setBackground(new java.awt.Color(249, 208, 252));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 255)));
        jPanel11.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Simple");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(249, 208, 252));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 255)));
        jPanel14.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Average");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(249, 208, 252));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 255)));
        jPanel15.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Complex");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        userInputs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputs1ActionPerformed(evt);
            }
        });
        userInputs1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userInputs1KeyPressed(evt);
            }
        });

        userInputs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputs2ActionPerformed(evt);
            }
        });
        userInputs2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userInputs2KeyPressed(evt);
            }
        });

        userInputs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputs3ActionPerformed(evt);
            }
        });
        userInputs3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userInputs3KeyPressed(evt);
            }
        });

        userOutput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userOutput1ActionPerformed(evt);
            }
        });
        userOutput1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userOutput1KeyPressed(evt);
            }
        });

        userOutput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userOutput2ActionPerformed(evt);
            }
        });
        userOutput2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userOutput2KeyPressed(evt);
            }
        });

        userInquiries1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInquiries1ActionPerformed(evt);
            }
        });
        userInquiries1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userInquiries1KeyPressed(evt);
            }
        });

        userOutput3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userOutput3ActionPerformed(evt);
            }
        });
        userOutput3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userOutput3KeyPressed(evt);
            }
        });

        InternalFiles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternalFiles1ActionPerformed(evt);
            }
        });
        InternalFiles1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InternalFiles1KeyPressed(evt);
            }
        });

        externalFiles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                externalFiles1ActionPerformed(evt);
            }
        });
        externalFiles1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                externalFiles1KeyPressed(evt);
            }
        });

        internalFiles2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internalFiles2ActionPerformed(evt);
            }
        });
        internalFiles2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                internalFiles2KeyPressed(evt);
            }
        });

        externalFiles2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                externalFiles2ActionPerformed(evt);
            }
        });
        externalFiles2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                externalFiles2KeyPressed(evt);
            }
        });

        userInquiries2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInquiries2ActionPerformed(evt);
            }
        });
        userInquiries2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userInquiries2KeyPressed(evt);
            }
        });

        externalFiles3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                externalFiles3ActionPerformed(evt);
            }
        });
        externalFiles3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                externalFiles3KeyPressed(evt);
            }
        });

        internalFiles3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internalFiles3ActionPerformed(evt);
            }
        });
        internalFiles3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                internalFiles3KeyPressed(evt);
            }
        });

        userInquiries3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInquiries3ActionPerformed(evt);
            }
        });
        userInquiries3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userInquiries3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(userInquiries1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userOutput1)
                                    .addComponent(userInputs1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(userInputs2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userInputs3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(userInquiries2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(userOutput2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userOutput3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userInquiries3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(externalFiles1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(externalFiles2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(externalFiles3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(104, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(InternalFiles1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(internalFiles2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(internalFiles3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userInputs1)
                    .addComponent(userInputs2)
                    .addComponent(userInputs3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userOutput1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userOutput3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userOutput2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userInquiries1)
                    .addComponent(userInquiries2)
                    .addComponent(userInquiries3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InternalFiles1)
                    .addComponent(internalFiles2)
                    .addComponent(internalFiles3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(externalFiles1)
                    .addComponent(externalFiles3)
                    .addComponent(externalFiles2)))
        );

        jButton1.setBackground(new java.awt.Color(249, 208, 252));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(249, 208, 252));
        jButton3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton3.setText("Next");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void externalFiles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_externalFiles1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_externalFiles1ActionPerformed

    private void internalFiles2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internalFiles2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_internalFiles2ActionPerformed

    private void externalFiles2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_externalFiles2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_externalFiles2ActionPerformed

    private void userInquiries2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInquiries2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInquiries2ActionPerformed

    private void externalFiles3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_externalFiles3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_externalFiles3ActionPerformed

    private void internalFiles3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internalFiles3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_internalFiles3ActionPerformed

    private void userInquiries3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInquiries3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInquiries3ActionPerformed

    private void userInquiries1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInquiries1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInquiries1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    verifyInputs();
        
    userInputs();
    userOutputs();
    userInquiries();
    internalFiles();
    externalFiles();
    ufp.displayUFP();
    
    double temp=ufp.calcUFP();
    System.out.println(temp);
    new afp(temp).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        clearFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void userInputs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputs1ActionPerformed

    private void userInputs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputs2ActionPerformed

    private void userInputs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputs3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputs3ActionPerformed

    private void userOutput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userOutput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userOutput1ActionPerformed

    private void userOutput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userOutput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userOutput2ActionPerformed

    private void userOutput3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userOutput3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userOutput3ActionPerformed

    private void InternalFiles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternalFiles1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InternalFiles1ActionPerformed

    private void userInputs1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userInputs1KeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            userInputs1.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            userInputs1.setEditable(true);
        }
    }//GEN-LAST:event_userInputs1KeyPressed

    private void userInputs2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userInputs2KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            userInputs2.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            userInputs2.setEditable(true);
        }
    }//GEN-LAST:event_userInputs2KeyPressed

    private void userInputs3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userInputs3KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            userInputs3.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            userInputs3.setEditable(true);
        }
    }//GEN-LAST:event_userInputs3KeyPressed

    private void userOutput1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userOutput1KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            userOutput1.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            userOutput1.setEditable(true);
        }
    }//GEN-LAST:event_userOutput1KeyPressed

    private void userOutput2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userOutput2KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            userOutput2.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            userOutput2.setEditable(true);
        }
    }//GEN-LAST:event_userOutput2KeyPressed

    private void userOutput3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userOutput3KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            userOutput3.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            userOutput3.setEditable(true);
        }
    }//GEN-LAST:event_userOutput3KeyPressed

    private void userInquiries1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userInquiries1KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            userInquiries1.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            userInquiries1.setEditable(true);
        }
    }//GEN-LAST:event_userInquiries1KeyPressed

    private void userInquiries2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userInquiries2KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            userInquiries2.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            userInquiries2.setEditable(true);
        }
    }//GEN-LAST:event_userInquiries2KeyPressed

    private void userInquiries3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userInquiries3KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            userInquiries3.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            userInquiries3.setEditable(true);
        }
    }//GEN-LAST:event_userInquiries3KeyPressed

    private void InternalFiles1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InternalFiles1KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            InternalFiles1.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
           InternalFiles1.setEditable(true);
        }
    }//GEN-LAST:event_InternalFiles1KeyPressed

    private void internalFiles2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_internalFiles2KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            internalFiles2.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            internalFiles2.setEditable(true);
        }
    }//GEN-LAST:event_internalFiles2KeyPressed

    private void internalFiles3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_internalFiles3KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            internalFiles3.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            internalFiles3.setEditable(true);
        }
    }//GEN-LAST:event_internalFiles3KeyPressed

    private void externalFiles1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_externalFiles1KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            externalFiles1.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            externalFiles1.setEditable(true);
        }
    }//GEN-LAST:event_externalFiles1KeyPressed

    private void externalFiles2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_externalFiles2KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            externalFiles2.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            externalFiles2.setEditable(true);
        }
    }//GEN-LAST:event_externalFiles2KeyPressed

    private void externalFiles3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_externalFiles3KeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c))
        {
            externalFiles3.setEditable(true);
            JOptionPane.showMessageDialog(null, "Cannot be character or space");
        }
        else{
            externalFiles3.setEditable(true);
        }
    }//GEN-LAST:event_externalFiles3KeyPressed

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
            java.util.logging.Logger.getLogger(UnadjustedFunctionPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnadjustedFunctionPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnadjustedFunctionPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnadjustedFunctionPoint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UnadjustedFunctionPoint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InternalFiles1;
    private javax.swing.JTextField externalFiles1;
    private javax.swing.JTextField externalFiles2;
    private javax.swing.JTextField externalFiles3;
    private javax.swing.JTextField internalFiles2;
    private javax.swing.JTextField internalFiles3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField userInputs1;
    private javax.swing.JTextField userInputs2;
    private javax.swing.JTextField userInputs3;
    private javax.swing.JTextField userInquiries1;
    private javax.swing.JTextField userInquiries2;
    private javax.swing.JTextField userInquiries3;
    private javax.swing.JTextField userOutput1;
    private javax.swing.JTextField userOutput2;
    private javax.swing.JTextField userOutput3;
    // End of variables declaration//GEN-END:variables

    private void clearFields(){
        userInputs1.setText("");
        userInputs2.setText("");
        userInputs3.setText("");
        userOutput1.setText("");
        userOutput2.setText("");
        userOutput3.setText("");
        userInquiries1.setText("");
        userInquiries2.setText("");
        userInquiries3.setText("");
        InternalFiles1.setText("");
        internalFiles2.setText("");
        internalFiles3.setText("");
        externalFiles1.setText("");
        externalFiles2.setText("");
        externalFiles3.setText("");
    }

}
