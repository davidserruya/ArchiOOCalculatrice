package view;

import java.util.Scanner;

import controller.Operation;
import errors.UndefinedOperation;

public class SimpleView extends View {
	Scanner sc = new Scanner(System.in);

	@Override
	public void startView() {
		System.out.println("Premier nombre: ");
		x = sc.nextDouble();
		setX(x);
		System.out.println("Second nombre : ");
		y = sc.nextDouble();
		setY(y);
		System.out.println("Opération :");
		op = sc.next();
		setOp(op);
	}
	
	@Override
	public  String afficher(double x, double y, String op) throws UndefinedOperation {
		Operation op1 = new Operation();
		
		return "le résultat est:"+ op1.doOperation(op,x,y);
	}
}
