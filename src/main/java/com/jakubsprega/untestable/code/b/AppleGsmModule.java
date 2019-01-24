package com.jakubsprega.untestable.code.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jakubsprega.untestable.code.api.Carrier;
import com.jakubsprega.untestable.code.api.GsmModule;

public class AppleGsmModule implements GsmModule {
	private static final Logger LOG = LoggerFactory.getLogger(AppleGsmModule.class);
    private Carrier carrier;

    public void connect() {
        LOG.info(
            String.format("Connecting to %s", carrier.getName())
        );

        LOG.info("Connected");
    }

    public void disconnect() {
        LOG.info(
            String.format("Disconnecting from %s", carrier.getName())
        );

        LOG.info("Disconnected");
    }
    
    public void sendSMS(String to, String message) {
        LOG.info(
            String.format("Sending message to: %s content: %s", to, message)
        );
        LOG.info("Message sent");
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }
}
