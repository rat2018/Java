//字符串连接方法;
public class Test{
	public static void main(String[] args){
		String s="Hello,";
		StringBuilder builder=new StringBuilder();
		builder.append(s);
		builder.append("Jim!");
		String completedString=builder.toString();
		System.out.println(completedString);
	}
}
