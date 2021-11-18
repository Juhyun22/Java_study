package Studying_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Map04 {

	public static void main(String[] args) {
		// {장르1={책제목1=작가1, 책제목2=작가2}, 장르2={책제목1=작가1, 책제목2=작가2}}

        // {
        //    자기계발={더 해빙=이서윤,홍주연, 말 그릇=김윤나, 메모의 마법=마에다 유지},
        //    소설={어린왕자=생텍쥐페리, 아몬드=손원평, 나미야 잡화점의 기적=히가시노 게이고, 해변의 카프카=무라카미 하루키},
        //    과학={시간은 흐르지 않는다=카를로 로벨리, 코스모스=칼 세이건, 평행우주=미치오 카쿠}
        // }
		Map<String, Map<String, String>> bookMap = new HashMap<>();
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("더 해빙", "이서윤,홍주연");
        map1.put("말 그릇", "김윤나");
        map1.put("메모의 마법", "마에다 유지");
        
        Map<String, String> map2 = new HashMap<>();
        map2.put("어린왕자", "생텍쥐페리");
        map2.put("아몬드", "손원평");
        map2.put("나미야 잡화점의 기적", "히가시노 게이고");
        map2.put("해변의 카프카", "무라카미 하루키");
        
        Map<String, String> map3 = new HashMap<>();
        map3.put("시간은 흐르지 않는다", "카를로 로벨리");
        map3.put("코스모스", "칼 세이건");
        map3.put("평행우주", "미치오 카쿠");
        
        bookMap.put("자기개발", map1);
        bookMap.put("소설", map2);
        bookMap.put("과학", map3);
        System.out.println(bookMap);
        
     // 책 이름 입력
        Scanner scan = new Scanner(System.in);
        System.out.print("책이름을 입력해주세요: ");
        String searchBook = scan.nextLine();

        // where I started 
        // 1) 첫번째 방법 
        Iterator<String> iter = bookMap.keySet().iterator();
        while (iter.hasNext()) {
        	String genre = iter.next();
        	if (bookMap.get(genre).containsKey(searchBook)) {  // bookMap의 genre가 searchBook의 키를 갖고 있냐..
        		String author = bookMap.get(genre).get(searchBook);
        		System.out.println(searchBook + "의 작가는 " + author);
        		break; // 작가를 찾았으면 또 돌지 않고 나오기 
        	}
        }
        
        // 2) 두번째 방법 
        iter = bookMap.keySet().iterator();
        while (iter.hasNext()) {
        	String genre = iter.next();
        	Map<String, String> book = bookMap.get(genre);
        	if (book.get(searchBook) != null)  { // 책에 대한 작가가 있냐?? 그 책이 있는지도 확인! 
        		String author = book.get(searchBook);
        		System.out.println(searchBook + "의 작가는 " + author);
        		break;
        	}
        	
        }
	}

}
