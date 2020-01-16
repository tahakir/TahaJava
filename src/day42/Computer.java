package day42;

public class Computer {

    private String brand;
    private int ram; //1-128
    private int price; //not less than $20


    public void runProgram(){

        System.out.println(this.brand+" is running program with the ram size of "+ram);
    }

    public void calculate(){

        System.out.println(brand + " is calculating");

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {

        return ram;
    }

    public void setRam(int ram) {
        if (ram >= 1 && ram <= 128) {
            this.ram = ram;
        }
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 20) {
            this.price = price;
        }else{
            System.out.println("Invalid Price");
        }
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
