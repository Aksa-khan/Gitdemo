package demo;
class vehicle {
	void run() {
		System.out.println("This is Vehicle");
	}
}
class bike extends vehicle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike obj = new bike();
		obj.run();
	}

}
