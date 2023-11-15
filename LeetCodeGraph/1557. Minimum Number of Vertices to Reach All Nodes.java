class Solution {
  public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> e) {
    List<Integer> list = new ArrayList<>();
    Map<Integer, Boolean> map = new HashMap<>();
    for (List<Integer> l : e) {
      int x = l.get(1);
      map.put(x, true);
    }
    for (int i = 0; i < n; i++) {
      if (!map.containsKey(i)) {
        list.add(i);
      }
    }
    return list;
  }
}