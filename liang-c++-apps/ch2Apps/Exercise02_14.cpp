#include <iostream>
using namespace std;

int main()
{
  
  cout << "Enter weight in pounds: ";
  double weight;
  cin >> weight;

  
  cout << "Enter height in inches: ";
  double height;
  cin >> height;

  double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);

  cout << "BMI is " << bmi << endl;

  return 0;
}


