package vivo_test.kimi_test;

public interface ExpirationListener<E> {

	/**
	 * Invoking when a expired event occurs.
	 * 
	 * @param expiredObject
	 */
	void expired(E expiredObject);

	void gitTest2();
}