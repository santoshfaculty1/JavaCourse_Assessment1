// Stack Test Suite
#include <cxxtest/TestSuite.h>
extern "C" {
	#include "Stack.h"
}

class MyTestSuite5 : public CxxTest::TestSuite
{
    char *_buffer;
public:
    void setUp()
    {
        init();
    }
    void tearDown()
    {
        //No Cleanup required
    }
    void test_push_pop()
    {
        push(10);
        push(15);
        int p1 = pop();
        int p2 = pop();
        TS_ASSERT_EQUALS(p1,15);
        TS_ASSERT_EQUALS(p2, 10);
	}
    void test_pop_empty_stack(){
		int p1 = pop();
		TS_ASSERT_EQUALS(p1, -1);
	} 
};
//gcc -c -o StrCpy.o Strcpy.c
//g++ -c -o runner.o -I$CXXTEST runner.cpp
//g++ -o runner1 StrCpy.o runner.o