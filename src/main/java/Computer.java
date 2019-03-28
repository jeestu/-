
public class Computer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="电脑";//名字
	    int score = 0;//积分
	}
	    /**
	    *出拳
	    *@return 出拳结果：1.剪刀 2.石头 3.布

	    */
	    public int showFist(){
	             //产生随机数
	             int show =(int)(Math.random()*10)%3+1;//产生随机数，表示电脑出拳
	             String name = null;
			//输出出拳结果并返回
		    switch(show){
				case 1:
					System.out.println(name+"你出拳：剪刀");
					break;
				case 2:
					System.out.println(name+"你出拳：石头");
					break;
				case 3:
					System.out.println(name+"你出拳：布");
					break;
				}
				return show;
	}
}
