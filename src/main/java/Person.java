import java.util.Scanner;
/**
 * 用户类
 *阶段1完成
 * @param <Scanner>
 */
public class Person {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="匿名";//名字
		int score=0;//积分
	}
		/**
		* 出拳
		*@return出拳结果：1.剪刀 2.石头 3.布
		*/
		public int showFist(){
			//接收用户的选择
			Scanner input =new Scanner(System.in);
			System.out.print("\n请出拳:1.剪刀 2.石头 3.布 (输入相应数字):");
			int show=input.nextInt();
			//输出出拳结果，并返回
			switch(show){
			case 1:
				System.out.println("你出拳：剪刀");
				break;
			case 2:
				System.out.println("你出拳：石头");
				break;
			case 3:
			System.out.println("你出拳：布");
				break;
			}
			return show;
	}
}
