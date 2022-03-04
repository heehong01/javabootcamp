package com.heejinhong.InClass;

public class PredicateExample {
    /*USING FOR LOOP _ LEAST DESIARBLE
    public static List<Person> findPeopleByName(List<Person> people, String name){
        List<Person> result = new ArrayList<Person>();
        for(Person p: people){
            if*p.getName().equals(name)
        }
    }*/

    /* USING PREDICATE FOR SPECIFIC TYPE
    public static List<Person>findPeople(List<Person> people, Predicate<Person> aPredicate){
        List<Person> result = new ArrayList<Person>();
        for(Person p: people){
            if(aPredicate.test(p)){
                result.add(p);
            }
        }
        return result;
   }
   peopleResul
     */
}
