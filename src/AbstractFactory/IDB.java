package AbstractFactory;

abstract class IDBConnection {
	protected String name;
	protected String password;
};

abstract class IDBCommand {
	protected String message;
	protected abstract int connection(IDBConnection connection);
};

abstract class IDBReader {
	protected abstract String read(IDBCommand command);
};

abstract class IDBFactory {
	protected abstract IDBConnection createConnection(String name, String password);
	protected abstract IDBCommand createCommand();
	protected abstract IDBReader createReader();
}

class SqlConnection extends IDBConnection {
	public String name;
	public String password;
	
	public SqlConnection(String name, String password) {
		this.name = name;
		this.password = password;
	}
}

class SqlCommand extends IDBCommand {
	public String message;
	
	protected int connection(IDBConnection connection) {
		System.out.println(connection.name);
		this.message = connection.name + "@" + connection.password;
		return 0;
	}
}

class SqlReader extends IDBReader {
	protected String read(IDBCommand command) {
		return command.message;
	}
}

class SqlFactory extends IDBFactory {
	public IDBConnection createConnection(String name, String password) {
		return new SqlConnection(name, password);
	}
	
	public IDBCommand createCommand() {
		return new SqlCommand();
	}

	public IDBReader createReader() {
		return new SqlReader();
	}
}

public class IDB {
	public static void main(String[] args) {
		SqlFactory factory = new SqlFactory();
		IDBConnection connection = factory.createConnection("root", "a123456");
		System.out.println(connection.name);
		IDBCommand command = factory.createCommand();
		command.connection(connection);
		IDBReader reader = factory.createReader();
		String result = reader.read(command);
		System.out.println(result);
	}
}
