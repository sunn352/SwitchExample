import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your choice");
		char choice = input.next().charAt(0);
		switch(choice) {
		case 'A':
		case 'a':{
			System.out.println("Ada");
			break;
		}
		case 'C':
		case 'c':{
			System.out.println("c language");
			break;
		}
		case 'F':
		case 'f':{
			System.out.println("fortan");
			break;
		}
		case 'P':
		case 'p':{
			System.out.println("python");
			break;
		}
		case 'J':
		case 'j':{
			System.out.println("java");
			break;
		}
		case 'V':
		case 'v':{
			System.out.println("visual c++");
			break;
		}
		default:{
			System.out.println("invalid input");
			break;
		}
		}
		input.close();
	}
	

}
