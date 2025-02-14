package Home.Views;

import Components.AlertMessager;
import Home.Controller.StaffController;
import Home.Model.StaffModel;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.awt.GridLayout;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperCompileManager;







public class HomeScreenmain extends javax.swing.JFrame {

    StaffController controller = new StaffController();
            String name1 ;
            String gender1;
            String age2;
            String position1;
            String salary2;
            String contact1;
            String image1;
            String date1;
    


    public HomeScreenmain() {
        initComponents();
        viewStaff();
        
    }
    public void viewStaff(){
        getData();
        scrollPane.removeAll();
        scrollPane.setLayout(new GridLayout(controller.getData().size()/5, 5));
        controller.getData().forEach((staff) -> {
            scrollPaneItems items = new scrollPaneItems(staff);
            scrollPane.add(items);
            scrollPane.repaint();
            scrollPane.revalidate();
        });        
    }
    
    public void getData(){
        DefaultTableModel model =(DefaultTableModel) table.getModel();
        model.setRowCount(0);
        controller.getData().forEach((staff)->{
            Object[] row={
            staff.getId(),
            staff.getName(),
            staff.getGender(),
            staff.getAge(),
            staff.getPosition(),
            staff.getSalary(),
            staff.getContact(),
            staff.getImage(),
            staff.getDate(),
            };
            model.addRow(row);
        });
    }
    
    public void clear(){
        txtName.setText("");
        btnMale.setSelected(false);
        btnFemale.setSelected(false);
        txtSalary.setText("");
        txtAge.setText("");
        txtPosition.setText("");
        txtContact.setText("");
        txtImage.setText("");
        btnGroupGender.clearSelection();
        lbImage.setIcon(null);
    }
    
