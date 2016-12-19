package com.gst.example1;

import java.util.Vector;
import org.apache.log4j.Logger;
import com.gst.framework.LoadParam;
import com.gst.framework.monitor.RunMonitor;

public class StartProject {
    private static Logger log = Logger.getLogger(StartProject.class);

    public static void main(String[] args) {
        try {
            log.info("----系统启动数据加载----");
            Vector vector = new Vector();
            //启动线程管理
            RunMonitor runMon = new RunMonitor();
            runMon.start();
            //启动10个线程
            for (int i = 0; i < 5; i++) {
                //发送数据
                SendSms sms = new SendSms();
                vector.add(sms);//不合法短信队列 
            }
            //LoadParam.vector = vector;
            runMon.addRunnable(vector);
            log.info("---------系统启动成功-------");
        } catch (Exception e) {
            log.error("----系统启动失败----", e);
        }
    } // end main

}
