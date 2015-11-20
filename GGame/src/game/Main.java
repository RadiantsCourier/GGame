package game;

public class Main {
	
	protected String[] position = new String[72];
	
	public Main(){
		Board board = new Board();
		for(int i = 45; i < 57; i++){
			position[i] = Integer.toString(i);
		}
		for(int i = 57; i < 63; i++){
			position[i] = "P";
		}
		position[63] = "S";
		position[64] = "S";
		position[65] = "F";
		board.update(position);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		
	}

}
