/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.UI;

import com.farmsys.Entity.Chart;
import com.farmsys.dao.ChartDAO;
import com.farmsys.dao.NhatKyDAO;
import com.farmsys.data.JsonResult;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.Year;
import java.util.Date;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author NguyenTrung
 */
public class ChartJPanel extends javax.swing.JPanel {

    public ChartJPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTong = new javax.swing.JPanel();
        pnlcharttron = new javax.swing.JPanel();
        pnlchartcot = new javax.swing.JPanel();
        Datengaybatdau = new com.toedter.calendar.JDateChooser();
        Datengayketthuc = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btnloccharttron = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1083, 750));
        setPreferredSize(new java.awt.Dimension(1083, 750));

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setMinimumSize(new java.awt.Dimension(1083, 750));
        PanelTong.setPreferredSize(new java.awt.Dimension(1083, 750));
        PanelTong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlcharttron.setBackground(new java.awt.Color(204, 204, 255));
        pnlcharttron.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlcharttron.setLayout(new java.awt.BorderLayout());
        PanelTong.add(pnlcharttron, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1050, 280));

        pnlchartcot.setBackground(new java.awt.Color(204, 204, 255));
        pnlchartcot.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlchartcot.setLayout(new java.awt.BorderLayout());
        PanelTong.add(pnlchartcot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 1050, 360));

        Datengaybatdau.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.add(Datengaybatdau, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, -1));

        Datengayketthuc.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.add(Datengayketthuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 170, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đến");
        PanelTong.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 60, 40));

        btnloccharttron.setBackground(new java.awt.Color(255, 255, 255));
        btnloccharttron.setText("Lọc");
        btnloccharttron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloccharttronActionPerformed(evt);
            }
        });
        PanelTong.add(btnloccharttron, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnloccharttronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloccharttronActionPerformed
        this.showPieChartByTime();
    }//GEN-LAST:event_btnloccharttronActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Datengaybatdau;
    private com.toedter.calendar.JDateChooser Datengayketthuc;
    private javax.swing.JPanel PanelTong;
    private javax.swing.JButton btnloccharttron;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlchartcot;
    private javax.swing.JPanel pnlcharttron;
    // End of variables declaration//GEN-END:variables
    ChartDAO dao = new ChartDAO();
    Double Thang1, Thang2, Thang3, Thang4, Thang5, Thang6, Thang7, Thang8, Thang9, Thang10, Thang11, Thang12;
    NhatKyDAO nkDAO = new NhatKyDAO();

    private void init() {
        this.fillTableChart();

        this.showPieChart();
        this.showBarChart();
    }

    private void fillTableChart() {
        List<Chart> list = dao.selectAll();
        for (Chart nk : list) {
            Thang1 = nk.getThang1();
            Thang2 = nk.getThang2();
            Thang3 = nk.getThang3();
            Thang4 = nk.getThang4();
            Thang5 = nk.getThang5();
            Thang6 = nk.getThang6();
            Thang7 = nk.getThang7();
            Thang8 = nk.getThang8();
            Thang9 = nk.getThang9();
            Thang10 = nk.getThang10();
            Thang11 = nk.getThang11();
            Thang12 = nk.getThang12();

        }
    }

    public void showPieChart() {
        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();
        int todo = ((100 / nkDAO.selectAll().size()) * nkDAO.selectByTrangThai(0).size());
        int doing = ((100 / nkDAO.selectAll().size()) * nkDAO.selectByTrangThai(1).size());
        int done = ((100 / nkDAO.selectAll().size()) * nkDAO.selectByTrangThai(3).size());
        int cancel = ((100 / nkDAO.selectAll().size()) * nkDAO.selectByTrangThai(2).size());
        if (todo > 0) {
            barDataset.setValue("Nhận việc", todo);
        }
        if (doing > 0) {
            barDataset.setValue("Đang làm", doing);
        }
        if (done > 0) {
            barDataset.setValue("Hoàn thành", done);
        }
        if (cancel > 0) {
            barDataset.setValue("Hủy", cancel);
        }

        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("Tiến độ công việc", barDataset, false, true, false);//explain

        PiePlot piePlot = (PiePlot) piechart.getPlot();

        //changing pie chart blocks colors
        piePlot.setSectionPaint("Nhận việc", new Color(255, 255, 102));
        piePlot.setSectionPaint("Đang làm", new Color(102, 255, 102));
        piePlot.setSectionPaint("Hoàn thành", new Color(255, 102, 153));
        piePlot.setSectionPaint("Hủy", new Color(0, 204, 204));
        piePlot.setBackgroundPaint(Color.white);
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        pnlcharttron.removeAll();
        pnlcharttron.add(barChartPanel, BorderLayout.CENTER);
        pnlcharttron.validate();
    }

    public void showPieChartByTime() {
        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();
        Date tungay = Datengaybatdau.getDate();
        Date denngay = Datengayketthuc.getDate();
        try {
            int todo = ((100 / nkDAO.selectByTime(tungay, denngay).size()) * nkDAO.selectTrangThaiByMonth(0, tungay, denngay).size());
            int doing = ((100 / nkDAO.selectByTime(tungay, denngay).size()) * nkDAO.selectTrangThaiByMonth(1, tungay, denngay).size());
            int done = ((100 / nkDAO.selectByTime(tungay, denngay).size()) * nkDAO.selectTrangThaiByMonth(3, tungay, denngay).size());
            int cancel = ((100 / nkDAO.selectByTime(tungay, denngay).size()) * nkDAO.selectTrangThaiByMonth(2, tungay, denngay).size());
            if (todo == 0 && doing == 0 && done == 0 && cancel == 0) {
                barDataset.setValue("Chưa có dữ liệu", 100);
            }
            if (todo > 0) {
                barDataset.setValue("Nhận việc", todo);
            }
            if (doing > 0) {
                barDataset.setValue("Đang làm", doing);
            }   
            if (done > 0) {
                barDataset.setValue("Hoàn thành", done);
            }
            if (cancel > 0) {
                barDataset.setValue("Hủy", cancel);
            }

            //create chart
            JFreeChart piechart = ChartFactory.createPieChart("Tiến độ công việc", barDataset, false, true, false);//explain

            PiePlot piePlot = (PiePlot) piechart.getPlot();

            //changing pie chart blocks colors
            piePlot.setSectionPaint("Nhận việc", new Color(255, 255, 102));
            piePlot.setSectionPaint("Đang làm", new Color(102, 255, 102));
            piePlot.setSectionPaint("Hoàn thành", new Color(255, 102, 153));
            piePlot.setSectionPaint("Hủy", new Color(0, 204, 204));
            piePlot.setBackgroundPaint(Color.white);
            //create chartPanel to display chart(graph)
            ChartPanel barChartPanel = new ChartPanel(piechart);
            pnlcharttron.removeAll();
            pnlcharttron.add(barChartPanel, BorderLayout.CENTER);
            pnlcharttron.validate();
        } catch (Exception e) {
            barDataset.setValue("Chưa có dữ liệu", 100);
        }

    }

    public void showBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(Thang1, "Amount", "1");
        dataset.setValue(Thang2, "Amount", "2");
        dataset.setValue(Thang3, "Amount", "3");
        dataset.setValue(Thang4, "Amount", "4");
        dataset.setValue(Thang5, "Amount", "5");
        dataset.setValue(Thang6, "Amount", "6");
        dataset.setValue(Thang7, "Amount", "7");
        dataset.setValue(Thang8, "Amount", "8");
        dataset.setValue(Thang9, "Amount", "9");
        dataset.setValue(Thang10, "Amount", "10");
        dataset.setValue(Thang11, "Amount", "11");
        dataset.setValue(Thang12, "Amount", "12");

        JFreeChart chart = ChartFactory.createBarChart("Tổng doanh thu", "Tháng", "$",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204, 0, 51);
        renderer.setSeriesPaint(0, clr3);

        ChartPanel barpChartPanel = new ChartPanel(chart);
        pnlchartcot.removeAll();
        pnlchartcot.add(barpChartPanel, BorderLayout.CENTER);
        pnlchartcot.validate();
    }

}