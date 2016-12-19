package com.gst.framework.monitor;

import org.apache.log4j.Logger;
import com.gst.framework.MyRunnable;

public class ClientMonitor extends Monitor {
    private static final Logger log = Logger.getLogger(ClientMonitor.class);

    protected void restart(Object o) {
        MyRunnable m = (MyRunnable) o;
        if (m.getIdle() > m.getMaxIdle() || !(m.isAlive())) {
            try {
                log.info("\r\n--[ClientMonitor]start thread " + m.getName() + " | blocked time: " + m.getIdle() + " > "
                        + m.getMaxIdle() + " | thread status: " + m.isAlive());
                m.stop();

            } catch (Exception ex) {
                log.error("ClientMonitor.restart()", ex);
            }
        }

    }
}
