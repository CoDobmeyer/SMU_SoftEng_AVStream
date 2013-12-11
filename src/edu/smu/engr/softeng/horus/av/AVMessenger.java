/**
 * 11/14/2013- 47 Lines of Code
 */
package edu.smu.engr.softeng.horus.av;

import java.io.ByteArrayOutputStream;

import edu.smu.engr.softeng.horus.cominfra.Messages.*;

/**
 * AVMessenger
 * Storage for audio and video data. 
 * @author Video
 */
public class AVMessenger extends Message{
    
    ByteArrayOutputStream payload;
    
    /**
     * Constructor
     * @param No parameter values.
     */
    public AVMessenger(){
    	
    	//first parameter is typeId (determined by interface) - need to change to reflect what the actual interface number turns out to be
    	//second parameter is clientID (hardcode for now - current cominfra impl will cause problems with multiple clients)
    	super(1, 1); 
    	
    }
    
    /**
     * Constructor
     * @param payload: Data to be stored in AVMessenger for sending
     */
    public AVMessenger(ByteArrayOutputStream payload) {
    	//first parameter is typeId (determined by interface) - need to change to reflect what the actual interface number turns out to be
    	//second parameter is clientID (hardcode for now - current cominfra impl will cause problems with multiple clients)
    	super(1, 1);
    	
    	setPayload(payload);
    }
    
    /**
     * Setter method for protection of data for param payload.
     * @param payload: Data to be stored in AVMessenger
     * @return No return value.
     */
    public void setPayload(ByteArrayOutputStream payload) {
        this.payload = payload;
    }
    
    /**
     * Getter method for param payload that stores information to be sent.
     * @return param payload
     */
    public ByteArrayOutputStream getPayload() {
        return this.payload; 
    }
    
    
}
