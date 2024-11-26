package ticket;

public class Bag {
    private Long amount;
    private Invitaion invitation;
    private Ticket ticket;

    public Bag(){
        this.amount = 0L;
        this.invitation = null;
    }

    public Bag(Long amount, Invitaion invitation){
        this.amount = amount;
        this.invitation = invitation;
    }

    public void setAmount(Long amount){
        this.amount = amount;
    }

    public void setInvitation(Invitaion invitation){
        this.invitation = invitation;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

        private boolean hasInvitation () {
            return invitation != null;

        }

        private void setTicket(Ticket ticket){
            this.ticket = ticket;
        }

        private void minusAmount(Long amount){
            System.out.println("금액 차감 전: " + this.amount);
            this.amount -= amount;
            System.out.println("금액 차감 후: " + this.amount);

        }
}