
class Rectangle {
	  int length;
	  int breadth;

	  public Rectangle(int l, int b){
	    length = l;
	    breadth = b;
	  }

 void area(){
	    System.out.println("Area = " + length*breadth + "sq units");
	  }

 void perimeter(){
	    System.out.println("Perimeter = " + 2*(length+breadth) + "units");
	  }
	}

class Square extends Rectangle{
	  int side;
	  public Square(int s){
	    super(s,s);
	  }
	  
 public static void main(String[] args) {
	    Rectangle r = new Rectangle(5,7);
	    r.area();
	    r.perimeter();

	    Square s = new Square(5);
	    s.area();
	    s.perimeter();

	   /* Square[] a = new Square[10];
	    int k = 5;
	    for(int i = 0;i<10;i++){
	      a[i] = new Square(k);
	      k++;
	    }

	    for(int i = 0;i<10;i++){
	      a[i].printArea();
	      a[i].printPerimeter();*/
	    }
	  }


