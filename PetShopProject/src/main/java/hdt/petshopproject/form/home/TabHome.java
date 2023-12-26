package hdt.petshopproject.form.home;

import hdt.petshopproject.DAO.cardSanPhamHome_List;
import hdt.petshopproject.DAO.hangHoa_List;
import hdt.petshopproject.model.cardSanPhamHome;
import hdt.petshopproject.model.hangHoa;
import hdt.petshopproject.swing.scrollbar.ScrollBarCustom;
import hdt.petshopproject.util.helper;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TabHome extends javax.swing.JPanel {
//    private DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

    private final DefaultComboBoxModel<String> CbBox = new DefaultComboBoxModel<>();
    DefaultTableModel tableModel = new DefaultTableModel();
    private hangHoa_List dao;
    JComboBox<String> KH_CB;
    private List<hangHoa> DsChon_List = new ArrayList<>();

    public TabHome() {
        initComponents();
        ScrollBarCustom sb = new ScrollBarCustom(10, 10, 100);
        sb.setForeground(new Color(130, 130, 130));
        jScrollPane1.setVerticalScrollBar(sb);
        initTable();
        initCombo();
        initSanPham(); 
        OrderFunc();
        findTextFieldAdj();
        initOderKhachHang_CB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        chiTietDonHang = new javax.swing.JDialog();
        Title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_ChiTiet = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lbNgayLapHD = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbTenKH1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbTenKH2 = new javax.swing.JLabel();
        lbTenKH3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbTenKH = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbTenNV = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lnIDKhachHang = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
=======
>>>>>>> f78f7ae8ee5f2eeae6706f90de2f926743526f2e
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Search_TextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        H_Combo = new javax.swing.JComboBox<>();
        Search_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSP = new javax.swing.JPanel();
        oder = new hdt.petshopproject.component.Oder();

<<<<<<< HEAD
        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");

        chiTietDonHang.setSize(new java.awt.Dimension(400, 700));

        Title.setBackground(new java.awt.Color(28, 59, 90));
        Title.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 204, 204));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("ĐƠN HÀNG");
        Title.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(242, 242, 249));

        tab_ChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã", "Tên thú cưng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_ChiTiet.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tab_ChiTiet);

        jLabel6.setText("Ngày lập hóa đơn:");

        lbNgayLapHD.setBackground(new java.awt.Color(230, 230, 232));
        lbNgayLapHD.setForeground(new java.awt.Color(51, 51, 51));
        lbNgayLapHD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNgayLapHD.setText("<Ngày>");
        lbNgayLapHD.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Tổng tiền:");

        lbTenKH1.setBackground(new java.awt.Color(204, 204, 204));
        lbTenKH1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTenKH1.setForeground(new java.awt.Color(51, 51, 51));
        lbTenKH1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenKH1.setText("x.000.000.000 đ");
        lbTenKH1.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Thành tiền:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Tổng khuyến mãi:");

        lbTenKH2.setBackground(new java.awt.Color(204, 204, 204));
        lbTenKH2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTenKH2.setForeground(new java.awt.Color(51, 51, 51));
        lbTenKH2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenKH2.setText("x.000.000.000 đ");
        lbTenKH2.setOpaque(true);

        lbTenKH3.setBackground(new java.awt.Color(204, 204, 204));
        lbTenKH3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTenKH3.setForeground(new java.awt.Color(51, 51, 51));
        lbTenKH3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenKH3.setText("x.000.000.000 đ");
        lbTenKH3.setOpaque(true);

        jButton3.setBackground(new java.awt.Color(43, 108, 140));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Xác nhận");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Đóng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(64, 64, 64)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbTenKH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTenKH2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTenKH3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(53, 53, 53))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNgayLapHD, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenKH3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenKH2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(242, 242, 249));

        lbTenKH.setBackground(new java.awt.Color(204, 204, 204));
        lbTenKH.setForeground(new java.awt.Color(51, 51, 51));
        lbTenKH.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenKH.setText("<TenKH>");
        lbTenKH.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tên nhân viên:");

        lbTenNV.setBackground(new java.awt.Color(204, 204, 204));
        lbTenNV.setForeground(new java.awt.Color(51, 51, 51));
        lbTenNV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenNV.setText("<TenNV>");
        lbTenNV.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("ID Khách hàng:");

        lnIDKhachHang.setBackground(new java.awt.Color(204, 204, 204));
        lnIDKhachHang.setForeground(new java.awt.Color(51, 51, 51));
        lnIDKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lnIDKhachHang.setText("<IDNV>");
        lnIDKhachHang.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Tên khách hàng:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lnIDKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTenNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(lbTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnIDKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout chiTietDonHangLayout = new javax.swing.GroupLayout(chiTietDonHang.getContentPane());
        chiTietDonHang.getContentPane().setLayout(chiTietDonHangLayout);
        chiTietDonHangLayout.setHorizontalGroup(
            chiTietDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chiTietDonHangLayout.setVerticalGroup(
            chiTietDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chiTietDonHangLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

=======
>>>>>>> f78f7ae8ee5f2eeae6706f90de2f926743526f2e
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
<<<<<<< HEAD
    
    private void OrderFunc(){
        oder.getBtnHuyHD().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                tableModel.setRowCount(0);
                tableModel.fireTableDataChanged();
                for (hangHoa result : DsChon_List) {
                    try {
                        hangHoa_List hh = new hangHoa_List();
                        hh.updateDaBan(result.getID(), "False");
                    } catch (Exception ex) {
                        Logger.getLogger(TabHome.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oder.getSumOrder().setText("0");
                oder.getBtnThanhToan().setText("0");
                DsChon_List = new ArrayList<>();
                listSP.removeAll();
                String selectedLoai = (String) H_Combo.getSelectedItem();
                updateDataByLoai(selectedLoai);
                listSP.revalidate();
                listSP.repaint();
                }
        });
        
        oder.getRefresh().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                tableModel.setRowCount(0);
                tableModel.fireTableDataChanged();
                for (hangHoa result : DsChon_List) {
                    try {
                        hangHoa_List hh = new hangHoa_List();
                        hh.updateDaBan(result.getID(), "False");
                    } catch (Exception ex) {
                        Logger.getLogger(TabHome.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                oder.getSumOrder().setText("0");
                oder.getBtnThanhToan().setText("0");
                DsChon_List = new ArrayList<>();
                listSP.removeAll();
                String selectedLoai = (String) H_Combo.getSelectedItem();
                updateDataByLoai(selectedLoai);
                listSP.revalidate();
                listSP.repaint();
                }
        });
        
        oder.getDelOrder_Btn().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = oder.getOrderTable().getSelectedRow();
                int tempID = -1;
                if (selectedRow != -1){ 
                    tempID = Integer.parseInt(String.valueOf(oder.getOrderTable().getValueAt(selectedRow, 0)));
                    tableModel.removeRow(selectedRow);
                    int tien = Integer.valueOf(oder.getSumOrder().getText());
                    oder.getSumOrder().setText(String.valueOf(tien - DsChon_List.get(selectedRow).getGiaTien()));
                    oder.getBtnThanhToan().setText(String.valueOf(tien -  DsChon_List.get(selectedRow).getGiaTien()));
                    DsChon_List.remove(selectedRow);
                }
                tableModel.fireTableDataChanged();
                hangHoa_List hh = new hangHoa_List();
                try {
                    hh.updateDaBan(tempID, "False");
                } catch (Exception ex) {
                    Logger.getLogger(TabHome.class.getName()).log(Level.SEVERE, null, ex);
                }
                listSP.removeAll();
                String selectedLoai = (String) H_Combo.getSelectedItem();
                updateDataByLoai(selectedLoai);
                listSP.revalidate();
                listSP.repaint();
                oder.getDelOrder_Btn().setEnabled(false);
            }
        });
        
        oder.getThanhToan().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                chiTietDonHang.setVisible(true);
//                lbTenNV.setText(oder.);
                lnIDKhachHang.setText(String.valueOf(oder.getCus_CB().getSelectedItem()));
                 LocalDate currentDate = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                String formattedDate = currentDate.format(formatter);
                lbNgayLapHD.setText(formattedDate);
                tab_ChiTiet.setModel(tableModel);
                lbTenKH3.setText(String.valueOf(oder.getSumOrder()));
                lbTenKH1.setText(String.valueOf(oder.getBtnThanhToan()));
            }
            
        });
    }
    
    private void initOderKhachHang_CB () {
        this.KH_CB = oder.getCus_CB();
        String sql = "select id from khachHang";
        try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement(); 
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            KH_CB.removeAllItems();
            while (rs.next()) {
                int value = rs.getInt("ID");
                KH_CB.addItem(String.valueOf(value));     
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi comboboxxxxxxxxx!");
        }
    }
    
