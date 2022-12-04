package traveler.travel.entity.chat;

import lombok.Getter;
import traveler.travel.entity.BaseTimeEntity;
import traveler.travel.entity.User;

import javax.persistence.*;

@Entity
@Getter
public class Message extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long id;

    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User writer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatroom_id")
    private ChatRoom chatRoom;

}
