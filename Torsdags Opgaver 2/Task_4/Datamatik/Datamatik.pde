void setup(){
  Teacher t1 = new Teacher("Tess", 49, true);
  Student s1 = new Student("Malte", 23, false,'a');
  Student s2 = new Student("Alfredo", 25, false,'a');
  
  println(t1.name);
  
  t1.changeName("not Tess");
  println(t1.name);
  
  println(s1.name+" "+s1.datamatikerTeam);
  println(s2.name+" "+s2.datamatikerTeam);
}
