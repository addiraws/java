  // class point for the declaring the two point object
  
    public class point{
       private int x;
       private int y;
        public point(int a, int b)
        {
            x= a;
            y= b;

        }
      public  int getx(){return x;}
        public int gety(){return y;}
//calculate the distance
        public double distance(point other)
        {
            int dx=x-other.getx();
            int dy=y-other.gety();
            return Math.sqrt(dx*dx+dy*dy);
        }

    
// main program
    public static void main(String[] args){
    //two object for defining path and points are co-ordinates
        point p1= new point(3,9);
        point p2= new point(5,5);
        System.out.println(p1.distance(p2));

    }
}

