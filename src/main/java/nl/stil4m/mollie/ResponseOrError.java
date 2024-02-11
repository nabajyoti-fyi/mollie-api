package nl.stil4m.mollie;

import java.util.Map;
import java.util.function.Consumer;

public class ResponseOrError<V> {
	private final int status;
	
	private final V data;
	
	private final Map error;
	
	private final Boolean success;
	
	private ResponseOrError(int status, V data, Map error, Boolean success) {
		this.status = status;
		this.data = data;
		this.error = error;
		this.success = success;
	}
	
	public static <V, T> ResponseOrError withError(int status, Map error) { return new ResponseOrError<>(status, null, error, Boolean.valueOf(false)); }
	
	public static <V, T> ResponseOrError withData(int status, V data) { return new ResponseOrError<>(status, data, null, Boolean.valueOf(true)); }
	
	public void get(Consumer<V> onSuccess, Consumer<Map> onError) {
		if (this.success.booleanValue()) {
			onSuccess.accept(this.data);
		} else {
			onError.accept(this.error);
		} 
	}
	
	public int getStatus() { return this.status; }
	
	public V getData() { return this.data; }
	
	public Map getError() { return this.error; }
	
	public Boolean getSuccess() { return this.success; }
}
