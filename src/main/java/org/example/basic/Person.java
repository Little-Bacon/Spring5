package org.example.basic;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
    private Integer id;
    private String name;

    private String[] email;
    private Properties p;

    public Properties getP() {
        return p;
    }

    public void setP(Properties p) {
        this.p = p;
    }

    public Map<String, String> getQqs() {
        return qqs;
    }

    public void setQqs(Map<String, String> qqs) {
        this.qqs = qqs;
    }

    private Map<String,String> qqs;

    public Set<String> getTels() {
        return tels;
    }

    public void setTels(Set<String> tels) {
        this.tels = tels;
    }

    private Set<String> tels;

    public String[] getEmail() {
        return email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(Map<String, String> qqs) {
        this.qqs = qqs;
        System.out.println("person");
    }

}
