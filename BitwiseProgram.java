import java.util.Scanner;
import javax.swing.JOptionPane;

public class BitwiseProgram {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int x=Integer.parseInt(JOptionPane.showInputDialog("Enter number1: "));
	int y=Integer.parseInt(JOptionPane.showInputDialog("Enter number2: "));

	
  int n=Integer.parseInt(JOptionPane.showInputDialog(" Enter 1 for '&' || "
  		+ " Enter 2 for '|' || "
  		+ " Enter 3 for '^' || "
  		+ " Enter 4 for '<<' || "
  		+ " Enter 5 for '>>' || "
  		+ " Enter 6 for '>>>' || "
  		+ " Enter 7 to EXIT "));
  while(true) {
	  if(n==1||n==2||n==3||n==4||n==5||n==6||n==7) {
		  break;
	  }
	  else {
		  JOptionPane.showMessageDialog(null, "Uh-oh!", "Enter valid number (1 to 7)", JOptionPane.ERROR_MESSAGE);
		  break;
	  }
  };
  while(true) {
	if(n==1) {
		int ans=x&y;
		JOptionPane.showMessageDialog(null, "The value is: "+ans);
		break;
	}
	else if(n==2){
		int ans=x|y;
		JOptionPane.showMessageDialog(null, "The value is: "+ans);
		break;
	}
	else if(n==3){
		int ans=x^y;
		JOptionPane.showMessageDialog(null, "The value is: "+ans);
		break;
	}
	else if(n==4){
		int ans=x<<y;
		JOptionPane.showMessageDialog(null, "The value is: "+ans);
		break;
	}
	else if(n==5){
		int ans=x>>y;
		JOptionPane.showMessageDialog(null, "The value is: "+ans);
		break;
	}
	else if(n==6){
		int ans=x>>>y;
		JOptionPane.showMessageDialog(null, "The value is: "+ans);
		break;
	}
	else if(n==7) {
		break;
	}}
	

}}
