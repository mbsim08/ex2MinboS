package controller;

import model.MyShape;
import view.MyWindow;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<MyShape> shapes = new ArrayList();

    public static void main(String args[]) {


        MyWindow win = new MyWindow();
        win.init();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }

}
