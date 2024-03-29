package ru.job4j.sort;

import java.util.Objects;

public class User implements Comparable<User>  {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {
        final int rsl = this.getAge()-o.getAge();
        return rsl !=0 ? rsl: o.getAge()-this.getAge();


//        if (this.age>o.age) return 1;
//        else if (this.age<o.age) return -1;
//        else return 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
