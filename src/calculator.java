import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {

    private JPanel calculator;

    private JTextField textField1;
    private JButton add;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton sub;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton div;
    private JButton mul;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton fullstop;
    private JButton clear;
    private JButton equal;
    private JLabel Heading;
    private JRadioButton ONRadioButton;
    private JRadioButton OFFRadioButton;
    private JButton mod;
    private JButton pow;

    public calculator() {
        // disabled all the buttons before on the calculator
        add.setEnabled(false);
        sub.setEnabled(false);
        div.setEnabled(false);
        mul.setEnabled(false);
        mod.setEnabled(false);
        pow.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        zero.setEnabled(false);
        equal.setEnabled(false);
        fullstop.setEnabled(false);
        clear.setEnabled(false);
        textField1.setEnabled(false);

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(" ");
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "9");
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "+");
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "-");
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "*");
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "/");
            }
        });
        mod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "%");
            }
        });
        pow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "^");
            }
        });
        fullstop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + ".");
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "0");
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "After finish the operation please clear");
                textField1.setText(textField1.getText() + "=");
                int length = textField1.getText().length();
                double num1;
                double num2;
                for(int i=0;i<length;i++){
                    if(textField1.getText().charAt(i)=='+') {
                        num1 = Double.parseDouble(textField1.getText().substring(0,i));
                        num2 = Double.parseDouble(textField1.getText().substring(i+1,length-1));
                        String ans = String.valueOf(num1+num2);
                        textField1.setText(textField1.getText() + ans);
                    }else if(textField1.getText().charAt(i)=='-'){
                        num1 = Double.parseDouble(textField1.getText().substring(0,i));
                        num2 = Double.parseDouble(textField1.getText().substring(i+1,length-1));
                        String ans = String.valueOf(num1-num2);
                        textField1.setText(textField1.getText() + ans);
                    }else if(textField1.getText().charAt(i)=='*'){
                        num1 = Double.parseDouble(textField1.getText().substring(0,i));
                        num2 = Double.parseDouble(textField1.getText().substring(i+1,length-1));
                        String ans = String.valueOf(num1*num2);
                        textField1.setText(textField1.getText() + ans);
                    }else if(textField1.getText().charAt(i)=='/'){
                        num1 = Double.parseDouble(textField1.getText().substring(0,i));
                        num2 = Double.parseDouble(textField1.getText().substring(i+1,length-1));
                        String ans = String.valueOf(num1/num2);
                        textField1.setText(textField1.getText() + ans);
                    }else if(textField1.getText().charAt(i)=='%'){
                        num1 = Double.parseDouble(textField1.getText().substring(0,i));
                        num2 = Double.parseDouble(textField1.getText().substring(i+1,length-1));
                        String ans = String.valueOf(num1%num2);
                        textField1.setText(textField1.getText() + ans);
                    }else if(textField1.getText().charAt(i)=='^'){
                        num1 = Double.parseDouble(textField1.getText().substring(0,i));
                        num2 = Double.parseDouble(textField1.getText().substring(i+1,length-1));
                        String ans = String.valueOf(Math.pow(num1,num2));
                        textField1.setText(textField1.getText() + ans);
                    }
                }
            }
        });
        ONRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(true);
                sub.setEnabled(true);
                div.setEnabled(true);
                mul.setEnabled(true);
                mod.setEnabled(true);
                pow.setEnabled(true);
                one.setEnabled(true);
                two.setEnabled(true);
                three.setEnabled(true);
                four.setEnabled(true);
                five.setEnabled(true);
                six.setEnabled(true);
                seven.setEnabled(true);
                eight.setEnabled(true);
                nine.setEnabled(true);
                zero.setEnabled(true);
                equal.setEnabled(true);
                fullstop.setEnabled(true);
                clear.setEnabled(true);
                textField1.setEnabled(true);
                OFFRadioButton.setEnabled(true);
            }
        });
        OFFRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.setEnabled(false);
                sub.setEnabled(false);
                div.setEnabled(false);
                mul.setEnabled(false);
                mod.setEnabled(false);
                pow.setEnabled(false);
                one.setEnabled(false);
                two.setEnabled(false);
                three.setEnabled(false);
                four.setEnabled(false);
                five.setEnabled(false);
                six.setEnabled(false);
                seven.setEnabled(false);
                eight.setEnabled(false);
                nine.setEnabled(false);
                zero.setEnabled(false);
                equal.setEnabled(false);
                fullstop.setEnabled(false);
                clear.setEnabled(false);
                textField1.setEnabled(false);
                ONRadioButton.setEnabled(true);
            }
        });


    }

    public static void main(String [] args){
        JFrame frame = new JFrame("CALCULATOR");
        frame.setSize(300,600);
        frame.setContentPane(new calculator().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
