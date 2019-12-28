
package newpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Proekt_new extends JFrame{
    
    Proekt_new() throws IOException{
    initFrame();
    }
    public int nomer = 10;
    public int stroka;
    public String town;
    
    public Image obrabotka(String name, int width, int height){
    BufferedImage myPicture1 = null;
                try {
                    myPicture1 = ImageIO.read(new File(".\\Source\\" + name));
                } catch (IOException ex) {
//                    Logger.getLogger(Proekt_new.class.getName()).log(Level.SEVERE, null, ex);
                }
                Image repic1 = myPicture1.getScaledInstance(width, height, 100);
                return repic1;
    
    }
    
    public void knopki(JButton butt, String on, String off, int i) {
        if (i % 2 == 0) {
            BufferedImage myPicture1 = null;
            try {
                myPicture1 = ImageIO.read(new File(on));
            } catch (IOException ex) {
//                Logger.getLogger(Proekt_new.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image repic1 = myPicture1.getScaledInstance(40, 40, 40);
            butt.setIcon(new ImageIcon(repic1));
        } else {
            BufferedImage myPicture1 = null;
            try {
                myPicture1 = ImageIO.read(new File(off));
            } catch (IOException ex) {
//                Logger.getLogger(Proekt_new.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image repic1 = myPicture1.getScaledInstance(40, 40, 40);
            butt.setIcon(new ImageIcon(repic1));
        }
    }
    
    
    class TableMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            }

        @Override
        public void mousePressed(MouseEvent e) {
            JTable tbl2 = (JTable) e.getSource();
            stroka=tbl2.getSelectedColumn();
            }

        @Override
        public void mouseReleased(MouseEvent e) {
            }

        @Override
        public void mouseEntered(MouseEvent e) {
            }

        @Override
        public void mouseExited(MouseEvent e) {
            }
    
    }
    
    
    
    
    class MyMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
        
        }

        @Override
        public void mousePressed(MouseEvent r) {
        JLabel lbl = (JLabel) r.getSource();
        JFrame jf = new JFrame(); 
        jf.setSize(100, 220); 
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
        JPanel panel10 = new JPanel();
        jf.add(panel10);   
        
        
        //ВЫБОР ГОРОДОВ
        JTable table = new JTable(10,1);
        table.setValueAt("Castle", 0, 0);
        table.setValueAt("Rampart", 1, 0);
        table.setValueAt("Tower", 2, 0);
        table.setValueAt("Inferno", 3, 0);
        table.setValueAt("Necropolis", 4, 0);
        table.setValueAt("Dungeon", 5, 0);
        table.setValueAt("Stronghold", 6, 0);
        table.setValueAt("Fortress", 7, 0);
        table.setValueAt("Conflux", 8, 0);
        table.setValueAt("Cove", 9, 0);
        table.addMouseListener(new TableMouseListener());
        panel10.add(table);
        
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        ListSelectionModel selectionModel = table.getSelectionModel();

        selectionModel.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    int tableRow = table.getSelectedRow();
                    if(0 == table.getSelectedRow()){
                Image repic1 = obrabotka("towns\\Castle.gif", 90, 50);
                lbl.setIcon(new ImageIcon(repic1));
                stroka = 0;
                    }
                    
                    if(1 == table.getSelectedRow()){
                Image repic1 = obrabotka("towns\\Rampart.gif", 90, 50);
                lbl.setIcon(new ImageIcon(repic1));
                stroka = 1;
                    }
                    
                    if(2 == table.getSelectedRow()){
                Image repic1 = obrabotka("towns\\Tower.gif", 90, 50);
                lbl.setIcon(new ImageIcon(repic1));
                stroka = 2;
                    }
                    
                    if(3 == table.getSelectedRow()){
                Image repic1 = obrabotka("towns\\Inferno.gif", 90, 50);
                lbl.setIcon(new ImageIcon(repic1));
                stroka = 3;
                    }
                    
                    if(4 == table.getSelectedRow()){
                Image repic1 = obrabotka("towns\\Necropolis.gif", 90, 50);
                lbl.setIcon(new ImageIcon(repic1));
                stroka = 4;
                    }
                    
                    if(5 == table.getSelectedRow()){
                Image repic1 = obrabotka("towns\\Dungeon.gif", 90, 50);
                lbl.setIcon(new ImageIcon(repic1));
                stroka = 5;
                    }
                    
                    if(6 == table.getSelectedRow()){
                Image repic1 = obrabotka("towns\\Stronghold.gif", 90, 50);
                lbl.setIcon(new ImageIcon(repic1));
                stroka = 6;
                    }
                    
                    if(7 == table.getSelectedRow()){
                Image repic1 = obrabotka("towns\\Fortress.gif", 90, 50);
                lbl.setIcon(new ImageIcon(repic1));
                stroka = 7;
                    }
                    
                    if(8 == table.getSelectedRow()){
                Image repic1 = obrabotka("towns\\Conflux.png", 90, 50);
                lbl.setIcon(new ImageIcon(repic1));
                stroka = 8;
                    }
                    
                    if(9 == table.getSelectedRow()){
                Image repic1 = obrabotka("towns\\Cove.BMP", 90, 50);
                lbl.setIcon(new ImageIcon(repic1));
                stroka = 9;
                    }
                    
                    
                }
        
});
        
        }
        
        //КОНЕЦ ВЫБОРА ГОРОДОВ

        @Override
        public void mouseReleased(MouseEvent e) {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }
    
    //ВЫБОР ГЕРОЕВ
    class MyMouseListener1 implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent r) {
        JLabel lbl = (JLabel) r.getSource();
        JFrame jf = new JFrame(); 
        jf.setSize(250, 200); 
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
        JPanel panel10 = new JPanel();
        jf.add(panel10);
        JTable table = new JTable(8,2);
        table.addMouseListener(new TableMouseListener());
        panel10.add(table);
        ListSelectionModel selectionModel = table.getSelectionModel();
        if(stroka ==0){
        table.setValueAt("Adela", 0, 0);
        table.setValueAt("Adelaide", 1, 0);
        table.setValueAt("Caitlin", 2, 0);
        table.setValueAt("Christian", 3, 0);
        table.setValueAt("Cuthbert", 4, 0);
        table.setValueAt("Edric", 5, 0);
        table.setValueAt("Ingham", 6, 0);
        table.setValueAt("Lord_Haart", 7, 0);
        table.setValueAt("Loynis", 0, 1);
        table.setValueAt("Orrin", 1, 1);
        table.setValueAt("Rion", 2, 1);
        table.setValueAt("Sanya", 3, 1);
        table.setValueAt("Sorsha", 4, 1);
        table.setValueAt("Sylvia", 5, 1);
        table.setValueAt("Tyris", 6, 1);
        table.setValueAt("Valeska", 7, 1);
        town="castle";
        }
        if(stroka ==1){
        table.setValueAt("Aeris", 0, 0);
        table.setValueAt("Alagar", 1, 0);
        table.setValueAt("Clancy", 2, 0);
        table.setValueAt("Coronius", 3, 0);
        table.setValueAt("Elleshar", 4, 0);
        table.setValueAt("Gem", 5, 0);
        table.setValueAt("Ivor", 6, 0);
        table.setValueAt("Jenova", 7, 0);
        table.setValueAt("Kyrre", 0, 1);
        table.setValueAt("Malcom", 1, 1);
        table.setValueAt("Melodia", 2, 1);
        table.setValueAt("Mephala", 3, 1);
        table.setValueAt("Ryland", 4, 1);
        table.setValueAt("Thorgrim", 5, 1);
        table.setValueAt("Ufretin", 6, 1);
        table.setValueAt("Uland", 7, 1);
        town="rampart";
        }
        if(stroka ==2){
        table.setValueAt("Aine", 0, 0);
        table.setValueAt("Astral", 1, 0);
        table.setValueAt("Cyra", 2, 0);
        table.setValueAt("Daremyth", 3, 0);
        table.setValueAt("Fafner", 4, 0);
        table.setValueAt("Halon", 5, 0);
        table.setValueAt("Iona", 6, 0);
        table.setValueAt("Josephine", 7, 0);
        table.setValueAt("Neela", 0, 1);
        table.setValueAt("Piquedram", 1, 1);
        table.setValueAt("Rissa", 2, 1);
        table.setValueAt("Serena", 3, 1);
        table.setValueAt("Solmyr", 4, 1);
        table.setValueAt("Thane", 5, 1);
        table.setValueAt("Theodorus", 6, 1);
        table.setValueAt("Torosar", 7, 1);
        town="tower";
        }
        if(stroka ==3){
        table.setValueAt("Ash", 0, 0);
        table.setValueAt("Axsis", 1, 0);
        table.setValueAt("Ayden", 2, 0);
        table.setValueAt("Calh", 3, 0);
        table.setValueAt("Calid", 4, 0);
        table.setValueAt("Fiona", 5, 0);
        table.setValueAt("Ignatius", 6, 0);
        table.setValueAt("Marius", 7, 0);
        table.setValueAt("Nymus", 0, 1);
        table.setValueAt("Octavia", 1, 1);
        table.setValueAt("Olema", 2, 1);
        table.setValueAt("Pyre", 3, 1);
        table.setValueAt("Rashka", 4, 1);
        table.setValueAt("Xarfax", 5, 1);
        table.setValueAt("Xyron", 6, 1);
        table.setValueAt("Zydar", 7, 1);
        town="inferno";
        }
        if(stroka ==4){
        table.setValueAt("Aislinn", 0, 0);
        table.setValueAt("Charna", 1, 0);
        table.setValueAt("Clavius", 2, 0);
        table.setValueAt("Galthran", 3, 0);
        table.setValueAt("Isra", 4, 0);
        table.setValueAt("Moandor", 5, 0);
        table.setValueAt("Nagash", 6, 0);
        table.setValueAt("Nimbus", 7, 0);
        table.setValueAt("Sandro", 0, 1);
        table.setValueAt("Septienna", 1, 1);
        table.setValueAt("Straker", 2, 1);
        table.setValueAt("Tamika", 3, 1);
        table.setValueAt("Thant", 4, 1);
        table.setValueAt("Vidomina", 5, 1);
        table.setValueAt("Vokial", 6, 1);
        table.setValueAt("Xsi", 7, 1);
        town="necropolis";
        }
        if(stroka ==5){
        table.setValueAt("Ajit", 0, 0);
        table.setValueAt("Alamar", 1, 0);
        table.setValueAt("Arlach", 2, 0);
        table.setValueAt("Dace", 3, 0);
        table.setValueAt("Damacon", 4, 0);
        table.setValueAt("Darkstorm", 5, 0);
        table.setValueAt("Deemer", 6, 0);
        table.setValueAt("Geon", 7, 0);
        table.setValueAt("Gunnar", 0, 1);
        table.setValueAt("Jaedar", 1, 1);
        table.setValueAt("Jeddite", 2, 1);
        table.setValueAt("Lorelei", 3, 1);
        table.setValueAt("Malekith", 4, 1);
        table.setValueAt("Sephinroth", 5, 1);
        table.setValueAt("Shakti", 6, 1);
        table.setValueAt("Synca", 7, 1);
        town="dungeon";
        }
        if(stroka ==6){
        table.setValueAt("Crag_Hack", 0, 0);
        table.setValueAt("Dessa", 1, 0);
        table.setValueAt("Gird", 2, 0);
        table.setValueAt("Gretchin", 3, 0);
        table.setValueAt("Gundula", 4, 0);
        table.setValueAt("Gurnisson", 5, 0);
        table.setValueAt("Jabarkas", 6, 0);
        table.setValueAt("Krellion", 7, 0);
        table.setValueAt("Oris", 0, 1);
        table.setValueAt("Saurug", 1, 1);
        table.setValueAt("Shiva", 2, 1);
        table.setValueAt("Terek", 3, 1);
        table.setValueAt("Tyraxor", 4, 1);
        table.setValueAt("Vey", 5, 1);
        table.setValueAt("Yog", 6, 1);
        table.setValueAt("Zubin", 7, 1);
        town="stronghold";
        }
        if(stroka ==7){
        table.setValueAt("Alkin", 0, 0);
        table.setValueAt("Andra", 1, 0);
        table.setValueAt("Broghild", 2, 0);
        table.setValueAt("Bron", 3, 0);
        table.setValueAt("Drakon", 4, 0);
        table.setValueAt("Gerwulf", 5, 0);
        table.setValueAt("Korbac", 6, 0);
        table.setValueAt("Merist", 7, 0);
        table.setValueAt("Mirlanda", 0, 1);
        table.setValueAt("Rosic", 1, 1);
        table.setValueAt("Styg", 2, 1);
        table.setValueAt("Tazar", 3, 1);
        table.setValueAt("Tiva", 4, 1);
        table.setValueAt("Verdish", 5, 1);
        table.setValueAt("Voy", 6, 1);
        table.setValueAt("Wystan", 7, 1);
        town="fortress";
        }
        if(stroka ==8){
        table.setValueAt("Aenain", 0, 0);
        table.setValueAt("Brissa", 1, 0);
        table.setValueAt("Ciele", 2, 0);
        table.setValueAt("Erdamon", 3, 0);
        table.setValueAt("Fiur", 4, 0);
        table.setValueAt("Gelare", 5, 0);
        table.setValueAt("Grindan", 6, 0);
        table.setValueAt("Ignissa", 7, 0);
        table.setValueAt("Inteus", 0, 1);
        table.setValueAt("Kalt", 1, 1);
        table.setValueAt("Labetha", 2, 1);
        table.setValueAt("Lacus", 3, 1);
        table.setValueAt("Luna", 4, 1);
        table.setValueAt("Monere", 5, 1);
        table.setValueAt("Pasis", 6, 1);
        table.setValueAt("Thunar", 7, 1);
        town="conflux";
        }
        if(stroka ==9){
        table.setValueAt("Anabel", 0, 0);
        table.setValueAt("Andal", 1, 0);
        table.setValueAt("Astra", 2, 0);
        table.setValueAt("Casmetra", 3, 0);
        table.setValueAt("Cassiopeia", 4, 0);
        table.setValueAt("Corkes", 5, 0);
        table.setValueAt("Dargem", 6, 0);
        table.setValueAt("Derek", 7, 0);
        table.setValueAt("Eovacius", 0, 1);
        table.setValueAt("Illor", 1, 1);
        table.setValueAt("Jeremy", 2, 1);
        table.setValueAt("Leena", 3, 1);
        table.setValueAt("Manfred", 4, 1);
        table.setValueAt("Miriam", 5, 1);
        table.setValueAt("Spint", 6, 1);
        table.setValueAt("Zilare", 7, 1);
        town="cove";
        }
        
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() { //назначение иконки героя из списка
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String name=(String) table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
                Image repic5 = obrabotka("heroes\\" + town + "\\Hero_" + name + ".png", 80, 90);
                lbl.setIcon(new ImageIcon(repic5));
                }
        });
        
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    
    }
    //КОНЕЦ ВЫБОРА ГЕРОЕВ
    
    
    //КНОПК
    class SimpleAction extends AbstractAction {

        int i = 0;

        SimpleAction() {
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\Resurrection.png";
            String b = ".\\Source\\arts\\Resurrection1.png";
            knopki(btn, a, b, i);
            i++;
        }
    }
    
    class SimpleAction1 extends AbstractAction {
        int i =0;
        SimpleAction1() {
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\DD.png";
            String b = ".\\Source\\arts\\DD1.png";
            knopki(btn, a, b, i);
            i++;  
        }
    }
    
        class SimpleAction2 extends AbstractAction {
        int i =0;
        SimpleAction2() {
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\Armageddon.png";
            String b = ".\\Source\\arts\\Armageddon1.png";
            knopki(btn, a, b, i);
            i++;  
        }
    }
        
        class SimpleAction3 extends AbstractAction {
        int i =0;
        SimpleAction3() {
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\Fly.png";
            String b = ".\\Source\\arts\\Fly1.png";
            knopki(btn, a, b, i);
            i++;  
        }
    }
            
        class SimpleAction4 extends AbstractAction {
        int i =0;
        SimpleAction4() {
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\TP.png";
            String b = ".\\Source\\arts\\TP1.png";
            knopki(btn, a, b, i);
            i++;  
        }
    }
                
        class SimpleAction5 extends AbstractAction {
        int i =0;
        SimpleAction5() {
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\Wings.png";
            String b = ".\\Source\\arts\\Wings1.png";
            knopki(btn, a, b, i);
            i++;  
        }
    }
                    
        class SimpleAction6 extends AbstractAction {
        int i =0;
        SimpleAction6() {
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\Hat.png";
            String b = ".\\Source\\arts\\Hat1.png";
            knopki(btn, a, b, i);
            i++;  
        }
    }
                        
        class SimpleAction7 extends AbstractAction {
        int i =0;
        SimpleAction7() {
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\Air_Book.png";
            String b = ".\\Source\\arts\\Air_Book1.png";
            knopki(btn, a, b, i);
            i++;  
        }
    }
                            
        class SimpleAction8 extends AbstractAction {
        int i =0;
        SimpleAction8() {
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\Earth_Book.png";
            String b = ".\\Source\\arts\\Earth_Book1.png";
            knopki(btn, a, b, i);
            i++;  
        }
    }
                                
        class SimpleAction9 extends AbstractAction {
        int i =0;
        SimpleAction9() {
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\Fire_Book.png";
            String b = ".\\Source\\arts\\Fire_Book1.png";
            knopki(btn, a, b, i);
            i++;  
        }
    }
    
    //КОНЕЦ КНОПОК
    
    
    public void initFrame() throws IOException{
       setSize(1230,150);
       int x = getWidth();
        JButton button = new JButton();
        JPanel panel = new JPanel(){// Переопределение метода, чтобы поставить картинку на фон
            @Override
            public void paintComponent(Graphics page){
            super.paintComponent(page);
            BufferedImage img;
                try {
                    img = ImageIO.read(new File(".\\Source\\test\\fon2.png"));
                    Image repicPanel = img.getScaledInstance(1220, 130, 100);
                    page.drawImage(repicPanel, 0, 0, null);
                } catch (IOException ex) {
//                    Logger.getLogger(Proekt_new.class.getName()).log(Level.SEVERE, null, ex);
                }
    
            }
        };
        JPanel panel2 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    setTitle("Heroes HUD");
    panel.setSize(1230, 150);
    BufferedImage myPicturePanel = ImageIO.read(new File(".\\Source\\test\\Basic_Water_Magic.png"));
    Image repicPanel = myPicturePanel.getScaledInstance(90, 90, 70);
    Color c1 = new Color(140,70,20);
    panel.setBackground(c1);
    panel4.setPreferredSize(new Dimension(220,90));
    panel.add(panel4);
    panel4.setOpaque(false); //прозрачность
    //НАЧАЛЬНЫЕ КНОПК
    BufferedImage myPicture1 = ImageIO.read(new File(".\\Source\\arts\\Resurrection1.png"));
    Image repic1 = myPicture1.getScaledInstance(40, 40, 40);
    BufferedImage myPicture2 = ImageIO.read(new File(".\\Source\\arts\\DD1.png"));
    Image repic2 = myPicture2.getScaledInstance(40, 40, 40);
    BufferedImage myPicture3 = ImageIO.read(new File(".\\Source\\arts\\Armageddon1.png"));
    Image repic3 = myPicture3.getScaledInstance(40, 40, 40);
    BufferedImage myPicture4 = ImageIO.read(new File(".\\Source\\arts\\Fly1.png"));
    Image repic4 = myPicture4.getScaledInstance(40, 40, 40);
    BufferedImage myPicture5 = ImageIO.read(new File(".\\Source\\arts\\TP1.png"));
    Image repic5 = myPicture5.getScaledInstance(40, 40, 40);
    BufferedImage myPicture6 = ImageIO.read(new File(".\\Source\\arts\\Wings1.png"));
    Image repic6 = myPicture6.getScaledInstance(40, 40, 40);
    BufferedImage myPicture7 = ImageIO.read(new File(".\\Source\\arts\\Hat1.png"));
    Image repic7 = myPicture7.getScaledInstance(40, 40, 40);
    BufferedImage myPicture8 = ImageIO.read(new File(".\\Source\\arts\\Air_book1.png"));
    Image repic8 = myPicture8.getScaledInstance(40, 40, 40);
    BufferedImage myPicture9 = ImageIO.read(new File(".\\Source\\arts\\Earth_book1.png"));
    Image repic9 = myPicture9.getScaledInstance(40, 40, 40);
    BufferedImage myPicture10 = ImageIO.read(new File(".\\Source\\arts\\Fire_book1.png"));
    Image repic10 = myPicture10.getScaledInstance(40, 40, 40);
    //КОНЕЦ НАЧАЛЬНЫХ КНОПОК
    //НАЧАЛО КОНЕЧНЫХ КНОПОК
    JButton button1 = new JButton(new SimpleAction());
    button1.setOpaque(false);
    button1.setContentAreaFilled(false);
    button1.setIcon(new ImageIcon(repic1));
    button1.setPreferredSize(new Dimension(35,35));
    button1.setFocusPainted(false);
    button1.setBorderPainted(false);
    JButton button2 = new JButton(new SimpleAction1());
    button2.setOpaque(false);
    button2.setContentAreaFilled(false);
    button2.setIcon(new ImageIcon(repic2));
    button2.setPreferredSize(new Dimension(35,35));
    button2.setFocusPainted(false);
    button2.setBorderPainted(false);
    JButton button3 = new JButton(new SimpleAction2());
    button3.setOpaque(false);
    button3.setContentAreaFilled(false);
    button3.setIcon(new ImageIcon(repic3));
    button3.setPreferredSize(new Dimension(35,35));
    button3.setFocusPainted(false);
    button3.setBorderPainted(false);
    JButton button4 = new JButton(new SimpleAction3());
    button4.setOpaque(false);
    button4.setContentAreaFilled(false);
    button4.setIcon(new ImageIcon(repic4));
    button4.setPreferredSize(new Dimension(35,35));
    button4.setFocusPainted(false);
    button4.setBorderPainted(false);
    JButton button5 = new JButton(new SimpleAction4());
    button5.setOpaque(false);
    button5.setContentAreaFilled(false);
    button5.setIcon(new ImageIcon(repic5));
    button5.setPreferredSize(new Dimension(35,35));
    button5.setFocusPainted(false);
    button5.setBorderPainted(false);
    JButton button6 = new JButton(new SimpleAction5());
    button6.setOpaque(false);
    button6.setContentAreaFilled(false);
    button6.setIcon(new ImageIcon(repic6));
    button6.setPreferredSize(new Dimension(35,35));
    button6.setFocusPainted(false);
    button6.setBorderPainted(false);
    JButton button7 = new JButton(new SimpleAction6());
    button7.setOpaque(false);
    button7.setContentAreaFilled(false);
    button7.setIcon(new ImageIcon(repic7));
    button7.setPreferredSize(new Dimension(35,35));
    button7.setFocusPainted(false);
    button7.setBorderPainted(false);
    JButton button8 = new JButton(new SimpleAction7());
    button8.setOpaque(false);
    button8.setContentAreaFilled(false);
    button8.setIcon(new ImageIcon(repic8));
    button8.setPreferredSize(new Dimension(35,35));
    button8.setFocusPainted(false);
    button8.setBorderPainted(false);
    JButton button9 = new JButton(new SimpleAction8());
    button9.setOpaque(false);
    button9.setContentAreaFilled(false);
    button9.setIcon(new ImageIcon(repic9));
    button9.setPreferredSize(new Dimension(35,35));
    button9.setFocusPainted(false);
    button9.setBorderPainted(false);
    JButton button10 = new JButton(new SimpleAction9());
    button10.setOpaque(false);
    button10.setContentAreaFilled(false);
    button10.setIcon(new ImageIcon(repic10));
    button10.setPreferredSize(new Dimension(35,35));
    button10.setFocusPainted(false);
    button10.setBorderPainted(false);
    
    panel4.add(button1);
    panel4.add(button2);
    panel4.add(button3);
    panel4.add(button4);
    panel4.add(button5);
    panel4.add(button6);
    panel4.add(button7);
    panel4.add(button8);
    panel4.add(button9);
    panel4.add(button10);
    //КОНЕЦ КОНЕЧНЫХ КНОПОК
    
    //LABEL ГЕРОЯ
    BufferedImage myPicture30 = ImageIO.read(new File(".\\Source\\test\\Random.bmp"));
    Image repic30 = myPicture30.getScaledInstance(80, 90, 70);
    JLabel picLabel3 = new JLabel(new ImageIcon(repic30));
    picLabel3.addMouseListener(new MyMouseListener1());
    picLabel3.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    panel.add(picLabel3);
    //LABEL ГЕРОЯ КОНЕЦ
    
    //LABEL ГОРОДА
    BufferedImage myPicture = ImageIO.read(new File(".\\Source\\test\\Random.bmp"));
    Image repic = myPicture.getScaledInstance(90, 50, 100);
    JLabel picLabel = new JLabel(new ImageIcon(repic));
    picLabel.addMouseListener(new MyMouseListener());
    picLabel.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    panel.add(picLabel);
    //LABEL ГОРОДА КОНЕЦ
 
    //ТЕКСТОВЫЕ ПОЛЯ
    panel6.setOpaque(false);
    panel6.setPreferredSize(new Dimension(350,90));
    panel.add(panel6);
    JTextField Field1 = new JTextField(7);
    Field1.setFont(new Font("Dialog", Font.PLAIN, 24));
    Field1.setOpaque(false);
    Field1.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, c1), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    Field1.setForeground(Color.WHITE);
    panel6.add(Field1);
    JTextField Field2 = new JTextField(2);
    Field2.setFont(new Font("Dialog", Font.PLAIN, 24));
    Field2.setOpaque(false);
    Field2.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, c1), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    Field2.setForeground(Color.WHITE);
    Field2.setHorizontalAlignment(JTextField.CENTER);
    panel6.add(Field2);
    JTextField Field3 = new JTextField(7);
    Field3.setFont(new Font("Dialog", Font.PLAIN, 24));
    Field3.setOpaque(false);
    Field3.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, c1), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    Field3.setForeground(Color.WHITE);
    Field3.setHorizontalAlignment(JTextField.RIGHT);
    panel6.add(Field3);
    JTextField Field4 = new JTextField(4);
    Field4.setFont(new Font("Dialog", Font.PLAIN, 24));
    Field4.setOpaque(false);
    Field4.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, c1), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    Field4.setForeground(Color.WHITE);
    panel6.add(Field4);
    JTextField Field5 = new JTextField(8);
    Field5.setFont(new Font("Dialog", Font.PLAIN, 24));
    Field5.setOpaque(false);
    Field5.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, c1), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    Field5.setForeground(Color.WHITE);
    Field5.setHorizontalAlignment(JTextField.CENTER);
    panel6.add(Field5);
    JTextField Field6 = new JTextField(4);
    Field6.setFont(new Font("Dialog", Font.PLAIN, 24));
    Field6.setOpaque(false);
    Field6.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, c1), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    Field6.setForeground(Color.WHITE);
    Field6.setHorizontalAlignment(JTextField.RIGHT);
    panel6.add(Field6);
    //ТЕКСТОВЫЕ ПОЛЯ КОНЕЦ
    
    //LABEL ГОРОДА
    BufferedImage myPicture0 = ImageIO.read(new File(".\\Source\\test\\Random.bmp"));
    Image repic0 = myPicture0.getScaledInstance(90, 50, 100);
    JLabel picLabel0 = new JLabel(new ImageIcon(repic0));
    picLabel0.addMouseListener(new MyMouseListener());
    picLabel0.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLUE), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    panel.add(picLabel0);
    //LABEL ГОРОДА КОНЕЦ
    //LABEL ГЕРОЯ
    BufferedImage myPicture300 = ImageIO.read(new File(".\\Source\\test\\Random.bmp"));
    Image repic300 = myPicture300.getScaledInstance(80, 90, 70);
    JLabel picLabel30 = new JLabel(new ImageIcon(repic300));
    picLabel30.addMouseListener(new MyMouseListener1());
    picLabel30.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLUE), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    panel.add(picLabel30);
    //LABEL ГЕРОЯ КОНЕЦ
    
    //НАЧАЛО КНОПОК
    JPanel panel9 = new JPanel();
    panel9.setPreferredSize(new Dimension(220,90));
    panel.add(panel9);
    panel9.setOpaque(false);
    
    JButton button1a = new JButton(new SimpleAction());
    button1a.setOpaque(false);
    button1a.setContentAreaFilled(false);
    button1a.setIcon(new ImageIcon(repic1));
    button1a.setPreferredSize(new Dimension(35,35));
    button1a.setFocusPainted(false);
    button1a.setBorderPainted(false);
    JButton button2a = new JButton(new SimpleAction1());
    button2a.setOpaque(false);
    button2a.setContentAreaFilled(false);
    button2a.setIcon(new ImageIcon(repic2));
    button2a.setPreferredSize(new Dimension(35,35));
    button2a.setFocusPainted(false);
    button2a.setBorderPainted(false);
    JButton button3a = new JButton(new SimpleAction2());
    button3a.setOpaque(false);
    button3a.setContentAreaFilled(false);
    button3a.setIcon(new ImageIcon(repic3));
    button3a.setPreferredSize(new Dimension(35,35));
    button3a.setFocusPainted(false);
    button3a.setBorderPainted(false);
    JButton button4a = new JButton(new SimpleAction3());
    button4a.setOpaque(false);
    button4a.setContentAreaFilled(false);
    button4a.setIcon(new ImageIcon(repic4));
    button4a.setPreferredSize(new Dimension(35,35));
    button4a.setFocusPainted(false);
    button4a.setBorderPainted(false);
    JButton button5a = new JButton(new SimpleAction4());
    button5a.setOpaque(false);
    button5a.setContentAreaFilled(false);
    button5a.setIcon(new ImageIcon(repic5));
    button5a.setPreferredSize(new Dimension(35,35));
    button5a.setFocusPainted(false);
    button5a.setBorderPainted(false);
    JButton button6a = new JButton(new SimpleAction5());
    button6a.setOpaque(false);
    button6a.setContentAreaFilled(false);
    button6a.setIcon(new ImageIcon(repic6));
    button6a.setPreferredSize(new Dimension(35,35));
    button6a.setFocusPainted(false);
    button6a.setBorderPainted(false);
    JButton button7a = new JButton(new SimpleAction6());
    button7a.setOpaque(false);
    button7a.setContentAreaFilled(false);
    button7a.setIcon(new ImageIcon(repic7));
    button7a.setPreferredSize(new Dimension(35,35));
    button7a.setFocusPainted(false);
    button7a.setBorderPainted(false);
    JButton button8a = new JButton(new SimpleAction7());
    button8a.setOpaque(false);
    button8a.setContentAreaFilled(false);
    button8a.setIcon(new ImageIcon(repic8));
    button8a.setPreferredSize(new Dimension(35,35));
    button8a.setFocusPainted(false);
    button8a.setBorderPainted(false);
    JButton button9a = new JButton(new SimpleAction8());
    button9a.setOpaque(false);
    button9a.setContentAreaFilled(false);
    button9a.setIcon(new ImageIcon(repic9));
    button9a.setPreferredSize(new Dimension(35,35));
    button9a.setFocusPainted(false);
    button9a.setBorderPainted(false);
    JButton button10a = new JButton(new SimpleAction9());
    button10a.setOpaque(false);
    button10a.setContentAreaFilled(false);
    button10a.setIcon(new ImageIcon(repic10));
    button10a.setPreferredSize(new Dimension(35,35));
    button10a.setFocusPainted(false);
    button10a.setBorderPainted(false);
    
    panel9.add(button1a);
    panel9.add(button2a);
    panel9.add(button3a);
    panel9.add(button4a);
    panel9.add(button5a);
    panel9.add(button6a);
    panel9.add(button7a);
    panel9.add(button8a);
    panel9.add(button9a);
    panel9.add(button10a);
    //КОНЕЦ КНОПОК
    
    getContentPane().add(panel);
    getContentPane().add(panel2);
    
    }
   
    public static void main(String[] args) throws IOException {
        new Proekt_new();
    }
    
}
