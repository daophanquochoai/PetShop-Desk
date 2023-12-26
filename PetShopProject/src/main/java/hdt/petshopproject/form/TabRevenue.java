package hdt.petshopproject.form;

import hdt.barchart.BarChart;
import hdt.chart.ModelChart;
import hdt.petshopproject.DAO.hoaDon_List;
import hdt.petshopproject.model.DoanhThu;
import hdt.petshopproject.util.helper;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TabRevenue extends javax.swing.JPanel {

    BarChart barChart1 = new BarChart();

    public TabRevenue() {
        initComponents();

        jPanel5.add(barChart1);
        hienSoHD();
        daBan();
        tongDT();
        initBarChartPet(barChart1);
        Sua();
    }

    public void initBarChartPet(BarChart chart) {
//        chart.addLegend("Chó", new Color(245, 189, 135));
//        chart.addLegend("Mèo", new Color(135, 189, 245));
//        chart.addLegend("Cá", new Color(189, 135, 245));
//        chart.addLegend("Khác", new Color(139, 229, 222));
        chart.addLegend("Tổng các loài", Color.blue);
//        chart.addData(new ModelChart("T1", new double[]{50000}));
//        chart.addData(new ModelChart("T2", new double[]{600}));
//        chart.addData(new ModelChart("T3", new double[]{200}));
//        chart.addData(new ModelChart("T4", new double[]{480}));
//        chart.addData(new ModelChart("T5", new double[]{350}));
//        chart.addData(new ModelChart("T6", new double[]{190}));
//        chart.addData(new ModelChart("T7", new double[]{500}));
//        chart.addData(new ModelChart("T8", new double[]{600}));
//        chart.addData(new ModelChart("T9", new double[]{200}));
//        chart.addData(new ModelChart("T10", new double[]{480}));
//        chart.addData(new ModelChart("T11", new double[]{350}));
//        chart.addData(new ModelChart("T12", new double[]{190}));
    }

    private void Sua() {
        hoaDon_List nam = new hoaDon_List();
        try {
            
            List<Integer> year = nam.getNam();
            for (int i : year) {

                jNam.addItem(String.valueOf(i));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi lấy dữ liệu năm");
        }
    }

    public void DTThang() {
        hoaDon_List thang = new hoaDon_List();
        String nam = String.valueOf(jNam.getSelectedItem());
        //System.out.print(Integer.parseInt(nam));
        jPanel5.removeAll();
        barChart1 = new BarChart();
        jPanel5.add(barChart1);
        barChart1.addLegend("Tổng các loai", Color.blue);
        nameChart.setText("Doanh thu nam "+nam);

        try {
            List<DoanhThu> month = thang.getThang(Integer.parseInt(nam));

            // barChart1.addData(new ModelChart("T12", new double[]{190}));
            for (int i = 1; i <= 12; i++) {
                if (month.size() >= 1) {

                    if (month.get(0).getFirst() == i) {
                        barChart1.addData(new ModelChart("T" + i, new double[]{(double) month.get(0).getSecond()}));
                        month.remove(0);
                    } else {
                        barChart1.addData(new ModelChart("T" + i, new double[]{0}));
                    }
                } else {
                    barChart1.addData(new ModelChart("T" + i, new double[]{0}));
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi lấy dữ liệu tháng");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        nameChart = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jNam = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(218, 218, 218));
        jPanel1.setForeground(new java.awt.Color(210, 210, 210));

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        nameChart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameChart.setForeground(new java.awt.Color(0, 102, 153));
        nameChart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameChart.setText("Doanh thu nam");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Số lượng thú cưng đã bán:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Chọn năm:");

        jNam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("jLabel7");
        jLabel7.setEnabled(false);
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("jLabel7");
        jLabel8.setEnabled(false);
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("jLabel7");
        jLabel9.setEnabled(false);
        jLabel9.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 17, 34));
        jLabel3.setText("Số lượng hóa đơn:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tổng doanh thu:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jNam, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameChart, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameChart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOANH THU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamActionPerformed
        // TODO add your handling code here:
        DTThang();
    }//GEN-LAST:event_jNamActionPerformed

    public void hienSoHD() {

        String sql = "select count(*) as 'Sohoadon'\n"
                + "from Bill";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                jLabel7.setText(rs.getString("Sohoadon"));
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi");
            }
        } catch (Exception ex) {

        }

    }

    public void daBan() {

        String sql = "SELECT COUNT(*) AS Daban\n"
                + "FROM chiTietDonHang ctdh\n"
                + "JOIN Bill b ON ctdh.ID_HD = b.ID_HD;";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                jLabel8.setText(rs.getString("Daban"));
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi");
            }
        } catch (Exception ex) {

        }

    }

    public void tongDT() {

        String sql = "SELECT SUM(hh.giaTien) AS tongDoanhThu\n"
                + "FROM chiTietDonHang ctdh\n"
                + "JOIN hangHoa hh ON ctdh.ID_HH = hh.ID\n"
                + "JOIN Bill b ON ctdh.ID_HD = b.ID_HD;";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                jLabel9.setText(rs.getString("tongDoanhThu"));
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi");
            }
        } catch (Exception ex) {

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jNam;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nameChart;
    // End of variables declaration//GEN-END:variables
}
