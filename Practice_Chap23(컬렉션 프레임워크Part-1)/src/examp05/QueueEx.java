package examp05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Message> mQueue = new LinkedList<>();
		mQueue.offer(new Message("sendMail", "홍길동"));
		mQueue.offer(new Message("sendSMS", "김연아"));
		mQueue.offer(new Message("sendKaKatalk", "김길동"));
		mQueue.offer(new Message("sendFaceBook", "하앙"));
		
		while(!mQueue.isEmpty()) {
			Message message = mQueue.poll();
			System.out.println(mQueue.size());
			switch (message.getCommad()) {
			case "sendMail":
				System.out.println(message.getTo() + "에게 메일을 보냅니다");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + "에게 SMS를 보냅니다");
				break;
			case "sendKaKatalk":
				System.out.println(message.getTo() + "에게 카카오톡을 보냅니다");
				break;
			case "sendFaceBook":
				System.out.println(message.getTo() + "에게 페이스북을 보냅니다");
				break;
			
			}
		}
	}

}
