class Main{

	public static void main(String[] args){

		Team t1= new Team("Jonstrup boldklub");
		t1.setRank(1);

		Team t2= new Team("Team2");	
		t2.setRank(2);

		Team t3= new Team("Team3");
		t3.setRank(3);

		Team t4= new Team("Team4");	
		t4.setRank(4);

		Team t5= new Team("Team5");	
		t5.setRank(5);

		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(t4.toString());
		System.out.println(t5.toString());
	}
}