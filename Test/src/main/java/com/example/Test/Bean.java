package com.example.Test;

import java.util.ArrayList;
import java.util.List;

public class Bean {
    public static List<Users> ExportUsers(){
        List<Users> list = new ArrayList<Users>();

        list.add(new Users("Mai Dac Viet","Malware Analyst"));
        list.add(new Users("Tran Tien Dung","Game Developer"));

        return list;
    }
}
