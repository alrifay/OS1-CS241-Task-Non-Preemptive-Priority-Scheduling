package GUI;
//<editor-fold defaultstate="collapsed" desc="Imports">

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import non.preemptive.priority.scheduling.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
//</editor-fold>

public class App extends javax.swing.JFrame {

//<editor-fold defaultstate="collapsed" desc="Attributes">
    javax.swing.table.DefaultTableModel model;
    private boolean editMood = false;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Constructor">
    public App() {
        initComponents();
        getContentPane().setBackground(new Color(33, 33, 33));
        getContentPane().setForeground(new Color(237, 237, 237));
        ListSelectionModel SelectionModel = ProcessTable.getSelectionModel();
        model = (DefaultTableModel) ProcessTable.getModel();
        SelectionModel.addListSelectionListener((ListSelectionEvent e) -> {
            if (e.getValueIsAdjusting()) {
                ProcessTableListSelection(e);
            }
        });

        try {
            setIconImage(ImageIO.read(getClass().getResource("/GUI/download.png")));

        } catch (Exception ex) {
            System.out.println("no");
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        ProcessTable.setDefaultRenderer(Integer.class, centerRenderer);
        Avg_ta.setText("Average turnaround time = 0");
        Avg_wt.setText("Average waiting time = 0");
        Avg_rt.setText("Average responce time = 0");
    }
//</editor-fold>

// <editor-fold defaultstate="collapsed" desc="Generated Code">
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        P_Number = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        P_Burst_time = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        P_Priority = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        P_Arrival_time = new javax.swing.JSpinner();
        ControlBtns = new javax.swing.JPanel();
        Btn_Add = new javax.swing.JButton();
        Btn_Edit = new javax.swing.JButton();
        Btn_Delete = new javax.swing.JButton();
        Btn_Clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProcessTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        Panel_Process = new javax.swing.JPanel();
        Panel_Time = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        Avg_wt = new javax.swing.JTextField();
        Avg_ta = new javax.swing.JTextField();
        Avg_rt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Non Preemptive Priority Scheduling");
        setBackground(new java.awt.Color(33, 33, 33));

        jPanel2.setBackground(new java.awt.Color(33, 33, 33));
        jPanel2.setForeground(new java.awt.Color(237, 237, 237));

        jPanel8.setBackground(new java.awt.Color(33, 33, 33));
        jPanel8.setForeground(new java.awt.Color(33, 33, 33));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setBackground(new java.awt.Color(33, 33, 33));
        jPanel4.setForeground(new java.awt.Color(237, 237, 237));

        jLabel1.setBackground(new java.awt.Color(33, 33, 33));
        jLabel1.setForeground(new java.awt.Color(237, 237, 237));
        jLabel1.setText("No. : ");

        P_Number.setEditable(false);
        P_Number.setBackground(new java.awt.Color(33, 33, 33));
        P_Number.setForeground(new java.awt.Color(237, 237, 237));
        P_Number.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Number))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel8.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(33, 33, 33));
        jPanel5.setForeground(new java.awt.Color(237, 237, 237));

        P_Burst_time.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel2.setBackground(new java.awt.Color(33, 33, 33));
        jLabel2.setForeground(new java.awt.Color(237, 237, 237));
        jLabel2.setText("Burst time : ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Burst_time))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P_Burst_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel8.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(33, 33, 33));
        jPanel6.setForeground(new java.awt.Color(237, 237, 237));

        P_Priority.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel3.setBackground(new java.awt.Color(33, 33, 33));
        jLabel3.setForeground(new java.awt.Color(237, 237, 237));
        jLabel3.setText("Priority : ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Priority))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(P_Priority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(33, 33, 33));
        jPanel7.setForeground(new java.awt.Color(237, 237, 237));

        jLabel4.setBackground(new java.awt.Color(33, 33, 33));
        jLabel4.setForeground(new java.awt.Color(237, 237, 237));
        jLabel4.setText("Arrival : ");

        P_Arrival_time.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Arrival_time)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(P_Arrival_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.add(jPanel7);

        ControlBtns.setBackground(new java.awt.Color(33, 33, 33));
        ControlBtns.setForeground(new java.awt.Color(237, 237, 237));
        ControlBtns.setLayout(new java.awt.GridLayout(1, 3, 5, 0));

        Btn_Add.setText("Add");
        Btn_Add.setMinimumSize(new java.awt.Dimension(10, 23));
        Btn_Add.setPreferredSize(new java.awt.Dimension(75, 23));
        Btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AddActionPerformed(evt);
            }
        });
        ControlBtns.add(Btn_Add);

        Btn_Edit.setText("Edit");
        Btn_Edit.setEnabled(false);
        Btn_Edit.setMinimumSize(new java.awt.Dimension(10, 23));
        Btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditActionPerformed(evt);
            }
        });
        ControlBtns.add(Btn_Edit);

        Btn_Delete.setText("Delete");
        Btn_Delete.setMinimumSize(new java.awt.Dimension(10, 23));
        Btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteActionPerformed(evt);
            }
        });
        ControlBtns.add(Btn_Delete);

        Btn_Clear.setText("Clear");
        Btn_Clear.setMinimumSize(new java.awt.Dimension(10, 23));
        Btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClearActionPerformed(evt);
            }
        });
        ControlBtns.add(Btn_Clear);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ControlBtns, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ControlBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane2.setBackground(new java.awt.Color(33, 33, 33));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(237, 237, 237));

        ProcessTable.setBackground(new java.awt.Color(33, 33, 33));
        ProcessTable.setForeground(new java.awt.Color(237, 237, 237));
        ProcessTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Burst time", "Priority", "Arriving time", "Waiting time", "Turnaround time", "Responce time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProcessTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ProcessTable.setDoubleBuffered(true);
        ProcessTable.setFillsViewportHeight(true);
        ProcessTable.setSelectionForeground(new java.awt.Color(237, 237, 237));
        ProcessTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ProcessTable.setShowVerticalLines(false);
        jScrollPane2.setViewportView(ProcessTable);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));
        jPanel1.setForeground(new java.awt.Color(237, 237, 237));

        jScrollPane3.setBackground(new java.awt.Color(33, 33, 33));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(237, 237, 237));

        jPanel3.setBackground(new java.awt.Color(33, 33, 33));
        jPanel3.setForeground(new java.awt.Color(237, 237, 237));
        jPanel3.setLayout(new java.awt.GridLayout(3, 0));

        Panel_Process.setBackground(new java.awt.Color(33, 33, 33));
        Panel_Process.setForeground(new java.awt.Color(237, 237, 237));
        Panel_Process.setPreferredSize(new java.awt.Dimension(5, 5));
        Panel_Process.setLayout(new javax.swing.BoxLayout(Panel_Process, javax.swing.BoxLayout.LINE_AXIS));
        jPanel3.add(Panel_Process);

        Panel_Time.setBackground(new java.awt.Color(33, 33, 33));
        Panel_Time.setForeground(new java.awt.Color(237, 237, 237));
        Panel_Time.setPreferredSize(new java.awt.Dimension(5, 5));
        Panel_Time.setLayout(new javax.swing.BoxLayout(Panel_Time, javax.swing.BoxLayout.LINE_AXIS));
        jPanel3.add(Panel_Time);

        jPanel11.setBackground(new java.awt.Color(33, 33, 33));
        jPanel11.setForeground(new java.awt.Color(237, 237, 237));
        jPanel11.setPreferredSize(new java.awt.Dimension(3, 10));
        jPanel11.setLayout(new java.awt.GridLayout(3, 0));

        Avg_wt.setEditable(false);
        Avg_wt.setBackground(new java.awt.Color(33, 33, 33));
        Avg_wt.setForeground(new java.awt.Color(237, 237, 237));
        Avg_wt.setBorder(null);
        jPanel11.add(Avg_wt);

        Avg_ta.setEditable(false);
        Avg_ta.setBackground(new java.awt.Color(33, 33, 33));
        Avg_ta.setForeground(new java.awt.Color(237, 237, 237));
        Avg_ta.setBorder(null);
        jPanel11.add(Avg_ta);

        Avg_rt.setEditable(false);
        Avg_rt.setBackground(new java.awt.Color(33, 33, 33));
        Avg_rt.setForeground(new java.awt.Color(237, 237, 237));
        Avg_rt.setBorder(null);
        jPanel11.add(Avg_rt);

        jPanel3.add(jPanel11);

        jScrollPane3.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// </editor-fold>

