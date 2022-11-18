#include <stdio.h>
typedef struct newV {
    int x;
    long y;
    int z;
}ejhash;
ejhash constructor(int x, long y, int z) {
		ejhash obj;
	    obj.x = x;
	    obj.y = y;
	    obj.z = z;
		return obj;
}
int hashCode(ejhash obj) {
    int h = obj.x;
	h = h * 31 + (int) (obj.y ^ (obj.y >> 32));
	//h = h * 31 + obj.z;//change
	return h;
}
void testCollision1(int x1, long y1, int z1,int x2, long y2, int z2) {
	    ejhash o1 = constructor(x1, y1, z1);
	    ejhash o2 = constructor(z2, y2, x2);//change
	    if (hashCode(o1) == hashCode(o2)) {
	        printf("%s\n","Solved hash collision 1");
	    }
}
void testCollision2(long y1, int z1,long y2, int z2) {
	    ejhash o1 = constructor(1, y1, z1);
	    ejhash o2 = constructor(2, y2, z2);
	    if (hashCode(o1) == hashCode(o2)) {
	        printf("%s\n","Solved hash collision 2");
	    }
		else{//change
			printf("%s\n","Not equal");//change
		}
}
void testCollision3(long y1, long y2) {
	    ejhash o1 = constructor(5678, y1, 3141);//change
	    ejhash o2 = constructor(5678, y2, 3141);
	    if (hashCode(o1) == hashCode(o2)) {
	        printf("%s\n","collision Occures");//change
	    }
}
void testCollision4(int x1, long y1, int z1) {
	    ejhash o1 = constructor(1234, 6454505372016058754, 3141);
	    ejhash o2 = constructor(x1, y1, z1);	
	    if (hashCode(o1) == hashCode(o2) && y1==z1) {//change
	        printf("%s\n","Solved hash collision 4");
	    }
}