/**Collection stack example
*@author keviness
*@version 2020/11/10
*/

public class CollectionStack {
    public static void main(String[] args) {
        increase(1);
    }

    static int increase(int x) {
        return increase(x) + 1;
    }
}
