package com.studmat.progs.arrays;

public class ImmutableStudent {

    public final int rollNo;
    public final String name;
    public final String address;

    public ImmutableStudent(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }



    public String getAddress() {
        return address;
    }
    public ImmutableStudent changeName(String newName){
        return new ImmutableStudent(this.rollNo,newName,this.getAddress());
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ImmutableStudent obj = new ImmutableStudent(1,"a","address");
        obj = obj.changeName("NewName");
        System.out.println(obj);
    }
}
