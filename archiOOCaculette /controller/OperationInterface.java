package controller;

import errors.UndefinedOperation;

interface OperationInterface {
	
	double doOperation(String input, double x, double y) throws UndefinedOperation;
	
}
