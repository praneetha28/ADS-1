import java.util.Arrays;
class HashTable<Key, Value> {
	private int M = 30001;
	private String[] keys = new String[M];
	private Value[] values = (Value[]) new Object[M];
	String[] k = new String[M];
	Value[] v = (Value[]) new Object[M];
	int s = 0;
	int vl = 0;
	int size = 0;
	// time complexity is O(N)
	public void put(String key, Value value) {
		int h = hashKey(key);
		k[s++] = key;
		v[vl++] = value;
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
	public int hashKey(String key) {
		return (key.hashCode() * 11) % M;
	}
	// time complexity is O(N)
	public Value get(String key) {
		int h = hashKey(key);
		for (int i = h; keys[i] != null; i = (i + 1) % M) {
			if (keys[i].equals(key)) {
				return values[i];
			}
		}
		return null;
	}
	public void delete(String key) {
		for (int i = 0; i < s; i++) {
			if (k[i] == null) {
				return;
			}
			if (k[i].equals(key)) {
				k[i] = null;
				v[i] = null;
				s--;
				vl--;
				// System.out.println("after deleted");
				break;
			} else {
				return;
			}
		}
		// System.out.println("...");
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
			String keyRehash = keys[h];
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
	public boolean contains(String key) {
		return get(key) != null;
	}
	public void resize() {
		keys = Arrays.copyOf(keys, size * 2);
		values = Arrays.copyOf(values, size * 2);
	}
	// time complexity is O(N)
	public String display() {
		String s = "{";
		for (int i = 0; i < k.length - 1; i++) {
			if (k[i] != null) {
				s += k[i] + ":" + v[i] +", ";
			}
		}
		if (k[k.length - 1] != null) {
				s += k[k.length - 1] + ":" + v[k.length - 1] +"}";
		} else {
			s = s.substring(0, s.length() - 2) + "}";
		}
		return s;
	}
}