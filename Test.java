import com.baobao.*;
public class Test{
	public static void main(String[] args){
		String s="Hello,";
		StringBuilder builder=new StringBuilder();
		builder.append(s);
		builder.append("Jim!");

		Sm sm=new Sm();
		builder.append(sm.get_k());

		String completedString=builder.toString();
		System.out.println(completedString);
	}
}
