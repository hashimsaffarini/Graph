class Solution {
  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> res = new ArrayList<>();
    Queue<List<Integer>> q = new LinkedList<>();
    int last = graph.length - 1;
    q.offer(Arrays.asList(0));
    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        List<Integer> temp = q.poll();
        if (temp.get(temp.size() - 1) == last) {
          res.add(temp);
        }
        int x = temp.get(temp.size() - 1);
        for (int val : graph[x]) {
          List<Integer> copy = new ArrayList<>(temp);
          copy.add(val);
          q.offer(copy);
        }
      }
    }
    return res;

  }
}