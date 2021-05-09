
package newpackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.table.DefaultTableCellRenderer;


public class Proekt_new extends JFrame{
    
    Proekt_new() throws IOException{
        initFrame();
    }
    public int townNumber;
    public String townName;
    
    public Image imageHandling(String name, int width, int height){
        BufferedImage myPicture1 = null;
                try {
                    myPicture1 = ImageIO.read(new File(".\\Source\\" + name));
                } catch (IOException ex) {
//                    Logger.getLogger(Proekt_new.class.getName()).log(Level.SEVERE, null, ex);
                }
                Image repic1 = myPicture1.getScaledInstance(width, height, 100);
                return repic1;
    
    }
    
    public void switchButtons(JButton butt, String on, String off, int i) {
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
    
    public JButton buttonHandling(JButton butt, Image image){
        butt.setOpaque(false);
        butt.setContentAreaFilled(false);
        butt.setIcon(new ImageIcon(image));
        butt.setPreferredSize(new Dimension(35,35));
        butt.setFocusPainted(false);
        butt.setBorderPainted(false);
        return butt;
    }
    
    public JTextField textHandling(JTextField field, Color color){
        field.setFont(new Font("Dialog", Font.PLAIN, 28));
        field.setOpaque(false);
        field.setBorder(new CompoundBorder( // sets two borders РАМКА
        BorderFactory.createMatteBorder(2, 2, 2, 2, color), // outer border
        BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        field.setForeground(Color.WHITE);
        return field;
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
        panel10.add(table);
        
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        ListSelectionModel selectionModel = table.getSelectionModel();

        selectionModel.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if(0 == table.getSelectedRow()){
                Image repic1 = imageHandling("towns\\Castle.gif", 80, 86);
                lbl.setIcon(new ImageIcon(repic1));
                townNumber = 0;
                    }
                    
                    if(1 == table.getSelectedRow()){
                Image repic1 = imageHandling("towns\\Rampart.gif", 80, 86);
                lbl.setIcon(new ImageIcon(repic1));
                townNumber = 1;
                    }
                    
                    if(2 == table.getSelectedRow()){
                Image repic1 = imageHandling("towns\\Tower.gif", 80, 86);
                lbl.setIcon(new ImageIcon(repic1));
                townNumber = 2;
                    }
                    
                    if(3 == table.getSelectedRow()){
                Image repic1 = imageHandling("towns\\Inferno.gif", 80, 86);
                lbl.setIcon(new ImageIcon(repic1));
                townNumber = 3;
                    }
                    
                    if(4 == table.getSelectedRow()){
                Image repic1 = imageHandling("towns\\Necropolis.gif", 80, 86);
                lbl.setIcon(new ImageIcon(repic1));
                townNumber = 4;
                    }
                    
                    if(5 == table.getSelectedRow()){
                Image repic1 = imageHandling("towns\\Dungeon.gif", 80, 86);
                lbl.setIcon(new ImageIcon(repic1));
                townNumber = 5;
                    }
                    
                    if(6 == table.getSelectedRow()){
                Image repic1 = imageHandling("towns\\Stronghold.gif", 80, 86);
                lbl.setIcon(new ImageIcon(repic1));
                townNumber = 6;
                    }
                    
                    if(7 == table.getSelectedRow()){
                Image repic1 = imageHandling("towns\\Fortress.gif", 80, 86);
                lbl.setIcon(new ImageIcon(repic1));
                townNumber = 7;
                    }
                    
                    if(8 == table.getSelectedRow()){
                Image repic1 = imageHandling("towns\\Conflux.png", 80, 86);
                lbl.setIcon(new ImageIcon(repic1));
                townNumber = 8;
                    }
                    
                    if(9 == table.getSelectedRow()){
                Image repic1 = imageHandling("towns\\Cove.BMP", 80, 86);
                lbl.setIcon(new ImageIcon(repic1));
                townNumber = 9;
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
        panel10.add(table);
        ListSelectionModel selectionModel = table.getSelectionModel();
        if(townNumber ==0){
        table.setValueAt("Adela", 0, 0);
        table.setValueAt("Adelaide", 1, 0);
        table.setValueAt("Beatrice", 2, 0);
        table.setValueAt("Caitlin", 3, 0);
        table.setValueAt("Christian", 4, 0);
        table.setValueAt("Cuthbert", 5, 0);
        table.setValueAt("Edric", 6, 0);
        table.setValueAt("Ingham", 7, 0);
        table.setValueAt("Lord_Haart", 0, 1);
        table.setValueAt("Loynis", 1, 1);
        table.setValueAt("Orrin", 2, 1);
        table.setValueAt("Rion", 3, 1);
        table.setValueAt("Sanya", 4, 1);
        table.setValueAt("Sorsha", 5, 1);
        table.setValueAt("Tyris", 6, 1);
        table.setValueAt("Valeska", 7, 1);
        townName="castle";
        }
        if(townNumber ==1){
        table.setValueAt("Aeris", 0, 0);
        table.setValueAt("Alagar", 1, 0);
        table.setValueAt("Clancy", 2, 0);
        table.setValueAt("Coronius", 3, 0);
        table.setValueAt("Elleshar", 4, 0);
        table.setValueAt("Gem", 5, 0);
        table.setValueAt("Giselle", 6, 0);
        table.setValueAt("Ivor", 7, 0);
        table.setValueAt("Jenova", 0, 1);
        table.setValueAt("Kyrre", 1, 1);
        table.setValueAt("Malcom", 2, 1);
        table.setValueAt("Melodia", 3, 1);
        table.setValueAt("Mephala", 4, 1);
        table.setValueAt("Ryland", 5, 1);
        table.setValueAt("Ufretin", 6, 1);
        table.setValueAt("Uland", 7, 1);
        townName="rampart";
        }
        if(townNumber ==2){
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
        townName="tower";
        }
        if(townNumber ==3){
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
        townName="inferno";
        }
        if(townNumber ==4){
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
        townName="necropolis";
        }
        if(townNumber ==5){
        table.setValueAt("Ajit", 0, 0);
        table.setValueAt("Alamar", 1, 0);
        table.setValueAt("Arlach", 2, 0);
        table.setValueAt("Dace", 3, 0);
        table.setValueAt("Damacon", 4, 0);
        table.setValueAt("Darkstorn", 5, 0);
        table.setValueAt("Deemer", 6, 0);
        table.setValueAt("Geon", 7, 0);
        table.setValueAt("Gunnar", 0, 1);
        table.setValueAt("Jaegar", 1, 1);
        table.setValueAt("Jeddite", 2, 1);
        table.setValueAt("Lorelei", 3, 1);
        table.setValueAt("Malekith", 4, 1);
        table.setValueAt("Sephinroth", 5, 1);
        table.setValueAt("Shakti", 6, 1);
        table.setValueAt("Synca", 7, 1);
        townName="dungeon";
        }
        if(townNumber ==6){
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
        townName="stronghold";
        }
        if(townNumber ==7){
        table.setValueAt("Alkin", 0, 0);
        table.setValueAt("Andra", 1, 0);
        table.setValueAt("Broghild", 2, 0);
        table.setValueAt("Bron", 3, 0);
        table.setValueAt("Drakon", 4, 0);
        table.setValueAt("Gerwulf", 5, 0);
        table.setValueAt("Kinkeria", 6, 0);
        table.setValueAt("Korbac", 7, 0);
        table.setValueAt("Merist", 0, 1);
        table.setValueAt("Mirlanda", 1, 1);
        table.setValueAt("Rosic", 2, 1);
        table.setValueAt("Styg", 3, 1);
        table.setValueAt("Tazar", 4, 1);
        table.setValueAt("Tiva", 5, 1);
        table.setValueAt("Verdish", 6, 1);
        table.setValueAt("Wystan", 7, 1);
        townName="fortress";
        }
        if(townNumber ==8){
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
        townName="conflux";
        }
        if(townNumber ==9){
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
        townName="cove";
        }
        
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() { //назначение иконки героя из списка
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String name=(String) table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
                try{
                    Image repic5 = imageHandling("heroes\\" + townName + "\\Hero_" + name + ".png", 80, 86);
                    lbl.setIcon(new ImageIcon(repic5));
                }
                catch(NullPointerException exc) {}
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
    
    
    //ВЫБОР ГО
    
    class MyMouseListenerGO implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent arg0) {
        }

        @Override
        public void mousePressed(MouseEvent r) {
        JLabel lbl = (JLabel) r.getSource();
        JFrame jf = new JFrame(); 
        jf.setSize(500, 300); 
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
        JPanel panel10 = new JPanel();
        jf.add(panel10);
        JTable table = new JTable(14,6);
        panel10.add(table);
        ListSelectionModel selectionModel = table.getSelectionModel();
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setBackground(row % 7 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
                return c;
            }
        });
        
        table.setValueAt("Castle", 0, 0);
        table.setValueAt("Monk", 1, 0);
        table.setValueAt("Zealot", 2, 0);
        table.setValueAt("Cavalier", 3, 0);
        table.setValueAt("Champion", 4, 0);
        table.setValueAt("Angel", 5, 0);
        table.setValueAt("Archangel", 6, 0);
        table.setValueAt("Rampart", 0, 1);
        table.setValueAt("Dendroid_Guard", 1, 1);
        table.setValueAt("Dendroid_Soldier", 2, 1);
        table.setValueAt("Unicorn", 3, 1);
        table.setValueAt("War_Unicorn", 4, 1);
        table.setValueAt("Green_Dragon", 5, 1);
        table.setValueAt("Gold_Dragon", 6, 1);
        table.setValueAt("Tower", 0, 2);
        table.setValueAt("Genie", 1, 2);
        table.setValueAt("Master_Genie", 2, 2);
        table.setValueAt("Naga", 3, 2);
        table.setValueAt("Naga_Queen", 4, 2);
        table.setValueAt("Giant", 5, 2);
        table.setValueAt("Titan", 6, 2);
        table.setValueAt("Inferno", 0, 3);
        table.setValueAt("Pit_Fiend", 1, 3);
        table.setValueAt("Pit_lord", 2, 3);
        table.setValueAt("Efreet", 3, 3);
        table.setValueAt("Efreet_Sultan", 4, 3);
        table.setValueAt("Devil", 5, 3);
        table.setValueAt("Arch_Devil", 6, 3);
        table.setValueAt("Necropolis", 0, 4);
        table.setValueAt("Lich", 1, 4);
        table.setValueAt("Power_Lich", 2, 4);
        table.setValueAt("Black_Knight", 3, 4);
        table.setValueAt("Dread_Knight", 4, 4);
        table.setValueAt("Bone_Dragon", 5, 4);
        table.setValueAt("Ghost_Dragon", 6, 4);
        table.setValueAt("Dungeon", 7, 0);
        table.setValueAt("Minotaur", 8, 0);
        table.setValueAt("Minotaur_King", 9, 0);
        table.setValueAt("Manticore", 10, 0);
        table.setValueAt("Scorpicore", 11, 0);
        table.setValueAt("Red_Dragon", 12, 0);
        table.setValueAt("Black_Dragon", 13, 0);
        table.setValueAt("Stronghold", 7, 1);
        table.setValueAt("Roc", 8, 1);
        table.setValueAt("Thunderbird", 9, 1);
        table.setValueAt("Cyclops", 10, 1);
        table.setValueAt("Cyclops_King", 11, 1);
        table.setValueAt("Behemoth", 12, 1);
        table.setValueAt("Ancient_Behemoth", 13, 1);
        table.setValueAt("Fortress", 7, 2);
        table.setValueAt("Gorgon", 8, 2);
        table.setValueAt("Mighty_Gorgon", 9, 2);
        table.setValueAt("Wyvern", 10, 2);
        table.setValueAt("Wyvern_Monarch", 11, 2);
        table.setValueAt("Hydra", 12, 2);
        table.setValueAt("Chaos_Hydra", 13, 2);
        table.setValueAt("Conflux", 7, 3);
        table.setValueAt("Earth_Elemental", 8, 3);
        table.setValueAt("Magma_Elemental", 9, 3);
        table.setValueAt("Psychic_Elemental", 10, 3);
        table.setValueAt("Magic_Elemental", 11, 3);
        table.setValueAt("Firebird", 12, 3);
        table.setValueAt("Phoenix", 13, 3);
        table.setValueAt("Cove", 7, 4);
        table.setValueAt("Sea_Witch", 8, 4);
        table.setValueAt("Sorceress", 9, 4);
        table.setValueAt("Nix", 10, 4);
        table.setValueAt("Nix_Warrior", 11, 4);
        table.setValueAt("Sea_Serpent", 12, 4);
        table.setValueAt("Haspid", 13, 4);
        table.setValueAt("Neutral", 0, 5);
        table.setValueAt("Fangarm", 1, 5);
        table.setValueAt("Enchanter", 2, 5);
        table.setValueAt("Faerie_Dragon", 3, 5);
        table.setValueAt("Rust_Dragon", 4, 5);
        table.setValueAt("Crystal_Dragon", 5, 5);
        table.setValueAt("Azure_Dragon", 6, 5);
        
        
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() { //назначение иконки героя из списка
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String name=(String) table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
                try{
                    Image repic5 = imageHandling("units\\" + name + ".jpg", 74, 70);
                    lbl.setIcon(new ImageIcon(repic5));
                }
                catch(NullPointerException exc){}
                }
        });
        }

        @Override
        public void mouseReleased(MouseEvent arg0) {
        }

        @Override
        public void mouseEntered(MouseEvent arg0) {
        }

        @Override
        public void mouseExited(MouseEvent arg0) {
        }
    
    }
    
