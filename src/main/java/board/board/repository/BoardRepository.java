package board.board.repository;

import board.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
    // <Board, primary key로 설정한 것의 data type>

    Page<Board> findByTitleContaining(String searchKeyword, Pageable pageable);

}
