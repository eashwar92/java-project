public class Rectangulator {
   public static void main(String[]args)    {
     int length = Integer.parseInt(args[]);
     int width = Integer.paerseInt(args[]);


      Rectangle myRectangle = new Rectangle(length,width);
  
string output = String.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());

   System.out.println(output);
  }

}
