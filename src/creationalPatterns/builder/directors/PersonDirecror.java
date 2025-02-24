package creationalPatterns.builder.directors;

import creationalPatterns.builder.PersonBuilder;

public class PersonDirecror {
    public PersonBuilder bogatt(PersonBuilder personBuilder){
        return personBuilder.email(null).name(null);
    }
}
