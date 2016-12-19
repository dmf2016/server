package com.gst.framework;

/**
 * 定义的抽象类，本系统所有线程类要继承本类来实现
 */
public abstract class MyRunnable implements Runnable
{
    protected Thread thread = null; // 当前线程
    private volatile long iLastTime = 0;
    private String sThreadName;

    static final int MAX_IDLE = 60 * 5; // 单位（秒）
    private int iMaxIdle = MAX_IDLE; // 最大的不活动时间

    protected volatile int iStop = 0; // 停止标志，为了避免多线程共用变量造成的错误，弃用boolean类型的变量

    public MyRunnable()
    {
        sThreadName = this.toString();
    }

    public MyRunnable(int i)
    {
        this();
        setMaxIdle(i);
    }

    public MyRunnable(String s)
    {
        sThreadName = s;
    }

    public MyRunnable(String s, int i)
    {
        this(s);
        setMaxIdle(i);
    }

    public void setMaxIdle(int i)
    {
        if (i > 0)
        {
            iMaxIdle = i;
        } else
        {
            iMaxIdle = MAX_IDLE;
        }
    }

    public void setName(String threadName)
    {
        sThreadName = threadName;
    }

    public String getName()
    {
        return sThreadName;
    }

    public int getMaxIdle()
    {
        return iMaxIdle;
    }

    public long getIdle()
    {
        long l = (System.currentTimeMillis() - iLastTime) / 1000;
        return l;
    }

    public void resetIdle()
    {
        iLastTime = System.currentTimeMillis();
    }

    /**
     * 启动线程
     */
    public boolean start()
    {
        thread = new Thread(this);
        thread.start();
        resetIdle();
        return true;
    }

    private Object stopLock = new Object();
    /**
     * 停止线程
     */
    // TODO 该方法使用了Thread废弃的stop方法！--Justin20140901
    public void stop()
    {
        synchronized(stopLock)
        {
            if (thread == null)
            {
                return;
            }
    
            if (iStop == Integer.MAX_VALUE)
            {
                iStop = 1;
            }
            iStop++;
            int i = 0;
            while (thread.isAlive() && i < 100)
            {
                try
                {
                    Thread.sleep(10);
                } catch (Exception e)
                {
                }
                i++;
            }
            if (thread.isAlive())
            {
                thread.stop();
            }
            thread = null;
            end();
        }
    }

    public boolean isStop(int iThreadId)
    {
        if (iThreadId == this.iStop)
        {
            return false;
        }
        return true;
    }

    /**
     * 线程停止后执行的用于清除变量/重新初试化参数
     */
    protected abstract void end();

    /**
     * 线程休眠一段时间
     * 
     * @param iTime
     *            时间长度，以毫秒为单位
     */
    public static final void sleep(int iTime)
    {
        if (iTime < 0)
        {
            return;
        }
        try
        {
            Thread.sleep(iTime);
        } catch (Exception e)
        {
        }
    }

    public Thread getThread()
    {
        return thread;
    }

    public boolean isAlive()
    {
        boolean b = false;
        if (thread != null)
        {
            b = thread.isAlive();
        }
        return b;
    }

}
