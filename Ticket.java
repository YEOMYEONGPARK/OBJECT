package ticket;

import javax.imageio.plugins.tiff.TIFFDirectory;

public class Ticket {
    private Long fee;

    public Ticket(){
        this.fee = 0L;
    }

    // 생성자 추가
    public Ticket(Long fee) {
        this.fee = fee;
    }

    public Long getFee() {
        return fee;
    }
}
