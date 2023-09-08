//3.a
int a = 6;
int b = 4;

if(a==10 || b==10 || a+b==10){
  println("Success!");
}
else{
 println("Failure!"); 
}

//3.b
int min = 3;
int max = 5;
if(min+max>10 && (min <= 5 || max <= 5)){
  println("Success!");
}

//3.c
int x=11;
int y=11;
int z=40;

if ((x%10==0 || y%10==0 || z%10==0)){
  println("Failure");
}

else if (x+y+z==30){
 println("Success!"); 
}

else{
 println("The numbers does NOT equal 30"); 
}
