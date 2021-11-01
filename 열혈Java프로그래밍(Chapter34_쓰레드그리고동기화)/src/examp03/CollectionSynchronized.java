package examp03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class CollectionSynchronized {
	public static List<Integer> lst = Collections.synchronizedList(new ArrayList<Integer>());
	public static void main(String[] args) throws InterruptedException {
//		컬렉션 인스턴스 동기화의 예
		for(int i = 0; i< 16 ; i++)
			lst.add(i);
		System.out.println(lst);
		
		Runnable task = () -> {
			synchronized (lst) {
			ListIterator<Integer> itr = lst.listIterator(); //반복자도 하나의 인스턴스다. (이경우 동기화가 되지 않았다)
			while(itr.hasNext())
				itr.set(itr.next()+1);
			}
		};
		
		ExecutorService exr = Executors.newFixedThreadPool(3);
		exr.submit(task);
//		exr.submit(task);
//		exr.submit(task);
		
		exr.shutdown();
		exr.awaitTermination(100, TimeUnit.SECONDS); //최대 100초동안 기다린다.
		System.out.println(lst);
		
//		 컬렉션 인스턴스 동기화
		
//		public static <T> Set<T> synchronizedSet(Set<T> s)
//		public static <T> List<T> synchronizedList(List<T> list)
//		public static <K, V> Map<K, V> synchronizedMap(Map<K, V> m)
//		public static <T> Collection<T> synchronizedCollection(Collection<T> c)
		
//		List<String> lst = Collections.synchronizedList(new ArrayList<String>());
	}

}
