import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.UIManager;
public class FormRegistrarVacunas extends javax.swing.JFrame {
int xMouse;int yMouse;
    /**
     * Creates new form FormVacunarPaciente
     */
    public FormRegistrarVacunas() {
        initComponents();
        this.setLocationRelativeTo(null);
        iniStyle();
        iniContent();

    }

    
  private void iniStyle(){
        lblMensaje.putClientProperty( "FlatLaf.styleClass", "font: 14$light.font" );
        lblMensaje.setForeground(Color.black);
        lblNav.putClientProperty( "FlatLaf.style", "font: bold $h3.regular.font" );
//                putClientProperty( "FlatLaf.styleClass", "font: bold $h3.regular.font" );
        lblNav.setForeground(Color.white);
        lblFecha.putClientProperty( "FlatLaf.style", "font: $h1.font" );
        lblFecha.setForeground(Color.white);
        lblSaluVax.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font" );
        lblSaluVax.setForeground(Color.white);
        setDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblSaluVax = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnInventarioVacunas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVacunasDisponibles = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblNav = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1302, 620));
        setUndecorated(true);
        setResizable(false);

        backGround.setBackground(new java.awt.Color(255, 255, 255));
        backGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(13, 71, 161));
        pnlMenu.setPreferredSize(new java.awt.Dimension(270, 640));

        lblSaluVax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaluVax.setText("SaluVax");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setToolTipText("");
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));

        btnInventarioVacunas.setBackground(new java.awt.Color(21, 101, 192));
        btnInventarioVacunas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInventarioVacunas.setForeground(new java.awt.Color(255, 255, 255));
        btnInventarioVacunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoVacunaInventario.png"))); // NOI18N
        btnInventarioVacunas.setText("Vacunas registradas");
        btnInventarioVacunas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnInventarioVacunas.setBorderPainted(false);
        btnInventarioVacunas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventarioVacunas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventarioVacunas.setIconTextGap(10);
        btnInventarioVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioVacunasActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(21, 101, 192));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoSalir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(15);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVacunasDisponibles.setBackground(new java.awt.Color(21, 101, 192));
        btnVacunasDisponibles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVacunasDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        btnVacunasDisponibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoNuevoRegistro.png"))); // NOI18N
        btnVacunasDisponibles.setText("Nuevo registro");
        btnVacunasDisponibles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 7, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVacunasDisponibles.setBorderPainted(false);
        btnVacunasDisponibles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVacunasDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVacunasDisponibles.setIconTextGap(10);
        btnVacunasDisponibles.setMargin(new java.awt.Insets(2, 10, 3, 14));
        btnVacunasDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacunasDisponiblesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInventarioVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnVacunasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaluVax, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSaluVax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInventarioVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnVacunasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        backGround.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 620));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        backGround.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 216, -1, -1));

        pnlHeader.setBackground(new java.awt.Color(25, 118, 210));
        pnlHeader.setPreferredSize(new java.awt.Dimension(744, 150));

        lblNav.setText("Administracion/Control/Inventario");

        lblFecha.setText("Hoy es {dia} de {mes} del {año}");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNav)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblNav)
                .addGap(35, 35, 35)
                .addComponent(lblFecha)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        backGround.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 60, 1073, -1));

        lblMensaje.setText("Saludos aqui podra buscar manipular los datos de las vacunas disponibles e ingresar nuevas.");
        backGround.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 20, 758, 28));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        backGround.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnVacunasDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {                                                      
       
        showJPanel(new RegistrarNuevaVacuna());
    }                                                     

    private void btnInventarioVacunasActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
        showJPanel(new VacunasDIsponiblesInventaro());
    }                                                    

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        this.dispose();
        FormLogin logeo=new FormLogin();
        logeo.setVisible(true);
    }                                        

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {                                     
      
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }                                    

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {                                     
        
        xMouse=evt.getX();
        yMouse=evt.getY();
    }  

    
 public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistrarVacunas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel backGround;
    private javax.swing.JButton btnInventarioVacunas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVacunasDisponibles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNav;
    private javax.swing.JLabel lblSaluVax;
    public static javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration                   
}
