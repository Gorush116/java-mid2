package collection.map.test.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        if (memberMap.containsKey(member.getId())) {
            System.out.println("이미 가입된 회원입니다.");
        }
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        if (!memberMap.containsKey(id)) {
            System.out.println("존재하지 않는 회원입니다.");
        }
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MemberRepository{" +
                "memberMap=" + memberMap +
                '}';
    }
}
