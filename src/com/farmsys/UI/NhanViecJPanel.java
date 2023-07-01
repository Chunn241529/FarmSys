
package com.farmsys.UI;

import com.farmsys.Entity.GianTrong;
import com.farmsys.Entity.NhanVien;
import com.farmsys.Entity.NhatKy;
import com.farmsys.Helper.MailHelper;
import com.farmsys.Helper.MsgBox;
import com.farmsys.dao.GianTrongDAO;
import com.farmsys.dao.NhanVienDAO;
import com.farmsys.dao.NhatKyDAO;
import java.sql.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NguyenTrung
 */
public class NhanViecJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhanviecJPanel
     */
    public NhanViecJPanel() {
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

        LydoJDialog = new javax.swing.JDialog();
        pnllydo = new javax.swing.JPanel();
        lbllydo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtlydo = new javax.swing.JTextArea();
        btnXacnhantuchoi = new javax.swing.JButton();
        pnltong = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnltbl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcv = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblnhanvien = new javax.swing.JLabel();
        pnlThaotac = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txttencv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmota = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtgiaoviec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtngaykt = new javax.swing.JTextField();
        btnhuy = new javax.swing.JButton();
        btnnhanviec = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        LydoJDialog.setTitle("Lý do từ chối nhận việc");
        LydoJDialog.setMinimumSize(new java.awt.Dimension(400, 200));
        LydoJDialog.setPreferredSize(new java.awt.Dimension(400, 200));

        pnllydo.setBackground(new java.awt.Color(255, 255, 255));

        lbllydo.setText("Lý do:");

        txtlydo.setColumns(20);
        txtlydo.setLineWrap(true);
        txtlydo.setRows(5);
        jScrollPane3.setViewportView(txtlydo);

        btnXacnhantuchoi.setText("Xác nhận");
        btnXacnhantuchoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacnhantuchoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnllydoLayout = new javax.swing.GroupLayout(pnllydo);
        pnllydo.setLayout(pnllydoLayout);
        pnllydoLayout.setHorizontalGroup(
            pnllydoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnllydoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnllydoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(pnllydoLayout.createSequentialGroup()
                        .addComponent(lbllydo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnllydoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnXacnhantuchoi)))
                .addContainerGap())
        );
        pnllydoLayout.setVerticalGroup(
            pnllydoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnllydoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllydo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXacnhantuchoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LydoJDialogLayout = new javax.swing.GroupLayout(LydoJDialog.getContentPane());
        LydoJDialog.getContentPane().setLayout(LydoJDialogLayout);
        LydoJDialogLayout.setHorizontalGroup(
            LydoJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnllydo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LydoJDialogLayout.setVerticalGroup(
            LydoJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnllydo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setMinimumSize(new java.awt.Dimension(1090, 750));
        setPreferredSize(new java.awt.Dimension(1090, 750));

        pnltong.setBackground(new java.awt.Color(255, 255, 255));
        pnltong.setMinimumSize(new java.awt.Dimension(1083, 750));
        pnltong.setPreferredSize(new java.awt.Dimension(1083, 750));
        pnltong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("Quản Lí  Công Việc Nhân Viên");
        pnltong.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnltbl.setBackground(new java.awt.Color(255, 255, 255));
        pnltbl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblcv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblcv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên Công Việc", "Mô Tả", "Người Giao Việc", "Ngày Kết Thúc", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblcv.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblcv.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblcv.setShowGrid(false);
        tblcv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcv);

        pnltbl.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, 540, 590));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Chi Tiết Công Việc :");
        pnltbl.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lblnhanvien.setText("jLabel8");
        pnltbl.add(lblnhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, -1, -1));

        pnlThaotac.setBackground(new java.awt.Color(255, 255, 255));
        pnlThaotac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Tên công việc: ");

        txttencv.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Mô tả: ");

        txtmota.setEditable(false);
        txtmota.setColumns(20);
        txtmota.setRows(5);
        jScrollPane2.setViewportView(txtmota);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Người giao việc: ");

        txtgiaoviec.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Ngày kết thúc: ");

        txtngaykt.setEditable(false);

        btnhuy.setBackground(new java.awt.Color(255, 255, 255));
        btnhuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnhuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_cancel_40px.png"))); // NOI18N
        btnhuy.setText("Từ chối");
        btnhuy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhuy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyActionPerformed(evt);
            }
        });

        btnnhanviec.setBackground(new java.awt.Color(255, 255, 255));
        btnnhanviec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnhanviec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_ok_40px.png"))); // NOI18N
        btnnhanviec.setText("Nhận việc");
        btnnhanviec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnhanviec.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnhanviec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanviecActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmsys/icons/icons8_synchronize_25px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlThaotacLayout = new javax.swing.GroupLayout(pnlThaotac);
        pnlThaotac.setLayout(pnlThaotacLayout);
        pnlThaotacLayout.setHorizontalGroup(
            pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThaotacLayout.createSequentialGroup()
                .addGroup(pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThaotacLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlThaotacLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txttencv, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlThaotacLayout.createSequentialGroup()
                                .addGroup(pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnlThaotacLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(77, 77, 77))
                                        .addGroup(pnlThaotacLayout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(pnlThaotacLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(22, 22, 22)))
                                .addGroup(pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtgiaoviec, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlThaotacLayout.createSequentialGroup()
                                        .addComponent(btnnhanviec, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnlThaotacLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlThaotacLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtgiaoviec, txtngaykt, txttencv});

        pnlThaotacLayout.setVerticalGroup(
            pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThaotacLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttencv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgiaoviec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(pnlThaotacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnhuy)
                    .addComponent(btnnhanviec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        pnlThaotacLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtgiaoviec, txtngaykt, txttencv});

        pnltbl.add(pnlThaotac, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 490, 500));

        pnltong.add(pnltbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnltong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnltong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblcvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcvMouseClicked
        if (evt.getClickCount() == 1) {
            this.row = tblcv.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblcvMouseClicked

    private void btnnhanviecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanviecActionPerformed
        this.update();
        this.clear();
    }//GEN-LAST:event_btnnhanviecActionPerformed

    private void btnhuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyActionPerformed
        LydoJDialog.setVisible(true);

    }//GEN-LAST:event_btnhuyActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.fillTableNguoinhanviec();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnXacnhantuchoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacnhantuchoiActionPerformed
        this.updateAgain();
        this.clear();

    }//GEN-LAST:event_btnXacnhantuchoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog LydoJDialog;
    private javax.swing.JButton btnXacnhantuchoi;
    private javax.swing.JButton btnhuy;
    private javax.swing.JButton btnnhanviec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbllydo;
    private javax.swing.JLabel lblnhanvien;
    private javax.swing.JPanel pnlThaotac;
    private javax.swing.JPanel pnllydo;
    private javax.swing.JPanel pnltbl;
    private javax.swing.JPanel pnltong;
    private javax.swing.JTable tblcv;
    private javax.swing.JTextField txtgiaoviec;
    private javax.swing.JTextArea txtlydo;
    private javax.swing.JTextArea txtmota;
    private javax.swing.JTextField txtngaykt;
    private javax.swing.JTextField txttencv;
    // End of variables declaration//GEN-END:variables
    NhatKyDAO nkDAO = new NhatKyDAO();
    GianTrongDAO gtDAO = new GianTrongDAO();
    NhanVienDAO nvDAO = new NhanVienDAO();
    int row = -1;
    String lydotuchoi;
    private String emailNV;

    private void init() {
        this.row = -1;
        loadLbl();
        LydoJDialog.setLocationRelativeTo(this);
        fillTableNguoinhanviec();

    }

    private void loadLbl() {
        lblnhanvien.setText(DangNhapJDialog.HienThiTen());
    }

    void fillTableNguoinhanviec() {
        DefaultTableModel model = (DefaultTableModel) tblcv.getModel();
        model.setRowCount(0);
        String tennv = lblnhanvien.getText();
        List<NhatKy> list = nkDAO.selectByTrangThaivaTennv(0, tennv);
        for (NhatKy nk : list) {
            model.addRow(new Object[]{
                nk.getStt(), nk.getTenCV(), nk.getChiTiet(), nk.getTenGian(), nk.getNguoiTao(), nk.getNgayKetThuc(), nk.toString()
            });
        }

    }

    void update() {
        NhatKy nv = getForm();

        if (nv == null) {
            return;
        } else {
            try {
                nkDAO.update((int) tblcv.getValueAt(this.row, 0));
                this.fillTableNguoinhanviec();
                MsgBox.alert(this, "Nhận việc thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Nhận việc thất bại!");
            }
        }
    }

    void updateAgain() {
        lydotuchoi = txtlydo.getText();
        NhatKy nv = getForm();
        GianTrong gt = new GianTrong();
        if (nv == null) {
        } else {
            try {
                nkDAO.updateTuChoi((int) tblcv.getValueAt(this.row, 0));
                gtDAO.updateAgain((String) tblcv.getValueAt(this.row, 3));
                this.fillTableNguoinhanviec();
                SendMail();
                MsgBox.alert(this, "Đã từ chối!");
            } catch (Exception e) {
                MsgBox.alert(this, "Từ chối thất bại!");
            }
        }
    }

    void setForm(NhatKy nv) {
        txttencv.setText(nv.getTenCV());
        txtmota.setText(nv.getChiTiet());
        txtgiaoviec.setText(nv.getNguoiTao());
        txtngaykt.setText(String.valueOf(nv.getNgayKetThuc()));

    }

    NhatKy getForm() {
        if (Validation()) {
            NhatKy nv = new NhatKy();
            nv.setTenCV(txttencv.getText());
            nv.setChiTiet(txtmota.getText());
            nv.setNguoiTao(txtgiaoviec.getText());
            nv.setNgayKetThuc(Date.valueOf(txtngaykt.getText()));

            return nv;
        }
        return null;
    }

    void edit() {
        int manv = (int) tblcv.getValueAt(this.row, 0);
        NhatKy nv = nkDAO.selectformtodoanddoing(manv);
        this.setForm(nv);

    }

    boolean Validation() {
        //Kiểm tra mã nhân viên
        if (txttencv.getText().length() == 0) {
            return false;
        }
        return true;
    }

    private void clear() {
        txttencv.setText("");
        txtngaykt.setText("");
        txtmota.setText("");
        txtgiaoviec.setText("");
    }

    void SendMail() {
        try {
            String nhanvien = lblnhanvien.getText();
            NhanVien nhanVien = nvDAO.selectById(nhanvien);
            if (nhanVien != null) {//check tk có tồn tại không
                emailNV = nvDAO.selectById(nhanvien).getEmail();//check mail nv
                if (emailNV == null) {
                    MsgBox.alert(this, "Tài khoản này chưa có email");
                } else {//tài khoản có mail --> gửi mail -->check otp
                    MsgBox.alert(this, "Đang gửi mail...");
                    LydoJDialog.setVisible(false);
                    MailHelper.sendText(emailNV, "Xác nhận lý do từ chối nhận việc", "Lý do:" + " " + lydotuchoi + "." + " Đã xác nhận!");
                    MsgBox.alert(this, "Lý do của bạn đã được xác nhận !");
                }
            } else {
                MsgBox.alert(this, "Tài khoản không tồn tại");
            }
        } catch (Exception e) {
        }
    }
}