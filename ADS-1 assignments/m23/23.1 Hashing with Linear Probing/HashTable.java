import java.util.Arrays;
class HashTable<Key, Value> {
	private int M = 30001;
	private Key[] keys = (Key[]) new Object[M];
	private Value[] values = (Value[]) new Object[M];
	int size = 0;
	// time complexity is O(N)
	public void put(Key key, Value value) {
		int h = hashKey(key);
		for (int i = h; keys[i] != null; i = (i + 1) % M) {
			if (keys[i].equals(key)) {
				values[i] = value;
				return;
			}
		}
		keys[h] = key;
		values[h] = value;
		size++;
	}
	// time complexity is O(1)
	public int hashKey(Key key) {
		return (key.hashCode() * 11) % M;
	}
	// time complexity is O(N)
	public Value get(Key key) {
		int h = hashKey(key);
		for (int i = h; keys[i] != null; i = (i + 1) % M) {
			if (keys[i].equals(key)) {
				return values[i];
			}
		}
		return null;
	}
	public void delete(Key key) {
		if (!contains(key)) {
			return;
		}
		int h = hashKey(key);
		while (!key.equals(keys[h])) {
			h = (h + 1) % M;
		}
		keys[h] = null;
		values[h] = null;
		h = (h + 1) % M;
		while (keys[h] != null) {
			Key keyRehash = keys[h];
			Value valueRehash = values[h];
			keys[h] = null;
			values[h] = null;
			size--;
			put(keyRehash, valueRehash);
			h = (h + 1) % M;
		}
		size--;
		// if (size > 0 && size <= M / 8) {
		// 	resize();
		// }
	}
	// time complexity is O(N)
	public boolean contains(Key key) {
		return get(key) != null;
	}
	public void resize() {
		keys = Arrays.copyOf(keys, size * 2);
		values = Arrays.copyOf(values, size * 2);
	}
	// time complexity is O(N)
	public String display() {
		String s = "{";
		for (int i = 0; i < keys.length - 1; i++) {
			if (keys[i] != null) {
				s += keys[i] + ":" + values[i] +", ";
			}
		}
		if (keys[keys.length - 1] != null) {
				s += keys[keys.length - 1] + ":" + values[keys.length - 1] +"}";
		} else {
			s = s.substring(0, s.length() - 2) + "}";
		}
		return s;
	}
}