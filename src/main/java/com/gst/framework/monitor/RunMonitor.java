package com.gst.framework.monitor;

/**
 * <p> 功能描述：监控管理线程</p>
 * <p>@author: dmf</p>
 * <p>@time: 2011上午11:04:36</p>
 * <p>@version: </p>
 */

import org.apache.log4j.Logger;
import com.gst.framework.MyRunnable;

public class RunMonitor extends Monitor {
    private static final Logger log = Logger.getLogger(RunMonitor.class);

    protected void restart(Object o) {
        MyRunnable m = (MyRunnable) o;
        if (m.getIdle() > m.getMaxIdle() || !(m.isAlive())) {
            try {
                log.info("\r\n--[RunMonitor]start thread " + m.getName() + " | " + m.getIdle() + " > " + m.getMaxIdle()
                        + " | " + m.isAlive());
                m.stop();
                m.start();
            } catch (Exception ex) {
                log.error("RunMonitor.restart()", ex);
            }
        }
    }

}
