package JavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JFrameLearning extends JFrame {

    private JPanel contentPane;
    public JFrameLearning(JPanel pcontentPane){
        contentPane = new JPanel();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
               try {
                   JFrameLearning frame = new JFrameLearning();
                   frame.setVisible(true);
               } catch (Exception e){
                   e.printStackTrace();
               }
            }
        });
    }

    public JFrameLearning(){
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);
    }




}
