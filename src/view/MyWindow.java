package view;

import controller.AddButtonListener;
import controller.ShowAllButtonListener;

import java.awt.*;
import javax.swing.*;

public class MyWindow extends JFrame {

    private JTextArea display = new JTextArea("Welcome to MyShapes");
    private JRadioButton[] shapeButtons = new JRadioButton[3];
    private JTextField xField = new JTextField(4);
    private JTextField yField = new JTextField(4);
    private JTextField v1Field = new JTextField(4);
    private JTextField v2Field = new JTextField(4);
    private JButton addButton = new JButton("Add a shape");
    private JButton showAllButton = new JButton("Show all shapes");


    public void init(){
        setSize(600,350);
        setLocation(400,200);
        setTitle("MyShapes Demo");

        Container cp = getContentPane();
        JScrollPane scrollPane = new JScrollPane(display,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        cp.add(BorderLayout.CENTER, scrollPane);

        JPanel bottomPane = new JPanel();
        cp.add(BorderLayout.SOUTH, bottomPane);
        bottomPane.setLayout(new GridLayout(3,1));

        shapeButtons[0] = new JRadioButton("My Circle");
        shapeButtons[1] = new JRadioButton("My Rectangle");
        shapeButtons[2] = new JRadioButton("My Kite");

        JPanel radioPanel = new JPanel();
        ButtonGroup radioGroup = new ButtonGroup();
        for (int i = 0; i < shapeButtons.length; i++) {
            radioPanel.add(shapeButtons[i]);
            radioGroup.add(shapeButtons[i]);
        }

        bottomPane.add(radioPanel);

        JPanel valuePane = new JPanel();
        valuePane.add(new JLabel( "x: "));
        valuePane.add(xField);
        valuePane.add(new JLabel( "y: "));
        valuePane.add(yField);
        valuePane.add(new JLabel( "w(r)(d1): "));
        valuePane.add(v1Field);
        valuePane.add(new JLabel( "h(d2): "));
        valuePane.add(v2Field);
        bottomPane.add(valuePane);

        JPanel buttonPane = new JPanel();
        buttonPane.add(addButton);
        buttonPane.add(showAllButton);
        bottomPane.add(buttonPane);

        addButton.addActionListener(new AddButtonListener(this));
        showAllButton.addActionListener(new ShowAllButtonListener(this));

    }

    public JTextArea getDisplay(){
        return display;
    }

    public JRadioButton[] getShapeButtons() {
        return shapeButtons;
    }

    public JTextField getxField() {
        return xField;
    }

    public JTextField getyField() {
        return yField;
    }

    public JTextField getv1Field() {
        return v1Field;
    }

    public JTextField getv2Field() {
        return v2Field;
    }




}
