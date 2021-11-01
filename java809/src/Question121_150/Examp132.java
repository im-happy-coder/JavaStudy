package Question121_150;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Examp132 {

	public static void main(String[] args) {
		final List<String> list = new CopyOnWriteArrayList<>();
		final AtomicInteger ai = new AtomicInteger(0); //AtomicInteger은 다음과 같이 생성할 수 있습니다. 초기값은 0이며, 초기값을 변경하고 싶으면 인자로 int 변수를 전달하면 됩니다.
		final CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() { //1이면 1씩증가, 2면 2씩 증가.
			@Override
			public void run() {
				System.out.println(list);
			}
		});
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000* ai.incrementAndGet());  //AtomicInteger.incrementAndGet()를 호출하면 값이 1씪 자동으로 증가합니다.
					list.add("X");
					barrier.await();//N 개의 쓰레드가 돌고 있다고 가정하고 CyclicBarrier 를 생성할 때 인자값으로 N 을 준다. 
									//각각의 쓰레드 내에서 CyclicBarrier 의 await() 를 호출하고 호출 횟수가 N번에 도달했을 때, N개의 모든 쓰레드의 대기 상태가 해제된다.   
				} catch (Exception xe) {}
				}
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	//즉 CyclicBarrier(2)를 주게 되면 2개의 스레드가 awit()호출하고 이 호출갯수가 2개에 도달했으면 대기상태가 해제되고 출력하게된다
		//즉 1를 주면 1개씩 add해서 1개씩 증가하게 되고
		//2를 주면 2개씩 add해서 2->4가 되는거다
		
		//답 : [X, X]
//		[X, X, X, X]

	}

}
/*
CopyOnWriteArrayList의 동작 방식과 특징
이름에서 알 수 있듯이 ArrayList를 구현한 클래스로서,
내부를 변경하는 작업은 항상 깨끗한 복사본을 만들어서 수행하도록 구현되어 있다.
내부의 배열은 절대 변경할 수 없으므로 순회할 때 락이 필요 없어서 속도면에서 매우 빠르다는 장점이 있다.

데이터 수정이나 삭제 등의 다른 용도로 쓰일 경우에는 속도가 느려지기 때문에
수정할 일은 거의 없으며 주로 순회가 일어나는 용도로 사용하는 것이 적합하다.

CopyOnWriteArrayList는 객체를 매번 복사하지 않고, 전달할 때 해당 상태를 스냅샷으로 가지고 있는 방식이다.


ArrayListVS CopyOnWriteArrayList
CopyOnWriteArrayList는 ArrayList 사이에는 한 가지 차이가 있다.
CopyOnWriteArrayList는 ArrayList와는 달리,
List를 읽기 위해 어딘가에 전달할 때 원본이 아닌 복사본을 만들어서 전달한다.
*/