//<editor-fold defaultstate="collapsed" desc="Process Operation">
    private void calc() {
        if (NonPreemptivePriorityScheduling.p.size() > 0) {
            NonPreemptivePriorityScheduling.gamal();
        }
        model.setRowCount(0);
        for (SProcess p1 : NonPreemptivePriorityScheduling.p) {
            Integer[] rowData = new Integer[7];
            SProcess p = p1;
            rowData[0] = p.number;
            rowData[1] = p.brustTime;
            rowData[2] = p.priority;
            rowData[3] = p.arrivalTime;
            rowData[4] = p.waitTime;
            rowData[5] = p.turnaroundTime;
            rowData[6] = p.waitTime;
            model.addRow(rowData);
        }
        UpdateChart(NonPreemptivePriorityScheduling.p);
    }

    private void UpdateChart(ArrayList<SProcess> A) {
        Panel_Process.removeAll();
        Panel_Time.removeAll();
        if (model.getRowCount() < 1 || A == null) {
            Panel_Process.updateUI();
            Panel_Time.updateUI();
            return;
        }
        NonPreemptivePriorityScheduling.gamal();
        int wait = 0, turnaround = 0;
        int w = Panel_Process.getWidth() / A.size();
        int h = Panel_Process.getHeight();
        JTextField t;
        JTextField f = new JTextField("" + A.get(0).waitTime);
        f.setHorizontalAlignment(JTextField.LEFT);
        f.setEditable(false);
        f.setBackground(new Color(33, 33, 33));
        f.setForeground(new Color(237, 237, 237));

        f.setFont(new java.awt.Font("Segoe UI", 0, 16));
        f.setPreferredSize(new Dimension(w / 2, h));
        f.setBorder(null);
        Panel_Time.add(f);

        for (int i = 0; i < A.size(); i++) {
            SProcess p = A.get(i);
            wait += p.waitTime;
            turnaround += p.turnaroundTime;
            if (i > 0 && A.get(i - 1).turnaroundTime + p.brustTime != p.turnaroundTime) {
                t = new JTextField("" + p.arrivalTime);
                f = new JTextField("Idle");
                t.setBorder(null);
                f.setBorder(null);
                f.setHorizontalAlignment(JTextField.CENTER);
                t.setHorizontalAlignment(JTextField.CENTER);
                f.setEditable(false);
                t.setEditable(false);
                f.setPreferredSize(new Dimension(w, h));
                t.setPreferredSize(new Dimension(w, h));
                f.setBackground(new Color(237, 237, 237));
                f.setForeground(new Color(63, 81, 181));
                t.setBackground(new Color(33, 33, 33));
                t.setForeground(new Color(237, 237, 237));
                t.setFont(new java.awt.Font("Segoe UI", 0, 16));
                f.setFont(new java.awt.Font("Segoe UI", 0, 16));
                Panel_Process.add(f);
                Panel_Time.add(t);
            }
            t = new JTextField("" + p.turnaroundTime);
            f = new JTextField("P" + p.number);
            t.setBorder(null);
            f.setBorder(null);
            f.setHorizontalAlignment(JTextField.CENTER);
            t.setHorizontalAlignment(JTextField.CENTER);
            f.setEditable(false);
            t.setEditable(false);
            f.setPreferredSize(new Dimension(w, h));
            t.setPreferredSize(new Dimension(w, h));
            if (i % 2 == 0) {
                f.setBackground(new Color(63, 81, 181));
            } else {
                f.setBackground(new Color(255, 64, 129));
            }
            f.setForeground(new Color(237, 237, 237));
            t.setBackground(new Color(33, 33, 33));
            t.setForeground(new Color(237, 237, 237));
            t.setFont(new java.awt.Font("Segoe UI", 0, 16));
            f.setFont(new java.awt.Font("Segoe UI", 0, 16));
            Panel_Process.add(f);
            Panel_Time.add(t);
        }
        Panel_Time.getComponents()[Panel_Time.getComponents().length - 1].setPreferredSize(new Dimension(w / 2, h));
        ((JTextField) Panel_Time.getComponents()[Panel_Time.getComponents().length - 1]).setHorizontalAlignment(JTextField.RIGHT);
        Panel_Process.updateUI();
        Panel_Time.updateUI();

        Avg_ta.setText("Average turnaround time = " + (turnaround / (double) A.size()));
        Avg_wt.setText("Average waiting time = " + (wait / (double) A.size()));
        Avg_rt.setText("Average responce time = " + (wait / (double) A.size()));
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Actions">
    private void ProcessTableListSelection(ListSelectionEvent evt) {
        javax.swing.DefaultListSelectionModel d = (javax.swing.DefaultListSelectionModel) evt.getSource();
        int i = d.getLeadSelectionIndex();
        if (editMood || model.getRowCount() <= i || i < 0 || model.getRowCount() < 1) {
            return;
        }
        P_Number.setText("" + model.getValueAt(i, 0));
        P_Burst_time.setValue(model.getValueAt(i, 1));
        P_Priority.setValue(model.getValueAt(i, 2));
        P_Arrival_time.setValue(model.getValueAt(i, 3));
    }

    private void Btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AddActionPerformed
        SProcess mypocess = new SProcess();
        mypocess.brustTime = (Integer) P_Burst_time.getValue();
        mypocess.priority = (Integer) P_Priority.getValue();
        mypocess.arrivalTime = (Integer) P_Arrival_time.getValue();
        NonPreemptivePriorityScheduling.addProcess(mypocess);
        calc();
    }//GEN-LAST:event_Btn_AddActionPerformed

    private void Btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClearActionPerformed
        P_Number.setText("");
        P_Burst_time.setValue(1);
        P_Priority.setValue(0);
        P_Arrival_time.setValue(0);
        Avg_ta.setText("Average turnaround time = 0");
        Avg_wt.setText("Average waiting time = 0");
        Avg_rt.setText("Average responce time = 0");
        model.setRowCount(0);
        NonPreemptivePriorityScheduling.p.clear();
        UpdateChart(null);
    }//GEN-LAST:event_Btn_ClearActionPerformed

    private void Btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteActionPerformed
        int i = ProcessTable.getSelectedRow();
        if (i < 0) {
            return;
        }
        P_Number.setText("");
        model.removeRow(i);
        NonPreemptivePriorityScheduling.p.remove(i);
        try {
            if (model.getRowCount() >= 0) {
                i = i - 1 > -1 ? i - 1 : i;
                ProcessTable.setRowSelectionInterval(i, i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        UpdateChart(null);
        calc();
    }//GEN-LAST:event_Btn_DeleteActionPerformed

    private void Btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditActionPerformed
        if (P_Number.getText().isEmpty()) {
            return;
        }
        if (editMood) {
            for (int i = 0; i < model.getRowCount(); i++) {
                String a = P_Number.getText();
                String b = "" + model.getValueAt(i, 0);
                if (a.equals(b)) {
                    int pos = (int) model.getValueAt(Integer.valueOf(P_Number.getText()) - 1, 0);
                    SProcess p = NonPreemptivePriorityScheduling.p.get(pos);
                    NonPreemptivePriorityScheduling.p.remove(p);
                    p.arrivalTime = (int) P_Arrival_time.getValue();
                    p.brustTime = (int) P_Burst_time.getValue();
                    p.priority = (int) P_Priority.getValue();
                    NonPreemptivePriorityScheduling.addProcess(p);
                    break;
                }
            }
            Btn_Edit.setText("Edit");
            editMood = false;
        } else {
            Btn_Edit.setText("Save");
            editMood = true;
        }
        ProcessTable.setEnabled(!editMood);
        for (java.awt.Component c : ControlBtns.getComponents()) {
            c.setEnabled(!editMood);
        }
        Btn_Edit.setEnabled(true);
        calc();
    }//GEN-LAST:event_Btn_EditActionPerformed

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Main Function">
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".contains(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }
    //</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Variables declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Avg_rt;
    private javax.swing.JTextField Avg_ta;
    private javax.swing.JTextField Avg_wt;
    private javax.swing.JButton Btn_Add;
    private javax.swing.JButton Btn_Clear;
    private javax.swing.JButton Btn_Delete;
    private javax.swing.JButton Btn_Edit;
    private javax.swing.JPanel ControlBtns;
    private javax.swing.JSpinner P_Arrival_time;
    private javax.swing.JSpinner P_Burst_time;
    private javax.swing.JTextField P_Number;
    private javax.swing.JSpinner P_Priority;
    private javax.swing.JPanel Panel_Process;
    private javax.swing.JPanel Panel_Time;
    private javax.swing.JTable ProcessTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
