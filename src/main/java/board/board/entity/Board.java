package board.board.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity //DB의 테이블 의미
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

    private String filename;

    private String filepath;

    private Integer numOfUse;

    private Integer size;

    private Integer shipping;

    private Integer price;

    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"board"})
    @OrderBy("Id desc")
    private List<Reply> replys;

    @CreationTimestamp
    private LocalDateTime createDate;
}
