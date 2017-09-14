import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by 803100 on 10.11.2016.
 */
public class Form1 extends  JFrame{
    private graph g;
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel lbl2;
    private JTextField textField1;
    private JLabel l1;
    private JButton buttonCancel;
    private JLabel lbl1;
    private JTextField textField2;

    public  JTextField getTextField1()
    {
        return  textField1;
    }
    public JTextField getTextField2()
    {
        return textField2;
    }
    public JLabel getLbl1()
    {
        return lbl1;
    }
    public  JLabel getLbl2()
    {
        return lbl2;
    }
    public  JLabel getL1()
    {
        return  l1;
    }
    public JButton getButtonOK()
    {
        return  buttonOK;
    }
    public  JButton getButtonCancel()
    {
        return buttonCancel;
    }
    private ArrayList<Integer> adj[];
    private boolean used[];
    private Form1 f;
    public int n=11;
    public  String a;


    public Form1() {

        setResizable(false);
        setVisible(true);
        setLocation(500,200);
        setContentPane(contentPane);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        buttonOK.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });



    }

    private  boolean check (String str)
    {
        int p = str.length();
        boolean a1=true;
        for (int i=0; i<p; i++)
        {
            if ((str.codePointAt(i)<48)||(str.codePointAt(i)>57))
                return false;
        }
        return a1;
    }

    private void onOK() {
        if (!check(textField2.getText()))
        {
            l1.setText("Wrong first string");
            return;
        }
        if (!check(textField1.getText()))
        {
            l1.setText("Wrong second string");
            return;
        }
        int b1 = Integer.valueOf(textField2.getText());
        int b2 = Integer.valueOf(textField1.getText());
        g = new graph();
        adj=g.initadj2();
        used=g.initused2();
        a = g.dfs(b1,b2,adj,used);
        l1.setText(a);

    }

    private void onCancel() {
        // add your code here if necessary
        textField2.setText("");
        textField1.setText("");
        l1.setText("");
        //dispose();
    }

}
