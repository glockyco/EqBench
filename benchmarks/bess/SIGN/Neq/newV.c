#include <stdio.h>
#include <math.h>
#include <stdbool.h>
double snippet(double a, double b) {
        if (b >= 0){
            a = -a;//change:inserted
            if (a >= 0)
                return a;
            else
                return 0;//change
        }
        else {
            if (a >= 0 && b>=0) //change: unsatisfiable condition
                return -a;
            else
                return a;
        }
}