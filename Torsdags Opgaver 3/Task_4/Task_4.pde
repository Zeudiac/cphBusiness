Square[] squares = new Square[10];

void setup() {

  size(1000, 800);

  Square s1 = new Square(50, 50);
  s1.display();
}

void draw(){
  for (int i = 0; i<squares.length; i++) {
    fill(random(255), random(255), random(255));
    squares[i] = new Square((int)random(0, 1000), (int)random(0, 800));
    squares[i].display();
  }
}
