package leetcode;

/*
 * ������ת
 * ����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��
 */

public class Solution {

	private static final int INT_MAX = 2147483647;
	private static final int INT_MIN = -2147483648;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse(-123456789));
	}

	public static int reverse(int x) {
		int result = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (result > INT_MAX/10 || (result == INT_MAX / 10 && pop > 7)) return 0;
			if (result < INT_MIN/10 || (result == INT_MIN / 10 && pop < -8)) return 0;
			result = result * 10 + pop;

		}

		return result;

	}

}
