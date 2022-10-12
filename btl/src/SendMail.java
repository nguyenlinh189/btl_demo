
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class SendMail extends javax.swing.JFrame {

    /**
     * Creates new form SendMail
     */
    private static User user;
    String listFile = "";// danh sach cac file chen trong file
    Map<String, String> inlineImages = new HashMap<>();// danh sach cac anh chen truc tiep trong noi dung
    int tt = 1;// so thu tu de thiet lap content-ID cho anh trong html
    public SendMail(User user) {
        initComponents();
        setLocationRelativeTo(this);
        this.setTitle("Gui thu");
        this.user = user;
        nameEmail.setText(user.getUsername());
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
        nameEmail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        NoiDung = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        Gui = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ChonFile = new javax.swing.JButton();
        ChonAnh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tep = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Anh = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        nameEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nameEmail.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Soạn thư");

        jLabel3.setText("Tới: ");

        jLabel4.setText("Chủ đề: ");

        jLabel5.setText("Nội dung:");

        NoiDung.setColumns(20);
        NoiDung.setRows(5);
        jScrollPane1.setViewportView(NoiDung);

        Gui.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Gui.setText("Gửi");
        Gui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuiActionPerformed(evt);
            }
        });

        jLabel6.setText("Dinh kem tep:");

        jLabel7.setText("Chen anh:");

        ChonFile.setText("Chọn file");
        ChonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChonFileActionPerformed(evt);
            }
        });

        ChonAnh.setText("Chọn Ảnh");
        ChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChonAnhActionPerformed(evt);
            }
        });

        Tep.setColumns(20);
        Tep.setRows(5);
        jScrollPane2.setViewportView(Tep);

        Anh.setColumns(20);
        Anh.setRows(5);
        jScrollPane3.setViewportView(Anh);

        jButton1.setText("Đóng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(514, 514, 514))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton1)
                                .addGap(227, 227, 227)
                                .addComponent(Gui, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(414, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(ChonAnh)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(ChonFile, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChonFile)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(ChonAnh))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(Gui))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuiActionPerformed
        // TODO add your handling code here:
        // xac dinh giao thuc
        Properties props = new Properties();
        String host = "";
        String port = "";
        if (user.getServer().equalsIgnoreCase("gmail")) {// phân biệt server
            host = "smtp.gmail.com";
            port = "465";

        } else {
            host="smtp-mail.outlook.com";
            port="587";
            props.put("mail.smtp.starttls.enable", "true");// chu y outlook dung ma hoa STARTTLS
        }
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.socketFactory.port", port);
        props.put("mail.smtp.port", port);
        // tao session de gui mail
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user.getUsername(), user.getPassword());
            }
        });
        // tao mail qua lop message
        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(user.getUsername()));
            String addresslist = jTextField1.getText();
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(addresslist));// khi nhập ô text danh sach cac dia chi email bên nhận cách nhau bằng theo dau phay
            message.setSubject(jTextField2.getText());
            String msg = NoiDung.getText(); // ví dụ nội dung nhập là: <b>demo</b> --> khi gửi đi thì bên nhận đc chữ demo in đậm
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg, "text/html; charset=utf-8");// chen noi dung

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            String s[] = Tep.getText().split("\n");
            if (s.length != 0) {
                for (String i : s) {
                    if(i.isEmpty()==false)
                    {
                        MimeBodyPart attachmentBodyPart = new MimeBodyPart();
                        attachmentBodyPart.attachFile(new File(i));
                        multipart.addBodyPart(attachmentBodyPart);// them tep dinh kem
                    }
                    
                }
            }

            if (inlineImages != null && inlineImages.size() > 0) {//chèn ảnh trực tiếp trong phần nội dung
                Set<String> setImageID = inlineImages.keySet();
                for (String i : setImageID) {
                    MimeBodyPart imagePart = new MimeBodyPart();
                    imagePart.setHeader("Content-ID", "<" + i + ">");
                    imagePart.setDescription(MimeBodyPart.INLINE);// de anh hien trong pha noi dung
                    String imagePath = inlineImages.get(i);
                    imagePart.attachFile(imagePath);
                    multipart.addBodyPart(imagePart);
                }
            }

            message.setContent(multipart);
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Gửi mail thành công");
        } catch (AddressException ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Gửi mail không thành công");
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(this, "Gửi mail không thành công");
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Gửi mail không thành công");
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuiActionPerformed

    private void ChonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChonFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        listFile = Tep.getText();
        fileChooser.setMultiSelectionEnabled(true);// cho chọn nhiều file trong một lần chọn bằng cách ấn phím shift
        int x = fileChooser.showDialog(this, "chọn file");
        if (x == JFileChooser.APPROVE_OPTION) {
            File f[] = fileChooser.getSelectedFiles();
            for (File i : f) {
                listFile = listFile + i.getAbsolutePath() + "\n";
            }
            Tep.setText(listFile);
        }
    }//GEN-LAST:event_ChonFileActionPerformed

    private void ChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChonAnhActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);// cho chon nhieu file anh cung mot luc bằng cách ấn phím shift
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("hình ảnh", "jpg", "png");// lọc những file là hình ảnh
        fileChooser.setFileFilter(imageFilter);
        int x = fileChooser.showDialog(this, "chọn file");
        String listanh = "";
        if (x == JFileChooser.APPROVE_OPTION) {
            File f[] = fileChooser.getSelectedFiles();
            for (File i : f) {
                listanh = listanh + i.getAbsolutePath() + "\n";
                String noiDung = NoiDung.getText() + "<br>" + "<img src=\"cid:image" + tt + "\"/>" + "</br>";// them cau lenh chen anh trong html
                NoiDung.setText(noiDung);
                inlineImages.put("image" + tt, i.getAbsolutePath());
                tt++;
            }
            Anh.setText(listanh);
        }
    }//GEN-LAST:event_ChonAnhActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendMail(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Anh;
    private javax.swing.JButton ChonAnh;
    private javax.swing.JButton ChonFile;
    private javax.swing.JButton Gui;
    private javax.swing.JTextArea NoiDung;
    private javax.swing.JTextArea Tep;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel nameEmail;
    // End of variables declaration//GEN-END:variables
}
