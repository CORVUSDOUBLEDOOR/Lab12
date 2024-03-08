import javax.swing.*;

public class JFrameExam1 {
    public static void main(String[] args) {
        JFrame jf =new JFrame();
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setBounds(0,0,830,550);
        jf.setTitle("Welcome to java GUI");
        jf.getContentPane().setLayout(null);
        jf.setVisible(true);

        JLabel JL1 = new JLabel("Name : ");
        JL1.setBounds(300,50,70,100);
        jf.add(JL1);
        JTextField JT1 = new JTextField();
        JT1.setBounds(350,87,200,30);
        jf.getContentPane().add(JT1);

        JLabel JL2 = new JLabel("Password : ");
        JL2.setBounds(275,90,120,100);
        jf.add(JL2);
        JTextField JT2 = new JTextField();
        JT2.setBounds(350,127,200,30);
        jf.getContentPane().add(JT2);
    }
}
