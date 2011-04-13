package com.hz.yk.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReadHtml extends AbstractRead {
    private URLConnection conn;
    private BufferedReader in;
    
    public ReadHtml() {
    }
    public ReadHtml(String s) {
        resource = s;
    }

    public boolean open() {
        try {
            URL url = new URL(resource);
            conn = url.openConnection();
            in = new BufferedReader (
                            new InputStreamReader(conn.getInputStream()));
        } catch (MalformedURLException e) {
            System.out.println("Uable to connect URL:" + resource);
            return false;
        } catch (IOException e) {
            System.out.println("IOExeption when connecting to URL" + resource);
            return false;
        }
        return true;
    }
    protected void readContent() {
        try {
            if(in != null) {
                String str;
                while((str = in.readLine()) != null) {
                     System.out.println(str);  
                }
            }
        } catch(IOException e) {
            System.out.println("Read file error !");
        }
    }
    protected void close() {
        if(in != null) {
            try {
                in.close();
            } catch(IOException e) {
                System.out.println("IO error !");
            }
        }
    }
    
}