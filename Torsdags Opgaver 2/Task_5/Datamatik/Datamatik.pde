void setup(){
  Teacher t1 = new Teacher("Tess", 49, true);
  Student s1 = new Student("Malte", 23, false,'a');
  Student s2 = new Student("Alfredo", 25, false,'a');
  
  isClassmates(s1,s2);

}
boolean isClassmates(Student o1, Student o2){
    if (o1.datamatikerTeam==o2.datamatikerTeam){
      println(o1.name+" & "+o2.name+" are classmates");
      return true;
    }
    else{
      println(o1.name+" & "+o2.name+" are NOT classmates");
      return false;
    }
}
