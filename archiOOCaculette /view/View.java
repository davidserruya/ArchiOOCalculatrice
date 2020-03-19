package view;

import errors.UndefinedOperation;

public abstract class View {

	protected double x;
	protected double y;
	protected String op;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getOp() {
		
		return op;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setOp(String op) {
		this.op = op;
	}
	
	public abstract void startView();

	public abstract String afficher(double x, double y, String op)throws UndefinedOperation ;
}
