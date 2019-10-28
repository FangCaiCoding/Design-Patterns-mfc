package com.mfc.design.建造者模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 20:00
 */
public class Product_Car {

    private String colour;
    private String type;
    private int size;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product_Car{" +
                "colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
