package creationalPatterns.builder;

public class PersonBuilder {
    private int id;
    private String name;
    private String email;
    public PersonBuilder id( int id){
        System.out.println("id "+id);
        this.id=id;
        return this;
    }
    public PersonBuilder name( String name){
        System.out.println("name "+name);
        this.name=name;
        return this;
    }
    public PersonBuilder email(String email){
        System.out.println("email "+email);
        this.email=email;
        return this;
    }
    public Person Build(){
        return new Person(id, name, email);
    }
    
}
