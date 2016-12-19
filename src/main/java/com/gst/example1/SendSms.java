package com.gst.example1;

import org.apache.log4j.Logger;
import com.gst.framework.MyRunnable;

public class SendSms extends MyRunnable {
    private static Logger LOG = Logger.getLogger(SendSms.class);

    public void run() {
        resetIdle();
        int iTheadId = iStop;
        while (!isStop(iTheadId)) {
            resetIdle();
            LOG.info("--------SendSms--------");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                LOG.error("SendSms[run]:", e);
            }
        }// end while

    } // end run

    @Override
    protected void end() {
        // TODO Auto-generated method stub
    }

}
