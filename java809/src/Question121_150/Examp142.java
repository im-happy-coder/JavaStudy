package Question121_150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Block {
	String color;
	int size;
	public Block(int size,String color) {
		this.color = color;
		this.size = size;
	}
	@Override
	public String toString() {
		return this.size + " : " + this.color;
	}
	
}
//Which definition of the ColorSorter class sorts the blocks list?
//ColorSorter 클래스의 어떤 정의가 블록 목록을 정렬합니까?
//정답
class ColorSorter implements Comparator<Block>{
	public int compare(Block o1, Block o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color);  // public int compareTo(String anotherString)
	}
}


//Comparator는 public int compare(매개변수가 2개)  -- Comparable은 public int compareTo(매개변수가 1개)

//정렬 가능한 클래스(Comparable 인터페이스를 구현한 클래스)들의 기본 정렬 기준과 다르게 정렬 하고 싶을 때 사용하는 인터페이스
//package: java.util.Comparator
//주로 익명 클래스로 사용된다.
//기본적인 정렬 방법인 오름차순 정렬을 내림차순으로 정렬할 때 많이 사용한다.

public class Examp142 {

	public static void main(String[] args) {
		List<Block> blocks = new ArrayList<>();
		blocks.add(new Block(10, "Green"));
		blocks.add(new Block(7, "Red"));
		blocks.add(new Block(12, "Blue"));
		Collections.sort(blocks, new ColorSorter());
		System.out.println(blocks);
	}

}
