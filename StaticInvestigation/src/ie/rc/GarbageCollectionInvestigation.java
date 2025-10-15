package ie.rc;

public class GarbageCollectionInvestigation {

	public static void main(String[] args) {
		
		int i = 0;
		
		while (i < 100000) {
			
			Message m1 = new Message("Message " + i, "This is message " + i);
			
			System.out.println("Message count: " + Message.getCount());
			i++;
		}
		
		System.out.println("final message count:" + Message.count);

	}

}
