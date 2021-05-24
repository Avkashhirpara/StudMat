package TempTest;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        char c = 'B';
        System.out.println(c);
        float f = 1;
        System.out.println(f);
        byte b =1 ;
        System.out.println(b);


    }
}


class temp {
    public static void main(String[] args) {
        List<student> list = new ArrayList<>();
    }
}

class student{
    int id ;
    String name ;
    String address ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
