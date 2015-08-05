package ba.bitcamp.classes.ass9_23;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandler {

	private static final String PATH_TO_PUBLIC = "./public";

	public static String getContent(String route) throws Exception {
		String fullPath = routeBuilder(route);
		BufferedReader bw = new BufferedReader(new FileReader(fullPath));
		StringBuilder sb = new StringBuilder();
		while (bw.ready()) {
			sb.append(bw.readLine());
		}

		return sb.toString();
	}

	private static String routeBuilder(String route) {
		if (route.equals("/")) {
			route = "/index.html";
		}
		return PATH_TO_PUBLIC + route;
	}

	public static void main(String[] args) {
		try {
			System.out.println(getContent("/"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
