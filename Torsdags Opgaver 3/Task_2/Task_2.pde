
void setup(){
 String wordPart = printPartOfWord("København",1,4); 
 println(wordPart);
}

String printPartOfWord(String word, int start, int end){
  int newEnd=start+end;
  String subString = word.substring(start, newEnd); 
  return subString;
}
