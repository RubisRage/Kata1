package is2.kata0;

import java.util.Date;


public class Person {
	private final String name;
    	private final Date birthdate;	

	public Person(String name, Date birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return (int) ((new Date().getTime() - birthdate.getTime()) / 365*24*60*60*1000);
	}
}
