package ru.progwards.java1.lessons.abstractnum;

public class Pyramid extends Figure3D {
    public Pyramid (Number segment){
        super(segment);

    }
    @Override
    public Number volume(){
       return segment.mul(segment).mul(segment).div(segment.newNumber(String.valueOf(3)));
    }

    @Override
    public String toString(){
        return String.valueOf(volume());
        }
}
