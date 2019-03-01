package chapter2;

/**
 *
 * @author Gerardo A A
 */
public class TicketNumber {

    public TicketNumber(int ticket) {
        validar(ticket);
    }
    
    private void validar(int ticket){
        int remainder = ticket%10;
        ticket = ticket/10;
        System.out.println(((ticket%7)==remainder ? "true":"false"));
    }
    
}
