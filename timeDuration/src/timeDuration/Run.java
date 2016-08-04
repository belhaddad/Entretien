package timeDuration;

import javax.management.BadAttributeValueExpException;

public class Run {

	public Run() {

	}

	public static void main(String[] args) throws BadAttributeValueExpException {
		TimeDuration time = new TimeDuration(65);
		System.out.println(time);

	}

}
