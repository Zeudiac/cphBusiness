
void setup(){
 String wordPart = printPartOfWord("København",0,3); 
 println(wordPart);
}

String printPartOfWord(String word, int start, int indexLength){
  int newEnd=start+indexLength;
  String subString = word.substring(start, newEnd); 
  return subString;
}
