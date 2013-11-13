package edu.smu.engr.softeng.horus.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Constants {

      //Actions for events
      public static final String ACTION_LOGIN = "LOGIN";
      public static final String ACTION_OPEN_VIDEO_STREAM = "OPEN_VIDEO_STREAM";
      public static final String ACTION_OPEN_AUDIO_STREAM = "OPEN_AUDIO_STREAM";
      public static final String ACTION_OPEN_COMBINED_STREAM = "OPEN_COMBINED_STREAM";

      /**
       * Encapsulates the way of making message popups
       * 
       * @param parentFrame
       * @param title
       * @param descritpion
       * @param messageType
       */
      public static void showPopup(JFrame parentFrame, String title, String descritpion, int messageType) {
            //Default error message popup
            JOptionPane.showMessageDialog(parentFrame, descritpion, title, messageType);
      }
}
