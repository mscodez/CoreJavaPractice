class Lab230{
	public static void main(String args[]){
		System.out.println(Hello.a);
	}
}

class Hello{
	int a;


/*Lab230.java:3: error: non-static variable a cannot be referenced from a static context
                System.out.println(Hello.a);
                                        ^
1 error
*/