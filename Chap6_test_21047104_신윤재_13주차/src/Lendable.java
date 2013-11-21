interface Lendable {
    abstract void checkOut(String borrower, String date); 
    abstract void checkIn(); 
}