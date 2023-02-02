package JavaSwing;

import javax.swing.*;

public class JPaneNewClassLearning {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Hello World!", "Pane",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showConfirmDialog(null, "Are u stupid?", "Serious Question", JOptionPane.YES_NO_OPTION);

        /*JOptionPane.showOptionDialog(null,
                                    "U are awesome",
                                    "Positive Messager",
                                        JOptionPane.YES_NO_OPTION,
                                        JOptionPane.INFORMATION_MESSAGE,
                                    null, null, null);*/

        int InputNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Give me a number between 0 and 10:"));
        System.out.println(InputNumber);
    }
}
