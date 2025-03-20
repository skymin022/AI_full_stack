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

	/*
	 * 게시글 조회
	 * 1. 넘겨받은 번호 no가 유효하지 않으면, null 반환
	 * 2. 게시글 번호 no가 유효하면,
	 * 	  번호에 해당하는 boardList[]의 게시글 요소를 반환 
	 */
	
	
	// 과제 해온거 
//	@Override
//	public Board read(int no) {
//		// 유효성 검사 
//		if(no < 1 || no > count) {
//			System.out.println("게시글 번호가 유효하지 않습니다.");
//			return null;
//		}
//		return boardList[no-1];
//	}
//
//	@Override
//	public boolean update(Board board) {
//		if(board.getNo() < 1 || board.getNo() > count) {
//			System.out.println("수정할 게시글 번호가 유효하지 않습니다.");
//			return false;
//		}
//		boardList[board.getNo()-1] = board;
//		System.out.println("게시글이 수정되었습니다.");
//		return true;	
//	}
//
//	@Override
//	public boolean delete(int no) {
//		if (no < 1 || no > count) {
//			System.out.println("삭제할 게시글 번호가 유효하지 않습니다.");
//			return false;
//		}
//		boardList[no-1] = null;	
//		
//		System.out.println("게시글이 삭제되었습니다.");
//		return true;
		
	
	
//	 강사
	
	/*
	 * 게시글 조회
	 * 1. 넘겨받은 번호 no가 유효하지 않으면, null 반환
	 * 2. 게시글 번호 no가 유효하면,
	 * 	  번호에 해당하는 boardList[]의 게시글 요소를 반환 
	 */
		@Override
		public Board read(int no) {
			// 유효성 검사 
			if(no < 1 || no > BoardInterface.MAX_COUNT) {
				System.err.println("게시글 번호는 1~");
				System.err.println(BoardInterface.MAX_COUNT + "번까지만 존재합니다.");
				
				return null;
			}
			return boardList[no-1];
		}
		/*
		 * 게시글 수정
		 * 1. 수정할 게시글 번호 no가 유효하지 않으면, false 반환
		 * 2. 						유효 하면
		 * - 번호에 해당하는 boardList[]의 요소 변경
		 * - 수정일자(updateedAt)를 현재 날짜,시간으로 변경
		 * - 수정 완료 후 , true 를 반환
		 */
		@Override
		public boolean update(Board board) {
			// 유효성 검사 
			int no = board.getNo();
			if(no < 1 || no > BoardInterface.MAX_COUNT) {
				System.err.println("게시글 번호는 1~");
				System.err.println(BoardInterface.MAX_COUNT + "번까지만 존재합니다.");
				return false;
			}
			// 기존 게시글 정보 조회
			Board updatBoard = boardList[no-1];
			// 사용자가 수정한 글 정보
			String updateTitle = board.getTitle();
			String updateWriter = board.getWriter();
			String updateContent = board.getContent();
			// 수정할 정보 변경
			updatBoard.setTitle(updateTitle);
			updatBoard.setWriter(updateWriter);
			updatBoard.setContent(updateContent);
			// 수정일자 현재/날짜 시간으로 변경
			updatBoard.setUpdateAt("2025/03/20 - 11:00");
//			boardList[no-1] = updatBoard; 		// 필요 없다
			return true;
		}
		
		/*
		 * 게시글 삭제
		 * 1. 삭제할 게시글 번호 no 가 유효하지 않으면, false 반환
		 * 2. 게시글이 하나도 존재하지 않으면, false반환
		 * 3. 삭제할 게시글 번호 no가 유효하면,
		 * - 번호에 해당하는 boardList[] 요소를 null로 변경(삭제)
		 * - 해당 index 다음의 요소들을 아픙로 한칸씩 당겨준다.
		 * - 게시글 개수 count를 1개 감소시킨다. 
		 * 4. 글번호 재세팅
		 */
		
		@Override
		public boolean delete(int no) {
			// 유효성 확인
			if(no < 1 || no > BoardInterface.MAX_COUNT) {
				System.err.println("게시글 번호는 1~");
				System.err.println(BoardInterface.MAX_COUNT + "번까지만 존재합니다.");
				return false;
			}
			if (count == 0 ) {
				System.err.println("삭제할 게시글이 없습니다.");
				return false;
			}
			// 게시글 삭제
			boardList[no-1] = null;
			// - 해당 index 다음의 요소들을 아픙로 한칸씩 당겨준다.
			for (int i = no; i < boardList.length; i++) {
				// 바로 앞의 위치 = 현재 접근 위치
				boardList[i-1] = boardList[i];
			}
			// 가장 마지막 위치의 객체를 null 로 비운다.
			boardList[count -1] = null;
			// 삭제 후, 게시글 개수를 -1 감소
			count--;
			// 글 번호 재 세팅 :
			for (int i = 0; i < boardList.length; i++) {
				if (boardList[i] != null)
					boardList[i].setNo(i+1);
			}
			// 게시글 삭제 성공
			System.out.println(no + "번 게시글을 삭제하였습니다.");
			return true;	
	}

}
