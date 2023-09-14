void setup(){
  
  //2.b
  println(addition(8,2));
  println();
  //2.c
  println(uppercase("make it capital"));
  println();
  
  println(ifUpperCase("ja"));
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
boolean ifUpperCase(String upOrNah){
  if(Character.isUpperCase(upOrNah.charAt(0))){
   return true;
  }
  else{
   return false; 
  }
}
