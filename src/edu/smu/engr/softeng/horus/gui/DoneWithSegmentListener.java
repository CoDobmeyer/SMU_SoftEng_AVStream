package edu.smu.engr.softeng.horus.gui;

import java.io.File;

/**
 * This interface is used by the GUI to let the stream know when it is done
 * with a particular segment of video. Typically this is after the segment
 * has completed playing on the player.
 */
public interface DoneWithSegmentListener {
      
      /**
       * This method will be called when the GUI is done with a particular video file
       * 
       * @param videoSegment The file that GUI has finished playing
       */
      public void doneWithSegment(File videoSegment);
}
