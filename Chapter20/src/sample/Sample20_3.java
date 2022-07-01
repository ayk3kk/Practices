package sample;

import java.lang.reflect.Member;

/**
 * @author 21002S
 *
 */
public class Sample20_3 {

	public static void main(String[] args) {

		Member member = FactoryMember.createMember();		//ポリモーフィズムを活用している


		//サブクラスのインスタンスをスーパークラス型として使用します。
//		Member member = new StrudentMember(100, "田中宏", "2000-6-18")
//		Member member = new CorporateMember(123, "株式会社アドバン", 1000);

		//スーパークラスMemberから継承したメンバーにはアクセス可能です。
		System.out.println(member.getId());
		System.out.println(member.getName());

		//サブクラス独自のメンバーには、アクセスできません。
		//System.out.println(member.getBirthday());

		if(member instanceof CorporateMember) {
			System.out.println(((CorporateMember)member).getEmploees());
		}else if(member instanceof StrudentMember) {
			System.out.println(((StrudentMember)member).getBitrhday());
		}
	}

}
