package com.queue.priorityBlockingQueue;

import java.util.Date;

public class JOBVO implements Comparable {
    private String jobID;
    private Date lastDate;

    public JOBVO(String jobID, Date lastDate) {
        super();
        this.jobID = jobID;
        this.lastDate = lastDate;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    @Override
    public String toString() {
        return "JOBBean [jobID=" + jobID + ", lastDate=" + lastDate + "]";
    }

    public int compareTo(JOBVO o) {

        Date date = new Date();

        long thisRemainTime = this.lastDate.getTime() - date.getTime();

        long oRemainTime = o.getLastDate().getTime() - date.getTime();

        if (thisRemainTime > oRemainTime) {
            return 1;
        } else if (thisRemainTime) {
            return -1;
        } else
            return 0;

    }
    /*
        @Override
        public int compareTo(Object o) {
            // TODO Auto-generated method stub
            return 0;
        }*/
}
