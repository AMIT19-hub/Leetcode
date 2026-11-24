class ProductOfNumbers {
    List<Integer> prefix;

    public ProductOfNumbers() {
        prefix = new ArrayList<>();
        prefix.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            prefix.clear();
            prefix.add(1);

        } else {
            int last = prefix.get(prefix.size() - 1);
            prefix.add(num * last);
        }
    }

    public int getProduct(int k) {

        int len = prefix.size();
        if (k >= len) {
            return 0;
        }
        return prefix.get(len - 1) / prefix.get(len - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */