package is2.kata0;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    
    public static void main(String[] args)
    {
	    Calendar birthdate = GregorianCalendar.getInstance();
	    birthdate.set(1980, 1, 1);

	    Person p = new Person("Jose Antonio", birthdate);


	    System.out.println(p.getName() + " tiene " + p.getAge() + " aniversarios de vida");
    }
}
