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

public class SerializationDe {
   public static void main(String[] args) throws Exception{
       ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("file1.txt"));
       ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("file2.txt"));
       ObjectInputStream in3 = new ObjectInputStream(new FileInputStream("file3.txt"));
       
       Serialization student1 = (Serialization)in1.readObject();
       Serialization student2 = (Serialization)in2.readObject();
       Serialization student3 = (Serialization)in3.readObject();
       
       System.out.println(student1.id + " " + student1.name + " " + student1.email + 
       " "+ student1.phone);
       System.out.println(student2.id + " " + student2.name + " " + student2.email +
       " " + student2.phone);
       System.out.println(student3.id + " " + student3.name + " " + student3.email +
       " " + student3.phone);
       
       in1.close();
       in2.close();
       in3.close();
   } 
}
