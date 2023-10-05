class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        int n = restaurants.length;
        List<int[]> filtered = new ArrayList<int[]>();
        for (int i = 0; i < n; i++) {
            if (restaurants[i][3] <= maxPrice && restaurants[i][4] <= maxDistance
                    && !(veganFriendly == 1 && restaurants[i][2] == 0)) {
                filtered.add(restaurants[i]);
            }
        }
        Collections.sort(filtered, (a, b) -> {
            if (a[1] != b[1]) {
                return b[1] - a[1];
            } else {
                return b[0] - a[0];
            }
        });
        List<Integer> res = new ArrayList<Integer>();
        for (int[] v : filtered) {
            res.add(v[0]);
        }
        return res;
    }
}


