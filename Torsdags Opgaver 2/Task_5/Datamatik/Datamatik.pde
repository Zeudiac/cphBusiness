void setup(){
  Teacher t1 = new Teacher("Tess", 49, true);
  Student s1 = new Student("Malte", 23, false,'a');
  Student s2 = new Student("Alfredo", 25, false,'a');
  
  testIsClassmates(s1,s2);

}
boolean testIsClassmates(Student s1, Student s2){
    if (s1.datamatikerTeam==s2.datamatikerTeam){
      println(s1.name+" & "+s2.name+" are classmates");
      return true;
    }
    else{
      println(s1.name+" & "+s2.name+" are NOT classmates");
      return false;
    }
}
