#include <iostream>
#include <string>

using namespace std;

int main(){
	cout << " Guest Book Version #1 Leave Your Name!\n\n";

	string first_name;
	cout << "First Name:\t";
	cin >> first_name;     //get first string only
	cin.ignore(100, '\n');//discard leftover chars and newline

	char middle_initial;
	cout << "Middle Initial \t";
	middle_initial = cin.get();
	cin.ignore(100, '\n');

	string last_name;
	cout << "Last Name:\t";
	getline(cin, last_name); //get entire line

	string city;
	cout << "City:\t\t";
	getline(cin, city);

	string country;
	cout << "Country:\t\t";
	getline(cin, country); //get entire line

	cout << "\nENTRY\n"
		 << first_name + ' ' + middle_initial + ". " + last_name + '\n'
		 << city + ", " + country + "\n\n";
}