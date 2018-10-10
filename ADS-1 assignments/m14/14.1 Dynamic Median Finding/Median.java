class Median {
	private MaxPQ<Float> max;
    private MinPQ<Float> min;
    Median() {
    	max = new MaxPQ<Float>();
    	min = new MinPQ<Float>();
    }
    public void insert(float k) {
    	Float median = 0.0f;
        if (k > median) {
            min.insert(k);
        } else {
            max.insert(k);
        }
        if (min.size() - max.size() > 1) {
            max.insert(min.delMin());
        }
        if (max.size() - min.size() > 1) {
            min.insert(max.delMax());
        }
        if (max.size() == min.size()) {
            median = (min.min() + max.max()) / 2;
            System.out.println(median);
        }
        if (min.size() > max.size()) {
            median = min.min();
            System.out.println(median);
        }
        if (max.size() > min.size()) {
            median = max.max();
            System.out.println(median);
        }
    }

}