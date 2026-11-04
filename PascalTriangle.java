// LeetCode 118
// Problem: Pascal's Triangle
// Approach: Previous Row
// Time Complexity: O(n²)
// Space Complexity: O(n²) including output

        class Solution {
            public List<List<Integer>> generate(int numRows) {
                //For outer list
                List<List<Integer>> result = new ArrayList<List<Integer>>();

                //First row
                result.add( new ArrayList<Integer>());
                result.get(0).add(1);

                //for alernating rows
                for(int row = 1 ; row <numRows;row++){
                    List<Integer> newRow = new ArrayList<>();

                    newRow.add(1);
                    List<Integer> prevRow = result.get(row-1);
                    for(int i=1;i<row;i++){
                        newRow.add(prevRow.get(i)+ prevRow.get(i-1));
                    }
                newRow.add(1);
                    result.add(newRow);

                }
                return result;

            }
        }
