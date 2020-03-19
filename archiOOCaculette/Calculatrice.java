import controller.*;
import errors.UndefinedOperation;
import view.*;

public class Calculatrice {

	public static void main(String[] args) {
		View viewCalculate = new SimpleView();
		viewCalculate.startView();
		try {
			viewCalculate.afficher(viewCalculate.getX(), viewCalculate.getY(),viewCalculate.getOp());
			
		} catch (UndefinedOperation e) {
			System.out.println("L'opération n'est pas encore implémentée");
		}
	}
}