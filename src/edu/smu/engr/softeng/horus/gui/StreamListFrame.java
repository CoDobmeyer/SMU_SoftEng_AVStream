package edu.smu.engr.softeng.horus.gui;

import java.awt.ComponentOrientation;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class StreamListFrame extends JFrame {

      public StreamListFrame(ActionListener actionListener) {
            super("Stream List");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300, 600);
            setLayout(new GridBagLayout());
            setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            //Generic constraints variable
            GridBagConstraints c = new GridBagConstraints();
      }     
}
