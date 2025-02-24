package behavioralpatterns.chainofresponsibility;

public class PasswordHandler  extends Handler{
private final Database database;

public PasswordHandler(Database database){
    this.database =database;
}
@Override
public boolean handle(String username, String password) {
  if(!database.isValidatPassword(username, password)){
    System.out.println("Password is not correct");
    return false;
  }
  System.out.println("Password is correct");  
  return handleNext(username, password); 
}
  

}
