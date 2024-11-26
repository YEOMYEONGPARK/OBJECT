package ticket;

public class ApplicationMain {
    public static void main(String[] args) {
        // 초대장 생성
        Invitaion invitation = new Invitaion();

        // Bag 생성
        Bag bagWithInvitation = new Bag(30000L, invitation); // 초대장 있음
        Bag bagWithoutInvitation = new Bag(50000L, null);    // 초대장 없음

        // Audience 생성
        Audience audienceWithInvitation = new Audience(bagWithInvitation);
        Audience audienceWithoutInvitation = new Audience(bagWithoutInvitation);

        // Ticket 생성
        Ticket ticket1 = new Ticket(10000L);
        Ticket ticket2 = new Ticket(15000L);

        // TicketOffice 생성
        TicketOffice ticketOffice = new TicketOffice(0L, ticket1, ticket2);

        // TicketSeller 생성
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);

        // Theater 생성
        Theater theater = new Theater(ticketSeller);

        // Audience가 Theater에 입장 티켓 유무와 잔액에서 차감 출력
        System.out.println("초대장이 있는 관객 입장");
        theater.enter(audienceWithInvitation);

        System.out.println("초대장이 없는 관객 입장");
        theater.enter(audienceWithoutInvitation);
    }
}