    //КОНЕЦ ВЫБОРА ГО
    
 
    //КНОПК
    class SimpleAction extends AbstractAction {
        
        int i = 0;
        String active;
        String nonactive;
        
        SimpleAction(String active, String nonactive) {
            this.active = active;
            this.nonactive = nonactive;
        }
            public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String a = ".\\Source\\arts\\" + active + ".png";
            String b = ".\\Source\\arts\\" + nonactive + ".png";
            switchButtons(btn, a, b, i);
            i++;
        }
    }
    //КОНЕЦ КНОПОК
    
    
    public void initFrame() throws IOException{
       setSize(1530,150);
        JPanel panel = new JPanel(){// Переопределение метода, чтобы поставить картинку на фон
            @Override
            public void paintComponent(Graphics page){
            super.paintComponent(page);
            BufferedImage img;
                try {
                    img = ImageIO.read(new File(".\\Source\\test\\fon2.png"));
                    //Image repicPanel = img.getScaledInstance(1380, 130, 100);
                    Image repicPanel = img.getScaledInstance(1540, 130, 100);
                    page.drawImage(repicPanel, 0, 0, null);
                } catch (IOException ex) {
//                    Logger.getLogger(Proekt_new.class.getName()).log(Level.SEVERE, null, ex);
                }
    
            }
        };
        JPanel panel2 = new JPanel(); 
        JPanel panelGO1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); // панель ГО
        JPanel panel4 = new JPanel(); // панель кнопок
        JPanel panel6 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); // текстовая панель
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    setTitle("Heroes HUD");
    panel.setSize(1520, 150);
    //panel.setSize(1360, 150);
    Color c1 = new Color(140,70,20);
    panel.setBackground(c1);
    
    BufferedImage myPicture50 = ImageIO.read(new File(".\\Source\\test\\Random.bmp"));
    Image repic50 = myPicture50.getScaledInstance(74, 70, 70);
    JLabel picLabel50 = new JLabel(new ImageIcon(repic50));
    picLabel50.addMouseListener(new MyMouseListenerGO());
    picLabel50.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    panel.add(picLabel50);
    
    JTextField Field222 = new JTextField(7);
    Field222=textHandling(Field222, Color.RED);
    Field222.setFont(new Font("Dialog", Font.PLAIN, 12));
    Field222.setHorizontalAlignment(JTextField.CENTER);
    
    panelGO1.setPreferredSize(new Dimension(74, 90));
    panelGO1.add(picLabel50);
    panelGO1.add(Field222);
    
    panel4.setPreferredSize(new Dimension(290,90));
    //panel4.setPreferredSize(new Dimension(200,90));
    panelGO1.setOpaque(false);
    panel.add(panelGO1);
    panel.add(panel4);
    panel4.setOpaque(false); //прозрачность
    panel4.setBorder(new CompoundBorder( // sets two borders РАМКА
        BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED), // outer border
        BorderFactory.createEmptyBorder(0, 0, 0, 0)));
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
    BufferedImage myPicture11 = ImageIO.read(new File(".\\Source\\arts\\Alliance1.png"));
    Image repic11 = myPicture11.getScaledInstance(40, 40, 40);
    BufferedImage myPicture12 = ImageIO.read(new File(".\\Source\\arts\\AotD1.png"));
    Image repic12 = myPicture12.getScaledInstance(40, 40, 40);
    BufferedImage myPicture13 = ImageIO.read(new File(".\\Source\\arts\\Shackles1.png"));
    Image repic13 = myPicture13.getScaledInstance(40, 40, 40);
    BufferedImage myPicture14 = ImageIO.read(new File(".\\Source\\arts\\Ogre_Fist1.png"));
    Image repic14 = myPicture14.getScaledInstance(40, 40, 40);
    //КОНЕЦ НАЧАЛЬНЫХ КНОПОК
    //НАЧАЛО КОНЕЧНЫХ КНОПОК
    JButton button1 = new JButton(new SimpleAction("Resurrection", "Resurrection1"));
    button1=buttonHandling(button1, repic1);
    JButton button2 = new JButton(new SimpleAction("DD", "DD1"));
    button2=buttonHandling(button2, repic2);
    JButton button3 = new JButton(new SimpleAction("Armageddon", "Armageddon1"));
    button3=buttonHandling(button3, repic3);
    JButton button4 = new JButton(new SimpleAction("Fly", "Fly1"));
    button4=buttonHandling(button4, repic4);
    JButton button5 = new JButton(new SimpleAction("TP", "TP1"));
    button5=buttonHandling(button5, repic5);
    JButton button6 = new JButton(new SimpleAction("Wings", "Wings1"));
    button6=buttonHandling(button6, repic6);
    JButton button7 = new JButton(new SimpleAction("Hat", "Hat1"));
    button7=buttonHandling(button7, repic7);
    JButton button8 = new JButton(new SimpleAction("Air_book", "Air_book1"));
    button8=buttonHandling(button8, repic8);
    JButton button9 = new JButton(new SimpleAction("Earth_book", "Earth_book1"));
    button9=buttonHandling(button9, repic9);
    JButton button10 = new JButton(new SimpleAction("Fire_book", "Fire_book1"));
    button10=buttonHandling(button10, repic10);
    JButton button11 = new JButton(new SimpleAction("Alliance", "Alliance1"));
    button11=buttonHandling(button11, repic11);
    JButton button12 = new JButton(new SimpleAction("AotD", "AotD1"));
    button12=buttonHandling(button12, repic12);
    JButton button13 = new JButton(new SimpleAction("Shackles", "Shackles1"));
    button13=buttonHandling(button13, repic13);
    JButton button14 = new JButton(new SimpleAction("Ogre_Fist", "Ogre_Fist1"));
    button14=buttonHandling(button14, repic14);
    
    panel4.add(button1);
    panel4.add(button2);
    panel4.add(button3);
    panel4.add(button4);
    panel4.add(button5);
    panel4.add(button11);
    panel4.add(button12);
    panel4.add(button6);
    panel4.add(button7);
    panel4.add(button8);
    panel4.add(button9);
    panel4.add(button10);
    panel4.add(button13);
    panel4.add(button14);
    //КОНЕЦ КОНЕЧНЫХ КНОПОК
    
    //LABEL ГЕРОЯ
    BufferedImage myPicture30 = ImageIO.read(new File(".\\Source\\test\\Random.bmp"));
    Image repic30 = myPicture30.getScaledInstance(80, 86, 70);
    JLabel picLabel3 = new JLabel(new ImageIcon(repic30));
    picLabel3.addMouseListener(new MyMouseListener1());
    picLabel3.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    panel.add(picLabel3);
    //LABEL ГЕРОЯ КОНЕЦ
    
    //LABEL ГОРОДА
    BufferedImage myPicture = ImageIO.read(new File(".\\Source\\test\\Random.bmp"));
    Image repic = myPicture.getScaledInstance(80, 86, 100);
    JLabel picLabel = new JLabel(new ImageIcon(repic));
    picLabel.addMouseListener(new MyMouseListener());
    picLabel.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    panel.add(picLabel);
    //LABEL ГОРОДА КОНЕЦ
 
    //ТЕКСТОВЫЕ ПОЛЯ
    panel6.setOpaque(false);
    panel6.setPreferredSize(new Dimension(390, 90));
    panel.add(panel6);
    JTextField Field1 = new JTextField(7);
    Field1=textHandling(Field1, Color.RED);
    panel6.add(Field1);
    panel6.add(Box.createRigidArea(new Dimension(3, 20)));
    JTextField Field2 = new JTextField(2);
    Field2=textHandling(Field2, Color.BLACK);
    Field2.setHorizontalAlignment(JTextField.CENTER);
    panel6.add(Field2);
    panel6.add(Box.createRigidArea(new Dimension(3, 20)));
    JTextField Field3 = new JTextField(7);
    Field3=textHandling(Field3, Color.BLUE);
    Field3.setHorizontalAlignment(JTextField.RIGHT);
    panel6.add(Field3);
    panel6.add(Box.createRigidArea(new Dimension(400, 6)));
    JTextField Field4 = new JTextField(2);
    Field4=textHandling(Field4, Color.RED);
    Field4.setHorizontalAlignment(JTextField.CENTER);
    panel6.add(Field4);
    panel6.add(Box.createRigidArea(new Dimension(5, 20)));
    JTextField Field5 = new JTextField(3);
    Field5=textHandling(Field5, Color.RED);
    Field5.setHorizontalAlignment(JTextField.CENTER);
    panel6.add(Field5);
    panel6.add(Box.createRigidArea(new Dimension(5, 20)));
    JTextField Field6 = new JTextField(5);
    Field6=textHandling(Field6, Color.BLACK);
    Field6.setHorizontalAlignment(JTextField.CENTER);
    panel6.add(Field6);
    panel6.add(Box.createRigidArea(new Dimension(5, 20)));
    JTextField Field7 = new JTextField(3);
    Field7=textHandling(Field7, Color.BLUE);
    Field7.setHorizontalAlignment(JTextField.CENTER);
    panel6.add(Field7);
    panel6.add(Box.createRigidArea(new Dimension(5, 20)));
    JTextField Field8 = new JTextField(2);
    Field8=textHandling(Field8, Color.BLUE);
    Field8.setHorizontalAlignment(JTextField.CENTER);
    panel6.add(Field8);
    //ТЕКСТОВЫЕ ПОЛЯ КОНЕЦ
    
    //LABEL ГОРОДА
    BufferedImage myPicture0 = ImageIO.read(new File(".\\Source\\test\\Random.bmp"));
    Image repic0 = myPicture0.getScaledInstance(80, 86, 100);
    JLabel picLabel0 = new JLabel(new ImageIcon(repic0));
    picLabel0.addMouseListener(new MyMouseListener());
    picLabel0.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLUE), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    panel.add(picLabel0);
    //LABEL ГОРОДА КОНЕЦ
    //LABEL ГЕРОЯ
    BufferedImage myPicture300 = ImageIO.read(new File(".\\Source\\test\\Random.bmp"));
    Image repic300 = myPicture300.getScaledInstance(80, 86, 70);
    JLabel picLabel30 = new JLabel(new ImageIcon(repic300));
    picLabel30.addMouseListener(new MyMouseListener1());
    picLabel30.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLUE), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    panel.add(picLabel30);
    //LABEL ГЕРОЯ КОНЕЦ
    
    //НАЧАЛО КНОПОК
    JPanel panel9 = new JPanel(); // панель кнопок
    panel9.setPreferredSize(new Dimension(290,90));
    //panel9.setPreferredSize(new Dimension(200,90));
    panel.add(panel9);
    panel9.setOpaque(false);
    panel9.setBorder(new CompoundBorder( // sets two borders РАМКА
        BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLUE), // outer border
        BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    
    JButton button1a = new JButton(new SimpleAction("Resurrection", "Resurrection1"));
    button1a=buttonHandling(button1a, repic1);
    JButton button2a = new JButton(new SimpleAction("DD", "DD1"));
    button2a=buttonHandling(button2a, repic2);
    JButton button3a = new JButton(new SimpleAction("Armageddon", "Armageddon1"));
    button3a=buttonHandling(button3a, repic3);
    JButton button4a = new JButton(new SimpleAction("Fly", "Fly1"));
    button4a=buttonHandling(button4a, repic4);
    JButton button5a = new JButton(new SimpleAction("TP", "TP1"));
    button5a=buttonHandling(button5a, repic5);
    JButton button6a = new JButton(new SimpleAction("Wings", "Wings1"));
    button6a=buttonHandling(button6a, repic6);
    JButton button7a = new JButton(new SimpleAction("Hat", "Hat1"));
    button7a=buttonHandling(button7a, repic7);
    JButton button8a = new JButton(new SimpleAction("Air_book", "Air_book1"));
    button8a=buttonHandling(button8a, repic8);
    JButton button9a = new JButton(new SimpleAction("Earth_book", "Earth_book1"));
    button9a=buttonHandling(button9a, repic9);
    JButton button10a = new JButton(new SimpleAction("Fire_book", "Fire_book1"));
    button10a=buttonHandling(button10a, repic10);
    JButton button11a = new JButton(new SimpleAction("Alliance", "Alliance1"));
    button11a=buttonHandling(button11a, repic11);
    JButton button12a = new JButton(new SimpleAction("AotD", "AotD1"));
    button12a=buttonHandling(button12a, repic12);
    JButton button13a = new JButton(new SimpleAction("Shackles", "Shackles1"));
    button13a=buttonHandling(button13a, repic13);
    JButton button14a = new JButton(new SimpleAction("Ogre_Fist", "Ogre_Fist1"));
    button14a=buttonHandling(button14a, repic14);
    
    panel9.add(button1a);
    panel9.add(button2a);
    panel9.add(button3a);
    panel9.add(button4a);
    panel9.add(button5a);
    panel9.add(button11a);
    panel9.add(button12a);
    panel9.add(button6a);
    panel9.add(button7a);
    panel9.add(button8a);
    panel9.add(button9a);
    panel9.add(button10a);
    panel9.add(button13a);
    panel9.add(button14a);
    //КОНЕЦ КНОПОК
    
    JPanel panelGO2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); // панель ГО
    
    BufferedImage myPicture60 = ImageIO.read(new File(".\\Source\\test\\Random.bmp"));
    Image repic60 = myPicture60.getScaledInstance(74, 70, 70);
    JLabel picLabel60 = new JLabel(new ImageIcon(repic60));
    picLabel60.addMouseListener(new MyMouseListenerGO());
    picLabel60.setBorder(new CompoundBorder( // sets two borders РАМКА
    BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK), // outer border
    BorderFactory.createEmptyBorder(0, 0, 0, 0)));
    panel.add(picLabel60);
    
    JTextField Field333 = new JTextField(7);
    Field333=textHandling(Field333, Color.BLUE);
    Field333.setFont(new Font("Dialog", Font.PLAIN, 12));
    Field333.setHorizontalAlignment(JTextField.CENTER);
    
    panelGO2.setPreferredSize(new Dimension(74, 90));
    panelGO2.add(picLabel60);
    panelGO2.add(Field333);
    
    panelGO2.setOpaque(false);
    panel.add(panelGO2);
    
    getContentPane().add(panel);
    getContentPane().add(panel2);
    
    }
   
    public static void main(String[] args) throws IOException {
        new Proekt_new();
    }
    
}
