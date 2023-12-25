package hdt.petshopproject.form.home;

import hdt.petshopproject.DAO.cardSanPhamHome_List;
import hdt.petshopproject.DAO.hangHoa_List;
import hdt.petshopproject.component.Oder;
import hdt.petshopproject.model.cardSanPhamHome;
import hdt.petshopproject.model.hangHoa;
import hdt.petshopproject.swing.scrollbar.ScrollBarCustom;
import hdt.petshopproject.util.helper;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TabHome extends javax.swing.JPanel {
//    private DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

    private final DefaultComboBoxModel<String> CbBox = new DefaultComboBoxModel<>();
    DefaultTableModel tableModel = new DefaultTableModel();

    public TabHome() {
        initComponents();
        ScrollBarCustom sb = new ScrollBarCustom(10, 10, 100);
        sb.setForeground(new Color(130, 130, 130));
        jScrollPane1.setVerticalScrollBar(sb);
        initTable();
        //Xóa chữ tìm kiếm trong JTextField ngay khi bấm vào
        Search_TextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Xóa nội dung khi nhận focus
                if (Search_TextField.getText().equals("Tìm kiếm theo tên")) {
                    Search_TextField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        }
        );
        // init
        initCombo();
        initSanPham();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Search_TextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        H_Combo = new javax.swing.JComboBox<>();
        Search_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSP = new javax.swing.JPanel();
        oder = new hdt.petshopproject.component.Oder();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");

        setBackground(new java.awt.Color(243, 239, 239));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1300, 833));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(942, 760));

        jPanel5.setOpaque(false);

        Search_TextField.setForeground(new java.awt.Color(51, 51, 51));
        Search_TextField.setText("Tìm kiếm theo tên");
        Search_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_TextFieldActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sắp xếp theo:");

        H_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H_ComboActionPerformed(evt);
            }
        });

        Search_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search/icons8-search-18(-ldpi).png"))); // NOI18N
        Search_Btn.setContentAreaFilled(false);
        Search_Btn.setOpaque(true);
        Search_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(H_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(H_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        listSP.setMinimumSize(new java.awt.Dimension(910, 20));
        listSP.setPreferredSize(new java.awt.Dimension(910, 910));
        listSP.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 12, 10));
        jScrollPane1.setViewportView(listSP);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        oder.setMinimumSize(new java.awt.Dimension(360, 500));
        oder.setPreferredSize(new java.awt.Dimension(360, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(oder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void initTable() {
        String[] header = new String[]{"Mã", "Tên thú cưng", "Giá"};
        tableModel.setColumnIdentifiers(header);
        oder.getOrderTable().setModel(tableModel);
    }

    private void initCombo() {
        String sql = "select distinct Loai from hangHoa";
        String tatCa = "Tất cả";
        try (
                Connection con = helper.openConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql);) {
            CbBox.removeAllElements();
            CbBox.addElement(tatCa);
            while (rs.next()) {
                CbBox.addElement(rs.getString("Loai"));
            }
            H_Combo.setModel(CbBox);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi combobox!");
        }
        H_Combo.addActionListener((java.awt.event.ActionEvent evt) -> {
            H_ComboActionPerformed(evt);
        });
    }

    private void initSanPham() {
        String selectedLoai = (String) H_Combo.getSelectedItem();
        updateDataByLoai(selectedLoai);
    }

    private void updateDataByLoai(String loai) {
        cardSanPhamHome_List dao = new cardSanPhamHome_List();
        ArrayList<cardSanPhamHome> dataList = dao.loadDataByLoai(loai);

        for (cardSanPhamHome data : dataList) {
            if( !data.isTrangThai()){
                cardSanPham cardSP = new cardSanPham(data.getIdDV(), data.getTenDV(), data.getGiaDV());
            listSP.add(cardSP, BorderLayout.CENTER);
            cardSP.getAddToCart_Btn().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    hangHoa hh = new hangHoa();
                    int ID = Integer.parseInt(cardSP.getIdDV());
                    try {
                        hangHoa_List dao = new hangHoa_List();
                        hh = dao.fillHH(ID);
                        if (hh != null) {
                            tableModel.addRow(new String[]{String.valueOf(ID), hh.getTen(), String.valueOf(hh.getGiaTien())});
                            tableModel.fireTableDataChanged();
                            dao.updateDaBan(ID, "True");
                            updateDataByLoai(loai);
                        }
                    } catch (Exception exc) {
                        JOptionPane.showMessageDialog(oder, "Dữ liệu thú cưng lỗi!!");
                    }
                }
            });
            }
        }
    }

    private void searchByName() {
        String searchText = Search_TextField.getText();
        cardSanPhamHome_List dao = new cardSanPhamHome_List();
        ArrayList<cardSanPhamHome> searchResults = dao.loadDataByName(searchText);
        updateSearchResults(searchResults);
    }

    private void updateSearchResults(ArrayList<cardSanPhamHome> searchResults) {
        for (cardSanPhamHome result : searchResults) {
            cardSanPham cardSP = new cardSanPham(result.getIdDV(), result.getTenDV(), result.getGiaDV());
            listSP.add(cardSP, BorderLayout.CENTER);
        }
    }


    private void Search_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_TextFieldActionPerformed

    }//GEN-LAST:event_Search_TextFieldActionPerformed

    private void H_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H_ComboActionPerformed
        listSP.removeAll();
        String selectedLoai = (String) H_Combo.getSelectedItem();
        updateDataByLoai(selectedLoai);
        listSP.revalidate();
        listSP.repaint();
    }//GEN-LAST:event_H_ComboActionPerformed

    private void Search_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_BtnActionPerformed
        listSP.removeAll();
        searchByName();
        listSP.revalidate();
        listSP.repaint();
    }//GEN-LAST:event_Search_BtnActionPerformed
    public void setlabelwithID(String ID) {
        String sql = "Select taiKhoan from nhanVien where ID=?";
        try {
            Connection conn = helper.openConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, ID);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                oder.setName(rs.getString("taiKhoan"));
            } else {
                JOptionPane.showMessageDialog(this, "Không nhận diện được nhân viên!!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Dữ liệu Admin lỗi!!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> H_Combo;
    private javax.swing.JButton Search_Btn;
    private javax.swing.JTextField Search_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listSP;
    private hdt.petshopproject.component.Oder oder;
    // End of variables declaration//GEN-END:variables

    void addToOrderPanel(cardSanPham aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
