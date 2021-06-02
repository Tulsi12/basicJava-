package data;

public  class Data {
	int sum(int a, int b) {
     //		int total=a+b;
      //		return total; 
		return a+b;	
	}
	
	int sub (int c, int d) {
		return c-d;
	}
	
	int mult(int x, int y) {
		return x*y;
	}
	
	int div (int e, int f) {
		return e/f;
	}
	
public void swap (int a, int b) {
	System.out.println("before swapping: ");
	System.out.println("value of a is: "+a);
	System.out.println("value of b is: "+b);
	System.out.println("after swapping: ");	
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("value of a is: "+a);
	System.out.println("value of b is: "+b);		
}

public boolean checkPrime(int num1){
    for (int i=2; i<num1;i++){
        if (num1% i==0){
            System.out.println("the number is not prime");
            return false;
        }
    }
    System.out.println("the number is  prime");
    return true;
}

	
	public static void main(String [] arg ) {
		
		Data algo = new Data();
		int a=5; int b=6 ;
		int total=algo.sum(a, b);
		System.out.println(total);
		
		int c=20; int d=10;
		int tot=algo.sub(c, d);
		System.out.println(tot);
		
		int x=2; int y=10;
		int mul= algo.mult(x, y);
		System.out.println(mul);
		
		int e=10; int f=5;
		int divd = algo.div(e, f);
		System.out.println(divd);

		algo.swap(10, 20);
		algo.checkPrime(3);
		
	}
}
