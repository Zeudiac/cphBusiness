//4.a
println("4.a:");
for (int i = 0; i<=20;i++){
  println(i);
}

println();

//4.b
println("4.b:");
for (int i = 0; i<=20;i++){
  if(i%2==0){
  println(i);
  }
}

println();

//4.c
println("4.c:");
for (int start = 20; start>=0; start--){
  println(start);
  if (start==0){
   println("Take Off!"); 
  }
}

println();

//4.d
println("4.d:");
for (int start = 20; start>=0; start--){
  String counterAsString="";
        switch(start){
            case 3: counterAsString = "three";
                    println(counterAsString);
                   break;
            case 2: counterAsString = "Two";
                    println(counterAsString);
                   break;
            case 1: counterAsString = "One";
                    println(counterAsString);
                   break;    
            case 0: counterAsString = "Take Off!";
                    println(counterAsString);
                   break;          
            default: 
        }
  if(start<=20 && start>3){
    println(start);
  }
}

println();

//4.e
println("4.e");
int i=0;
while(i<=20){
 if(i%2==0){
  println(i); 
 }
 i+=1;
}

println();

int start = 20;
while(start>=0){
 println(start);
 if (start==0){
  println("Take Off!"); 
 }
 start -=1;
}
