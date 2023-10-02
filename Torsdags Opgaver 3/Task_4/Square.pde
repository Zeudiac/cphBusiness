class Square {
  int xpos;
  int ypos;

  Square(int xpos, int ypos) {
    this.xpos=xpos;
    this.ypos=ypos;
  }

  void display() {
    rect(this.xpos, this.ypos, 50, 50);
  }
}
