package generics;

public class AlreadyCarryingException extends Exception {
	public static final String MESSAGE = "Collector is already carrying something";
	public AlreadyCarryingException () {
		super(MESSAGE);
	}
}
