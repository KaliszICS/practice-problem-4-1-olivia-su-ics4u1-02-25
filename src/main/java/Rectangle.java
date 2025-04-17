public class Rectangle{

    private double length;
    private double width; 


    public Rectangle(double l, double w){

    this.length = l;
    this.width = w;

    }    

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public double area(){
        return this.length * this.width;

    }

    public double perimeter(){
        if (this.length > 0 && this.width > 0){
            return 2* (this.length + this.width);
        }else{
            return 0.0;
        }

    }

}