void setup(){
  a1();
  b1("1.b");
  c1("malte",23);
}

void a1(){
 println("Hello from the function"); 
}

void b1(String a){
  println(a);
}

void c1(String name, int age){
 println("My name is "+name+", I am "+age+" years old."); 
}
