package javahomework7;

/* 17. Write a class with the name Wall. The class needs two fields(instance variables) with name width
and height of type double
 */

public class Pro17_Wall_Area {

    double height;
    double width;
    double area;

    public Pro17_Wall_Area(double height, double width) {
        this.height = height;
        this.width = width;
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //If the parameter is less than 0 it needs to set the width field value to 0.
    public void setWidth(double width) {
        this.width = width;
        if (width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getArea() {
        return  this.height * this.width;
    }

    public static void main(String[] args) {
        Pro17_Wall_Area wall = new Pro17_Wall_Area(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

}
