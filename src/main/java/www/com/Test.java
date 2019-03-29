package www.com;

public class Test {
	public static void main(String[] args) {
		JDBCOperation.getAll();
		JDBCOperation.insert(new Person(20,"test19",19));
		JDBCOperation.getAll();
		JDBCOperation.update(new Person(2,"test15",19));
		JDBCOperation.getAll();
		JDBCOperation.delete(11);
		JDBCOperation.getAll();
	}
}


