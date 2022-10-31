/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.interfaces.doce092022;

/**
 *
 * @author enriq
 */
public class cmitem {
    private String brand;
    private String name;
    private String doors;
    private String speed;
    private String year;
    private String image1;
    private String image2;

    private String description;

    public cmitem(String name, String brand, String doors, String speed, String year, String description, String image1, String image2) {
        this.brand = brand;
        this.name = name;
        this.doors = doors;
        this.speed = speed;
        this.year = year;
        this.image1 = image1;
        this.image2 = image2;
        this.description = description;
    }


    
    @Override
    public String toString()
    {
        return name;
    }

    public String getImage1() {
        return image1;
    }

    public String getImage2() {
        return image2;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getDoors() {
        return doors;
    }

    public String getSpeed() {
        return speed;
    }

    public String getYear() {
        return year;
    }


    public String getDescription() {
        return description;
    }
    
  
    
}

