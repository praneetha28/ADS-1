class Median {
	private MaxPQ<Float> maxpq;
    private MinPQ<Float> minpq;
    Median(int n) {
    	maxpq = new MaxPQ<Float>(n);
    	minpq = new MinPQ<Float>(n);
    }
    public void insert(float k) {
    	Float median = 0.0f;
            if (k > median) {
                minpq.insert(k);
            } else {
                maxpq.insert(k);
            }

            if (minpq.size() - maxpq.size() > 1) {
                maxpq.insert(minpq.delMin());

            }
            if (maxpq.size() - minpq.size() > 1) {
                minpq.insert(maxpq.delMax());

            }

            if (minpq.size() == maxpq.size()) {
                median = (minpq.min() + maxpq.max()) / 2;
                System.out.println(median);
            }

            if (maxpq.size() > minpq.size()) {
                median = maxpq.max();
                System.out.println(median);
            }

            if (minpq.size() > maxpq.size()) {
                median = minpq.min();
                System.out.println(median);
            }
    }

}