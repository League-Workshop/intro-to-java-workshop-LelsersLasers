void setup ()
{
  size (800,800);
  background (#C914DE);
}
void draw ()
{
  ellipse (400,400,800,800);
  if (mousePressed)
  {
    fill (#08C6B5);
  }
  else
  {
    fill (#DE4014);
  }
  ellipse (400,400,800,800);
}