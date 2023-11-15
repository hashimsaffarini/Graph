public static void printDfs(int[][] arr, int n, int source) {
        boolean visit[] = new boolean[n];
        List<Integer>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int a[] : arr) {
            list[a[0]].add(a[1]);
            list[a[1]].add(a[0]);
        }

        dfs(source, list, visit);

    }

    public static void dfs(int idx, List<Integer>[] list, boolean[] visit) {
        visit[idx] = true;
        System.out.print(idx + " ");
        for (int val : list[idx]) {
            if (!visit[val]) {
                dfs(val, list, visit);
            }
        }
    }