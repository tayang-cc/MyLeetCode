//A company is organizing a meeting and has a list of n employees, waiting to 
//be invited. They have arranged for a large circular table, capable of seating any 
//number of employees. 
//
// The employees are numbered from 0 to n - 1. Each employee has a favorite 
//person and they will attend the meeting only if they can sit next to their favorite 
//person at the table. The favorite person of an employee is not themself. 
//
// Given a 0-indexed integer array favorite, where favorite[i] denotes the 
//favorite person of the iᵗʰ employee, return the maximum number of employees that can 
//be invited to the meeting. 
//
// 
// Example 1: 
// 
// 
//Input: favorite = [2,2,1,2]
//Output: 3
//Explanation:
//The above figure shows how the company can invite employees 0, 1, and 2, and 
//seat them at the round table.
//All employees cannot be invited because employee 2 cannot sit beside 
//employees 0, 1, and 3, simultaneously.
//Note that the company can also invite employees 1, 2, and 3, and give them 
//their desired seats.
//The maximum number of employees that can be invited to the meeting is 3. 
// 
//
// Example 2: 
//
// 
//Input: favorite = [1,2,0]
//Output: 3
//Explanation: 
//Each employee is the favorite person of at least one other employee, and the 
//only way the company can invite them is if they invite every employee.
//The seating arrangement will be the same as that in the figure given in 
//example 1:
//- Employee 0 will sit between employees 2 and 1.
//- Employee 1 will sit between employees 0 and 2.
//- Employee 2 will sit between employees 1 and 0.
//The maximum number of employees that can be invited to the meeting is 3.
// 
//
// Example 3: 
// 
// 
//Input: favorite = [3,0,1,4,1]
//Output: 4
//Explanation:
//The above figure shows how the company will invite employees 0, 1, 3, and 4, 
//and seat them at the round table.
//Employee 2 cannot be invited because the two spots next to their favorite 
//employee 1 are taken.
//So the company leaves them out of the meeting.
//The maximum number of employees that can be invited to the meeting is 4.
// 
//
// 
// Constraints: 
//
// 
// n == favorite.length 
// 2 <= n <= 10⁵ 
// 0 <= favorite[i] <= n - 1 
// favorite[i] != i 
// 
//
// Related Topics 深度优先搜索 图 拓扑排序 👍 177 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        // 统计入度，便于进行拓扑排序
        int[] indeg = new int[n];
        for (int i = 0; i < n; ++i) {
            ++indeg[favorite[i]];
        }
        boolean[] used = new boolean[n];
        int[] f = new int[n];
        Arrays.fill(f, 1);
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0; i < n; ++i) {
            if (indeg[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int u = queue.poll();
            used[u] = true;
            int v = favorite[u];
            // 状态转移
            f[v] = Math.max(f[v], f[u] + 1);
            --indeg[v];
            if (indeg[v] == 0) {
                queue.offer(v);
            }
        }
        // ring 表示最大的环的大小
        // total 表示所有环大小为 2 的「基环内向树」上的最长的「双向游走」路径之和
        int ring = 0, total = 0;
        for (int i = 0; i < n; ++i) {
            if (!used[i]) {
                int j = favorite[i];
                // favorite[favorite[i]] = i 说明环的大小为 2
                if (favorite[j] == i) {
                    total += f[i] + f[j];
                    used[i] = used[j] = true;
                }
                // 否则环的大小至少为 3，我们需要找出环
                else {
                    int u = i, cnt = 0;
                    while (true) {
                        ++cnt;
                        u = favorite[u];
                        used[u] = true;
                        if (u == i) {
                            break;
                        }
                    }
                    ring = Math.max(ring, cnt);
                }
            }
        }
        return Math.max(ring, total);
    }
}

//leetcode submit region end(Prohibit modification and deletion)
