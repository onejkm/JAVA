
public class T01 {
    public static void main(String[] args) throws Exception {
        Member me = new Member();
        me.setId(1);
        me.setName("����");
        chuanyue(me);
        System.out.println(me);
    }
    // ����chuanyue��������Խ
    public static void chuanyue(Member member) {

        member.setId(1001);
        member.setName("�����");

        Member member_other = new Member();
        member_other.setId(1002);
        member_other.setName("���");

        member = member_other;

        member.setId(1003);
        member.setName("����");
    }

}

class Member {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + "]";
    }

}
