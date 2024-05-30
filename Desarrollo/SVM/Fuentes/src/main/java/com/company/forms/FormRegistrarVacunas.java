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
