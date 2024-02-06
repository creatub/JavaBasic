package day10;
import java.util.*;
import java.awt.*;
/*Map계열
 * Hashtable, HashMap, Properties
 * - Object유형을 저장할 수 있다
 * - key와 value값을 매핑하여 저장한다.
 * - key값의 중복을 허용하지 않는다.
 * - 무순서
 * - 데이터가 75%차면 자동으로 저장 역역을 확대한다.
 * - 데이터 저장: Object put(Object key, Object value)
 * - 데이터 꺼내기: Object get(Object key)
 * */
public class HashMapTest {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("하나",1);
		ht.put("둘","Two");
		ht.put("파랑","Blue");
		ht.put("빨강",java.awt.Color.red);
		
		Object obj = ht.get("둘");
		System.out.println(obj);
		
		Color obj2 = (Color)ht.get("빨강");
		System.out.println(obj2.getRed()+"<=red값");
		
		//Generic 이용 <K,V>
		HashMap<String, Integer> map = new HashMap<>();
		map.put("생년", 2000);
		map.put("나이", 24);
		map.put("용돈", 500000);
		System.out.println(map);
		map.put("용돈", 700000);
		System.out.println(map.size());
		System.out.println(map);
		
		//Set<K>	keySet()
		//key값들만 Set유형으로 반환한다.
		Set<String> set = map.keySet();
		for(String key:set) {
			Integer val=map.get(key);
			System.out.println(key+"#"+val);
		}
		//Set인터페이스의 메서드
		//Iterator<E>	iterator()
		Iterator<String> it = set.iterator();
		//key값을 집합유형으로 반환해서 해당 집합을 논리적으로 커서를 이용해서
		//한번에 꺼내올 수 있는 방법을 제공한다.
		/* boolean	hasNext()
		 * E	next()
		 */
		//논리적 커서는 첫번째 요소 직전에 위치함(before First)
		System.out.println("--------------------");
		while(it.hasNext()) {
			String key=it.next();//논리적 커서를 다음칸으로 이동시키고 가리키는 곳의 요소를 반환
			System.out.println(key);
		}
		System.out.println("--------------------");
		//Collection<V>	values()
		//value값들만 Collection유형으로 반환한다.
		Collection<Integer> lst = map.values();
		for(Integer i:lst) {
			System.out.println(i);
		}
	}

}
