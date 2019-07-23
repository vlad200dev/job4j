package ru.job4j.Inheritance;

public class Doctor extends Profession {

    private int experienceInField;
    private int quantityOfPatiens;

    public Doctor(int experienceInField, int quantityOfPatiens){
        this.experienceInField = experienceInField;
        this.quantityOfPatiens = quantityOfPatiens;
    }
    public int getExperience(){
        return this.experienceInField;
    }
    public int getQuantityOfPatiens(){
        return this.quantityOfPatiens;
    }

}
