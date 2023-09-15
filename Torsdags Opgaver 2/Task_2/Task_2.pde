void setup(){
  
  //2.b
  println(addition(8,2));
  println();
  
  //2.c
  String uppercaseReturned = uppercase("make it capital");
  println(uppercaseReturned);
  println();
  
  println(checkUpperCase("ohoh"));
}

//2.b
int addition(int a, int b){
 return a+b; 
}

//2.c
String uppercase(String upper){
  return upper=upper.toUpperCase();
}

//2.d
boolean checkUpperCase(String upOrNah){
  
   return Character.isUpperCase(upOrNah.charAt(0));

}
