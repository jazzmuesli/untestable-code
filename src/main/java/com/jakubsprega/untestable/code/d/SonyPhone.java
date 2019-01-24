package com.jakubsprega.untestable.code.d;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author jakubsprega
 */
public class SonyPhone {
	private static final Logger LOG = LoggerFactory.getLogger(SonyPhone.class);
    public static boolean SERVICE_MODE = false;
    
    public void call(OutgoingCall outgoingCall){
        LOG.info("Calling...");
        PhoneSettings.getInstance().addRecentCall(outgoingCall);
    }
    
    public void answer(IncomingCall call){
        LOG.info("Answering the phone...");
        PhoneSettings.getInstance().addRecentCall(call);
    }
    
    public List<Call> getRecentCalls(){
        return PhoneSettings.getInstance().getRecentCalls();
    }
}
