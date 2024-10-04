public class TestCirle{
   public static void main(String[] args){
   Circle a = new Circle(0);
   Circle b = new Circle(0);
   Circle c = new Circle(0);
   a.setRadius(3);
   b.setRadius(20);
   c.setRadius(23);
   System.out.println("Radius of the first cirlce: "+a.getRadius());
   System.out.println("Diameter of the first cirlce: "+a.getDiameter());
   System.out.println("Area of the first cirlce: "+a.getArea());
   System.out.println();
   System.out.println("Radius of the second cirlce: "+b.getRadius());
   System.out.println("Diameter of the second cirlce: "+b.getDiameter());
   System.out.println("Area of the second cirlce: "+b.getArea());
   System.out.println();
   System.out.println("Radius of the third cirlce: "+c.getRadius());
   System.out.println("Diameter of the third cirlce: "+c.getDiameter());
   System.out.println("Area of the third cirlce: "+c.getArea());

    
   
   }
}

 class Circle{
   double rad;
   double dia;
   double area;
   
   Circle(double rad){
   this.rad = rad;
   dia = rad*2;
   area = 3.14*(rad*rad);
   }
   
   public void setRadius(double rad){
      this.rad = rad;
      dia=rad*2;
      area = 3.14*(rad*rad);
   }
   
   public double getRadius(){
    return rad;
   }
   
    public double getDiameter(){
     return dia;
   }
   
   public double getArea(){
      return area;
   }

}
