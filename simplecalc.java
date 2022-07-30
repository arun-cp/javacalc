import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;

public class simplecalc implements ActionListener {
  JTextField tf1, tf2, tf3;
  int k = -1;
  JButton b1, b2, b3, b4, b5, b6, a1, a2, a3, a4, a5, a6, a7, a8, a9, a0, n1, n2;

  simplecalc() {
    JFrame f = new JFrame("Calculator");
    f.getContentPane().setBackground(Color.RED);
    JLabel l = new JLabel("CALCULATOR");
    l.setBounds(160, 30, 250, 50);
    JLabel s = new JLabel("Sollution");
    s.setBounds(50, 180, 100, 20);
    tf1 = new JTextField();
    tf1.setBounds(100, 100, 120, 20);
    tf1.setEditable(false);
    tf2 = new JTextField();
    tf2.setBounds(100, 150, 120, 20);
    tf2.setEditable(false);
    tf3 = new JTextField();
    tf3.setBounds(50, 200, 170, 20);
    tf3.setEditable(false);
    n1 = new JButton(">");
    n1.setBounds(50, 100, 50, 20);
    n2 = new JButton(">");
    n2.setBounds(50, 150, 50, 20);
    a1 = new JButton("1");
    a1.setBounds(50, 230, 50, 40);
    a2 = new JButton("2");
    a2.setBounds(110, 230, 50, 40);
    a3 = new JButton("3");
    a3.setBounds(170, 230, 50, 40);
    a4 = new JButton("4");
    a4.setBounds(230, 230, 50, 40);
    a5 = new JButton("5");
    a5.setBounds(290, 230, 50, 40);
    a6 = new JButton("6");
    a6.setBounds(50, 280, 50, 40);
    a7 = new JButton("7");
    a7.setBounds(110, 280, 50, 40);
    a8 = new JButton("8");
    a8.setBounds(170, 280, 50, 40);
    a9 = new JButton("9");
    a9.setBounds(230, 280, 50, 40);
    a0 = new JButton("0");
    a0.setBounds(290, 280, 50, 40);
    b1 = new JButton("+");
    b1.setBounds(230, 100, 50, 50);
    b2 = new JButton("-");
    b2.setBounds(230, 160, 50, 50);
    b3 = new JButton("*");
    b3.setBounds(290, 100, 50, 50);
    b4 = new JButton("/");
    b4.setBounds(290, 160, 50, 50);
    b5 = new JButton("Clear");
    b5.setBounds(180, 330, 90, 40);
    b6 = new JButton(".");
    b6.setBounds(50, 330, 50, 40);
    a1.addActionListener(this);
    a2.addActionListener(this);
    a3.addActionListener(this);
    a4.addActionListener(this);
    a5.addActionListener(this);
    a6.addActionListener(this);
    a7.addActionListener(this);
    a8.addActionListener(this);
    a9.addActionListener(this);
    a0.addActionListener(this);
    n1.addActionListener(this);
    n2.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    f.add(tf1);
    f.add(tf2);
    f.add(tf3);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(l);
    f.add(a1);
    f.add(a2);
    f.add(a3);
    f.add(a4);
    f.add(a5);
    f.add(a6);
    f.add(a7);
    f.add(a8);
    f.add(a9);
    f.add(a0);
    f.add(n1);
    f.add(n2);
    f.add(s);
    f.setSize(410, 500);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) {
    double c = 0;
    if (e.getSource() == n1) {
      k = 0;
      tf1.setEditable(true);
      tf2.setEditable(false);
    }
    if (e.getSource() == n2) {
      k = 1;
      tf2.setEditable(true);
      tf1.setEditable(false);
    }
    if (e.getSource() == a1) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("1"));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("1"));
    }
    if (e.getSource() == a2) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("2"));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("2"));
    }
    if (e.getSource() == a3) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("3"));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("3"));
    }
    if (e.getSource() == a4) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("4"));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("4"));
    }
    if (e.getSource() == a5) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("5"));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("5"));
    }
    if (e.getSource() == a6) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("6"));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("6"));
    }
    if (e.getSource() == a7) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("7"));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("7"));
    }
    if (e.getSource() == a8) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("8"));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("8"));
    }
    if (e.getSource() == a9) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("9"));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("9"));
    }
    if (e.getSource() == a0) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("0"));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("0"));
    }
    if (e.getSource() == b6) {
      if (k == 0)
        tf1.setText(tf1.getText().concat("."));
      else if (k == 1)
        tf2.setText(tf2.getText().concat("."));
    }
    if (e.getSource() == b1 || e.getSource() == b2 || e.getSource() == b3 || e.getSource() == b4) {
      String s1 = tf1.getText();
      String s2 = tf2.getText();
      double a = Double.parseDouble(s1);
      double b = Double.parseDouble(s2);
      if (e.getSource() == b1) {
        c = a + b;
      } else if (e.getSource() == b2) {
        c = a - b;
      } else if (e.getSource() == b3) {
        c = a * b;
      } else if (e.getSource() == b4) {
        c = a / b;
      }
      String result = String.valueOf(c);
      tf3.setText(result);
    }
    if (e.getSource() == b5) {
      tf3.setText("");
      tf1.setText("");
      tf2.setText("");
    }

  }

  public static void main(String[] args) {
    new simplecalc();
  }
}