package org.example;

class Animal1 {

        void bark() {
            System.out.println("Woof-Woof");
        }
    String firstName;
    String secondName;
    int age;
    int roomNumber;

    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }

    public String name;
//    public int age;

    public int getAge() {
        //complete Getter
        return age;

    }
    public void setAge(int age) {
        //complete Setter
        if(age < 0){
            System.out.println("Invalid age");
            age = 0;
        }
        this.age = age;
    }
    public int minFunc(int n1, int n2){
        int min = 0;
        if (n1>n2)
            min = n2;
        else
            min = n1;

        return min;
    }

}
