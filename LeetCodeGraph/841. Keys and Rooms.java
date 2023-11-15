class Solution {
  public boolean canVisitAllRooms(List<List<Integer>> rooms) {

    boolean[] visited = new boolean[rooms.size()];

    dfs(rooms, 0, visited);

    for (boolean v : visited) {
      if (v == false)
        return false;
    }

    return true;

  }

  void dfs(List<List<Integer>> rooms, int source, boolean[] visited) {

    visited[source] = true;

    for (int r : rooms.get(source)) {
      if (!visited[r]) {
        dfs(rooms, r, visited);
      }

    }
  }
}