ArrayList<Integer> intArrList = new ArrayList();
ArrayList<Boolean> charArrList = new ArrayList();

ArrayList<String> stringArrList = new ArrayList();
    
void setup(){
    println("7.b");
    stringArrList.add("5345345");
    stringArrList.add("AGADF");
    stringArrList.add("gdsfas");
    stringArrList.add("#RFASD53AA%");
    
    for(int i=0; i<10;i++){
    intArrList.add(i);   
    }
    
    takeSArrListF(stringArrList);
    int sum=takeIArrListF(intArrList);
    println("7.c "+sum);
    
    float averageValue=averageValue(intArrList);
    println("7.d "+averageValue);
    
}

void takeSArrListF(ArrayList <String> sArrList){
  for(String i: sArrList){
   println(i); 
  }
   println();
}

int takeIArrListF(ArrayList<Integer> iArrList){
  int addition=0;
  for(int i: iArrList){
   addition+=i; 
  }
  return addition;
}

float averageValue(ArrayList<Integer> iArrList){
  float addition=0;
  float size = iArrList.size();
  for(float i: iArrList){
   addition+=i; 
  }
  float averageV = addition/size;
  return averageV;
}
