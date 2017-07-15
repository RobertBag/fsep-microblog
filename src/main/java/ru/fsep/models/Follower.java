package ru.fsep.models;

import lombok.*;
import javax.persistence.*;


/**
 * 08.07.2017
 *
 * @author Robert Bagramov.
 */

@Entity
@Table(name = "follower")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "follower_id", nullable = false)
    private Long followerId;
}
