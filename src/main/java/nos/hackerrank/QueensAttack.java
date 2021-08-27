package nos.hackerrank;

import java.util.*;

public class QueensAttack {
    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    //Indexes to represent orthogonal direction. First index is row, second index is column
    private static int ROW = 0;
    private static int COL = 1;

    //Map of direction descriptions (String) to 2D Normalized Vectors indicating the direction (List of Integers, Length: 2)
    private static HashMap<String, ChessVector> DIRECTION_VECTOR_MAP = new HashMap<>();
    static {
        DIRECTION_VECTOR_MAP.put("UP", new ChessVector(-1, 0));
        DIRECTION_VECTOR_MAP.put("DOWN", new ChessVector(1, 0));
        DIRECTION_VECTOR_MAP.put("LEFT", new ChessVector(0, -1));
        DIRECTION_VECTOR_MAP.put("RIGHT", new ChessVector(0, 1));
        DIRECTION_VECTOR_MAP.put("UP-LEFT", new ChessVector(-1, -1));
        DIRECTION_VECTOR_MAP.put("UP-RIGHT", new ChessVector(-1, 1));
        DIRECTION_VECTOR_MAP.put("DOWN-LEFT", new ChessVector(1, -1));
        DIRECTION_VECTOR_MAP.put("DOWN-RIGHT", new ChessVector(1, 1));
    }

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        List<ChessPoint> test = new ArrayList<>();
        Integer result = 0;
        Set<ChessPoint> obstaclePoints = new HashSet<>();
        for (List<Integer> point : obstacles){
            obstaclePoints.add(new ChessPoint(point.get(0), point.get(1)));
        }

        for (String direction : DIRECTION_VECTOR_MAP.keySet()){
            ChessVector v = DIRECTION_VECTOR_MAP.get(direction);
            ChessPoint p = new ChessPoint(r_q, c_q);
            p = p.applyVector(v);
            while (p.isOnBoard(n) && !obstaclePoints.contains(p)){
                result++;
                p = p.applyVector(v);
            }
        }

        return result;
    }

    private static class ChessVector{
        private List<Integer> vector;

        private ChessVector(int r, int c){
            this.vector = Arrays.asList(r, c);
        }

        private Integer getRow(){
            return this.vector.get(ROW);
        }
        private Integer getCol(){
            return this.vector.get(COL);
        }

        public boolean equals(Object o){
            return (o instanceof ChessVector? ((ChessVector) o).getRow() == this.getRow() && ((ChessVector) o).getCol() == this.getCol() : false);
        }

        public int hashCode(){
            return Objects.hash(this.getRow(), this.getCol());
        }

        public String toString(){
            return "(" + this.getRow() +", " + this.getCol() + ")";
        }
    }

    private static class ChessPoint{
        private List<Integer> point;

        private ChessPoint(int r, int c){
            this.point = Arrays.asList(r, c);
        }

        private boolean isOnBoard(int n){
            return (this.getRow() >= 1 && this.getRow() <= n && this.getCol() >= 1 && this.getCol() <= n);
        }


        private ChessPoint applyVector(ChessVector v){
            return new ChessPoint(v.getRow() + this.getRow(), v.getCol() + this.getCol());
        }

        public Integer getRow(){
            return this.point.get(ROW);
        }
        public Integer getCol(){
            return this.point.get(COL);
        }

        public boolean equals(Object o){
            return (o instanceof ChessPoint? ((ChessPoint) o).getRow().equals(this.getRow()) && ((ChessPoint) o).getCol().equals(this.getCol()) : false);
        }

        public int hashCode(){
            return Objects.hash(this.getRow(), this.getCol());
        }

        public String toString(){
            return "(" + this.getRow() +", " + this.getCol() + ")";
        }
    }

}