=======
    private void initFormListSanPham(int soLuong){
        listSP.setPreferredSize(new Dimension(910,(int)Math.ceil((double)soLuong/6)*(230)+10));
    }
>>>>>>> f78f7ae8ee5f2eeae6706f90de2f926743526f2e
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
                            int tien = Integer.valueOf(oder.getSumOrder().getText());
                            oder.getSumOrder().setText(String.valueOf(tien + hh.getGiaTien()));
                            oder.getBtnThanhToan().setText(String.valueOf(tien + hh.getGiaTien()));
                            DsChon_List.add(hh); 
                            tableModel.fireTableDataChanged();
                            dao.updateDaBan(ID, "True");
                            listSP.removeAll();
                            updateDataByLoai(loai);
                            listSP.revalidate();
                            listSP.repaint();
                        }
                    } catch (Exception exc) {
                        JOptionPane.showMessageDialog(oder, "Dữ liệu thú cưng lỗi!!");
                    }
                }
            });
            }
        }
        initFormListSanPham(dataList.size());
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
    
    public void findTextFieldAdj(){
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

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
//        hoaDon hd = new hoaDon();
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        chiTietDonHang.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
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
    private javax.swing.JLabel Title;
    private javax.swing.JDialog chiTietDonHang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
=======
>>>>>>> f78f7ae8ee5f2eeae6706f90de2f926743526f2e
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbNgayLapHD;
    private javax.swing.JLabel lbTenKH;
    private javax.swing.JLabel lbTenKH1;
    private javax.swing.JLabel lbTenKH2;
    private javax.swing.JLabel lbTenKH3;
    private javax.swing.JLabel lbTenNV;
    private javax.swing.JPanel listSP;
    private javax.swing.JLabel lnIDKhachHang;
    private hdt.petshopproject.component.Oder oder;
    private javax.swing.JTable tab_ChiTiet;
    // End of variables declaration//GEN-END:variables

}
