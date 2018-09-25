class Percolation {
	private boolean[][] grid;
	public int size;
	public int count;
	private int top = 0;
	private int bottom;
	private WeightedQuickUnionUF qf;
	Percolation(int sze) {
		this.size = sze;
		this.count = 0;
		this.bottom = sze * sze + 1;
		qf = new WeightedQuickUnionUF(sze * sze + 2);
		grid = new boolean[size][size];
	}
	public boolean isOpen(int r, int c) {
		return grid[r][c];
	}
	public int getIndex(int i, int j) {
		return (i*size) + j;
	}
	public void open(int r, int c) {
		if (isOpen(r, c) == false) {
			grid[r][c] = true;
			count += 1;
		}
		if (r == 0) {
			qf.union(getIndex(r, c), size * size);
		}
		if (r == size - 1) {
			qf.union(getIndex(r, c), size * size + 1);
		}
        if (c < size - 1 && isOpen(r, c + 1)) { //bottom
        	qf.union(getIndex(r, c), getIndex(r, c + 1) );
        }
        if (c > 0 && isOpen(r, c - 1)) { // left
        	qf.union(getIndex(r, c), getIndex(r, c - 1) );
        }
        if ( r < size - 1 && isOpen(r + 1, c)) { //right
        	qf.union(getIndex(r, c), getIndex(r + 1, c) );
        }
        if (r > 0 && isOpen(r - 1, c)) { // top
        	qf.union(getIndex(r, c), getIndex(r - 1, c) );
        }
	}
	// public int numberOfOpenSites() {
	// 	return count;
	// }
	public boolean percolates() {
		return qf.connected(size * size, (size*size)+1);

	}
}