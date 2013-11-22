package edu.smu.engr.softeng.horus.gui;

/**
 * This interface is used when the user pressed the record button.
 * 
 * Create an implementation of this method and pass it to the video player
 * so it can send the appropriate message.
 */
public interface RecordButtonListener {
      
      /**
       * This method is called by the GUI for whenever the user presses the record button
       * 
       * @param isRecording true if the user wants to record, false if they want to stop recording
       */
      public void recordButtonPushed(boolean isRecording);
}

