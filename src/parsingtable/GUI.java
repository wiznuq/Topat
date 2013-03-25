package parsingtable;

import java.util.LinkedList;
import javax.swing.JTable;
import java.util.Stack;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author wiznuq
 */
public class GUI extends javax.swing.JFrame {

    private String[] rulesToken;
    private String[] rulesExpression;
    private String[] inputArray;
    private int rulesColumnCount;
    private int rulesRowCount;
    private String inputString;
    private String[][] rulesContent;
    int steps;
    LinkedList<String> inputStack = new LinkedList();
    LinkedList<String> currentStack = new LinkedList();
    int lastrow;
    String stack;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        getRules();
        steps = 0;
        lastrow = 0;
        //printContent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRules = new javax.swing.JTable();
        jTextInput = new javax.swing.JTextField();
        jBtnCheck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableResult = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBtnClearResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableRules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"E", "T E'", "T E'", "", "", null, null},
                {"E'", "", null, "+ T E'", "", "", null},
                {"T", "F T'", "F T'", null, null, null, null},
                {"T'", null, "", null, "* F T'", null, null},
                {"F", "( E )", "id", null, null, null, null}
            },
            new String [] {
                "", "(", "id", "+", "*", ")", "$"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableRules);

        jBtnCheck.setText("Check Input");
        jBtnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCheckActionPerformed(evt);
            }
        });

        jLabel1.setText("Input");

        jTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Match", "Stack", "Input", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableResult);
        jTableResult.getColumnModel().getColumn(0).setHeaderValue("Match");
        jTableResult.getColumnModel().getColumn(1).setHeaderValue("Stack");
        jTableResult.getColumnModel().getColumn(2).setHeaderValue("Input");
        jTableResult.getColumnModel().getColumn(3).setHeaderValue("Action");

        jLabel2.setText("Rules");

        jBtnClearResult.setText("Clear Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnClearResult))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCheck)
                            .addComponent(jBtnClearResult))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getRules() {


        rulesColumnCount = jTableRules.getColumnCount();
        rulesRowCount = jTableRules.getRowCount();
        rulesToken = new String[rulesColumnCount + 1];
        rulesExpression = new String[rulesRowCount + 1];


        JTableHeader th = jTableRules.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        for (int x = 1, y = tcm.getColumnCount(); x < y; x++) {
            TableColumn tc = tcm.getColumn(x);
            rulesToken[x] = (String) tc.getHeaderValue();
            System.out.println(rulesToken[x]);
            //System.out.println("Column name = " + tc.getHeaderValue() + ", width = " + tc.getWidth());
        }
        System.out.println("------");

        for (int i = 0; i < rulesRowCount; i++) {//row
            if (GetData(jTableRules, i, 0) != null) {
                rulesExpression[i] = GetData(jTableRules, i, 0).toString();
                System.out.println(rulesExpression[i]);
            }

        }
        System.out.println("------");
        rulesContent = new String[rulesColumnCount][rulesRowCount];
        for (int h = 1; h < rulesColumnCount; h++) {
            for (int i = 0; i < rulesRowCount; i++) {
                if (jTableRules.getValueAt(i, h) != null) {
                    rulesContent[h][i] = GetData(jTableRules, i, h).toString();
                    //System.out.println(h+" "+i+" "+rulesContent[h][i]);
                } else {
                    rulesContent[h][i] = "";
                    //System.out.println(h+" "+i+" "+rulesContent[h][i]);
                }


            }
        }




    }

    private void printContent() {
        for (int i = 0; i < rulesColumnCount; i++) {
            if (rulesToken[i] != null) {
                System.out.println(rulesToken[i]);//column
            }

        }
        for (int i = 0; i < rulesRowCount; i++) {//row
            if (rulesExpression[i] != null) {
                System.out.println(rulesExpression[i]);
            }
        }
    }

    private void compareInput() {
    }

    private boolean isOperator(String input) {

        String[] rules = new String[]{"+", "*", "(", ")"};
        for (int i = 0; i < rules.length; i++) {
            if (input.contains(rules[i])) {
                System.out.println(input);
                return true;
            }
        }


        return false;
    }

    private void nextStep() {
        //String temp = inputStack.pop().toString();

        //print input

        // jTableResult.setValueAt(arrayToString(inputArray), 0, 2);
        jTableResult.setValueAt(arrayToString(inputArray), lastrow, 2);
        if (steps == 0) {
            currentStack.add("E");
             stack="E";
        }



        String lastInputStack = inputStack.peek().toString();
       
        String lastStack = currentStack.peek().toString();
         jTableResult.setValueAt(stack, lastrow, 1);
         
         
         System.out.println("last input : " + lastInputStack);
        System.out.println("last stack : " + lastStack);
       
        System.out.println(rulesToken.length);
         
        if (lastStack.equals("id")) {
            System.out.println("1");
            if(lastStack.equals(lastInputStack)){
                inputStack.pop();
                jTableResult.setValueAt("Pop " + currentStack.pop() , lastrow, 3);
                
            }
            //action pop lastinput stack
            //action pop laststack
            //print out
        } 
        else {
            System.out.println("2");
            if (isOperator(lastStack)) {
                System.out.println("3");
                jTableResult.setValueAt("Pop " + inputStack.pop() , lastrow, 3);
                //poplast input//
                //print out
            } else {
                System.out.println("4");
                for (int h = 1; h < rulesToken.length - 1; h++) {//col
                    String temp = rulesToken[h];
                    //System.out.println(temp);
                    if (temp != null) {
                        
                        if (temp.equals(lastInputStack)) {
                            System.out.println("5");
                            for (int i = 0; i < rulesExpression.length; i++) {
                                String temp2 = rulesExpression[i];
                                //System.out.println(temp2);
                                if (lastStack.equals(temp2)) {
                                    
                                   
                                    currentStack.push(rulesContent[h][i]);
                                    stack=rulesContent[h][i];
                                    //write action
                                    jTableResult.setValueAt(rulesContent[h][i], lastrow, 3);
                                    lastrow++;
                                    break;
                                } else {
                                    jTableResult.setValueAt("", lastrow, 3);
                                }


                            }

                        }   

                    }
                }

                //push action 

            }
        }




        







        steps++;
    }

    private String arrayToString(String[] array) {
        String temp = "";
        for (int i = 0; i < array.length; i++) {
            temp += array[i];
        }

        return temp;
    }

    private String[] Spliter(String input) {
        String[] temp;
        temp = input.split(" ");
        return temp;
    }

    public Object GetData(JTable table, int row_index, int col_index) {
        return table.getModel().getValueAt(row_index, col_index);
    }

    private void jBtnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCheckActionPerformed
        String input = jTextInput.getText();
        inputString = input;

        inputArray = input.split(" ");

        pushArrayToStack(inputArray);
        nextStep();
        //printStack(inputStack);
        //printArray(inputArray);

    }//GEN-LAST:event_jBtnCheckActionPerformed
    public void pushArrayToStack(String[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            inputStack.push(array[i]);
            // System.out.println(inputStack.peek());
        }


    }

    private void printStack(Stack stack) {
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }

    private void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCheck;
    private javax.swing.JButton jBtnClearResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableResult;
    private javax.swing.JTable jTableRules;
    private javax.swing.JTextField jTextInput;
    // End of variables declaration//GEN-END:variables
}
