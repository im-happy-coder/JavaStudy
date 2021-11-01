package examp05;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinbox = new Stack<Coin>();  //코인을 넣을 컬렉션을 만듬
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(10));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(500));
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("꺼내온 동전  : " + coin.getValue());
		}
	}

}
