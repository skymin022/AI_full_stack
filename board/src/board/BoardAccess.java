package board;

public class BoardAccess implements BoardInterface {

	// 게시글 개수(현재)
	int count =1;
	// 게시글 목록
	Board[] boardList = new Board[BoardInterface.MAX_COUNT];
	public BoardAccess() {
	boardList[0] = new Board(1,"제목01", "작성자01", "내용01", "2025/03/19 - 18:00:00","2025/03/19 - 18:00:00");
	}
	
	/**
	 *  게시글 등록
	 *  1. 매개변수로 넘겨 받은 board 객체에 게시글 번호를 부여한다.
	 *  2. 등록일자와 수정일자를 현재 날짜/시각으로 지정하낟.
	 *  3. board 객체를 현재까지 등록된 배열요소 다음 index에 저장한다.
	 *  4. 등록된 board 객체를 반환한다.
	 *  * 게시글 목록이 가득찼는지 확인한다.
	 */
	
	@Override
	public Board create(Board board) {
		if(this.count == BoardInterface.MAX_COUNT) {
			System.out.println("게시글 목록이 꽉 찼습니다.");
		}
		int no = ++count;
		String createdAt = "2025/03/19 - 18:00";
		String updatedAt = "2025/03/19 - 18:00";
		board.setNo(no);
		board.setCreateAt(createdAt);
		board.setUpdateAt(updatedAt);
		boardList[no-1] = board;
		System.out.println(board);
		System.out.println("게시글이 등록되었습니다.");
		return null;
	}
	/**
	 * 게시글 목록
	 * 1. 게시글이 존재하는지 확인하고 1개의 게시글도 없으면 null 반환
	 * 2. 게시글이 존재하면, 전체 게시글 배열인 boardList를 반환
	 */
	@Override
	public Board[] list() {
		if (this.count==0) {
			System.out.println("조회된 게시글이 없습니다.");
			return null;
		}
		System.out.println("게시글 목록을 조회합니다.");
		return boardList;
	}

	@Override
	public Board read(int no) {
		if(no < 1 || no > count) {
			System.out.println("게시글 번호가 유효하지 않습니다.");
			return null;
		}
		return boardList[no-1];
	}

	@Override
	public boolean upate(Board board) {
		if(board.getNo() < 1 || board.getNo() > count) {
			System.out.println("수정할 게시글 번호가 유효하지 않습니다.");
			return false;
		}
		boardList[board.getNo()-1] = board;
		System.out.println("게시글이 수정되었습니다.");
		return true;	
	}

	@Override
	public boolean delete(int no) {
		if (no < 1 || no > count) {
			System.out.println("삭제할 게시글 번호가 유효하지 않습니다.");
			return false;
		}
		boardList[no-1] = null;	
		
		System.out.println("게시글이 삭제되었습니다.");
		return true;	
	}

}
