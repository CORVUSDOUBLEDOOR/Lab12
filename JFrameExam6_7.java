import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameExam6_7 {
    public static void main(String[] args) {
        JFrame jf =new JFrame();
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setBounds(0,0,890,750);
        jf.getContentPane().setBackground(new Color(255,204,118));
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

        JButton JB1 = new JButton("OK");
        JB1.setBounds(400,600,60,35);
        JB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Success");
                jf.setVisible(false);
                System.exit(0);
            }
        });
        jf.getContentPane().add(JB1);

        JRadioButton Male = new JRadioButton("Male");
        Male.setBounds(350,270,60,20);
        jf.getContentPane().add(Male);

        JRadioButton Female = new JRadioButton("Female");
        Female.setBounds(420,270,90,20);
        jf.getContentPane().add(Female);
        ButtonGroup BG = new ButtonGroup();
        BG.add(Male);
        BG.add(Female);

        JLabel skills = new JLabel("Skills : ");
        skills.setBounds(299,300,60,20);
        jf.getContentPane().add(skills);
        JCheckBox C = new JCheckBox("C");
        JCheckBox Cplus = new JCheckBox("C++");
        JCheckBox java = new JCheckBox("Java");
        JCheckBox Python = new JCheckBox("Python");
        JCheckBox PHP = new JCheckBox("PHP");
        JCheckBox rust = new JCheckBox("R");
        C.setBounds(350,300,60,20);
        Cplus.setBounds(350,330,60,20);
        java.setBounds(350,360,60,20);
        Python.setBounds(350,390,60,20);
        PHP.setBounds(350,420,60,20);
        rust.setBounds(350,450,60,20);
        jf.getContentPane().add(C);
        jf.getContentPane().add(Cplus);
        jf.getContentPane().add(java);
        jf.getContentPane().add(Python);
        jf.getContentPane().add(PHP);
        jf.getContentPane().add(rust);

        JLabel educate = new JLabel("Education : ");
        educate.setBounds(273,500,90,20);
        jf.getContentPane().add(educate);

        String [] educations = {"High school","Bacherlor","Master's Degree","Ph.D."};
        JComboBox educaiton = new JComboBox(educations);
        educaiton.setBounds(347,500,120,20);
        jf.getContentPane().add(educaiton);

        jf.setVisible(true);
    }
}
