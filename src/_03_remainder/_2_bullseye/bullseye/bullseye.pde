
void setup() {
 
  // set the size of your sketch
  size(800,800);
}

void draw() {
  for(int i = 22;i>0;i--) {
  if(i%2 == 0) {
fill(0,0,0);
  }
  else {
fill(200,0,0);
  }
  ellipse(400,400,i*50,i*50);
  }
}