    void gotoScreen(Component components){
        mainScreen.removeAll();
        mainScreen.add(components);
        mainScreen.repaint();
        mainScreen.revalidate();
    }
public void chooseImage(JLabel label, JTextField textfield) {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        String fileName = file.getAbsolutePath();
        ImageIcon icon = new ImageIcon(fileName);
        Image image = icon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
        textfield.setText(fileName);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        mainScreen = new javax.swing.JPanel();
        homeScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollPane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtImage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnFemale = new javax.swing.JRadioButton();
        btnMale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        lbImage = new javax.swing.JLabel();
        btnAddStaff = new javax.swing.JButton();
        btnChooseImage = new javax.swing.JButton();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtContact = new javax.swing.JTextField();
        searchScreen = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        homeScreen1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUDSalary = new javax.swing.JTextField();
        txtImage1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUDAge = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtUDPosition = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnUDFemale = new javax.swing.JRadioButton();
        btnUDMale = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        lbUDImage = new javax.swing.JLabel();
        txtUDDate = new com.toedter.calendar.JDateChooser();
        txtUDContact = new javax.swing.JTextField();
        txtUDName = new javax.swing.JTextField();
        btnUDChooseImage = new javax.swing.JButton();
        btnDelete = new com.k33ptoo.components.KButton();
        btnUpdate = new com.k33ptoo.components.KButton();
        txtUDImage = new javax.swing.JTextField();
        txtUDId = new javax.swing.JTextField();
        menuScreen = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        Dshboard = new javax.swing.JPanel();
        btnGotoSearch = new com.k33ptoo.components.KButton();
        Karona = new javax.swing.JLabel();
        btnHome = new com.k33ptoo.components.KButton();
        SignOut = new com.k33ptoo.components.KButton();
        Profile = new javax.swing.JLabel();
        btnMenu = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainScreen.setLayout(new java.awt.CardLayout());

        homeScreen.setBackground(new java.awt.Color(255, 255, 255));
        homeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 100, 100));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Staff");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 60));

        scrollPane.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(scrollPane);

        homeScreen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 550, 150));

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Name          :");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 100, 30));

        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 90, 30));

        jLabel3.setBackground(new java.awt.Color(100, 100, 100));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 299, 100, -1));

        jLabel4.setBackground(new java.awt.Color(100, 100, 100));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Salary         :");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 100, 30));

        txtSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 90, 30));

        txtImage.setEditable(false);
        txtImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 0, 0));

        jLabel5.setBackground(new java.awt.Color(100, 100, 100));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Contact       :");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 100, 30));

        jLabel6.setBackground(new java.awt.Color(100, 100, 100));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Age            :");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 100, 30));

        txtAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 90, 30));

        jLabel7.setBackground(new java.awt.Color(100, 100, 100));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Position      :");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 100, 30));

        txtPosition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 90, 30));

        jLabel8.setBackground(new java.awt.Color(100, 100, 100));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Date     :");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 30));

        btnGroupGender.add(btnFemale);
        btnFemale.setText("F");
        homeScreen.add(btnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        btnGroupGender.add(btnMale);
        btnMale.setText("M");
        homeScreen.add(btnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel9.setBackground(new java.awt.Color(100, 100, 100));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Gender        :");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 100, 30));

        lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(100, 100, 100)));
        homeScreen.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 217, 120, 130));

        btnAddStaff.setBackground(new java.awt.Color(204, 255, 255));
        btnAddStaff.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAddStaff.setText("+Add");
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });
        homeScreen.add(btnAddStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 120, 30));

        btnChooseImage.setBackground(new java.awt.Color(255, 255, 204));
        btnChooseImage.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnChooseImage.setText("Brawe");
        btnChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseImageActionPerformed(evt);
            }
        });
        homeScreen.add(btnChooseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 120, 30));
        homeScreen.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 120, 20));

        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 90, 30));

        mainScreen.add(homeScreen, "card2");

        searchScreen.setBackground(new java.awt.Color(255, 255, 255));
        searchScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        searchScreen.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 360, 70));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search_8094123 (1).png"))); // NOI18N
        searchScreen.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 50, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Gender", "Age", "Position", "Salary", "Conact", "Image", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setPreferredWidth(120);
            table.getColumnModel().getColumn(2).setPreferredWidth(60);
            table.getColumnModel().getColumn(3).setPreferredWidth(40);
            table.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        searchScreen.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 540, 140));

        homeScreen1.setBackground(new java.awt.Color(255, 255, 255));
        homeScreen1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(100, 100, 100));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Name          :");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 100, 30));

        jLabel12.setBackground(new java.awt.Color(100, 100, 100));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 299, 100, -1));

        jLabel13.setBackground(new java.awt.Color(100, 100, 100));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Salary         :");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 100, 30));

        txtUDSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(txtUDSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 90, 30));

        txtImage1.setEditable(false);
        txtImage1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(txtImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 0, 0));

        jLabel14.setBackground(new java.awt.Color(100, 100, 100));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Contact       :");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 100, 30));

        jLabel15.setBackground(new java.awt.Color(100, 100, 100));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Age            :");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 100, 30));

        txtUDAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(txtUDAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 90, 30));

        jLabel16.setBackground(new java.awt.Color(100, 100, 100));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Position      :");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 100, 30));

        txtUDPosition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(txtUDPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 90, 30));

        jLabel17.setBackground(new java.awt.Color(100, 100, 100));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Date     :");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 30));

        btnGroupGender.add(btnUDFemale);
        btnUDFemale.setText("F");
        homeScreen1.add(btnUDFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        btnGroupGender.add(btnUDMale);
        btnUDMale.setText("M");
        homeScreen1.add(btnUDMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel18.setBackground(new java.awt.Color(100, 100, 100));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Gender        :");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 100, 30));

        lbUDImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUDImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(lbUDImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 120, 130));
        homeScreen1.add(txtUDDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 120, 20));

        txtUDContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(txtUDContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 90, 30));

        txtUDName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen1.add(txtUDName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 90, 30));

        searchScreen.add(homeScreen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        btnUDChooseImage.setBackground(new java.awt.Color(0, 204, 204));
        btnUDChooseImage.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnUDChooseImage.setText("Brawe");
        btnUDChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUDChooseImageActionPerformed(evt);
            }
        });
        searchScreen.add(btnUDChooseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 120, 30));

        btnDelete.setText("Delete");
        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDelete.setkBorderRadius(45);
        btnDelete.setkEndColor(new java.awt.Color(255, 204, 255));
        btnDelete.setkHoverEndColor(new java.awt.Color(255, 204, 102));
        btnDelete.setkHoverStartColor(new java.awt.Color(255, 204, 102));
        btnDelete.setkPressedColor(new java.awt.Color(153, 204, 255));
        btnDelete.setkStartColor(new java.awt.Color(153, 204, 255));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        searchScreen.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 100, 40));

        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnUpdate.setkBorderRadius(45);
        btnUpdate.setkEndColor(new java.awt.Color(255, 204, 255));
        btnUpdate.setkHoverEndColor(new java.awt.Color(255, 204, 102));
        btnUpdate.setkHoverStartColor(new java.awt.Color(255, 204, 102));
        btnUpdate.setkPressedColor(new java.awt.Color(153, 204, 255));
        btnUpdate.setkStartColor(new java.awt.Color(153, 204, 255));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        searchScreen.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 90, 40));

        txtUDImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(txtUDImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 0, 0));

        txtUDId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(txtUDId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 10, 0));

        mainScreen.add(searchScreen, "card3");

        menuScreen.setBackground(new java.awt.Color(255, 255, 255));
        menuScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrint.setBackground(new java.awt.Color(255, 153, 204));
        btnPrint.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        menuScreen.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 63, 160, 50));

        mainScreen.add(menuScreen, "card4");

        bg.add(mainScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 550, 470));

        Dshboard.setBackground(new java.awt.Color(255, 255, 255));

        btnGotoSearch.setText("Search");
        btnGotoSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGotoSearch.setkBorderRadius(45);
        btnGotoSearch.setkEndColor(new java.awt.Color(255, 204, 255));
        btnGotoSearch.setkHoverEndColor(new java.awt.Color(255, 204, 102));
        btnGotoSearch.setkHoverStartColor(new java.awt.Color(255, 204, 102));
        btnGotoSearch.setkPressedColor(new java.awt.Color(153, 204, 255));
        btnGotoSearch.setkStartColor(new java.awt.Color(153, 204, 255));
        btnGotoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoSearchActionPerformed(evt);
            }
        });

        Karona.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Karona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Karona.setText("ADMIN");

        btnHome.setText("Home");
        btnHome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnHome.setkBackGroundColor(new java.awt.Color(255, 204, 204));
        btnHome.setkBorderRadius(45);
        btnHome.setkEndColor(new java.awt.Color(255, 204, 255));
        btnHome.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        btnHome.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        btnHome.setkHoverStartColor(new java.awt.Color(255, 204, 102));
        btnHome.setkPressedColor(new java.awt.Color(255, 204, 204));
        btnHome.setkSelectedColor(new java.awt.Color(255, 204, 204));
        btnHome.setkStartColor(new java.awt.Color(153, 204, 255));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        SignOut.setText("Sign Out");
        SignOut.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SignOut.setkBorderRadius(45);
        SignOut.setkEndColor(new java.awt.Color(255, 204, 255));
        SignOut.setkHoverEndColor(new java.awt.Color(255, 204, 102));
        SignOut.setkHoverStartColor(new java.awt.Color(255, 204, 102));
        SignOut.setkPressedColor(new java.awt.Color(153, 204, 255));
        SignOut.setkStartColor(new java.awt.Color(153, 204, 255));
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });

        Profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/business_5785257.png"))); // NOI18N

        btnMenu.setText("Menu");
        btnMenu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnMenu.setkBorderRadius(45);
        btnMenu.setkEndColor(new java.awt.Color(255, 204, 255));
        btnMenu.setkHoverEndColor(new java.awt.Color(255, 204, 102));
        btnMenu.setkHoverStartColor(new java.awt.Color(255, 204, 102));
        btnMenu.setkPressedColor(new java.awt.Color(153, 204, 255));
        btnMenu.setkStartColor(new java.awt.Color(153, 204, 255));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DshboardLayout = new javax.swing.GroupLayout(Dshboard);
        Dshboard.setLayout(DshboardLayout);
        DshboardLayout.setHorizontalGroup(
            DshboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Profile, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addGroup(DshboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DshboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Karona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DshboardLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(DshboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SignOut, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(btnGotoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(DshboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DshboardLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );
        DshboardLayout.setVerticalGroup(
            DshboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DshboardLayout.createSequentialGroup()
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Karona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnGotoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(SignOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(DshboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DshboardLayout.createSequentialGroup()
                    .addGap(195, 195, 195)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(230, Short.MAX_VALUE)))
        );

        bg.add(Dshboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(802, 487));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGotoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoSearchActionPerformed
        gotoScreen(searchScreen);
        getData();
    }//GEN-LAST:event_btnGotoSearchActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        gotoScreen(homeScreen);
        viewStaff();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed

    }//GEN-LAST:event_SignOutActionPerformed

    private void btnChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseImageActionPerformed
        chooseImage(lbImage, txtImage);
    }//GEN-LAST:event_btnChooseImageActionPerformed

    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffActionPerformed
String name = txtName.getText();
        String gender = btnMale.isSelected() ? "Male" : btnFemale.isSelected() ? "Female" : "Other";
        String age1 = txtAge.getText();
        String position = txtPosition.getText();
        String salary1 = txtSalary.getText();
        String contact = txtContact.getText();
        String image = txtImage.getText();
        SimpleDateFormat df = new SimpleDateFormat(txtDate.getDateFormatString());
        String date = df.format(txtDate.getDate());

        if (!name.isEmpty() && !gender.isEmpty() && !age1.isEmpty() && !position.isEmpty() && !salary1.isEmpty() && !contact.isEmpty() && !image.isEmpty() && !date.isEmpty()) {
            int age = Integer.parseInt(age1);
            double salary = Double.parseDouble(salary1);
            controller.addStaffToDB(new StaffModel(0, name, gender, age, position, salary, contact, image, date));
            viewStaff();
            clear();
        } else {
            AlertMessager.warning("Please enter all field");
        }
    }//GEN-LAST:event_btnAddStaffActionPerformed

    private void btnUDChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUDChooseImageActionPerformed
        chooseImage(lbUDImage, txtUDImage);
    }//GEN-LAST:event_btnUDChooseImageActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel model=(DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        txtUDId.setText(model.getValueAt(row, 0).toString());
        txtUDName.setText(model.getValueAt(row, 1).toString());
        if(model.getValueAt(row, 2).toString().equalsIgnoreCase("male")){
            btnUDMale.setSelected(true);
        }else{
            btnUDFemale.setSelected(true);
        }
        txtUDAge.setText(model.getValueAt(row, 3).toString());
        txtUDPosition.setText(model.getValueAt(row, 4).toString());
        txtUDSalary.setText(model.getValueAt(row, 5).toString());
        txtUDContact.setText(model.getValueAt(row, 6).toString());
        txtUDImage.setText(model.getValueAt(row, 7).toString());
        ImageIcon icon = new ImageIcon(txtUDImage.getText());
        Image image = icon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
        lbUDImage.setIcon(new ImageIcon(image));
        
        try {
            Date date;
            SimpleDateFormat df = new  SimpleDateFormat(txtUDDate.getDateFormatString());
            date = df.parse(model.getValueAt(row, 8).toString());
            txtUDDate.setDate(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        name1 =model.getValueAt(row, 1).toString();
        if(model.getValueAt(row, 2).toString().equalsIgnoreCase("male")){
            gender1="male";
        }else{
            gender1="female";
        }
        age2=model.getValueAt(row, 3).toString();
        position1=model.getValueAt(row, 4).toString();
        salary2=model.getValueAt(row, 5).toString();
        contact1=model.getValueAt(row, 6).toString();
        image1=model.getValueAt(row, 7).toString();
        SimpleDateFormat df = new SimpleDateFormat(txtDate.getDateFormatString());
        date1=df.format(txtUDDate.getDate());
        
    }//GEN-LAST:event_tableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id =txtUDId.getText();
        String name = txtUDName.getText();
        String gender = btnUDMale.isSelected() ? "Male" : btnUDFemale.isSelected() ? "Female" : "Other";
        String age1 = txtUDAge.getText();
        String position = txtUDPosition.getText();
        String salary1 = txtUDSalary.getText();
        String contact = txtUDContact.getText();
        String image = txtUDImage.getText();
        
        SimpleDateFormat df = new SimpleDateFormat(txtUDDate.getDateFormatString());
        String date=null;
        if(txtUDDate.getDate()!=null){
            date=df.format(txtUDDate.getDate());
        }else{
            date=df.format(txtUDDate.getDate());
        }
        if(!name.isEmpty() && !gender.isEmpty() && !age1.isEmpty() && !position.isEmpty() && !salary1.isEmpty() && !contact.isEmpty() && !image.isEmpty() && !date.isEmpty()){
            //update data
            int id1=Integer.parseInt(id);
            int age3 = Integer.parseInt(age1);
            double salary3 = Double.parseDouble(salary1);
            controller.updateStaffDB(new StaffModel(id1, name, gender, age3, position, salary3, contact, image, date));
            getData();
            if(!name.equals(name1) || !gender.equals(gender1) || !age1.equals(age1) || !position.equals(position1) || !salary1.equals(salary1) || !contact.equals(contact1) || !image.equals(image1) || !date.equals(date1)){
                
            }else{
                AlertMessager.error("Please update information");
            }
        }else{
            AlertMessager.error("Please select data for update");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id1 = txtUDId.getText();
        if (!id1.isEmpty()) {
            int id = Integer.parseInt(id1);
            controller.deleteStaff(id);
            getData();
        } else {
            AlertMessager.warning("Please select data for delete");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        int totalstaff=controller.getTotalStaff();
        int totalmale=controller.getTotalMale();
        int totalfemale=controller.getTotalFemale();
        double totalsalary=controller.getTotalSalary();
        
        System.out.println(
            "total staff ="+totalstaff
            +"\ntotal male ="+totalmale
            +"\ntotal female ="+totalfemale
            +"\ntotal salary ="+totalsalary);
        
        HashMap<String,Object> data=new HashMap<>();
        data.put("totalstaff", totalstaff);
        data.put("totalmale", totalmale);
        data.put("totalfemale", totalfemale);
        data.put("totalsalary", totalsalary);
        
//        try {
//            JasperReport report = JasperCompileManager.compileReport("src/Home/Views/staff.jrxml");
//            JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(controller.getData());
//            JasperPrint print = JasperFillManager.fillReport(report, data, source);
//            JasperViewer.viewReport(print);
//        } catch (JRException ex) {
//            ex.printStackTrace();
//        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        gotoScreen(menuScreen);
    }//GEN-LAST:event_btnMenuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreenmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dshboard;
    private javax.swing.JLabel Karona;
    private javax.swing.JLabel Profile;
    private com.k33ptoo.components.KButton SignOut;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnChooseImage;
    private com.k33ptoo.components.KButton btnDelete;
    private javax.swing.JRadioButton btnFemale;
    private com.k33ptoo.components.KButton btnGotoSearch;
    private javax.swing.ButtonGroup btnGroupGender;
    private com.k33ptoo.components.KButton btnHome;
    private javax.swing.JRadioButton btnMale;
    private com.k33ptoo.components.KButton btnMenu;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUDChooseImage;
    private javax.swing.JRadioButton btnUDFemale;
    private javax.swing.JRadioButton btnUDMale;
    private com.k33ptoo.components.KButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel homeScreen;
    private javax.swing.JPanel homeScreen1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbUDImage;
    private javax.swing.JPanel mainScreen;
    private javax.swing.JPanel menuScreen;
    private javax.swing.JPanel scrollPane;
    private javax.swing.JPanel searchScreen;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtImage1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUDAge;
    private javax.swing.JTextField txtUDContact;
    private com.toedter.calendar.JDateChooser txtUDDate;
    private javax.swing.JTextField txtUDId;
    private javax.swing.JTextField txtUDImage;
    private javax.swing.JTextField txtUDName;
    private javax.swing.JTextField txtUDPosition;
    private javax.swing.JTextField txtUDSalary;
    // End of variables declaration//GEN-END:variables




}
