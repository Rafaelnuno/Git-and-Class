package pt.iade.unimanage.models;

import java.util.ArrayList;
import java.time.LocalDate;

public class Teacher extends Person {
    private static int nextNumber=0;
    private int mecNumber;
    private ArrayList<Unit> units;

public Teacher(String name, char gender, String email, LocalDate birthDay){
        super(name, gender, birthDay);
        this.mecNumber = mecNumber;
        this.email = email;
        nextNumber++;
        units = new ArrayList<>();
    }

public int getMecNumber(){return mecNumber;}
    
public ArrayList<Unit> getUnits(){return units;}

@Override
public String getReference(){return "T<"+mecNumber+">";}

@Override
public String getName() {
    
    return null;
}

@Override
public String getEmail() {
    
    return null;
}

}
