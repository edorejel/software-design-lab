#include <iostream>

using namespace std;

int main(){

	cout << "Welcome to the Calorie Calculator\n\n";

	//get servings from the user
	double servings;
	cout << "Enter servings per food item: ";
	cin >> servings;

	//get the number of calories from the user
	double calories;
	cout << "Enter calories per serving: ";
	cin >> calories;

	//calculate total calories
	double total_calories = servings * calories;

	//display total calories
	cout << "Total calories: " << total_calories << endl << endl;

	return 0;

}