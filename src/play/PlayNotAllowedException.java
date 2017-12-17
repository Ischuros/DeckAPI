package play;

public class PlayNotAllowedException extends Exception {
	private static final long serialVersionUID = 1L;

	PlayNotAllowedException() {
	}

	@Override
	public String getMessage() {
		return "Play not allowed.";
	}
}
