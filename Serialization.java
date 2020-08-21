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

public class Serialization implements Serializable {
    int id;
    String name;
    String school;
    String email;
    int phone;
    
    public Serialization(int id, String name, String school, String email, int phone){
        this.id = id;
        this.name = name;
        this.school = school;
        this.email = email;
        this.phone = phone;
    }
}
