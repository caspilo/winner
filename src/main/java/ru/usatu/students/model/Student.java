package ru.usatu.students.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
   @XmlElement
   private int id;
   @XmlElement
   private String name;

    public Student(){
    }

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){return id;}
    public String getName(){return name;}

    public void setName(String name){this.name = name;}
    public void setId(int id){this.id = id;}
}
