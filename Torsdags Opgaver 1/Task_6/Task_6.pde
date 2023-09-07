int colors = 255;


void setup() {
  size(300, 800);
  background(100);
  stroke(0);
}

void draw() {
  //ellipse1
  if(frameCount>0 && frameCount<200 || frameCount>500){
   fill(colors,0,0); 
  }
  else{
   fill(0); 
  }
  ellipse(width/2, 150, 200, 200);
 
 //ellipse2
  if(frameCount>100 && frameCount<200 || frameCount>400 && frameCount<500){
   fill(colors,colors,0); 
  }
  else{
   fill(0); 
  }
  ellipse(width/2, 400, 200, 200);
  
  //ellipse3
  fill(0);
  if(frameCount>200 && frameCount<400){
   fill(0,colors,0); 
  }
  ellipse(width/2, 650, 200, 200);
  if (frameCount>600){
   frameCount=0;
  }
}
