int[] arr = {28,230,9,310,72};

void setup(){
 int randomnr=getRandom();
 println(randomnr);
}

int getRandom(){
 int randomNr=(int)random(5); 
 return arr[randomNr];
}
