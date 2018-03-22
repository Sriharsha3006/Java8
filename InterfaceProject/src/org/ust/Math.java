package org.ust;

enum Hello {
	MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(7);
	 
	Hello(int dayNumber) {
        this.dayNumber = dayNumber;
    }
 
    private int dayNumber;
 
    public int getDayNumber() {
        return this.dayNumber;
    }
}
