package controller;

import model.MyCircle;
import model.MyRectangle;
import model.MyKite;
import model.MyShape;
import view.MyWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonListener implements ActionListener{

    private MyWindow win;
    private JTextArea display;
    private JRadioButton[] shapesButtons;
    private  JTextField xField;
    private  JTextField yField;
    private  JTextField v1Field;
    private  JTextField v2Field;


    public AddButtonListener(MyWindow win) {
        this.win = win;
        display = win.getDisplay();
        shapesButtons = win.getShapeButtons();
        xField = win. getxField();
        yField = win. getyField();
        v1Field = win. getv1Field();
        v2Field = win. getv2Field();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        MyShape shape = null;

        if(shapesButtons[0].isSelected()) { // Circle
            String xVal = xField.getText();
            String yVal = yField.getText();
            String rVal = v1Field.getText();
            float x ,y;
            double r;
            try {
                x = Float.parseFloat(xVal);
                y = Float.parseFloat(yVal);
                r = Double.parseDouble(rVal);
            }
            catch(NumberFormatException ex) {
                display.setText("Wrong number format: x, y, r");
                return;
            }

            shape = new MyCircle(x,y,r);
        }

        else if(shapesButtons[1].isSelected()) { //Rectangle
            String xVal = xField.getText();
            String yVal = yField.getText();
            String wVal = v1Field.getText();
            String hVal = v2Field.getText();

            float x ,y;
            double w,h;
            try {
                x = Float.parseFloat(xVal);
                y = Float.parseFloat(yVal);
                w = Double.parseDouble(wVal);
                h = Double.parseDouble(hVal);
            }
            catch(NumberFormatException ex) {
                display.setText("Wrong number format: x, y, w, h");
                return;
            }

            shape = new MyRectangle(x,y,w,h);
        }

        else if(shapesButtons[2].isSelected()) { //Kite
            String xVal = xField.getText();
            String yVal = yField.getText();
            String d1Val = v1Field.getText();
            String d2Val = v2Field.getText();

            float x ,y;
            double d1 ,d2;
            try {
                x = Float.parseFloat(xVal);
                y = Float.parseFloat(yVal);
                d1 = Double.parseDouble(d1Val);
                d2 = Double.parseDouble(d2Val);
            }
            catch(NumberFormatException ex) {
                display.setText("Wrong number format: x, y, w, h");
                return;
            }

            shape = new MyKite(x, y,d1, d2);
        }

        if(shape!=null) {
            Main.shapes.add(shape);

            String m = display.getText();
            String newMessage = String.format("%s\nAdded: %s", m, shape);
            display.setText(newMessage);
        }
    }

}
