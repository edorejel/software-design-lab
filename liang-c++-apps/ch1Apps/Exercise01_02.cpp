//--header file, usually included at head of program, the top
#include <iostream>//--compiler preprocessor directive, tells compiler to include the iostream libray, needed to support console input and output
//--end header file
using namespace std;//--tells compiler to use the standard namespace, std is abbreviation for standard, namespace is a naming mechanism to avoid conflicts in large programs

int main(){//--begin main method of type int
//--output statements used to output to user, operator << is stream insertion operator
  cout << "Welcome to C++" << endl;//--cout and endl are defined in iostream library, used to output to user, output the string to the user, compiler requires using namespace std statement to find them in library
  cout << "Welcome to C++" << endl;//--cout and endl are defined in iostream library, used to output to user, compiler requires using namespace std statement to find them in library
  cout << "Welcome to C++" << endl;//--cout and endl are defined in iostream library, used to output to user, compiler requires using namespace std statement to find them in library
  cout << "Welcome to C++" << endl;//--cout and endl are defined in iostream library, used to output to user, compiler requires using namespace std statement to find them in library
  cout << "Welcome to C++" << endl;//--cout and endl are defined in iostream library, used to output to user, compiler requires using namespace std statement to find them in library
//--end output statements
  return 0;//--return statement, returns 0 using the semicolon, known as the statement terminator, value 0 indicates progra terminates with successful exit
}//--end main method
