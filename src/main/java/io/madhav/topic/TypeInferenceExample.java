package io.madhav.topic;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringLengthLambda mylambda=s->s.length();	
		System.out.println(mylambda.getLength("jellll"));
	}

}

interface StringLengthLambda{
	int getLength(String s);
}
