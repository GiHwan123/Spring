package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import javax.swing.text.html.Option;
import java.util.*;

public class MemoryMemberRepository implements  MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {//회원정보를 저장하는 메소드
        member.setId(++sequence);
        store.put(member.getId(),member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {//특정 ID를 가진 회원을 찾아 return 하는 메소드
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {//특정 회원을 찾아 return 하는 메소드
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {//저장된 회원 정보(이름)를 모두 return하는 메소드
        return new ArrayList<>(store.values());
    }

    public void clearStore(){//저장된 회원정보를 모두 삭제하는 메소드
        store.clear();
    }
}
