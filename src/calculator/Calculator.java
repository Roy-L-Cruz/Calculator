
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {
    
    public static String F = "",S = "",T = "";
    
    public static final JTextField txt = new JTextField();
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(null);

        txt.setEditable(false);
        txt.setHorizontalAlignment(JTextField.RIGHT);

        JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;

        btn1 = new JButton("AC");
        btn2 = new JButton("D");
        btn3 = new JButton("+/-");
        btn4 = new JButton("÷");
        btn5 = new JButton("7");
        btn6 = new JButton("8");
        btn7 = new JButton("9");
        btn8 = new JButton("x");
        btn9 = new JButton("4");
        btn10 = new JButton("5");
        btn11 = new JButton("6");
        btn12 = new JButton("-");
        btn13 = new JButton("1");
        btn14 = new JButton("2");
        btn15 = new JButton("3");
        btn16 = new JButton("+");
        btn17 = new JButton("%");
        btn18 = new JButton("0");
        btn19 = new JButton(".");
        btn20 = new JButton("=");
        
        Calculator calculator = new Calculator();

        txt.setBounds(2, 10, 207, 50);

        btn1.setBounds(2, 75,50,50);
        btn2.setBounds(54, 75,50,50);
        btn3.setBounds(106, 75,50,50);
        btn4.setBounds(158, 75,50,50);

        btn5.setBounds(2, 127,50,50);
        btn6.setBounds(54, 127,50,50);
        btn7.setBounds(106, 127,50,50);
        btn8.setBounds(158, 127,50,50);

        btn9.setBounds(2, 179,50,50);
        btn10.setBounds(54, 179,50,50);
        btn11.setBounds(106, 179,50,50);
        btn12.setBounds(158, 179,50,50);

        btn13.setBounds(2, 231,50,50);
        btn14.setBounds(54, 231,50,50);
        btn15.setBounds(106, 231,50,50);
        btn16.setBounds(158, 231,50,50);

        btn17.setBounds(2, 283,50,50);
        btn18.setBounds(54, 283,50,50);
        btn19.setBounds(106, 283,50,50);
        btn20.setBounds(158, 283,50,50);


        frame.add(txt);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn10);
        frame.add(btn11);
        frame.add(btn12);
        frame.add(btn13);
        frame.add(btn14);
        frame.add(btn15);
        frame.add(btn16);
        frame.add(btn17);
        frame.add(btn18);
        frame.add(btn19);
        frame.add(btn20);
        
        btn1.addActionListener(calculator.new AC());
        btn2.addActionListener(calculator.new Del());
        btn3.addActionListener(calculator.new Inv());
        btn4.addActionListener(calculator.new Div());
        btn5.addActionListener(calculator.new Sev());
        btn6.addActionListener(calculator.new Eig());
        btn7.addActionListener(calculator.new Nin());
        btn8.addActionListener(calculator.new Multiply());
        btn9.addActionListener(calculator.new Fou());
        btn10.addActionListener(calculator.new Fiv());
        btn11.addActionListener(calculator.new Six());
        btn12.addActionListener(calculator.new Sub());
        btn13.addActionListener(calculator.new One());
        btn14.addActionListener(calculator.new Two());
        btn15.addActionListener(calculator.new Thr());
        btn16.addActionListener(calculator.new Plus());
        btn17.addActionListener(calculator.new Mod());
        btn18.addActionListener(calculator.new Zer());
        btn19.addActionListener(calculator.new Dot());
        btn20.addActionListener(calculator.new Equal());
        
        frame.setSize(223, 372);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    class AC implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            F = S = T = "";
            txt.setText(F+S+T);
        }
    }
    class Del implements ActionListener {
        public void actionPerformed(ActionEvent e) {    
            if (T.length() > 0) {
                T = T.substring(0, T.length() - 1);
            }
            else if (S.length() > 0) {
                S = S.substring(0, S.length() - 1);
            }
            else if (F.length() > 0) {
                F = F.substring(0, F.length() - 1);
            }
            txt.setText(F+S+T);
        }
    }
    class Inv implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!T.contains("(") && !F.contains("(")) {
                if (S.length() == 1) {
                    String inv = "(-" + T +")";
                    T = inv; 
                }
                else if (S.length() == 0) {
                    String inv = "(-" + F +")";
                    F = inv;
                }
                
            }
            else if (T.contains("-") && F.contains("-")) {
                if (S.length() == 1) {
                    String inv = T.substring(1);
                    T = inv; 
                }
                else if (S.length() == 0) {
                    String inv = F.substring(1);
                    F = inv;
                }
            }
            else{
                if (F.contains("(")) {
                    String inv = F.substring(0, F.length() - 1).substring(2);
                    F = inv;
                }else if (T.contains("(")) {
                    String inv = T.substring(0, T.length() - 1).substring(2);
                    T = inv;
                }
            }
            txt.setText(F+S+T);
        }
    }
    class Div implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = "÷";
            txt.setText(F+S+T);
        }
    }
    class Sev implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                String t = T + "7";
                T=t;
                txt.setText(F+S+T);
            }
            else if (S.length() == 0) {
                String f = F + "7";
                F=f;
                txt.setText(F+S+T);
            }
        }
    }
    class Eig implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                T += "8";
            }
            else if (S.length() == 0) {
                F += "8";
            }
            txt.setText(F+S+T);
        }
    }
    class Nin implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                T += "9";
            }
            else if (S.length() == 0) {
                F += "9";
            }
            txt.setText(F+S+T);
        }
    }
    class Multiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                S = "x";
                txt.setText(F+S+T);
        }
    }
    class Fou implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                T += "4";
            }
            else if (S.length() == 0) {
                F += "4";
            }
            txt.setText(F+S+T);
        }
    }
    class Fiv implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                T += "5";
            }
            else if (S.length() == 0) {
                F += "5";
            }
            txt.setText(F+S+T);
        }
    }
    class Six implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                T += "6";
            }
            else if (S.length() == 0) {
                F += "6";
            }
            txt.setText(F+S+T);
        }
    }
    class Sub implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                S = "-";
                txt.setText(F+S+T);
        }
    }
    class One implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                T += "1";
            }
            else if (S.length() == 0) {
                F += "1";
            }
            txt.setText(F+S+T);
        }
    }
    class Two implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                T += "2";
            }
            else if (S.length() == 0) {
                F += "2";
            }
            txt.setText(F+S+T);
        }
    }
    class Thr implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                T += "3";
            }
            else if (S.length() == 0) {
                F += "3";
            }
            txt.setText(F+S+T);
        }
    }
    class Plus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                S = "+";
                txt.setText(F+S+T);
        }
    }
    class Mod implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                S = "%";
                txt.setText(F+S+T);
        }
    }
    class Zer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                T += "0";
            }
            else if (S.length() == 0) {
                F += "0";
            }
            txt.setText(F+S+T);
        }
    }
    class Dot implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (S.length() == 1) {
                if (!T.contains(".")) {
                    T += ".";
                }
            }
            else if (S.length() == 0) {
                if (!F.contains(".")) {
                    F += ".";
                }
            }
            txt.setText(F+S+T);
        }
    }
    class Equal implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (F.contains("(")) {
                String f = F.substring(0, F.length() - 1).substring(1);
                F = f;
            }
            else if (T.contains("(")) {
                String t = T.substring(0, T.length() - 1).substring(1);
                T = t;
            }
            
            if(F.contains("NaN")){
                F = "";
                S = "";
                T = "";
                txt.setText(F+S+T);
            }
            else if (S.contains("÷") && F.length()>0 && T.length()>0) {
                float div = Float.parseFloat(F) / Float.parseFloat(T);
                F = Float.toString(div);
                S = "";
                T = "";
                txt.setText(Float.toString(div));
            }
            else if (S.contains("+") && F.length()>0 && T.length()>0) {
                float add = Float.parseFloat(F) + Float.parseFloat(T);
                F = Float.toString(add);
                S = "";
                T = "";
                txt.setText(Float.toString(add));
            }
            else if (S.contains("-") && F.length()>0 && T.length()>0) {
                float min = Float.parseFloat(F) - Float.parseFloat(T);
                F = Float.toString(min);
                S = "";
                T = "";
                txt.setText(Float.toString(min));
            }
            else if (S.contains("x") && F.length()>0 && T.length()>0) {
                float mult1 = Float.parseFloat(F);
                float mult2 = Float.parseFloat(T);
                float mult = mult1 * mult2;
                F = Float.toString(mult);
                S = "";
                T = "";
                txt.setText(Float.toString(mult));
            }
            else if (S.contains("%") && F.length()>0 && T.length()>0) {
                float mod = Float.parseFloat(F) % Float.parseFloat(T);
                F = Float.toString(mod);
                S = "";
                T = "";
                txt.setText(Float.toString(mod));
            }
            else{
                F = "";
                S = "";
                T = "";
                txt.setText(F+S+T);
            }
        }
    }
}
