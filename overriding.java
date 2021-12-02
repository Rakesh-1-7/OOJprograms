class Shape
{
    double x,y;
    
    double printArea(double x,double y)
    {
        return 0;
    }

}

class Triangle extends Shape
{

    double printArea(double x, double y)
    {
        return x * y * 0.5;
    }
}

class Rectangle extends Shape
{

    double printArea(double x, double y)
    {
        return x * y;
    }
}

class Circle extends Shape
{

    double printArea(double x, double y)
    {
        return 3.14*Math.pow(x,2);
    }
}

class overriding
{
    public static void main(String args[]) 
    {
        Shape r;
        Triangle a1 = new Triangle();    
        Rectangle a2 = new Rectangle();
        Circle a3 = new Circle();

        r = a1;
        System.out.println("Area of Triangle : " + r.printArea(10,20));
    
        r = a2;
        System.out.println("Area of Triangle : " + r.printArea(10,20));
    
        r = a3;
        System.out.println("Area of Triangle : " + r.printArea(10,1));
    }
}