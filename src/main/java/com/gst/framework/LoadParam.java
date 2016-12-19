package com.gst.framework;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Hashtable;
import java.util.Vector;

/**
 * 加载系统运行参数、异常信息参数
 * @author bladee 2008-4-13
 */
public class LoadParam {
    // 系统参数存储对象
    public static Hashtable htSysParam = new Hashtable();

    /**存放线程***/
    public static Vector vector = new Vector();

    public static synchronized Connection getConnection() {
        try {
            Class.forName(LoadParam.getConfig("dbDirver"));
            return DriverManager.getConnection(LoadParam.getConfig("dbUrl"), LoadParam.getConfig("dbUserName"),
                    LoadParam.getConfig("dbPassword"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("无法创建数据库连接");
        }
        return null;
    }

    /**
     * 系统参数信息加载
     * @throws IOException
     * @throws DocumentException
     */
    /*    public void load() throws IOException, DocumentException
        {
            SAXReader reader = new SAXReader();
            System.out.println(LoadParam.class.getResource("/config/config.xml"));
            InputStream in = LoadParam.class
                    .getResourceAsStream("/config/config.xml");
            Document document = reader.read(in);
            // 获取文档的根元素
            Element root = document.getRootElement();
            for (Iterator i_pe = root.elementIterator(); i_pe.hasNext();)
            {
                Element e_pe = (Element) i_pe.next();
                // 获取当前元素的名字
                String elementName = e_pe.getName().trim();
                String elementValue = e_pe.getText().trim();
                LoadParam.putConfig(elementName, elementValue);
            }
        }*/

    public static void putConfig(String key, String value) {
        htSysParam.put(key, value);
    }

    public static String getConfig(String key) {
        return (String) htSysParam.get(key);
    }
}
