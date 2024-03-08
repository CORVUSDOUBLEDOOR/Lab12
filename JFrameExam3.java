import javax.swing.*;

public class JFrameExam3 {
    public static void main(String[] args) {
        JFrame jf =new JFrame();
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setBounds(0,0,830,550);
        jf.setTitle("Welcome to java GUI");
        jf.getContentPane().setLayout(null);

        JLabel JL1 = new JLabel("Name : ");
        JL1.setBounds(300,50,70,100);
        jf.getContentPane().add(JL1);
        JTextField JT1 = new JTextField();
        JT1.setBounds(350,87,200,30);
        jf.getContentPane().add(JT1);

        JLabel JL2 = new JLabel("Password : ");
        JL2.setBounds(275,90,120,100);
        jf.getContentPane().add(JL2);
        JPasswordField PS= new JPasswordField();
        PS.setBounds(350,127,200,30);
        jf.getContentPane().add(PS);

        JLabel JL3 = new JLabel("Address : ");
        JL3.setBounds(284, 130,100,100);
        jf.getContentPane().add(JL3);

        JTextArea JTA1 = new JTextArea(5,120);
        JTA1.setBounds(349,167,200,120);
        jf.getContentPane().add(JTA1);

        JScrollPane JSP1 = new JScrollPane(JTA1);
        JSP1.setBounds(349,167,200,90);
        jf.getContentPane().add(JSP1);

        jf.setVisible(true);
    }
}
