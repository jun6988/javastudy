package chapter01;

public class Ex16Switch {

	public static void main(String[] args) {
		char grade = ' ';
		int score = 76;
		
	switch(score / 10) {
		case 10:
		case 9 : {
			grade = 'A';
			break;
		} case 8: {
			grade = 'B';
			break;
		} case 7: {
			grade = 'C';
			break;
		} case 6: {
			grade = 'D';
			break;
		} default: {
			grade = 'F';
			break;
		}
	

		}	
	}	
}