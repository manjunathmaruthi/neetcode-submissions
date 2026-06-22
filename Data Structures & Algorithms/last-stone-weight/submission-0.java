class Solution {
    public int lastStoneWeight(int[] stones) {

        /**

            [2,3,6,2,4]

            0 1 2 3 4
            2 3 6 2 4

            //put all to Max queue

            while (queue.size() > 1) {
            
            // get Max for each time 6 4
            

                if (x == y) {
                    //remove both
                } else {
                    //remove x and y
                    ele1 = ele1 - ele2;
                    insert ele1;
                }
            }
        **/

        PriorityQueue<Integer> maxQueue = new PriorityQueue<>((a,b)->b-a);

        for (int i=0; i<stones.length; i++) {
            maxQueue.add(stones[i]);
        }

        while (maxQueue.size() > 1) {

            int element1 = maxQueue.poll();
            int element2 = maxQueue.poll();

            System.out.println("ELement1: "+element1);

             System.out.println("ELement2: "+element2);

            if (element1 != element2) {
                int newElement = element1 - element2;
                maxQueue.add(newElement);
            }

            System.out.println("Afte eachround: "+maxQueue);
        }

        if (maxQueue.size() == 0) {
            return 0;
        } else {
            return maxQueue.poll();
        }
        
    }
}
