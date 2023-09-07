int input = 30;
int input2 = input;
for(input=input; input>=0;input--){
  if((input>6 || input<6) && (input!=input2/2)){
  println(input);
  }
  else if (input==6){
   println("six"); 
  }
  else{
   println("HALF!");
  }
}
