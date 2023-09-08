int input = 30;
for (int i=input; i>=0; i--) {
  
  if ((i>6 || i<6) && i!=input/2) {
    println(i);
  } 
  else if (i==6) {
    println("six");
  } 
  else {
    println("HALF!");
  }
}
