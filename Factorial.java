// My Factorial Assessment

public class Factorial(){
	public static void main(String av[]){
		System.out.println("Factorial "+simpleFactorial(7) );
	}
	public static int simpleFactorial(int n){
        	int result = 1;
       		for(int i = 1; i <= n; i++){
            		result *= i;
        	}
        return result;
    }


}


