package com.example.wk02hw01;

import java.util.HashMap;

public class Utils {
    HashMap<String, String> users = new HashMap<>();

    public static HashMap<String, String> populate() {
        HashMap<String, String> temp = new HashMap<>();
        temp.put("alice", "otter123");
        temp.put("ben", "jerry000");
        temp.put("elon", "tusk");
        return temp;
    }

    public static int checkUser( String name, String pass) {
        HashMap<String, String> users = new HashMap<>();
        users = populate();

        for (String key: users.keySet()) {
            if (users.get(name).equals(pass)) {
                return 0;
            }
        }
        return -1;
    }


}
