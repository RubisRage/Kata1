package is2.kata0;

import java.util.Date;

public class Main {
    
    public static void main(String[] args)
    {
	    Person p = new Person("Jose Antonio", new Date(80, 0, 1));
	    System.out.println(p.getName() + " tiene " + p.getAge() + " aniversarios de vida");
    }
}
