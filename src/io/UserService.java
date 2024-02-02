package io;

import java.util.Iterator;
import java.util.List;

public interface UserService {
    // 회원 정보를 등록하다.
    public void addUser(User user);
    //회원 정보를 수정하다
    public boolean updateUser(User user);
    //회원 정보를 삭제한다.
    public boolean deleteUser(String email);
    //회원 정보를 반환한다.
    public Iterator<User> getUsers();

    public boolean exists(String email);
}
