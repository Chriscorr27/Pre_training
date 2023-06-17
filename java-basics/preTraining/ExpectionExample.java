package preTraining;

public class ExpectionExample {

	public ExpectionExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divide(5,0);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		try {
			divideNum(5,0);
		}catch(ArithmeticException e){
			System.out.println(e);
		}

	}
	
	public static int divide(int a,int b) {
		if(b==0) {
			throw new ArithmeticException("\nNumber is zero, cannot calculate divide");  
		}
		return a/b;
	}
	
	public static int divideNum(int a, int b) throws ArithmeticException {  
        int div = a / b;  
        return div;  
    }  

}
