package FIT2099Clinic;

public class Person{
    String fullName;
    String address;
    Person(String name,String add){
        fullName=name;
        address=add;
    }
    void setFullName(String name){
        fullName=name;
    }
    void setAddress(String add){
        address=add;
    }
    String getName(){
        return fullName;
    }
    String getAddress(){
        return address;
    }
    public String toString(){
        return "Full Name = "+fullName+" and live in "+address;
    }
}