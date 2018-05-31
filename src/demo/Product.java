/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author NAM TRUONG
 */
public class Product {
    
    private String name;
    private String image;
    private String price;

    public Product() {
    }

    public Product(String name, String image, String price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", image=" + image + ", price=" + price + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
