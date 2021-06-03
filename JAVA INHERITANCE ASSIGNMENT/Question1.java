
 class Parent {

	 void pmethod(){
		    System.out.println("This is parent class");
		  }
 }
 

	class Child extends Parent{
		   void cmethod(){
		    System.out.println("This is child class");
		  }
	
		   
	
   public static void main(String[] args){
		Parent a = new Parent();
		Child b = new Child();
		a.pmethod();
		b.cmethod();
		b.pmethod();
		  }
		}									
		


