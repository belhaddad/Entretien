package timeDuration;

import javax.management.BadAttributeValueExpException;

public class TimeDuration {
	int seconds;

	// Constructeur avec parametres
	public TimeDuration(int seconds) throws BadAttributeValueExpException {
		super();

		try {
			if (this.seconds >= 0) {
				this.seconds = seconds;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// getter
	public int getSeconds() {
		return seconds;
	}

	// methode toString
	@Override
	public String toString() {
		return "TimeDuration :" + (int) (seconds / 3600) + " h " + (int) ((seconds - seconds / 3600) / 60) + " m "
				+ (int) ((seconds - (seconds - (int) ((seconds - seconds / 3600) / 60)))) + "s";
	}

	// setter
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

}
