package com.gst.framework.monitor;

import java.util.Enumeration;
import java.util.Vector;
import org.apache.log4j.Logger;
import com.gst.framework.MyRunnable;

public abstract class Monitor extends MyRunnable {
    private static final Logger log = Logger.getLogger(Monitor.class);

    public Vector monitors = new Vector();

    public void addRunnable(Object monitor) {
        monitors.add(monitor);
    }

    public void removeRunnable(Object monitor) {
        monitors.remove(monitor);
    }

    public void run() {
        Object o;
        int iTheadId = iStop;
        while (!isStop(iTheadId)) {
            try {
                Enumeration enu = monitors.elements();
                while (enu.hasMoreElements()) {
                    resetIdle();
                    if ((o = (Object) enu.nextElement()) == null) {
                        monitors.remove(o);
                        continue;
                    }
                    restart(o);
                }
            } catch (Exception ex) {
                log.error("Monitor.run()", ex);
            }
            sleep(100);
        }
    }

    protected void end() {
    }

    protected abstract void restart(Object o);
}
