int[] newArr = {153,56,32,64,23};

void setup(){
  newArr=sortArray(newArr);
  for(int i: newArr){
  println(i);
  }
}

int[] sortArray(int[] array){
  array=sort(array);
  return array;
}
