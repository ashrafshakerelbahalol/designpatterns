package creationalPatterns.builder;

import creationalPatterns.builder.directors.PersonDirecror;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder= new PersonBuilder();
        Person p;// =personBuilder.name("sdsd").id(0).email("ashrafshakerelbahlol@gmail.com").Build();
        PersonDirecror personDirecror=new PersonDirecror();
        p = personDirecror.bogatt(personBuilder).Build();
    }
    
}
