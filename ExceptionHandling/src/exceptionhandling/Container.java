/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author Mark
 */
public class Container implements Comparable<Container>{
        private String UUID;
        private String Short_Name;
        private String Long_Name;

    public Container() {
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public void setShort_Name(String Short_Name) {
        this.Short_Name = Short_Name;
    }

    public void setLong_Name(String Long_Name) {
        this.Long_Name = Long_Name;
    }

    public String getUUID() {
        return UUID;
    }

    public String getShort_Name() {
        return Short_Name;
    }

    public String getLong_Name() {
        return Long_Name;
    }

    public final int compareTo(Container c){
        return Short_Name.compareToIgnoreCase(c.Short_Name);
    }

    @Override
    public String toString() {
     return "\nid is: "+UUID+"\nshort name: "+Short_Name+"\nLong name is: "+Long_Name;
    }
    
}

