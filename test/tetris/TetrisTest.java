package tetris;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.*;

class TetrisTest {
	
	private GameController game;
	private Board board;
	
	@BeforeEach
	void setUp() {
		game = new GameController();
		board = new Board();
	}
	
	@Test
	void testInitialBoard() {
		assertEquals(0, game.currentScore(), "The score doesn't initialize as 0.");
	}
	
	@Test
	void testPieceCanMoveDown() {
		Tetromino piece = new Tetromino(new Point[] {new Point(4, 0), new Point(5, 0)}, Color.RED);
		assertTrue(board.canMove(piece, 0 , 1), "La pieza deber�a poder moverse hacia abajo.");
	}
	
	@Test
	void testPieceCannotMoveOutsideLeft() {
		Tetromino piece = new Tetromino(new Point[] {new Point(0, 0), new Point(1, 0)}, Color.BLUE);
        assertFalse(board.canMove(piece, -1 , 0), "La pieza no deber�a moverse fuera del borde izquierdo.");
    }
		
}