package behavioralpatterns.strategy;

import java.time.LocalDate;

public class CreditCard {
    private final int ccv;
    private final LocalDate expirationDate;
    private final String CardNumber;
    public CreditCard(int ccv, LocalDate expirationDate, String cardNumber) {
        this.ccv = ccv;
        this.expirationDate = expirationDate;
       this. CardNumber = cardNumber;
    }
    
    
}
