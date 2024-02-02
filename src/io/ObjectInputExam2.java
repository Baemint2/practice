package io;

import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputExam2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/tmp/userlist.dat"));
        ArrayList<User> list = (ArrayList)in.readObject();
                in.close();
        for(User lists : list) {
            System.out.println(lists);
        }
    }
}
