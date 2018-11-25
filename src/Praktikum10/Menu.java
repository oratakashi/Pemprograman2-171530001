/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum10;

import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Date;

/**
 *
 * @author nixia
 */
public class Menu extends javax.swing.JFrame {

    SimpleDateFormat tglview = new SimpleDateFormat("dd MMMM yyyy");
    SimpleDateFormat tglonly = new SimpleDateFormat("dd");
    SimpleDateFormat bulanview = new SimpleDateFormat("MMMM yyyy");
    boolean login_active = false;
    boolean dashboard_active = false;
    
    
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        form_awal(false);
        this.setExtendedState(this.getExtendedState()| Menu.MAXIMIZED_BOTH);
        pSidebar.setVisible(false);
        pPencarian.setVisible(false);
        pSettings.setVisible(false);
        lblTgl.setText(String.valueOf(tglview.format(new Date())));
        lbWidgetTgl.setText(String.valueOf(tglonly.format(new Date())));
        lbWidgetTahun.setText(String.valueOf(bulanview.format(new Date())));
        pDashboard.setVisible(false);
        lbKeterangan.setVisible(false);
        //Custom Code
        
    }
    
    
    
    public void form_awal(boolean xyz){
        panelMenu.setVisible(xyz);
        panelNavigasi.setVisible(xyz);
        lblSetting.setVisible(xyz);
        lbPencarian.setVisible(xyz);
        
    }
    
    public void login(){
        String id_user = txtIDUser.getText();
        String password = txtPassword.getText();
        
        if(id_user.equals("")){
            JOptionPane.showMessageDialog(this, "ID. User belum di isi!", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
        }else if(password.equals("")){
            JOptionPane.showMessageDialog(this, "Password belum di isi!", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
        }else if(!id_user.equals("171530001")||!password.equals("mahasiswa")){
            JOptionPane.showMessageDialog(this, "ID. User dan Password Salah!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }else{
            form_awal(true);
            panelLogin.setVisible(false);
            txtUsername.setText("Crystal Wijaya");
            login_active = true;
        }
    }
    
    void set_color1(JPanel panel){
        if(cmbTema.getSelectedItem().equals("Gelap")){
            panel.setBackground(Color.DARK_GRAY);
        }else{
            panel.setBackground(Color.LIGHT_GRAY);
        }
    }
    
    void set_color2(JPanel panel){
        if(cmbTema.getSelectedItem().equals("Gelap")){
            panel.setBackground(new java.awt.Color(80,80,80));
        }else{
            panel.setBackground(Color.WHITE);
        }
    }
    
    void set_tema(String tema){
        if(tema.equals("Gelap")){
            pPencarian.setBackground(Color.DARK_GRAY);
            pSettings.setBackground(Color.DARK_GRAY);
            pSidebar.setBackground(Color.DARK_GRAY);
            panelLogin.setBackground(Color.DARK_GRAY);
            panelMenu.setBackground(Color.DARK_GRAY);
            panelHeader.setBackground(Color.DARK_GRAY);
            panelFooter.setBackground(Color.DARK_GRAY);
            mnAdd.setBackground(new java.awt.Color(80,80,80));
            mnProfile.setBackground(new java.awt.Color(80,80,80));
            mnReport.setBackground(new java.awt.Color(80,80,80));
            mnExit.setBackground(new java.awt.Color(80,80,80));
            slUpload.setBackground(Color.DARK_GRAY);
            panelNavigasi.setBackground(new java.awt.Color(80,80,80));
            //Label
            lblUsername.setForeground(Color.WHITE);
            lbAdd.setForeground(Color.WHITE);
            lblProfile.setForeground(Color.WHITE);
            lblReport.setForeground(Color.WHITE);
            lblExit.setForeground(Color.WHITE);
            lbPencarian.setForeground(Color.WHITE);
            lblSetting.setForeground(Color.WHITE);
            lbSize.setForeground(Color.WHITE);
            lblSetUsername.setForeground(Color.WHITE);
            lbTheme.setForeground(Color.WHITE);
            lbMaxUpload.setForeground(Color.WHITE);
            lblTgl.setForeground(Color.WHITE);
            lbSidebar.setForeground(Color.WHITE);
            lbBahasa.setForeground(Color.WHITE);
            txtUsername.setForeground(Color.WHITE);
            txtPencarian.setForeground(Color.WHITE);
            
        }else if(tema.equals("Terang")){
            pPencarian.setBackground(Color.LIGHT_GRAY);
            pSettings.setBackground(Color.LIGHT_GRAY);
            pSidebar.setBackground(Color.LIGHT_GRAY);
            panelLogin.setBackground(Color.LIGHT_GRAY);
            panelMenu.setBackground(Color.LIGHT_GRAY);
            panelHeader.setBackground(Color.LIGHT_GRAY);
            panelFooter.setBackground(Color.LIGHT_GRAY);
            slUpload.setBackground(Color.LIGHT_GRAY);
            panelNavigasi.setBackground(Color.WHITE);
            mnAdd.setBackground(Color.WHITE);
            mnProfile.setBackground(Color.WHITE);
            mnReport.setBackground(Color.WHITE);
            mnExit.setBackground(Color.WHITE);
            
            //Label
            lblUsername.setForeground(Color.BLACK);
            lbAdd.setForeground(Color.BLACK);
            lblProfile.setForeground(Color.BLACK);
            lblReport.setForeground(Color.BLACK);
            lblExit.setForeground(Color.BLACK);
            lbPencarian.setForeground(Color.BLACK);
            lblSetting.setForeground(Color.BLACK);
            lbSize.setForeground(Color.BLACK);
            lblSetUsername.setForeground(Color.BLACK);
            lbTheme.setForeground(Color.BLACK);
            lbMaxUpload.setForeground(Color.BLACK);
            lblTgl.setForeground(Color.BLACK);
            lbSidebar.setForeground(Color.BLACK);
            lbBahasa.setForeground(Color.BLACK);
            txtUsername.setForeground(Color.BLACK);
            txtPencarian.setForeground(Color.BLACK);
        }
    }
    
    void set_bahasa(String bahasa){
        if(bahasa.equals("English")){
            lbAdd.setText("Add");
            lblProfile.setText("Profile");
            lblReport.setText("Report");
            lblExit.setText("Exit");
            lblSetting.setText("Setting");
            lbPencarian.setText("Search");
            lbBahasa.setText("Set Language");
            lbMaxUpload.setText("Set Maximum Upload File");
            lbTheme.setText("Set Theme");
            lbSetBackground.setText("Set Background");
            lblSetUsername.setText("Set Username");
            btnApply.setText("Apply");
            lbSidebar.setText("Setting");
        }else if(bahasa.equals("Indonesia")){
            lbAdd.setText("Tambah");
            lblProfile.setText("Profil");
            lblReport.setText("Laporan");
            lblExit.setText("Keluar");
            lblSetting.setText("Pengaturan");
            lbPencarian.setText("Pencarian");
            lbBahasa.setText("Atur Bahasa");
            lbMaxUpload.setText("Atur Maksimal Upload File");
            lbTheme.setText("Atur Tema");
            lbSetBackground.setText("Atur Background");
            lblSetUsername.setText("Atur Username");
            btnApply.setText("Terapkan");
            lbSidebar.setText("Pengaturan");
        }
    }
    
    void set_backgroud(String background){
        if(background.equals("Material")){
            lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/material.png")));
        }else if(background.equals("Windows")){
            lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/windows.png")));
        }else if(background.equals("Sierra")){
            lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/sierra.png")));
        }else if(background.equals("Abstract")){
            lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/abstract.png")));
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIDUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        panelMenu = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        mnAdd = new javax.swing.JPanel();
        lbAdd = new javax.swing.JLabel();
        mnProfile = new javax.swing.JPanel();
        lblProfile = new javax.swing.JLabel();
        mnReport = new javax.swing.JPanel();
        lblReport = new javax.swing.JLabel();
        mnExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        panelNavigasi = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblSetting = new javax.swing.JLabel();
        lbPencarian = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelFooter = new javax.swing.JPanel();
        lblTgl = new javax.swing.JLabel();
        lbKeterangan = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pSidebar = new javax.swing.JPanel();
        lbSidebar = new javax.swing.JLabel();
        pPencarian = new javax.swing.JPanel();
        txtPencarian = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        pSettings = new javax.swing.JPanel();
        slUpload = new javax.swing.JSlider();
        lbMaxUpload = new javax.swing.JLabel();
        lbSize = new javax.swing.JLabel();
        lbTheme = new javax.swing.JLabel();
        cmbTema = new javax.swing.JComboBox<>();
        lbBahasa = new javax.swing.JLabel();
        cmbBahasa = new javax.swing.JComboBox<>();
        lblSetUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnApply = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        lbSetBackground = new javax.swing.JLabel();
        cmbBackground = new javax.swing.JComboBox<>();
        pMenu = new javax.swing.JDesktopPane();
        pDashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbWidgetTgl = new javax.swing.JLabel();
        lbWidgetTahun = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtBrgBaru = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblUsername2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelLogin.setBackground(java.awt.Color.darkGray);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/lock.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Login App");

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("ID User");

        txtIDUser.setBackground(java.awt.Color.darkGray);
        txtIDUser.setForeground(java.awt.Color.orange);
        txtIDUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDUser.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Password");

        txtPassword.setBackground(java.awt.Color.darkGray);
        txtPassword.setForeground(java.awt.Color.orange);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(java.awt.Color.orange);
        btnLogin.setForeground(java.awt.Color.white);
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13))
                            .addGroup(panelLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(26, 26, 26))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(5, 5, 5)
                .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.setBackground(java.awt.Color.darkGray);

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/crystal-wijaya.png"))); // NOI18N

        lblUsername.setBackground(java.awt.Color.white);
        lblUsername.setFont(new java.awt.Font("Bradley Hand ITC", 0, 18)); // NOI18N
        lblUsername.setForeground(java.awt.Color.white);
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Crystal Wijaya");

        mnAdd.setBackground(new java.awt.Color(80, 80, 80));
        mnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnAddMouseExited(evt);
            }
        });

        lbAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbAdd.setForeground(java.awt.Color.white);
        lbAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/nav-menu.png"))); // NOI18N
        lbAdd.setText("Add");

        javax.swing.GroupLayout mnAddLayout = new javax.swing.GroupLayout(mnAdd);
        mnAdd.setLayout(mnAddLayout);
        mnAddLayout.setHorizontalGroup(
            mnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnAddLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnAddLayout.setVerticalGroup(
            mnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnProfile.setBackground(new java.awt.Color(80, 80, 80));
        mnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnProfileMouseExited(evt);
            }
        });

        lblProfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProfile.setForeground(java.awt.Color.white);
        lblProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/nav-menu.png"))); // NOI18N
        lblProfile.setText("Profile");

        javax.swing.GroupLayout mnProfileLayout = new javax.swing.GroupLayout(mnProfile);
        mnProfile.setLayout(mnProfileLayout);
        mnProfileLayout.setHorizontalGroup(
            mnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnProfileLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnProfileLayout.setVerticalGroup(
            mnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnReport.setBackground(new java.awt.Color(80, 80, 80));
        mnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnReportMouseExited(evt);
            }
        });

        lblReport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblReport.setForeground(java.awt.Color.white);
        lblReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/nav-menu.png"))); // NOI18N
        lblReport.setText("Report");

        javax.swing.GroupLayout mnReportLayout = new javax.swing.GroupLayout(mnReport);
        mnReport.setLayout(mnReportLayout);
        mnReportLayout.setHorizontalGroup(
            mnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnReportLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnReportLayout.setVerticalGroup(
            mnReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnExit.setBackground(new java.awt.Color(80, 80, 80));
        mnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mnExitMouseExited(evt);
            }
        });

        lblExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExit.setForeground(java.awt.Color.white);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/exit.png"))); // NOI18N
        lblExit.setText("Exit");

        javax.swing.GroupLayout mnExitLayout = new javax.swing.GroupLayout(mnExit);
        mnExit.setLayout(mnExitLayout);
        mnExitLayout.setHorizontalGroup(
            mnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnExitLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mnExitLayout.setVerticalGroup(
            mnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblFoto)
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(mnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mnReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelNavigasi.setBackground(new java.awt.Color(80, 80, 80));

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/nav-menu1.png"))); // NOI18N
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelNavigasiLayout = new javax.swing.GroupLayout(panelNavigasi);
        panelNavigasi.setLayout(panelNavigasiLayout);
        panelNavigasiLayout.setHorizontalGroup(
            panelNavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNavigasiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMenu)
                .addContainerGap())
        );
        panelNavigasiLayout.setVerticalGroup(
            panelNavigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNavigasiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(java.awt.Color.white);

        panelHeader.setBackground(java.awt.Color.darkGray);

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/close.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblSetting.setForeground(java.awt.Color.white);
        lblSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/settings.png"))); // NOI18N
        lblSetting.setText("Setting");
        lblSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSettingMouseClicked(evt);
            }
        });

        lbPencarian.setForeground(java.awt.Color.white);
        lbPencarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/pencarian.png"))); // NOI18N
        lbPencarian.setText("Search");
        lbPencarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPencarianMouseClicked(evt);
            }
        });

        jLabel5.setForeground(java.awt.Color.orange);
        jLabel5.setText("SisDang | Sistem Informasi Pergudangan v1.0");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPencarian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSetting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClose, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSetting)
                        .addComponent(lbPencarian)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        panelFooter.setBackground(java.awt.Color.darkGray);

        lblTgl.setForeground(java.awt.Color.white);
        lblTgl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTgl.setText("Tanggal Saat Ini");

        lbKeterangan.setForeground(java.awt.Color.white);
        lbKeterangan.setText("Informasi : Klik dua kali pada background untuk membuka dashboard");

        javax.swing.GroupLayout panelFooterLayout = new javax.swing.GroupLayout(panelFooter);
        panelFooter.setLayout(panelFooterLayout);
        panelFooterLayout.setHorizontalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbKeterangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTgl)
                    .addComponent(lbKeterangan))
                .addGap(6, 6, 6))
        );

        jPanel5.setLayout(new javax.swing.OverlayLayout(jPanel5));

        jPanel2.setOpaque(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        pSidebar.setBackground(java.awt.Color.darkGray);

        lbSidebar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSidebar.setForeground(java.awt.Color.white);
        lbSidebar.setText("lbSidebar");

        pPencarian.setBackground(java.awt.Color.darkGray);

        txtPencarian.setBackground(java.awt.Color.darkGray);
        txtPencarian.setForeground(java.awt.Color.white);
        txtPencarian.setBorder(null);
        txtPencarian.setOpaque(false);

        javax.swing.GroupLayout pPencarianLayout = new javax.swing.GroupLayout(pPencarian);
        pPencarian.setLayout(pPencarianLayout);
        pPencarianLayout.setHorizontalGroup(
            pPencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPencarianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pPencarianLayout.setVerticalGroup(
            pPencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPencarianLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pSettings.setBackground(java.awt.Color.darkGray);

        slUpload.setBackground(java.awt.Color.darkGray);
        slUpload.setValue(10);
        slUpload.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slUploadStateChanged(evt);
            }
        });
        slUpload.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                slUploadPropertyChange(evt);
            }
        });

        lbMaxUpload.setForeground(java.awt.Color.white);
        lbMaxUpload.setText("Set Maximum Upload File");

        lbSize.setForeground(java.awt.Color.white);
        lbSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSize.setText("10Mb");

        lbTheme.setForeground(java.awt.Color.white);
        lbTheme.setText("Set Theme");

        cmbTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gelap", "Terang" }));
        cmbTema.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTemaItemStateChanged(evt);
            }
        });

        lbBahasa.setForeground(java.awt.Color.white);
        lbBahasa.setText("Set Language");

        cmbBahasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Indonesia" }));
        cmbBahasa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBahasaItemStateChanged(evt);
            }
        });

        lblSetUsername.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblSetUsername.setForeground(java.awt.Color.white);
        lblSetUsername.setText("Set Username");

        txtUsername.setForeground(java.awt.Color.white);
        txtUsername.setBorder(null);
        txtUsername.setOpaque(false);

        btnApply.setText("Apply");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        lbSetBackground.setForeground(java.awt.Color.white);
        lbSetBackground.setText("Set Background");

        cmbBackground.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Material", "Windows", "Sierra", "Abstract" }));
        cmbBackground.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBackgroundItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pSettingsLayout = new javax.swing.GroupLayout(pSettings);
        pSettings.setLayout(pSettingsLayout);
        pSettingsLayout.setHorizontalGroup(
            pSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slUpload, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(lbSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBahasa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSettingsLayout.createSequentialGroup()
                        .addGroup(pSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApply))
                    .addGroup(pSettingsLayout.createSequentialGroup()
                        .addGroup(pSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaxUpload)
                            .addComponent(lbTheme)
                            .addComponent(lbBahasa)
                            .addComponent(lblSetUsername)
                            .addComponent(lbSetBackground))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbBackground, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pSettingsLayout.setVerticalGroup(
            pSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSettingsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbMaxUpload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slUpload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbSize)
                .addGap(10, 10, 10)
                .addComponent(lbTheme)
                .addGap(5, 5, 5)
                .addComponent(cmbTema, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbBahasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBahasa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbSetBackground)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblSetUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApply))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pSidebarLayout = new javax.swing.GroupLayout(pSidebar);
        pSidebar.setLayout(pSidebarLayout);
        pSidebarLayout.setHorizontalGroup(
            pSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPencarian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSidebar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pSidebarLayout.setVerticalGroup(
            pSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSidebar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pMenu.setOpaque(false);

        pDashboard.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 26)); // NOI18N
        jLabel1.setText("Dashboard");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Main");

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        lbWidgetTgl.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        lbWidgetTgl.setText("08");

        lbWidgetTahun.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbWidgetTahun.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbWidgetTahun.setText("Maret 2018");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbWidgetTgl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lbWidgetTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbWidgetTgl)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbWidgetTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pesan");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel7.setBackground(java.awt.Color.darkGray);

        txtBrgBaru.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        txtBrgBaru.setForeground(java.awt.Color.white);
        txtBrgBaru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBrgBaru.setText("0");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Barang Baru");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBrgBaru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBrgBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 0, 51));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pending Task");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Pengiriman Barang");

        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("ke Toko Berkah Jaya");

        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Hari Ini");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel9.setBackground(java.awt.Color.darkGray);

        jPanel10.setBackground(java.awt.Color.darkGray);

        jLabel15.setBackground(java.awt.Color.white);
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Daftar Barang Terbaru");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(java.awt.Color.darkGray);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/sad.png"))); // NOI18N

        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Tidak Ada Data");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel16)
                .addGap(0, 0, 0)
                .addComponent(jLabel17)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblUsername2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsername2.setForeground(java.awt.Color.white);
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/crystal-wijaya - small.png"))); // NOI18N
        lblUsername2.setText("Crystal Wijaya");

        javax.swing.GroupLayout pDashboardLayout = new javax.swing.GroupLayout(pDashboard);
        pDashboard.setLayout(pDashboardLayout);
        pDashboardLayout.setHorizontalGroup(
            pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(pDashboardLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDashboardLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDashboardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(155, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDashboardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pDashboardLayout.setVerticalGroup(
            pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDashboardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pDashboardLayout.createSequentialGroup()
                        .addComponent(lblUsername2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDashboardLayout.createSequentialGroup()
                        .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pDashboardLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pMenu.setLayer(pDashboard, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(pMenuLayout);
        pMenuLayout.setHorizontalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pMenuLayout.setVerticalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(pMenu)
                .addGap(0, 0, 0)
                .addComponent(pSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pMenu)
        );

        jPanel5.add(jPanel2);

        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Praktikum10/material.png"))); // NOI18N
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 554, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelNavigasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelNavigasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        login();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        panelMenu.setVisible(true);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        panelMenu.setVisible(false);
        panelNavigasi.setVisible(true);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void mnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseClicked
        int exit = JOptionPane.showConfirmDialog(this, "Apakah anda ingin keluar dari aplikasi ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(exit==JOptionPane.YES_OPTION){
            form_awal(false);
            pSidebar.setVisible(false);
            pPencarian.setVisible(false);
            pSettings.setVisible(false);
            pDashboard.setVisible(false);
            lbKeterangan.setVisible(false);
            panelLogin.setVisible(true);
            login_active = false;
        }
    }//GEN-LAST:event_mnExitMouseClicked

    private void mnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAddMouseEntered
        set_color1(mnAdd);
    }//GEN-LAST:event_mnAddMouseEntered

    private void mnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAddMouseExited
        set_color2(mnAdd);
    }//GEN-LAST:event_mnAddMouseExited

    private void mnProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnProfileMouseEntered
        set_color1(mnProfile);
    }//GEN-LAST:event_mnProfileMouseEntered

    private void mnProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnProfileMouseExited
        set_color2(mnProfile);
    }//GEN-LAST:event_mnProfileMouseExited

    private void mnReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnReportMouseEntered
        set_color1(mnReport);
    }//GEN-LAST:event_mnReportMouseEntered

    private void mnReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnReportMouseExited
        set_color2(mnReport);
    }//GEN-LAST:event_mnReportMouseExited

    private void mnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseEntered
        set_color1(mnExit);
    }//GEN-LAST:event_mnExitMouseEntered

    private void mnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseExited
        set_color2(mnExit);
    }//GEN-LAST:event_mnExitMouseExited

    private void lbPencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPencarianMouseClicked
        pSidebar.setVisible(true);
        if(cmbBahasa.getSelectedItem().toString().equals("Indonesia")){
            lbSidebar.setText("Pencarian");
            pPencarian.setVisible(true);
            pSettings.setVisible(false);
            txtPencarian.requestFocus(true);
        }else{
            lbSidebar.setText("Search");
            pPencarian.setVisible(true);
            pSettings.setVisible(false);
            txtPencarian.requestFocus(true);
        }
        
    }//GEN-LAST:event_lbPencarianMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        if(login_active==true){
            if(evt.getClickCount()==1){
                pSidebar.setVisible(false);
                panelMenu.setVisible(false);
                panelNavigasi.setVisible(true);
                if(dashboard_active==false){
                    lbKeterangan.setVisible(true);
                }
                
            }else if(evt.getClickCount()==2){
                if(dashboard_active==false){
                    dashboard_active=true;
                    pDashboard.setVisible(true);
                }else if(dashboard_active==true){
                    dashboard_active=false;
                    pDashboard.setVisible(false);
                }
                lbKeterangan.setVisible(false);
            }
            
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void lblSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingMouseClicked
        if(cmbBahasa.getSelectedItem().toString().equals("Indonesia")){
            pSidebar.setVisible(true);
            lbSidebar.setText("Pengaturan");
            pPencarian.setVisible(false);
            pSettings.setVisible(true);
        }else{
            pSidebar.setVisible(true);
            lbSidebar.setText("Setting");
            pPencarian.setVisible(false);
            pSettings.setVisible(true);
        }
    }//GEN-LAST:event_lblSettingMouseClicked

    private void slUploadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_slUploadPropertyChange
        
    }//GEN-LAST:event_slUploadPropertyChange

    private void slUploadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slUploadStateChanged
        lbSize.setText(String.valueOf(slUpload.getValue())+"Mb");
    }//GEN-LAST:event_slUploadStateChanged

    private void cmbTemaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTemaItemStateChanged
        set_tema(cmbTema.getSelectedItem().toString() );
        
    }//GEN-LAST:event_cmbTemaItemStateChanged

    private void mnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAddMouseClicked
        IfrAdd fr = new IfrAdd();
        pMenu.add(fr);
        fr.setVisible(true);
        pDashboard.setVisible(false);
        dashboard_active = false;
    }//GEN-LAST:event_mnAddMouseClicked

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        JOptionPane.showMessageDialog(this, "Berhasil merubah username", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        txtUsername.setText(txtUsername.getText());
        lblUsername.setText(txtUsername.getText());
        lblUsername2.setText(txtUsername.getText());
    }//GEN-LAST:event_btnApplyActionPerformed

    private void cmbBackgroundItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBackgroundItemStateChanged
        set_backgroud(cmbBackground.getSelectedItem().toString());
    }//GEN-LAST:event_cmbBackgroundItemStateChanged

    private void cmbBahasaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBahasaItemStateChanged
        set_bahasa(cmbBahasa.getSelectedItem().toString());
    }//GEN-LAST:event_cmbBahasaItemStateChanged

    private void mnReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnReportMouseClicked
        IfrReport fr = new IfrReport();
        pMenu.add(fr);
        fr.setVisible(true);
        pDashboard.setVisible(false);
        dashboard_active = false;
    }//GEN-LAST:event_mnReportMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbBackground;
    private javax.swing.JComboBox<String> cmbBahasa;
    private javax.swing.JComboBox<String> cmbTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbAdd;
    private javax.swing.JLabel lbBahasa;
    private javax.swing.JLabel lbKeterangan;
    private javax.swing.JLabel lbMaxUpload;
    private javax.swing.JLabel lbPencarian;
    private javax.swing.JLabel lbSetBackground;
    private javax.swing.JLabel lbSidebar;
    private javax.swing.JLabel lbSize;
    private javax.swing.JLabel lbTheme;
    private javax.swing.JLabel lbWidgetTahun;
    private javax.swing.JLabel lbWidgetTgl;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblSetUsername;
    private javax.swing.JLabel lblSetting;
    private javax.swing.JLabel lblTgl;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JPanel mnAdd;
    private javax.swing.JPanel mnExit;
    private javax.swing.JPanel mnProfile;
    private javax.swing.JPanel mnReport;
    private javax.swing.JPanel pDashboard;
    private javax.swing.JDesktopPane pMenu;
    private javax.swing.JPanel pPencarian;
    private javax.swing.JPanel pSettings;
    private javax.swing.JPanel pSidebar;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNavigasi;
    private javax.swing.JSlider slUpload;
    private javax.swing.JLabel txtBrgBaru;
    private javax.swing.JTextField txtIDUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPencarian;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
