package bmm.service;

public interface AdminControlService {
    boolean isExist(String username);
    boolean isCorrectPassword(String password);
}
