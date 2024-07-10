package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    TextField textField;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16,
            b17, b18, b19, b20, b21, b22, b23, b24;

    String finalValue, storedValue, operation;
    Double finalDoubleValue, storedDoubleValue, finalTotal;

    Cal() {
        Frame frame = new Frame();

        frame.addWindowListener(new close());
        frame.setBackground(Color.white);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        frame.setSize(380, 630);
        frame.setLocationRelativeTo(null);

        Font font1 = new Font("Poppins", Font.BOLD, 40);
        Font font2 = new Font("Poppins", Font.PLAIN, 20);
        Font font3 = new Font("Poppins", Font.BOLD, 25);

        MenuBar menuBar = new MenuBar();

        Menu menu1 = new Menu("View");
        MenuItem menuItem1 = new MenuItem("Standard");
        MenuItem menuItem2 = new MenuItem("Scientific");
        MenuItem menuItem3 = new MenuItem("Programmer");
        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menuItem3);

        Menu menu2 = new Menu("Edit");
        MenuItem menuItem4 = new MenuItem("Copy (CTRL + C)");
        MenuItem menuItem5 = new MenuItem("Cut (CTRL + X)");
        MenuItem menuItem6 = new MenuItem("Past (CTRL + V)");
        menu2.add(menuItem4);
        menu2.add(menuItem5);
        menu2.add(menuItem6);

        Menu menu3 = new Menu("Help");
        MenuItem menuItem7 = new MenuItem("About Calculator");
        MenuItem menuItem8 = new MenuItem("Help");
        menu3.add(menuItem7);
        menu3.add(menuItem8);

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);

        frame.setMenuBar(menuBar);

        Panel panel1 = new Panel();
        Panel panel2 = new Panel();

        GridLayout gridLayout = new GridLayout(6, 4, 4, 4);

        panel2.setLayout(gridLayout);
        panel2.setBackground(Color.white);

        textField = new TextField(11);
        textField.setFont(font1);
        textField.setEditable(true);
        textField.setForeground(Color.black);
        textField.setBackground(Color.white);
        textField.setText("0");

        panel1.add(textField);

        b1 = new Button("1");
        b1.setBackground(Color.white);
        b1.setFont(font2);
        b1.setPreferredSize(new Dimension(70, 70));
        b1.addActionListener(this);

        b2 = new Button("2");
        b2.setBackground(Color.white);
        b2.setFont(font2);
        b2.addActionListener(this);

        b3 = new Button("3");
        b3.setBackground(Color.white);
        b3.setFont(font2);
        b3.addActionListener(this);

        b4 = new Button("4");
        b4.setBackground(Color.white);
        b4.setFont(font2);
        b4.addActionListener(this);

        b5 = new Button("5");
        b5.setBackground(Color.white);
        b5.setFont(font2);
        b5.addActionListener(this);

        b6 = new Button("6");
        b6.setBackground(Color.white);
        b6.setFont(font2);
        b6.addActionListener(this);

        b7 = new Button("7");
        b7.setBackground(Color.white);
        b7.setFont(font2);
        b7.addActionListener(this);

        b8 = new Button("8");
        b8.setBackground(Color.white);
        b8.setFont(font2);
        b8.addActionListener(this);

        b9 = new Button("9");
        b9.setBackground(Color.white);
        b9.setFont(font2);
        b9.addActionListener(this);

        b10 = new Button("0");
        b10.setBackground(Color.white);
        b10.setFont(font2);
        b10.addActionListener(this);

        b11 = new Button("+");
        b11.setForeground(new Color(0, 150, 0));
        b11.setBackground(Color.white);
        b11.setFont(font3);
        b11.addActionListener(this);

        b12 = new Button("-");
        b12.setForeground(new Color(0, 150, 0));
        b12.setBackground(Color.white);
        b12.setFont(font3);
        b12.addActionListener(this);

        b13 = new Button("*");
        b13.setForeground(new Color(0, 150, 0));
        b13.setBackground(Color.white);
        b13.setFont(font3);
        b13.addActionListener(this);

        b14 = new Button("/");
        b14.setForeground(new Color(0, 150, 0));
        b14.setBackground(Color.white);
        b14.setFont(font3);
        b14.addActionListener(this);

        b15 = new Button("=");
        b15.setForeground(Color.white);
        b15.setBackground(new Color(6, 117, 176));
        b15.setFont(font3);
        b15.addActionListener(this);

        b16 = new Button(".");
        b16.setBackground(Color.white);
        b16.setFont(font2);
        b16.addActionListener(this);

        b17 = new Button("+/-");
        b17.setBackground(Color.white);
        b17.setFont(font2);
        b17.addActionListener(this);

        b18 = new Button("MR");
        b18.setBackground(Color.white);
        b18.setFont(font2);
        b18.addActionListener(this);

        b19 = new Button("M+");
        b19.setBackground(Color.white);
        b19.setFont(font2);
        b19.addActionListener(this);

        b20 = new Button("M-");
        b20.setBackground(Color.white);
        b20.setFont(font2);
        b20.addActionListener(this);

        b21 = new Button("%");
        b21.setBackground(Color.white);
        b21.setFont(font2);
        b21.addActionListener(this);

        b22 = new Button("√");
        b22.setBackground(Color.white);
        b22.setFont(font2);
        b22.addActionListener(this);

        b23 = new Button("C");
        b23.setForeground(Color.red);
        b23.setBackground(Color.white);
        b23.setFont(font2);
        b23.addActionListener(this);

        b24 = new Button("<<");
        b24.setBackground(Color.white);
        b24.setFont(font2);
        b24.addActionListener(this);

        panel2.add(b21);
        panel2.add(b22);
        panel2.add(b23);
        panel2.add(b24);
        panel2.add(b18);
        panel2.add(b19);
        panel2.add(b20);
        panel2.add(b14);
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
        panel2.add(b13);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b12);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b11);
        panel2.add(b17);
        panel2.add(b10);
        panel2.add(b16);
        panel2.add(b15);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {

        if (textField.getText().equals("0")) {
            textField.setText("");
        }

        Object object = event.getSource();

        if (object.equals(b1)) {
            textField.setText(textField.getText() + b1.getLabel());
        } else if (object.equals(b2)) {
            textField.setText(textField.getText() + b2.getLabel());
        } else if (object.equals(b3)) {
            textField.setText(textField.getText() + b3.getLabel());
        } else if (object.equals(b4)) {
            textField.setText(textField.getText() + b4.getLabel());
        } else if (object.equals(b5)) {
            textField.setText(textField.getText() + b5.getLabel());
        } else if (object.equals(b6)) {
            textField.setText(textField.getText() + b6.getLabel());
        } else if (object.equals(b7)) {
            textField.setText(textField.getText() + b7.getLabel());
        } else if (object.equals(b8)) {
            textField.setText(textField.getText() + b8.getLabel());
        } else if (object.equals(b9)) {
            textField.setText(textField.getText() + b9.getLabel());
        } else if (object.equals(b10)) {
            textField.setText(textField.getText() + b10.getLabel());
        } else if (object.equals(b11)) {
            // +
            finalValue = textField.getText();
            operation = b11.getLabel();
            textField.setText("");

        } else if (object.equals(b12)) {
            // -
            finalValue = textField.getText();
            operation = b12.getLabel();
            textField.setText("");

        } else if (object.equals(b13)) {
            // *
            finalValue = textField.getText();
            operation = b13.getLabel();
            textField.setText("");

        } else if (object.equals(b14)) {
            // /
            finalValue = textField.getText();
            operation = b14.getLabel();
            textField.setText("");

        } else if (object.equals(b15)) {
            // =
            storedValue = textField.getText();

            finalDoubleValue = Double.parseDouble(finalValue);
            storedDoubleValue = Double.parseDouble(storedValue);
            textField.setText("");

            if (operation.equals("+")) {

                finalTotal = finalDoubleValue + storedDoubleValue;
                textField.setText(finalTotal + "");

            } else if (operation.equals("-")) {

                finalTotal = finalDoubleValue - storedDoubleValue;
                textField.setText(finalTotal + "");

            } else if (operation.equals("*")) {

                finalTotal = finalDoubleValue * storedDoubleValue;
                textField.setText(finalTotal + "");

            } else if (operation.equals("/")) {

                finalTotal = finalDoubleValue / storedDoubleValue;
                textField.setText(finalTotal + "");

            } else if (operation.equals("%")) {

                finalTotal = (finalDoubleValue * storedDoubleValue) / 100;
                textField.setText(finalTotal + "");

            } else if (operation.equals("√")) {

                finalTotal = Math.sqrt(finalDoubleValue);
                textField.setText(finalTotal + "");

            }

        } else if (object.equals(b16)) {
            textField.setText(textField.getText() + b16.getLabel());
        } else if (object.equals(b17)) {
            //+/-
        } else if (object.equals(b18)) {
            //MR
        } else if (object.equals(b19)) {
            //M+ 
        } else if (object.equals(b20)) {
            //M- 
        } else if (object.equals(b21)) {
            //% 
            finalValue = textField.getText();
            operation = b21.getLabel();
            textField.setText("");

        } else if (object.equals(b22)) {
            //√ 
            finalValue = textField.getText();
            operation = b22.getLabel();
            textField.setText("");

        } else if (object.equals(b23)) {
            //clear 
            textField.setText("");
        } else if (object.equals(b24)) {
            //<<

        }

    }

}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }

}
