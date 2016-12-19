package com.queue.priorityBlockingQueue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileUtil {
    private String fileName;
    private PrintWriter pw;

    public FileUtil(String fileName) {
        this.fileName = fileName;
    }

    public void init() {
        try {
            pw = new PrintWriter(new File(this.fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void destory() {
        if (pw != null) {
            pw.close();
        }
    }

    public void write(String context) {
        pw.write(context + "\n");
    }
}
