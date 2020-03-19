package controller;

import errors.UndefinedOperation;

public class Operation implements OperationInterface {

	@Override
	public double doOperation(String input, double x, double y) throws UndefinedOperation {
		double result = -1;

		switch (input) {
		case "+":
			result = x + y;
			break;
		case "-":
			result = x - y;
			break;
		default:
			throw new UndefinedOperation();
		}
		return result;
	}

}
