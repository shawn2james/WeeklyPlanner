package manageJson;

import java.io.Serializable;

public class Country implements Serializable{
    public String name;
    public Country(String name){
        this.name = name;
    }
}