package com.jakubsprega.untestable.code.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jakubsprega.untestable.code.api.GsmModule;

/**
 * Samsung GSM module
 *
 * @author jakubsprega
 */
public class SamsungGsmModule implements GsmModule {
	private static final Logger LOG = LoggerFactory.getLogger(SamsungGsmModule.class);

    public void connect() {
        boolean connected = true;
        LOG.info("Connecting");
        if (!connected) {
            throw new IllegalStateException("Could not connect to ...");
        }
    }

    public void disconnect() {
        LOG.info("Disconnecting");
    }

    public void sendSMS(String to, String message) {
        connect();
        LOG.info("Sending sms");
        disconnect();
    }
}
