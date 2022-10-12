
import java.util.Properties;
import java.util.Scanner;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class demo {

    public static void main(String[] args) throws NoSuchProviderException, MessagingException {
        while (true) {
            Scanner in = new Scanner(System.in);
            String username = in.nextLine();
            String password = in.nextLine();
            System.out.println(username);
            System.out.println(password);
            Properties props = new Properties();
            props.setProperty("mail.store.protocol", "imaps");
            Session session = Session.getInstance(props, null);
            Store store = session.getStore();
            store.connect("imap.gmail.com", username, password);
            System.out.println("dang nhap thanh cong");
        }
    }
}
