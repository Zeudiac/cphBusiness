String[] artists = {"Eminem","Jay-Z","Kendrick Lamar","2Pac","Lil Wayne"};
String[] hits = {"Mockingbird","Ni**as In Paris","HUBLE.","Hit 'Em Up","Love Me"};
int arrCounter = 0;
int counter = 1;

for(String i: artists){
  println(counter+". "+i+": "+hits[arrCounter]);
  counter++;
  
}
