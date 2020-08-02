#include "testing/SimpleTest.h"
#include <string>
#include <fstream>
#include "error.h"
#include "filelib.h"
#include "vector.h"


using namespace std;

void testFunction(string filename){
	ifstream in;

	if (!openFile(in, filename)){
		error("Couldn't open file!");
	}

	Vector<string> lines;
	readEntireFile(in, lines);

	cout << lines << endl;
}

PROVIDED_TEST("test opening new text file"){
	testFunction("res/custom.txt");
}