/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.googlecode.javacv.OpenCVFrameGrabber;

/**
 *
 * @author Airagale
 */
public class AVController {
    
	private OpenCVFrameGrabber grabber = null;
	private Object micObject = null;
	
    /**
     * AaronE
     * @param recVideo
     * @param recAudio
     * Initializes video and audio
     */
    public void execute(boolean recVideo, boolean recAudio)
    {
        if(recVideo)
        	initializeCamera();
        
        if(recAudio)
        	initializeMic();
        
        startCapture();
    }
    
    private void startCapture() {
		// TODO Auto-generated method stub
		
	}

	private void initializeMic() {

    	//method for audio team to initialize the microphone
		
	}

	private void initializeCamera() {
    	grabber = new OpenCVFrameGrabber(0);
	}

	private ByteArrayOutputStream EncryptPayload(ByteArrayInputStream data)
    {
        return null;
    }
    
    private void packageAV(ByteArrayInputStream data)
    {
        
    }
}
