package ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public void sellTO(Audience audience){
        ticketOffice.sellTicketTo(audience);
    }
}
