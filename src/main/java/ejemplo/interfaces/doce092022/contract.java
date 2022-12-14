/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplo.interfaces.doce092022;

/**
 *
 * @author enriq
 */

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.VerticalAlignment;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class contract extends javax.swing.JFrame {

    /**
     * Creates new form contract
     */
    String name; 
    String car;
    String gastype;
    
    public contract(String _name, String _car, String _gastype) throws IOException{  
        initComponents();
        this.setResizable(false);
        this.setTitle("Contrato");
        this.name = _name;
        this.car = _car;
        this.gastype = _gastype;
        nameinpt.setText(_name);
        boughtcarinp.setText(_car);
        
        
                
    }
    
    
    public contract(){
        initComponents();
        this.setResizable(false);
        this.setTitle("Contrato");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comentinpt = new javax.swing.JTextArea();
        boughtcarinp = new javax.swing.JTextField();
        financed = new javax.swing.JComboBox<>();
        idinpt = new java.awt.TextField();
        dateinpt = new javax.swing.JTextField();
        nameinpt = new javax.swing.JTextField();
        surnameinpt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Fecha de nacimiento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel5.setText("Financiado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel6.setText("Coche comprado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel7.setText("Comentarios");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        comentinpt.setColumns(20);
        comentinpt.setRows(5);
        jScrollPane1.setViewportView(comentinpt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 420, -1));

        boughtcarinp.setEditable(false);
        getContentPane().add(boughtcarinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, -1));

        financed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        getContentPane().add(financed, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 60, -1));

        idinpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idinptActionPerformed(evt);
            }
        });
        getContentPane().add(idinpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 190, -1));

        dateinpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateinptActionPerformed(evt);
            }
        });
        getContentPane().add(dateinpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 220, -1));

        nameinpt.setEditable(false);
        getContentPane().add(nameinpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 200, -1));
        getContentPane().add(surnameinpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 240, -1));

        jButton1.setText("Crear Factura");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 160, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idinptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idinptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idinptActionPerformed

    private void dateinptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateinptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateinptActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        //Practicamente toda esta funci??n es el generado del pdf automatico al presionar el boton de crear factura
        PdfWriter pdfwriter = null;
        try {
            int invnum = numgen(25);
            String Path = "invoice #" + invnum + ".pdf";
            
            pdfwriter = new PdfWriter(Path);
            PdfDocument pdfdocument = new PdfDocument(pdfwriter);
            Document document = new Document(pdfdocument);
            pdfdocument.setDefaultPageSize(PageSize.A4);
            float col = 280f;
            float columnWidth[] = {col, col};
            Table table = new Table(columnWidth);
            table.setBackgroundColor(new DeviceRgb(63, 169, 219));
            table.addCell(new Cell()
                    .add(new Paragraph("Contrato")
                            .setTextAlignment(TextAlignment.CENTER)
                            .setVerticalAlignment(VerticalAlignment.MIDDLE)
                            .setMarginTop(30f)
                            .setMarginBottom(30f)
                            .setFontSize(30f)
                            .setBorder(Border.NO_BORDER)
                    )); table.addCell(new Cell().add(new Paragraph("Thedoc LT\n " + "#" + invnum +  " - Contrato\n " + invnum)
                            .setTextAlignment(TextAlignment.RIGHT)
                            .setMarginTop(30f)
                            .setMarginBottom(30f)
                            .setBorder(Border.NO_BORDER)
                            .setMarginRight(10f)
                            
                    )); float colWidth[] = {80, 300, 100, 80};
                    Table Customertable = new Table(colWidth);
                    Customertable.addCell(new Cell(0, 4)
                            .add(new Paragraph("Informaci??n de cliente")
                                    .setBold()
                                    
                            ).setBorder(Border.NO_BORDER)
                    );  Customertable.addCell(new Cell().add(new Paragraph("Nombre")).setBorder(Border.NO_BORDER));
                    Customertable.addCell(new Cell().add(new Paragraph(nameinpt.getText().toString() + " " + surnameinpt.getText().toString())).setBorder(Border.NO_BORDER));
                    Customertable.addCell(new Cell().add(new Paragraph("Contrato No.")).setBorder(Border.NO_BORDER));
                    Customertable.addCell(new Cell().add(new Paragraph(String.valueOf(invnum))).setBorder(Border.NO_BORDER));
                    Customertable.addCell(new Cell().add(new Paragraph("Mo. No.")).setBorder(Border.NO_BORDER));
                    Customertable.addCell(new Cell().add(new Paragraph(String.valueOf(invnum))).setBorder(Border.NO_BORDER));
                    Customertable.addCell(new Cell().add(new Paragraph("Fecha:")).setBorder(Border.NO_BORDER));
                    Date fecha = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Customertable.addCell(new Cell().add(new Paragraph(sdf.format(fecha))).setBorder(Border.NO_BORDER));
                    float iteminfocolwidth[] = {140, 140, 140, 140};
                    Table infotable = new Table(iteminfocolwidth);
                    infotable.addCell(new Cell().add(new Paragraph("Nombre")));
                    infotable.addCell(new Cell().add(new Paragraph(nameinpt.getText().toString() + " " + surnameinpt.getText().toString())));
                    infotable.addCell(new Cell().add(new Paragraph("Fecha de nacimiento")));
                    infotable.addCell(new Cell().add(new Paragraph(dateinpt.getText().toString())));
                    infotable.addCell(new Cell().add(new Paragraph("DNI")));
                    infotable.addCell(new Cell().add(new Paragraph(idinpt.getText().toString())));
                    infotable.addCell(new Cell().add(new Paragraph("Financiado")));
                    infotable.addCell(new Cell().add(new Paragraph(financed.getSelectedItem().toString())));
                    infotable.addCell(new Cell().add(new Paragraph("Coche Comprado")));
                    infotable.addCell(new Cell().add(new Paragraph(car)));
                    infotable.addCell(new Cell().add(new Paragraph("Gasolina")));
                    infotable.addCell(new Cell().add(new Paragraph(gastype)));
                    float cmts[] = {140, 140};
                    Table cmt = new Table(cmts);
                    cmt.addCell(new Cell().add(new Paragraph("Comentarios")));
                    cmt.addCell(new Cell().add(new Paragraph(comentinpt.getText().toString())));
                    document.add(table);
                    document.add(new Paragraph("\n"));
                    document.add(Customertable);
                    document.add(new Paragraph("\n"));
                    document.add(infotable);
                    document.add(new Paragraph("\n"));
                    document.add(cmt);
                    document.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(contract.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pdfwriter.close();
                JOptionPane.showMessageDialog(null, "Has creado correctamente la factura, comprueba la carpeta principal del proyecto para coger la factura");
            } catch (IOException ex) {
                Logger.getLogger(contract.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contract().setVisible(true);
            }
        });
    }
    
    
    //generador de numeros random
    public int numgen(int size){
        int num = (int) (Math.random()*size+1);
        return num;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boughtcarinp;
    private javax.swing.JTextArea comentinpt;
    private javax.swing.JTextField dateinpt;
    private javax.swing.JComboBox<String> financed;
    private java.awt.TextField idinpt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameinpt;
    private javax.swing.JTextField surnameinpt;
    // End of variables declaration//GEN-END:variables
}
