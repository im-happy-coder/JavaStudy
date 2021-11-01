package examp01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {

	public static void main(String[] args) {
//		Path객체는이 정보를 얻을 수있는 몇 가지 방법이있다. 
//		Path객체의 파일이나 디렉토리는 없든 있든 실행된다.
		
		//경로가 절대 경로인 경우
			Path path = Paths.get("C:\\temp\\dir1\\file.txt");  
			// Or Path path = Paths.get("/temp/dir1/file.txt");
			System.out.println("toString(): " + path.toString());
			System.out.println("getFileName(): " + path.getFileName());
			System.out.println("getNameCount(): " +path.getNameCount());
			// Indexes start from zero 
			System.out.println("getName(0): " + path.getName(0));
			System.out.println("getName(1): " + path.getName(1));
			System.out.println("getName(2): " + path.getName(2));
			// subpath(beginIndex, endIndex) from beginIndex to endIndex-1
			System.out.println("subpath(0,2): " + path.subpath(0,2));
			System.out.println("getParent(): " + path.getParent());
			System.out.println("getRoot(): " + path.getRoot());
System.out.println("-----------------------------------------");
//			출력 :
//
//			toString(): C:\temp\dir1\file.txt // Or /temp/dir1/file.txt
//			getFileName(): file.txt
//			getNameCount(): 3
//			getName(0): temp
//			getName(1): dir1
//			getName(2): file.txt
//			subpath(0,2): temp\dir1 // Or temp/dir1
//			getParent(): C:\temp\dir1 // Or /temp/dir1
//			getRoot(): C:\ // Or /
			
			//경로가 상대경로인 경우
				Path path1 = Paths.get("dir1\\file.txt");// Or dir1/file.txt 
				System.out.println("toString(): " + path1.toString());
				System.out.println("getFileName(): " + path1.getFileName());
				System.out.println("getNameCount(): " + path1.getNameCount());
				System.out.println("getName(0): " + path1.getName(0));
				System.out.println("getName(1): " + path1.getName(1));
				System.out.println("subpath(0,2): " + path1.subpath(0,2));
				System.out.println("getParent(): " + path1.getParent());
				System.out.println("getRoot(): " + path1.getRoot());
				System.out.println("-------------------------------------");
//				. 현재 디렉토리 참조
//				.. 상위 디렉토리를 참조하려면
//				예를 들면 :
					Path p1 = Paths.get("/temp/./file.txt");  //           /temp/file.txt
					Path p2 = Paths.get( "/temp/dir1/../file.txt"); //    /temp//file.txt
				
				
//				이 경우 normalize () 메서드를 사용하여 (..) 즉 중복을 제거한다.
				Path path3 = Paths.get("/temp/dir1/../file.txt");
				System.out.println(path3); // /temp/dir1/../file.txt
				Path path4 = path.normalize();
				System.out.println(path4); // /temp/file.txt
				
//				이 방법은 파일이 있는지 확인하기 위해 파일 시스템에 액세스하지 않으므로 경로에서 .. 및 선행 이름을 제거하면 더 이상 원본 파일을 참조하지 않는 경로가 생성 될 수 있습니다.
//				이는 이전 이름이 심볼릭 링크 (다른 파일에 대한 참조) 일 때 발생할 수 있습니다.
//				toRealPath () 메서드를 사용하는 것이 좋습니다.
//				Path toRealPath(LinkOption... options) throws IOException
				
//				이 방법은 다음을 수행합니다.
//				LinkOption.NOFOLLOW_LINKS가 인수로 전달되는 경우 기호 링크는 따르지 않습니다 (기본적으로 수행됨).
//				경로가 상대 경로이면 절대 경로를 반환합니다.
//				중복 요소가 제거 된 경로를 반환합니다 (있는 경우).
				
//				두 경로를 결합 할 수 있습니다. 두 가지 경우가 있습니다.
//				첫 번째 경우. 절대 경로가 있고 루트 요소 (부분 경로)가없는 두 번째 경로와 결합하려는 경우 두 번째 경로가 추가됩니다.
//
//				Path path = Paths.get("/temp");
//				System.out.println(path.resolve("newDir")); // /temp/newDir
				
//				두 번째 경우. 부분 또는 상대 경로가 있고이를 절대 경로와 결합하려는 경우 다음 절대 경로가 반환됩니다.
//
//				Path path = Paths.get("newDir");
//				System.out.println(path.resolve("/temp")); // /temp
				
				
				
//				relativize() 또 다른 흥미로운 방법입니다.
//
//				path1.relativize(path2)말처럼 나에게 보여 어떻게 경로 2에 경로 1에서 얻을 수있는 경로를 제공합니다 .
//
//				예를 들어, 디렉토리에 /temp있고로 이동하려면 /temp/dir1/subdir먼저 dir1로 이동 한 다음 subdir로 이동해야합니다.
//
//				Path path1 = Paths.get("temp");
//				Path path2 = Paths.get("temp/dir1/file.txt");
//				Path path1ToPath2 = path1.relativize(path2); // dir1/file.txt
//
//				경로가 다른 정보없이 두 개의 친척 경로를 나타내는 경우 형제로 간주되므로 상위 디렉터리로 이동 한 다음 다른 디렉터리로 이동해야합니다.
//				Path path1 = Paths.get("dir1");
//				Path path1ToPath2 = path1.relativize(Paths.get("dir2")); // ../dir2
//				두 예제 모두 상대 경로를 사용합니다.
//				경로 중 하나가 절대 경로 인 경우 정보 부족으로 상대 경로를 구성 할 수 없으며 a llegalArgumentException가 발생합니다.
				
//				Path absPath = Paths.get("c:\\temp\\dir1\\file.txt");
//				Path relPath = Paths.get("temp\\dir1\\file.txt");
//
//				boolean startsWith(Path other)
//				absPath.startsWith(Paths.get("c:\\temp\\file.txt")); // false
//				absPath.startsWith(Paths.get("c:\\temp\\dir1\\img.jpg")); // false
//				absPath.startsWith(Paths.get("c:\\temp\\dir1\\")) // true  O
//				absPath.startsWith(relPath); // false
//
//				boolean startsWith(String other)
//				relPath.startsWith("t"); // false
//				relPath.startsWith("temp"); // true   O
//				relPath.startsWith("temp\\d"); // false
//				relPath.startsWith("temp\\dir1"); // true O
//
//				boolean endsWith(Path other)
//				absPath.endsWith("file.txt"); // true  O
//				absPath.endsWith("d:\\temp\\dir1\\file.txt"); // false
//				relPath.endsWith(absPath); // false
//
//				boolean endsWith(String other)
//				relPath.endsWith("txt"); // false
//				relPath.endsWith("file.txt"); // true O
//				relPath.endsWith("\\dir1\\file.txt"); // false
//				relPath.endsWith("dir1\\file.txt"); // true O
	}

}
