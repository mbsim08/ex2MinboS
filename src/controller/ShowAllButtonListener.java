package controller;


import model.MyShape;
import view.MyWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowAllButtonListener implements ActionListener{

    private MyWindow win;
    private JTextArea display;

    public ShowAllButtonListener(MyWindow win) {
        this.win = win;
        display = win.getDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

  /*      String m = "";
        for (int i = 0 ; i < Main.shapes.size(); i++) {
            MyShape s = Main.shapes.get(i);
            m += "\n" + s;
        }
        */
        StringBuilder data = new StringBuilder();
        for(MyShape s: Main.shapes) {
            data.append(s);
            data.append('\n');
        }

        display.setText(data.toString());
    }
}
