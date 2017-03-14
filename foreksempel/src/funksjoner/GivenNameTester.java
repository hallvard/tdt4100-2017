package funksjoner;

import java.util.function.Predicate;

public class GivenNameTester implements Predicate<Person> {

   private String name;

   public GivenNameTester(String name) {
      this.name = name;
   }

   @Override
   public boolean test(Person p) {
      return name.equals(p.getGivenName());
   }
}
