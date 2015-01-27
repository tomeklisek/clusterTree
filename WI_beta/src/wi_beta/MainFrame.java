/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wi_beta;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tomeklisek
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public File inputFile;
    public File outputFile;
    
    public String[] categories;
    
    List<Element> elementsList;
    
    //0 - {1}
    //1 - {2}
    //2 - {3}
    //3 - {1, 2}
    //4 - {1, 3}
    //5 - {2, 3}
    //6 - {1, 2, 3}
    Map<Integer, List<Element>> elementsMap;
    
    public MainFrame() {
        initComponents();
        
        categories = new String[3];
        categories[0] = "";
        categories[1] = "";
        categories[2] = "";
        
        inputFile = null;
        elementsList = new ArrayList<>();
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 480));

        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Kategoria1:");

        jLabel2.setText("Kategoria2:");

        jLabel3.setText("Kategoria3:");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jButton1.setText("Dodaj obiekt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Usuń obiekt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );

        jMenu1.setText("Plik");

        jMenuItem1.setText("Pobierz dane");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Zapisz zbiory");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Zamknij");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Informacje");

        jMenuItem4.setText("Instrukcja");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("O programie");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem5MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 //dodawanie obiektu
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //this.setVisible(false);
        new AddElementFrame(this); 
    }//GEN-LAST:event_jButton1ActionPerformed

    public void addElement(Element newElem)
    {
        elementsList.add(newElem);
    }
    
    public String[] getCategories()
    {
        return this.categories;
    }
    //o programie
    private void jMenuItem5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MousePressed
        JOptionPane.showMessageDialog(null, "Autor: Tomasz Lisowski\nNumer indeksu: 131563", "Autor", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem5MousePressed

    //zamknij
    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3MousePressed

//pobierz dane    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fc = new JFileChooser("F:/dev/git/clusterTree/WI_beta/dane");   
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int value = fc.showOpenDialog(null);
        
        elementsList = new ArrayList<>();
        
        if (value == JFileChooser.APPROVE_OPTION) 
        {
            inputFile = fc.getSelectedFile();
            
            if (inputFile != null)
            {
                try {
                    elementsList = readXML();
                    
                    jLabel7.setText(categories[0]);
                    jLabel8.setText(categories[1]);
                    jLabel9.setText(categories[2]);
                    
                    jLabel4.setText("ile: "+elementsList.size());
                    
                    groupSet();
                    
                    
                     } catch (FileNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

//usuwanie elementu    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //for (Element el : elementsList)
        {
        System.out.println("mapa");
        Integer[] rozmiar = new Integer[7];
                    for (int i = 0; i < 7; i++)
                    {
                        rozmiar[i] = 0;
                        //TODO - inicjalizacja mapy
                        if (elementsMap != null)
                        if (elementsMap.get(i) != null)
                        {
                            System.out.println(i +" - "+elementsMap.get(i).size());
                            rozmiar[i] = elementsMap.get(i).size();
                        }
                        else
                        {
                            System.out.println(i +" - 0");
                            rozmiar[i] = 0;
                        }
                    }
                    
                    jScrollPane1.removeAll();
                    //jScrollPane1.repaint();
                    
                    //TODO - remove okregow
            System.out.println("szerokosc: "+jScrollPane1.getWidth());
            System.out.println("wysokosc: "+jScrollPane1.getHeight());
            System.out.println("x: "+jScrollPane1.getX());
            System.out.println("y: "+jScrollPane1.getY());
            Graphics g = jScrollPane1.getGraphics();
            g.setColor(Color.red);
            g.drawOval(jScrollPane1.getWidth()/2, 50, rozmiar[0]*20, rozmiar[0]*20);
            g.dispose();
            jScrollPane1.print(g);
            
            g = jScrollPane1.getGraphics();
            g.setColor(Color.GREEN);
            g.drawOval(jScrollPane1.getWidth()/2, 150, rozmiar[1]*20, rozmiar[1]*20);
            g.dispose();
            jScrollPane1.print(g);
            
            g = jScrollPane1.getGraphics();
            g.setColor(Color.BLUE);
            g.drawOval(jScrollPane1.getWidth()/2, 250, rozmiar[2]*20, rozmiar[2]*20);
            g.dispose();
            jScrollPane1.print(g);
            
//            System.out.println("====================");
//            System.out.println("name: "+el.getName());
//            System.out.println("c1: "+el.isCategory1());
//            System.out.println("c2: "+el.isCategory2());
//            System.out.println("c3: "+el.isCategory3());
//            System.out.println("p1: "+el.getParam1());
//            System.out.println("p2: "+el.getParam2());
//            System.out.println("p3: "+el.getParam3());
//            
            
        }
        jLabel4.setText("ile: "+elementsList.size());
    }//GEN-LAST:event_jButton2ActionPerformed

//zapis zbioru    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser fc = new JFileChooser("F:/java/projects/WI_beta/dane");   
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int value = fc.showOpenDialog(null);
   
        if (value == JFileChooser.APPROVE_OPTION) 
        {
            outputFile = fc.getSelectedFile();
            
            if (outputFile != null)
            {
                createXML();
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    public void groupSet()
    {
        elementsMap = new HashMap<>();
        elementsMap.put(0, new ArrayList<Element>());
        elementsMap.put(1, new ArrayList<Element>());
        elementsMap.put(2, new ArrayList<Element>());
        elementsMap.put(3, new ArrayList<Element>());
        elementsMap.put(4, new ArrayList<Element>());
        elementsMap.put(5, new ArrayList<Element>());
        elementsMap.put(6, new ArrayList<Element>());
        
        for (Element el : elementsList)
        {
            if (el.isCategory1())
            {
                if (el.isCategory2())
                {
                    if (el.isCategory3())
                        elementsMap.get(6).add(el);
                    else
                        elementsMap.get(3).add(el);
                }
                else if (el.isCategory3())
                    elementsMap.get(4).add(el);
                else
                    elementsMap.get(0).add(el);
            }
            else if (el.isCategory2())
            {
                if (el.isCategory3())
                    elementsMap.get(5).add(el);
                else
                    elementsMap.get(1).add(el);
            }
            else if (el.isCategory3())
                elementsMap.get(2).add(el);      
        }
    }
    
    private void createXML()
    {
        String result = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
        
        result += "<categories>\n";
        result += "\t<category1>"+categories[0]+"</category1>\n";
        result += "\t<category2>"+categories[1]+"</category2>\n";
        result += "\t<category3>"+categories[2]+"</category3>\n";
        result += "</categories>\n";
        result += "<list>\n";
        
        String isCategory = "0";
        for (Element e : elementsList)
        {
            result += "\t<element>\n";
            result += "\t\t<name>"+e.getName()+"</name>\n";
            
            isCategory = "0";
            if (e.isCategory1())
                isCategory = "1";
            result += "\t\t<cat1>"+isCategory+"</cat1>\n";
            isCategory = "0";
            if (e.isCategory2())
                isCategory = "1";
            result += "\t\t<cat2>"+isCategory+"</cat2>\n";
            isCategory = "0";
            if (e.isCategory3())
                isCategory = "1";
            result += "\t\t<cat3>"+isCategory+"</cat3>\n";
            
            result += "\t\t<param1>"+e.getParam1()+"</param1>\n";
            result += "\t\t<param2>"+e.getParam2()+"</param2>\n";
            result += "\t\t<param3>"+e.getParam3()+"</param3>\n";
            
            result += "\t</element>\n";
        }
        result += "</list>";
        
        try (FileOutputStream fos = new FileOutputStream(outputFile); BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            bos.write(result.getBytes());
            bos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // odczyt zawartości pliku
    private List<Element> readXML() throws FileNotFoundException, IOException{
        int nline = 0;
        
        List<Element> list = new ArrayList<>();
        
        FileInputStream fstream = new FileInputStream(inputFile);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        
        while ((strLine = br.readLine()) != null) {
                        
                    strLine = strLine.trim();
                    
                    if (nline == 0) {
                        nline++;
                        continue;
                    }
                    if (nline == 1) {
                        if (!"<categories>".equals(strLine)) {
                           // Log.writeLine("Błąd: Nieprawidłowy nagłówek pliku!");
                            break;
                        }
                    } else 
                    {
                        for (int i = 1; i <= 3; i++)
                        {
                            strLine = strLine.replaceAll("<category"+i+">", "");
                            strLine = strLine.replaceAll("</category"+i+">", "");
                            categories[i-1] = strLine;
                             
                            strLine = br.readLine();
                            strLine = strLine.trim();
                            nline++;
                        }
                        
//                        System.out.println("mam kategorie.. aktualna linia:");
//                        System.out.println(strLine);
//                        if (!"</categories>".equals(strLine))
//                        {
//                            strLine = br.readLine();
//                            strLine = strLine.trim();
//                            nline++;
//                        }
                        
                        strLine = br.readLine();
                        strLine = strLine.trim();
                        nline++;
                        
                        Element el = new Element();
                        
                        if ("<list>".equals(strLine))
                        while ((strLine = br.readLine()) != null) 
                        {
                            strLine = strLine.trim();
                             if ("</list>".equals(strLine))
                                 break;
                             
                             if ("<element>".equals(strLine))
                             {
                                 el = new Element();
                                 continue;
                             }
                             
                             //name
                              if (strLine.indexOf("<name>") != -1 && strLine.indexOf("</name>") != -1) 
                              {
                                strLine = strLine.replaceAll("<name>", "");
                                strLine = strLine.replaceAll("</name>", "");
                                
                                el.setName(strLine);
                                continue;
                              }
                             
                             //categories
                            for (int i = 1; i <= 3; i++)
                            {
                                strLine = strLine.replaceAll("<cat"+i+">", "");
                                strLine = strLine.replaceAll("</cat"+i+">", "");
                                boolean category;
                                if (strLine.equals("0"))
                                    category = false;
                                else
                                    category = true;
                                
                                if (i == 1)
                                    el.setCategory1(category);
                                else if (i == 2)
                                    el.setCategory2(category);
                                else
                                    el.setCategory3(category);
                                
                                strLine = br.readLine();
                                strLine = strLine.trim();
                                nline++;
                            }
                              
                             //parameters
                            for (int i = 1; i <= 3; i++)
                            {
                                strLine = strLine.replaceAll("<param"+i+">", "");
                                strLine = strLine.replaceAll("</param"+i+">", "");
                                
                                if (i == 1)
                                    el.setParam1(strLine);
                                else if (i == 2)
                                    el.setParam2(strLine);
                                else
                                    el.setParam3(strLine);
                                
                                strLine = br.readLine();
                                strLine = strLine.trim();
                                 nline++;
                            }
                             if ("</element>".equals(strLine))
                             {
                                 list.add(el);
                                 continue;
                             }
                             nline++;
                        }
                        else
                        {
                            System.out.println("error, maja byc listy a mam:");
                            System.out.println(strLine);
                           // break;
                            return null;
                        }
                    }
                
                nline++;
            }
        
            br.close();
            in.close();
            fstream.close();
            
            return list;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
