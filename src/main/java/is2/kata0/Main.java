package is2.kata0;

import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args)
    {
	    Person p = new Person("Jose Antonio", LocalDate.of(1980, 1, 1));


	    System.out.println(p.getName() + " tiene " + p.getAge() + " aniversarios de vida");
    }
}
