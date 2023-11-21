/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
        
        

public class BukuAlamat extends javax.swing.JFrame {
        int x=0;
    /**
     * Creates new form BukuAlamat
     */
    public BukuAlamat() {
        initComponents();
         Dimension screenSize = 
         Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2); 
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        txtid = new javax.swing.JTextField();
        txtnm1 = new javax.swing.JTextField();
        txtnm2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listJeniskelamin = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCatatan = new javax.swing.JTextArea();
        txtNotlpn = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txttgllahir = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CoAgama = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(137, 202, 171));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nama Depan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nama Belakang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("No Telp");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Tanggal Lahir");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Catatan");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Simpan Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Tambah Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Keluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        listJeniskelamin.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Lali-Laki", "Perempuan", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listJeniskelamin);

        txtCatatan.setColumns(20);
        txtCatatan.setRows(5);
        jScrollPane3.setViewportView(txtCatatan);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Jenis Kelamin");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Agama");

        CoAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buddha", "Hindu", "Islam", "Khonghucu", "Kristen" }));
        CoAgama.setSelectedIndex(-1);

        tbdata.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAMA DEPAN", "NAMA BELAKANG", "JENIS KELAMIN", "AGAMA", "ALAMAT", "NO TELP", "EMAIL", "TANGGAL LAHIR", "CATATAN"
            }
        ));
        jScrollPane4.setViewportView(tbdata);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Kembali");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\semester 5\\PBO 2 Pak edya\\1.png")); // NOI18N

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Ubah");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("hapus");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNotlpn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtnm1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtnm2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CoAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(149, 149, 149))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton6)
                                    .addComponent(jButton7)
                                    .addComponent(jButton5)
                                    .addComponent(jButton4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtnm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(24, 24, 24))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(txttgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(CoAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNotlpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(628, 628, 628))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0); // Menutup aplikasi dengan menghentikan proses JVM (Java Virtual Machine) dengan kode keluar 0
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                  // Mengambil model dari tabel yang digunakan
                  DefaultTableModel model = (DefaultTableModel) tbdata.getModel(); 

                  // Mengambil nilai dari komponen-komponen input pada antarmuka pengguna
                  String id = txtid.getText();
                  String nama1 = txtnm1.getText();
                  String nama2 = txtnm2.getText();
                  String jeniskelamin = listJeniskelamin.getSelectedValue();
                  String agama = CoAgama.getSelectedItem().toString();
                  String alamat = txtAlamat.getText();
                  String notlp = txtNotlpn.getText();
                  String email = txtemail.getText();
                  String tgllahir = txttgllahir.getText();
                  String ctt = txtCatatan.getText();

                // Melakukan validasi, jika ada kolom yang kosong, tampilkan pesan kesalahan
                if (id.trim().isEmpty() || nama1.isEmpty() || nama2.isEmpty() || jeniskelamin.isEmpty() || agama.isEmpty()
                        || alamat.isEmpty() || notlp.isEmpty() || email.isEmpty() || tgllahir.isEmpty() || ctt.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Semua kolom harus diisi sebelum menambah Data!");
                    return; // Keluar dari metode jika ada kolom yang kosong
                }

                // Menyiapkan data untuk ditambahkan ke dalam tabel
                Object[] rowData = {id, nama1, nama2, jeniskelamin, agama, alamat, notlp, email, tgllahir, ctt};

                // Menambahkan data ke dalam tabel
                model.addRow(rowData);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // Mengosongkan teks pada JTextField "txtid"
         txtid.setText("");
         // Mengosongkan teks pada JTextField "txtnm1"
         txtnm1.setText("");
         // Mengosongkan teks pada JTextField "txtnm2"
         txtnm2.setText("");
         // Menetapkan nilai null pada komponen JList "listJeniskelamin" dan menggunakan opsi "rootPaneCheckingEnabled"
         listJeniskelamin.setSelectedValue(null, rootPaneCheckingEnabled);
         // Menetapkan nilai null pada komponen JComboBox "CoAgama"
         CoAgama.setSelectedItem(null);
         // Mengosongkan teks pada JTextField "txtAlamat"
         txtAlamat.setText("");
         // Mengosongkan teks pada JTextField "txtNotlpn"
         txtNotlpn.setText("");
         // Mengosongkan teks pada JTextField "txtemail"
         txtemail.setText("");
         // Mengosongkan teks pada JTextField "txttgllahir"
         txttgllahir.setText("");
         // Mengosongkan teks pada JTextField "txtCatatan"
         txtCatatan.setText("");


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // Mengambil nilai dari komponen-komponen input pada antarmuka pengguna
           String id = txtid.getText();  // Mengambil ID dari teks input "txtid"
           String nama1 = txtnm1.getText();  // Mengambil Nama Depan dari teks input "txtnm1"
           String nama2 = txtnm2.getText();  // Mengambil Nama Belakang dari teks input "txtnm2"
           String jeniskelamin = listJeniskelamin.getSelectedValue();  // Mengambil Jenis Kelamin dari daftar "listJeniskelamin"
           String agama = CoAgama.getSelectedItem().toString();  // Mengambil Agama dari pilihan yang dipilih dalam combo box "CoAgama"
           String alamat = txtAlamat.getText();  // Mengambil Alamat dari teks input "txtAlamat"
           String notlp = txtNotlpn.getText();  // Mengambil Nomor Telepon dari teks input "txtNotlpn"
           String email = txtemail.getText();  // Mengambil Email dari teks input "txtemail"
           String tgllahir = txttgllahir.getText();  // Mengambil Tanggal Lahir dari teks input "txttgllahir"
           String ctt = txtCatatan.getText();  // Mengambil Catatan dari teks input "txtCatatan"

           // Validasi untuk memastikan semua kolom telah diisi
           if (id.isEmpty() || nama1.isEmpty() || nama2.isEmpty() || jeniskelamin == null || agama.isEmpty()
                   || alamat.isEmpty() || notlp.isEmpty() || email.isEmpty() || tgllahir.isEmpty() || ctt.isEmpty()) {
               JOptionPane.showMessageDialog(rootPane, "Semua kolom harus diisi sebelum menyimpan!");
               return; // Keluar dari metode jika ada kolom yang kosong
           }

    try {
        // Membuka file "Simpan Data.txt" untuk ditambahi (append)
        FileWriter bukuAlamat = new FileWriter("Data Buku Alamat.txt", true);

    // Menulis setiap informasi seseorang/pengguna ke file
     bukuAlamat.write("ID: " + id);  // Menulis ID ke file
            bukuAlamat.write(System.getProperty("line.separator"));
            bukuAlamat.write("Nama Depan: " + nama1);  // Menulis Nama Depan ke file
            bukuAlamat.write(System.getProperty("line.separator"));
            bukuAlamat.write("Nama Belakang: " + nama2);  // Menulis Nama Belakang ke file
            bukuAlamat.write(System.getProperty("line.separator"));
            bukuAlamat.write("Jenis Kelamin: " + jeniskelamin);  // Menulis Jenis Kelamin ke file
            bukuAlamat.write(System.getProperty("line.separator"));
            bukuAlamat.write("Agama: " + agama);  // Menulis Agama ke file
            bukuAlamat.write(System.getProperty("line.separator"));
            bukuAlamat.write("Alamat: " + alamat);  // Menulis Alamat ke file
            bukuAlamat.write(System.getProperty("line.separator"));
            bukuAlamat.write("Nomor Telepon: " + notlp);  // Menulis Nomor Telepon ke file
            bukuAlamat.write(System.getProperty("line.separator"));
            bukuAlamat.write("Email: " + email);  // Menulis Email ke file
            bukuAlamat.write(System.getProperty("line.separator"));
            bukuAlamat.write("Tanggal Lahir: " + tgllahir);  // Menulis Tanggal Lahir ke file
            bukuAlamat.write(System.getProperty("line.separator"));
            bukuAlamat.write("Catatan: " + ctt);  // Menulis Catatan ke file
            bukuAlamat.write(System.getProperty("line.separator"));

        // Menutup file setelah selesai menulis
        bukuAlamat.close();

        // Menampilkan pesan sukses jika data berhasil disimpan
        JOptionPane.showMessageDialog(rootPane, "Data Anda Berhasil Disimpan Ke Format .Txt!");
    } catch (Exception e) {
        // Menampilkan pesan error jika terjadi kesalahan
        JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Form_Login_Buku_Alamat().show();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Mendapatkan indeks baris terpilih di tabel
        int selectedRow = tbdata.getSelectedRow();

        // Validasi apakah ada baris yang dipilih
        if (selectedRow == -1) {
            // Menampilkan pesan kesalahan jika tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(rootPane, "Pilih baris yang ingin diubah!");
            // Keluar dari metode jika tidak ada baris yang dipilih
            return;
       }

            // Mengambil nilai dari komponen-komponen input pada antarmuka pengguna
            String id = txtid.getText();  
            String nama1 = txtnm1.getText();  
            String nama2 = txtnm2.getText();  
            String jeniskelamin = listJeniskelamin.getSelectedValue();  
            String agama = CoAgama.getSelectedItem().toString();  
            String alamat = txtAlamat.getText();  
            String notlp = txtNotlpn.getText();  
            String email = txtemail.getText();  
            String tgllahir = txttgllahir.getText();  
            String ctt = txtCatatan.getText();  

            // Validasi apakah semua kolom telah diisi
            if (id.isEmpty() || nama1.isEmpty() || nama2.isEmpty() || jeniskelamin == null || agama.isEmpty()
                    || alamat.isEmpty() || notlp.isEmpty() || email.isEmpty() || tgllahir.isEmpty() || ctt.isEmpty()) {
                // Menampilkan pesan kesalahan jika ada kolom yang kosong
                JOptionPane.showMessageDialog(rootPane, "Semua kolom harus diisi sebelum menyimpan!");
                // Keluar dari metode jika ada kolom yang kosong
                return;
            }

                // Mengubah nilai pada tabel dengan nilai baru dari komponen input
                tbdata.setValueAt(id, selectedRow, 0);
                tbdata.setValueAt(nama1, selectedRow, 1);
                tbdata.setValueAt(nama2, selectedRow, 2);
                tbdata.setValueAt(jeniskelamin, selectedRow, 3);
                tbdata.setValueAt(agama, selectedRow, 4);
                tbdata.setValueAt(alamat, selectedRow, 5);
                tbdata.setValueAt(notlp, selectedRow, 6);
                tbdata.setValueAt(email, selectedRow, 7);
                tbdata.setValueAt(tgllahir, selectedRow, 8);
                tbdata.setValueAt(ctt, selectedRow, 9);

            // Menampilkan pesan sukses setelah berhasil melakukan perubahan
            JOptionPane.showMessageDialog(rootPane, "Data berhasil diubah!");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    // Mendapatkan indeks baris terpilih di tabel
    int selectedRow = tbdata.getSelectedRow();

    // Validasi apakah ada baris yang dipilih
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(rootPane, "Pilih baris yang ingin dihapus!");
        return; // Keluar dari metode jika tidak ada baris yang dipilih
    }

    // Konfirmasi pengguna sebelum menghapus baris
    int confirmDialogResult = JOptionPane.showConfirmDialog(rootPane, "Apakah Anda yakin ingin menghapus baris ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
    
    if (confirmDialogResult == JOptionPane.YES_OPTION) {
        // Hapus baris terpilih dari tabel
        DefaultTableModel model = (DefaultTableModel) tbdata.getModel();
        model.removeRow(selectedRow);

        // Menampilkan pesan sukses setelah berhasil menghapus
        JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus!");
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   // Mengatur tampilan dan nuansa (Look and Feel) aplikasi menggunakan Nimbus
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            // Menetapkan tampilan dan nuansa Nimbus
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            // Keluar dari loop setelah menemukan Nimbus
                            break;
                        }
                    }
                    } catch (ClassNotFoundException ex) {
                    // Log jika kelas Nimbus tidak ditemukan
                    java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    // Log jika terjadi kesalahan instansiasi
                    java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    // Log jika terjadi kesalahan akses yang tidak sah
                    java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    // Log jika tampilan dan nuansa yang tidak didukung
                    java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Membuat dan menampilkan formulir (frame) BukuAlamat */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        // Membuat instance dari kelas BukuAlamat dan menampilkannya
                        new BukuAlamat().setVisible(true);
                    }
                });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CoAgama;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.List list1;
    private javax.swing.JList<String> listJeniskelamin;
    private javax.swing.JTable tbdata;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextArea txtCatatan;
    private javax.swing.JTextField txtNotlpn;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnm1;
    private javax.swing.JTextField txtnm2;
    private javax.swing.JTextField txttgllahir;
    // End of variables declaration//GEN-END:variables

    void show(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
