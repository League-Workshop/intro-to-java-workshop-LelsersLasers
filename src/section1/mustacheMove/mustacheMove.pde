PImage mustache;
PImage friend;

void setup ()
{
  friend = loadImage ("friend.jpg");
  size (1024,1024);
  friend.resize(width,height);
  mustache = loadImage ("mustache.png");
  background (friend);
}

void draw ()
{
  if (mousePressed)
  {
    background (friend);
    image (mustache, mouseX - 250, mouseY - 150);
  }
}