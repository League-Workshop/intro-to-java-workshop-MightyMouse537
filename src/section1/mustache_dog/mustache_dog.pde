PImage mustache;
PImage gopherDog;
void setup() {
  gopherDog= loadImage ("gopher dog.jpg");
  size(800,600);
  gopherDog.resize(700,600);
}
void draw() {
  backround(gopherDog);
  image(mustache,400,300);
}
