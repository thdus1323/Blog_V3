package shop.mtcoding.blog.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Import(BoardRepository.class)
class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    @Transactional
    public void findById_test() {
        int id = 1;
        System.out.println("start - 1");
        Board board = boardRepository.findById(id);
        System.out.println("start - 2");
        System.out.println(board.getUser().getId());
        System.out.println("start - 3");
        System.out.println(board.getUser().getUsername());
    }

    @Test
    public void findAll_test() {
        List<Board> boardList = boardRepository.findAll();
    }

}