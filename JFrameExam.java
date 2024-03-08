import javax.swing.*;

public class JFrameExam {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(0,0,830,550);
        jFrame.setTitle("Welcome to java GUI");
        jFrame.getContentPane().setLayout(null);
        jFrame.setVisible(true);

        JLabel label1 = new JLabel("My name is Hade.");
        label1.setBounds(50,50,200,14);
        jFrame.getContentPane().add(label1);
        JLabel label2 = new JLabel("I like a mango.");
        label2.setBounds(50,70,200,14);
        jFrame.getContentPane().add(label2);
    }
}
