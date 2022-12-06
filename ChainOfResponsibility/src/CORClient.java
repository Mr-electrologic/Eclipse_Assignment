
public class CORClient {
		public static void main(String[] args) {
			Chain node1=new Addition();
			Chain node2=new Multiplication();
			Chain node3=new Subtraction();
			Chain node4=new Division();
			node1.nextInChain(node2);
			node2.nextInChain(node3);
			node3.nextInChain(node4);
			Numbers n1=new Numbers(4,5,"mult");
			node1.commpute(n1);
		}
}
interface Chain{
	public void nextInChain(Chain node);
	public void commpute(Numbers req);
}
class Numbers{
	int num1,num2;
	String calcType;
	public Numbers(int num1, int num2, String calcType) {
		this.num1 = num1;
		this.num2 = num2;
		this.calcType = calcType;
	}
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	public String getCalcType() {
		return calcType;
	}
}
class Addition implements Chain{
	Chain nextNode;

	@Override
	public void nextInChain(Chain node) {
		// TODO Auto-generated method stub
		nextNode=node;
	}

	@Override
	public void commpute(Numbers req) {
		// TODO Auto-generated method stub
		System.out.println("in add node");
		if (req.getCalcType().equalsIgnoreCase("add"))
			System.out.println(req.getNum1()+req.getNum2());
		else
			nextNode.commpute(req);
	}
}
class Multiplication implements Chain{
	Chain nextNode;

	@Override
	public void nextInChain(Chain node) {
		// TODO Auto-generated method stub
		nextNode=node;
	}

	@Override
	public void commpute(Numbers req) {
		// TODO Auto-generated method stub
		System.out.println("in mul node");
		if (req.getCalcType().equalsIgnoreCase("mul"))
			System.out.println(req.getNum1()+req.getNum2());
		else
			nextNode.commpute(req);
	}	
}
class Subtraction implements Chain{
	Chain nextNode;

	@Override
	public void nextInChain(Chain node) {
		// TODO Auto-generated method stub
		nextNode=node;
	}

	@Override
	public void commpute(Numbers req) {
		// TODO Auto-generated method stub
		System.out.println("in sub node");
		if (req.getCalcType().equalsIgnoreCase("sub"))
			System.out.println(req.getNum1()+req.getNum2());
		else
			nextNode.commpute(req);
	}	
}
class Division implements Chain{
	Chain nextNode;

	@Override
	public void nextInChain(Chain node) {
		// TODO Auto-generated method stub
		nextNode=node;
	}

	@Override
	public void commpute(Numbers req) {
		// TODO Auto-generated method stub
		System.out.println("in div node");
		if (req.getCalcType().equalsIgnoreCase("div"))
			System.out.println(req.getNum1()+req.getNum2());
		else
			nextNode.commpute(req);
	}
}