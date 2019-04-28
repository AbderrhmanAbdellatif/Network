package game;

//import connectfourClient.Client;
import connectfourClient.Client;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane; 

/**
 *
 * @author ahmet
 */
public class Game extends javax.swing.JFrame {
    //framedeki komponentlere erişim için statik oyun değişkeni
    public static Game ThisGame;
    //Oyun tahtasının Matrix temsili
    public static int[][] TableMatrix = new int[6][7];
    //karşı tarafın seçimi seçim -1 
    public int RivalSelection = -1;
    public static boolean click=true;
   
    public ImageIcon icon_empty;
    public ImageIcon icon_user;
    public ImageIcon icon_rival;
    
    public Game() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                TableMatrix[i][j] = 0;
            }
        }
        try {
            icon_empty = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("/images/button.jpg"))).getImage().getScaledInstance(60, 58, Image.SCALE_DEFAULT));
            icon_user = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("/images/b_user.jpg"))).getImage().getScaledInstance(60, 58, Image.SCALE_DEFAULT));
            icon_rival = new ImageIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("/images/b_rival.jpg"))).getImage().getScaledInstance(60, 58, Image.SCALE_DEFAULT));
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
        ThisGame = this;
        ThisGame.Table.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Table = new javax.swing.JFrame();
        User_name = new javax.swing.JLabel();
        Columb0 = new javax.swing.JPanel();
        L10 = new javax.swing.JLabel();
        L20 = new javax.swing.JLabel();
        L30 = new javax.swing.JLabel();
        L40 = new javax.swing.JLabel();
        L50 = new javax.swing.JLabel();
        L00 = new javax.swing.JLabel();
        Columb1 = new javax.swing.JPanel();
        L11 = new javax.swing.JLabel();
        L21 = new javax.swing.JLabel();
        L39 = new javax.swing.JLabel();
        L31 = new javax.swing.JLabel();
        L41 = new javax.swing.JLabel();
        L01 = new javax.swing.JLabel();
        L51 = new javax.swing.JLabel();
        Columb2 = new javax.swing.JPanel();
        L02 = new javax.swing.JLabel();
        L12 = new javax.swing.JLabel();
        L22 = new javax.swing.JLabel();
        L32 = new javax.swing.JLabel();
        L52 = new javax.swing.JLabel();
        L42 = new javax.swing.JLabel();
        Columb3 = new javax.swing.JPanel();
        L03 = new javax.swing.JLabel();
        L13 = new javax.swing.JLabel();
        L23 = new javax.swing.JLabel();
        L33 = new javax.swing.JLabel();
        L43 = new javax.swing.JLabel();
        L53 = new javax.swing.JLabel();
        Columb4 = new javax.swing.JPanel();
        L04 = new javax.swing.JLabel();
        L14 = new javax.swing.JLabel();
        L24 = new javax.swing.JLabel();
        L34 = new javax.swing.JLabel();
        L44 = new javax.swing.JLabel();
        L54 = new javax.swing.JLabel();
        Columb5 = new javax.swing.JPanel();
        L05 = new javax.swing.JLabel();
        L15 = new javax.swing.JLabel();
        L25 = new javax.swing.JLabel();
        L35 = new javax.swing.JLabel();
        L45 = new javax.swing.JLabel();
        L55 = new javax.swing.JLabel();
        Columb6 = new javax.swing.JPanel();
        L06 = new javax.swing.JLabel();
        L16 = new javax.swing.JLabel();
        L26 = new javax.swing.JLabel();
        L36 = new javax.swing.JLabel();
        L46 = new javax.swing.JLabel();
        L56 = new javax.swing.JLabel();
        rival_Name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        ButtonConnect = new javax.swing.JButton();

        Table.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Table.setMinimumSize(new java.awt.Dimension(700, 600));

        User_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        User_name.setText("User Name");

        Columb0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Columb0MouseClicked(evt);
            }
        });

        L10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb0Layout = new javax.swing.GroupLayout(Columb0);
        Columb0.setLayout(Columb0Layout);
        Columb0Layout.setHorizontalGroup(
            Columb0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Columb0Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Columb0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L00)
                    .addComponent(L40)
                    .addComponent(L50)
                    .addComponent(L30)
                    .addComponent(L10)
                    .addComponent(L20)))
        );
        Columb0Layout.setVerticalGroup(
            Columb0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Columb0Layout.createSequentialGroup()
                .addComponent(L00)
                .addGap(0, 0, 0)
                .addGroup(Columb0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L10)
                    .addGroup(Columb0Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(L20)
                        .addGap(0, 0, 0)
                        .addComponent(L30)
                        .addGap(0, 0, 0)
                        .addComponent(L40)
                        .addGap(0, 0, 0)
                        .addComponent(L50))))
        );

        Columb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Columb1MouseClicked(evt);
            }
        });

        L11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb1Layout = new javax.swing.GroupLayout(Columb1);
        Columb1.setLayout(Columb1Layout);
        Columb1Layout.setHorizontalGroup(
            Columb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Columb1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Columb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L51)
                    .addComponent(L01)
                    .addComponent(L41)
                    .addComponent(L31)
                    .addComponent(L39)
                    .addComponent(L11)
                    .addComponent(L21)))
        );
        Columb1Layout.setVerticalGroup(
            Columb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb1Layout.createSequentialGroup()
                .addComponent(L01)
                .addGap(0, 0, 0)
                .addGroup(Columb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L11)
                    .addGroup(Columb1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(Columb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L21)
                            .addGroup(Columb1Layout.createSequentialGroup()
                                .addComponent(L39)
                                .addGap(0, 0, 0)
                                .addComponent(L31)
                                .addGap(0, 0, 0)
                                .addComponent(L41)))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(L51)
                .addGap(0, 0, 0))
        );

        Columb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Columb2MouseClicked(evt);
            }
        });

        L02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb2Layout = new javax.swing.GroupLayout(Columb2);
        Columb2.setLayout(Columb2Layout);
        Columb2Layout.setHorizontalGroup(
            Columb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Columb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L02)
                    .addComponent(L12)
                    .addComponent(L22)
                    .addComponent(L32)
                    .addComponent(L52)
                    .addComponent(L42)))
        );
        Columb2Layout.setVerticalGroup(
            Columb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(L02)
                .addGap(0, 0, 0)
                .addComponent(L12)
                .addGap(0, 0, 0)
                .addComponent(L22)
                .addGap(0, 0, 0)
                .addComponent(L32)
                .addGap(0, 0, 0)
                .addComponent(L42)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(L52))
        );

        Columb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Columb3MouseClicked(evt);
            }
        });

        L03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb3Layout = new javax.swing.GroupLayout(Columb3);
        Columb3.setLayout(Columb3Layout);
        Columb3Layout.setHorizontalGroup(
            Columb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Columb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L03)
                    .addComponent(L13)
                    .addComponent(L23)
                    .addComponent(L33)
                    .addComponent(L43)
                    .addComponent(L53))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Columb3Layout.setVerticalGroup(
            Columb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb3Layout.createSequentialGroup()
                .addComponent(L03)
                .addGap(0, 0, 0)
                .addComponent(L13)
                .addGap(0, 0, 0)
                .addComponent(L23)
                .addGap(0, 0, 0)
                .addComponent(L33)
                .addGap(0, 0, 0)
                .addComponent(L43)
                .addGap(0, 0, 0)
                .addComponent(L53)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Columb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Columb4MouseClicked(evt);
            }
        });

        L04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb4Layout = new javax.swing.GroupLayout(Columb4);
        Columb4.setLayout(Columb4Layout);
        Columb4Layout.setHorizontalGroup(
            Columb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Columb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L04)
                    .addComponent(L14)
                    .addComponent(L24)
                    .addComponent(L34)
                    .addComponent(L44)
                    .addComponent(L54))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Columb4Layout.setVerticalGroup(
            Columb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb4Layout.createSequentialGroup()
                .addComponent(L04)
                .addGap(0, 0, 0)
                .addComponent(L14)
                .addGap(0, 0, 0)
                .addComponent(L24)
                .addGap(0, 0, 0)
                .addComponent(L34)
                .addGap(0, 0, 0)
                .addComponent(L44)
                .addGap(0, 0, 0)
                .addComponent(L54)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Columb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Columb5MouseClicked(evt);
            }
        });

        L05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb5Layout = new javax.swing.GroupLayout(Columb5);
        Columb5.setLayout(Columb5Layout);
        Columb5Layout.setHorizontalGroup(
            Columb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Columb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L05)
                    .addComponent(L15)
                    .addComponent(L25)
                    .addComponent(L35)
                    .addComponent(L45)
                    .addComponent(L55))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Columb5Layout.setVerticalGroup(
            Columb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb5Layout.createSequentialGroup()
                .addComponent(L05)
                .addGap(0, 0, 0)
                .addComponent(L15)
                .addGap(0, 0, 0)
                .addComponent(L25)
                .addGap(0, 0, 0)
                .addComponent(L35)
                .addGap(0, 0, 0)
                .addComponent(L45)
                .addGap(0, 0, 0)
                .addComponent(L55)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Columb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Columb6MouseClicked(evt);
            }
        });

        L06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        L56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button.jpg"))); // NOI18N

        javax.swing.GroupLayout Columb6Layout = new javax.swing.GroupLayout(Columb6);
        Columb6.setLayout(Columb6Layout);
        Columb6Layout.setHorizontalGroup(
            Columb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(Columb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L06)
                    .addComponent(L16)
                    .addComponent(L26)
                    .addComponent(L36)
                    .addComponent(L46)
                    .addComponent(L56))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Columb6Layout.setVerticalGroup(
            Columb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Columb6Layout.createSequentialGroup()
                .addComponent(L06)
                .addGap(0, 0, 0)
                .addComponent(L16)
                .addGap(0, 0, 0)
                .addComponent(L26)
                .addGap(0, 0, 0)
                .addComponent(L36)
                .addGap(0, 0, 0)
                .addComponent(L46)
                .addGap(0, 0, 0)
                .addComponent(L56)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        rival_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Kullanıcı Adı :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Rakip Adı :");

        javax.swing.GroupLayout TableLayout = new javax.swing.GroupLayout(Table.getContentPane());
        Table.getContentPane().setLayout(TableLayout);
        TableLayout.setHorizontalGroup(
            TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableLayout.createSequentialGroup()
                .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TableLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Columb0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Columb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Columb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Columb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Columb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TableLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(User_name)
                        .addGap(165, 165, 165)))
                .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TableLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rival_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TableLayout.createSequentialGroup()
                        .addComponent(Columb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Columb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        TableLayout.setVerticalGroup(
            TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Columb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Columb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TableLayout.createSequentialGroup()
                        .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Columb0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Columb1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Columb2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Columb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Columb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(rival_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(User_name)
                                .addComponent(jLabel2)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kullanıcı Adı:");

        ButtonConnect.setText("Bağlan");
        ButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(ButtonConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConnectActionPerformed

        Client.Start("127.0.0.1", 2000);

        ThisGame.Table.setVisible(true);
        ThisGame.Table.repaint();
        User_name.setText(Username.getText());
        ThisGame.setVisible(false);
    }//GEN-LAST:event_ButtonConnectActionPerformed

    private void Columb0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Columb0MouseClicked
        SendMessage(0);
    }//GEN-LAST:event_Columb0MouseClicked

    private void Columb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Columb1MouseClicked
        SendMessage(1);
    }//GEN-LAST:event_Columb1MouseClicked

    private void Columb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Columb2MouseClicked
        SendMessage(2);
    }//GEN-LAST:event_Columb2MouseClicked

    private void Columb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Columb3MouseClicked
        SendMessage(3);
    }//GEN-LAST:event_Columb3MouseClicked

    private void Columb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Columb4MouseClicked
        SendMessage(4);
    }//GEN-LAST:event_Columb4MouseClicked

    private void Columb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Columb5MouseClicked
        SendMessage(5); 
    }//GEN-LAST:event_Columb5MouseClicked

    private void Columb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Columb6MouseClicked
        SendMessage(6);
    }//GEN-LAST:event_Columb6MouseClicked

    public void SendMessage(int y){
        if(click){
        boolean flag = false;
        int[] Myselection = {0, 0};
        Message msg = new Message(Message.Message_Type.Coordination);
        Myselection[1]=y;
        
        for (int i = 0; i < 6; i++) {
            if (TableMatrix[i][y] != 0) {
                TableMatrix[i - 1][y] = Client.UserNumber;
                Myselection[0] = i - 1;
                msg.content = Myselection;
                flag = true;
                break;
            }
        }
        if (flag == false) {
            TableMatrix[5][y] = Client.UserNumber;
            Myselection[0] = 5;
            msg.content = Myselection;
        }
        click=false;
        Client.Send(msg);
        changeImage(Myselection);
        }
        else{
            JOptionPane.showMessageDialog(Game.ThisGame.Table, "Rakibinizin Sırası");
        }
    }
    public static void changeImage(int[] coordination) {
        switch (coordination[0]) {
            case 0:
                switch (coordination[1]) {
                    case 0:
                        Game.ThisGame.L00.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 1:
                        Game.ThisGame.L01.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 2:
                        Game.ThisGame.L02.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 3:
                        Game.ThisGame.L03.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 4:
                        Game.ThisGame.L04.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 5:
                        Game.ThisGame.L05.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 6:
                        Game.ThisGame.L06.setIcon(Game.ThisGame.icon_user);
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                switch (coordination[1]) {
                    case 0:
                        Game.ThisGame.L10.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 1:
                        Game.ThisGame.L11.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 2:
                        Game.ThisGame.L12.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 3:
                        Game.ThisGame.L13.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 4:
                        Game.ThisGame.L14.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 5:
                        Game.ThisGame.L15.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 6:
                        Game.ThisGame.L16.setIcon(Game.ThisGame.icon_user);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (coordination[1]) {
                    case 0:
                        Game.ThisGame.L20.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 1:
                        Game.ThisGame.L21.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 2:
                        Game.ThisGame.L22.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 3:
                        Game.ThisGame.L23.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 4:
                        Game.ThisGame.L24.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 5:
                        Game.ThisGame.L25.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 6:
                        Game.ThisGame.L26.setIcon(Game.ThisGame.icon_user);
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (coordination[1]) {
                    case 0:
                        Game.ThisGame.L30.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 1:
                        Game.ThisGame.L31.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 2:
                        Game.ThisGame.L32.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 3:
                        Game.ThisGame.L33.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 4:
                        Game.ThisGame.L34.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 5:
                        Game.ThisGame.L35.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 6:
                        Game.ThisGame.L36.setIcon(Game.ThisGame.icon_user);
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                switch (coordination[1]) {
                    case 0:
                        Game.ThisGame.L40.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 1:
                        Game.ThisGame.L41.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 2:
                        Game.ThisGame.L42.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 3:
                        Game.ThisGame.L43.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 4:
                        Game.ThisGame.L44.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 5:
                        Game.ThisGame.L45.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 6:
                        Game.ThisGame.L46.setIcon(Game.ThisGame.icon_user);
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                switch (coordination[1]) {
                    case 0:
                        Game.ThisGame.L50.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 1:
                        Game.ThisGame.L51.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 2:
                        Game.ThisGame.L52.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 3:
                        Game.ThisGame.L53.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 4:
                        Game.ThisGame.L54.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 5:
                        Game.ThisGame.L55.setIcon(Game.ThisGame.icon_user);
                        break;
                    case 6:
                        Game.ThisGame.L56.setIcon(Game.ThisGame.icon_user);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConnect;
    private javax.swing.JPanel Columb0;
    private javax.swing.JPanel Columb1;
    private javax.swing.JPanel Columb2;
    private javax.swing.JPanel Columb3;
    private javax.swing.JPanel Columb4;
    private javax.swing.JPanel Columb5;
    private javax.swing.JPanel Columb6;
    public javax.swing.JLabel L00;
    public javax.swing.JLabel L01;
    public javax.swing.JLabel L02;
    public javax.swing.JLabel L03;
    public javax.swing.JLabel L04;
    public javax.swing.JLabel L05;
    public javax.swing.JLabel L06;
    public javax.swing.JLabel L10;
    public javax.swing.JLabel L11;
    public javax.swing.JLabel L12;
    public javax.swing.JLabel L13;
    public javax.swing.JLabel L14;
    public javax.swing.JLabel L15;
    public javax.swing.JLabel L16;
    public javax.swing.JLabel L20;
    public javax.swing.JLabel L21;
    public javax.swing.JLabel L22;
    public javax.swing.JLabel L23;
    public javax.swing.JLabel L24;
    public javax.swing.JLabel L25;
    public javax.swing.JLabel L26;
    public javax.swing.JLabel L30;
    public javax.swing.JLabel L31;
    public javax.swing.JLabel L32;
    public javax.swing.JLabel L33;
    public javax.swing.JLabel L34;
    public javax.swing.JLabel L35;
    public javax.swing.JLabel L36;
    private javax.swing.JLabel L39;
    public javax.swing.JLabel L40;
    public javax.swing.JLabel L41;
    public javax.swing.JLabel L42;
    public javax.swing.JLabel L43;
    public javax.swing.JLabel L44;
    public javax.swing.JLabel L45;
    public javax.swing.JLabel L46;
    public javax.swing.JLabel L50;
    public javax.swing.JLabel L51;
    public javax.swing.JLabel L52;
    public javax.swing.JLabel L53;
    public javax.swing.JLabel L54;
    public javax.swing.JLabel L55;
    public javax.swing.JLabel L56;
    public javax.swing.JFrame Table;
    private javax.swing.JLabel User_name;
    public javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel rival_Name;
    // End of variables declaration//GEN-END:variables
}
