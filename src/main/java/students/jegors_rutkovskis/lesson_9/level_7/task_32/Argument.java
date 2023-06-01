package students.jegors_rutkovskis.lesson_9.level_7.task_32;

class Argument extends MathOperation {

    private double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}
