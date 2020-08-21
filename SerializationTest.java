/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws Exception{
        Serialization student1 = new Serialization(1234, "Kamal Thapa", "ISE", "thpkml@gmail.com", 07234211345);
        Serialization student2 = new Serialization(1234, "Kamal Thapa", "ISE", "thpkml@gmail.com", 07234211345);
        Serialization student3 = new Serialization(1234, "Kamal Thapa", "ISE", "thpkml@gmail.com", 07234211345);
        
        FileOutputStream fout1 = new FileOutputStream("file1.txt");
        FileOutputStream fout2 = new FileOutputStream("file2.txt");
        FileOutputStream fout3 = new FileOutputStream("file3.txt");
        
        ObjectOutputStream out1 = new ObjectOutputStream(fout1);
        ObjectOutputStream out2 = new ObjectOutputStream(fout2);
        ObjectOutputStream out3 = new ObjectOutputStream(fout3);
        
        out1.writeObject(student1);
        out2.writeObject(student2);
        out3.writeObject(student3);
        
        out1.flush();
        out2.flush();
        out3.flush();
        
        System.out.println("Flushed Successfully !");
    }
}
