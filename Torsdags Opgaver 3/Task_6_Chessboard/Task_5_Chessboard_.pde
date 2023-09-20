int[][] board = new int[8][8];
int x = 0;
int y = 0;
int sideLength = 40;

void setup() {
  size(320,320);
  for (int i=0; i<8; i++) {

    for (int j=0; j<8; j++) {

      if (i%2+j%2==0) {
        board[i][j]=0;
      } 
      else if(i%2+j%2==1){
        board[i][j]=1;
      }
      print(board[i][j]);
      
    }
    println();
  }
  drawBoard();
}

void drawBoard(){
  for (int i=0; i<8; i++) {
      x=0;
    for (int j=0; j<8; j++) {
      if (board[i][j]==0){
        fill(255);
      }
      else{
        fill(0);
      }
      rect(x,y,sideLength,sideLength);
      x = x+sideLength;
      }
      y=y+sideLength;
  }
}
