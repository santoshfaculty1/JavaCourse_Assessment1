/* This program to implement stack. Stack is a LIFO data strcuture    *
 * LIFO - Last in First Out                                                *
 * Perform PUSH(insert operation), POP(Delete operation) and Display stack */
#include <stdio.h>
#include "Stack.h"

#define MAXSIZE 10

struct stack            /* Structure definition for stack */
{
	int stk[MAXSIZE];
	int top;
};

typedef struct stack STACK;
STACK s;


int main1 ()
{
	init();
	push(1);
	push(5);
	push(10);
	display();
	pop();
	pop();
	pop();

	return 1;
}

/*Initialize stack head*/
void init(){
	s.top = -1;
}




/*Function to add an element to the stack*/
void push (int num)
{	
	if (s.top == (MAXSIZE - 1))
	{
		printf ("Stack is Full\n");
		return;
	}
	else
	{
		s.top = s.top + 1;
		s.stk[s.top] = num;
	}
	return;
}


/*Function to delete an element from the stack*/
int pop ()
{
	int num;
	if (s.top == - 1)
	{
		printf ("Stack is Empty\n");
		return (s.top);
	}
	else
	{
		num = s.stk[s.top];
		printf ("poped element is = %d\n", s.stk[s.top]);
		s.top = s.top - 1;
	}
	return(num);
}

/*Function to display the status of the stack*/
void display ()
{
	int i;
	if (s.top == -1)
	{
		printf ("Stack is empty\n");
		return;
	}
	else
	{
		printf ("\nThe status of the stack is\n");
		for (i = s.top; i >= 0; i--)
		{
			printf ("%d\n", s.stk[i]);
		}
	}
	printf ("\n");
}