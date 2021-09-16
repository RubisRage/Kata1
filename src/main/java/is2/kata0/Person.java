package is2.kata0;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person {
	private final String name;
    	private final Calendar birthdate;	

	public Person(String name, Calendar birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	String getName() {
		return name;
	}

	int getAge() {
		Calendar now = GregorianCalendar.getInstance();
		final long MILLISECONDS_PER_YEAR = (long) 365.25f*24*60*60*1000;

		return (int) ((now.getTimeInMillis()-birthdate.getTimeInMillis())
			/ MILLISECONDS_PER_YEAR);
	}
}
