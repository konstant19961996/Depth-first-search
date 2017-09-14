import static org.junit.Assert.*;

import javax.swing.*;
import org.junit.*;
import org.junit.Test;
import org.netbeans.jemmy.*;

/**
 * Created by 803100 on 10.11.2016.
 */
public class FormTest {
    static Form1 fForm;

    @BeforeClass
    public static  void  setUpClass(){
        fForm = new Form1();
        JemmyProperties.setCurrentTimeout("JTextComponentOperator.PushKeyTimeout", 50);
        JemmyProperties.setCurrentTimeout("FrameWaiter.WaitFrameTimeout",2000);
        JemmyProperties.setCurrentTimeout("ComponentOperator.WaitCpmponentTimeout",1000);
    }
    @Test
    public void DataTest(){
        Assert.assertNotNull(fForm);
        Assert.assertEquals("Введите начальную вершину",fForm.getLbl1().getText());
        Assert.assertEquals("Введите конечную вершину", fForm.getLbl2().getText());
        Assert.assertEquals("",fForm.getL1().getText());
        Assert.assertEquals("Result",fForm.getButtonOK().getText());
        Assert.assertEquals("Cancel",fForm.getButtonCancel().getText());
    }
    @Test
    public  void testResultBtn1() {
        fForm.getTextField2().setText("1");
        fForm.getTextField1().setText("1");
        Assert.assertEquals("1", fForm.getTextField2().getText());
        Assert.assertEquals("1", fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals(" 2", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();
        Assert.assertEquals("", fForm.getTextField2().getText());
        Assert.assertEquals("", fForm.getTextField1().getText());
        Assert.assertEquals("", fForm.getL1().getText());
    }
    @Test
    public  void testResultBtn2() {
        fForm.getTextField2().setText("0");
        fForm.getTextField1().setText("2");
        Assert.assertEquals("0",fForm.getTextField2().getText());
        Assert.assertEquals("2",fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals(" 1 2 4 8 9 5 10 3", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();
        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }
    @Test
    public  void testResultBtn3() {
        fForm.getTextField2().setText("0");
        fForm.getTextField1().setText("7");
        Assert.assertEquals("0",fForm.getTextField2().getText());
        Assert.assertEquals("7",fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals(" 1 2 4 8", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();
        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }
    @Test
    public  void testResultBtn4() {
        fForm.getTextField2().setText("10");
        fForm.getTextField1().setText("6");
        Assert.assertEquals("10",fForm.getTextField2().getText());
        Assert.assertEquals("6",fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals(" 11 7", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();
        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }
    @Test
    public  void testResultBtn5() {
        fForm.getTextField2().setText("0");
        fForm.getTextField1().setText("6");
        Assert.assertEquals("0",fForm.getTextField2().getText());
        Assert.assertEquals("6",fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals(" 1 2 4 8 9 5 10 3 6 7", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();
        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }







    @Test
    public  void testCancelBtn1() {
        Assert.assertEquals("", fForm.getTextField2().getText());
        Assert.assertEquals("", fForm.getTextField1().getText());
        Assert.assertEquals("", fForm.getL1().getText());

        fForm.getTextField2().setText("0");
        fForm.getTextField1().setText("1");
        Assert.assertEquals("0", fForm.getTextField2().getText());
        Assert.assertEquals("1", fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals(" 1 2", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();


        Assert.assertEquals("", fForm.getTextField2().getText());
        Assert.assertEquals("", fForm.getTextField1().getText());
        Assert.assertEquals("", fForm.getL1().getText());
    }
    @Test
    public  void testCancelBtn2() {
        fForm.getTextField2().setText("0");
        fForm.getTextField1().setText("3");
        Assert.assertEquals("0",fForm.getTextField2().getText());
        Assert.assertEquals("3",fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals(" 1 2 4", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();

        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }
    @Test
    public  void testCancelBtn3() {
        fForm.getTextField2().setText("0");
        fForm.getTextField1().setText("10");
        Assert.assertEquals("0",fForm.getTextField2().getText());
        Assert.assertEquals("10",fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals(" 1 2 4 8 9 5 10 3 6 7 11", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();

        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }
    @Test
    public  void testCancelBtn4() {
        fForm.getTextField2().setText("hello");
        fForm.getTextField1().setText("world");
        Assert.assertEquals("hello",fForm.getTextField2().getText());
        Assert.assertEquals("world",fForm.getTextField1().getText());
        fForm.getButtonCancel().doClick();

        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }
    @Test
    public  void testCancelBtn5() {
        fForm.getTextField2().setText("hello");
        fForm.getTextField1().setText("");
        Assert.assertEquals("hello",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        fForm.getButtonCancel().doClick();

        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }

    @Test
    public  void testException1() {
        fForm.getTextField2().setText("15");
        fForm.getTextField1().setText("1");
        Assert.assertEquals("15", fForm.getTextField2().getText());
        Assert.assertEquals("1", fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals("First vertex is wrong", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();


        Assert.assertEquals("", fForm.getTextField2().getText());
        Assert.assertEquals("", fForm.getTextField1().getText());
        Assert.assertEquals("", fForm.getL1().getText());
    }
    public  void testException2()
    {
        fForm.getTextField2().setText("6 6");
        fForm.getTextField1().setText("1");
        Assert.assertEquals("-5",fForm.getTextField2().getText());
        Assert.assertEquals("1",fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals("Wrong first string", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();


        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }
    public  void testException3() {
        fForm.getTextField2().setText("0");
        fForm.getTextField1().setText("17");
        Assert.assertEquals("0",fForm.getTextField2().getText());
        Assert.assertEquals("17",fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals("Second vertex is wrong", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();


        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }
    public  void testException4() {
        fForm.getTextField2().setText("0");
        fForm.getTextField1().setText("6 6");
        Assert.assertEquals("0",fForm.getTextField2().getText());
        Assert.assertEquals("17",fForm.getTextField1().getText());
        fForm.getButtonOK().doClick();
        Assert.assertEquals("Wrong first string", fForm.getL1().getText());
        fForm.getButtonCancel().doClick();


        Assert.assertEquals("",fForm.getTextField2().getText());
        Assert.assertEquals("",fForm.getTextField1().getText());
        Assert.assertEquals("",fForm.getL1().getText());
    }


}