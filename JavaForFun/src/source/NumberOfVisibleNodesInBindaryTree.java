package source;

public class NumberOfVisibleNodesInBindaryTree {
	public int solution(Tree T) {
		return findNumberberOfVisibleNodes(T, Integer.MIN_VALUE);
	}

	public int findNumberberOfVisibleNodes(Tree T, int maxVal) {
		if (T == null) {
			return 0;
		}

		int count = 0;

		if (T.x >= maxVal) {
			count = 1;
			maxVal = T.x;
		}

		return count + findNumberberOfVisibleNodes(T.l, maxVal) + findNumberberOfVisibleNodes(T.r, maxVal);
	}
}
